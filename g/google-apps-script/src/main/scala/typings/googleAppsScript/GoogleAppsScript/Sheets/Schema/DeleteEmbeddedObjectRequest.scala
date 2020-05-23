package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEmbeddedObjectRequest extends js.Object {
  var objectId: js.UndefOr[Double] = js.undefined
}

object DeleteEmbeddedObjectRequest {
  @scala.inline
  def apply(objectId: js.UndefOr[Double] = js.undefined): DeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(objectId)) __obj.updateDynamic("objectId")(objectId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmbeddedObjectRequest]
  }
}

