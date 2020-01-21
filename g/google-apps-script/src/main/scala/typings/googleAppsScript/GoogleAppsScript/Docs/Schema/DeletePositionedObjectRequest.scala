package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePositionedObjectRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
}

object DeletePositionedObjectRequest {
  @scala.inline
  def apply(objectId: String = null): DeletePositionedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePositionedObjectRequest]
  }
}

