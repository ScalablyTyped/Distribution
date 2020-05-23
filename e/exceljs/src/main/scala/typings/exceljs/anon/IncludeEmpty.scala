package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeEmpty extends js.Object {
  var includeEmpty: Boolean
}

object IncludeEmpty {
  @scala.inline
  def apply(includeEmpty: Boolean): IncludeEmpty = {
    val __obj = js.Dynamic.literal(includeEmpty = includeEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmpty]
  }
}

