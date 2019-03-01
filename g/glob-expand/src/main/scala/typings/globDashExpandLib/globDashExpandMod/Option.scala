package typings
package globDashExpandLib.globDashExpandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[
    java.lang.String | (js.Function1[/* filePath */ java.lang.String, scala.Boolean])
  ] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    filter: java.lang.String | (js.Function1[/* filePath */ java.lang.String, scala.Boolean]) = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

