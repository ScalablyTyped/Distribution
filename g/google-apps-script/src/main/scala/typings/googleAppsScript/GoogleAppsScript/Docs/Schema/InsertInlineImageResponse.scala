package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertInlineImageResponse extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
}

object InsertInlineImageResponse {
  @scala.inline
  def apply(objectId: String = null): InsertInlineImageResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertInlineImageResponse]
  }
}

