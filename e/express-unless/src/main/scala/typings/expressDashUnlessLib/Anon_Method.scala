package typings
package expressDashUnlessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var methods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var url: java.lang.String | stdLib.RegExp
}

object Anon_Method {
  @scala.inline
  def apply(
    url: java.lang.String | stdLib.RegExp,
    method: java.lang.String | js.Array[java.lang.String] = null,
    methods: js.Array[java.lang.String] = null
  ): Anon_Method = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods)
    __obj.asInstanceOf[Anon_Method]
  }
}

