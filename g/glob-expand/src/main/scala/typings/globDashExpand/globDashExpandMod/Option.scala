package typings.globDashExpand.globDashExpandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String | (js.Function1[/* filePath */ String, Boolean])] = js.undefined
}

object Option {
  @scala.inline
  def apply(cwd: String = null, filter: String | (js.Function1[/* filePath */ String, Boolean]) = null): Option = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

