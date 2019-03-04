package typings
package ftpdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlag extends js.Object {
  var encoding: java.lang.String
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EncodingFlag {
  @scala.inline
  def apply(encoding: java.lang.String, flag: java.lang.String = null): Anon_EncodingFlag = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[Anon_EncodingFlag]
  }
}

