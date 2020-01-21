package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStop extends js.Object {
  var alignment: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Dimension] = js.undefined
}

object TabStop {
  @scala.inline
  def apply(alignment: String = null, offset: Dimension = null): TabStop = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
}

