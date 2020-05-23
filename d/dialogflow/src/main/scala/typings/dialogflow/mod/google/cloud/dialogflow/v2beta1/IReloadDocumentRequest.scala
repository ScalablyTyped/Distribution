package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ReloadDocumentRequest. */
trait IReloadDocumentRequest extends js.Object {
  /** ReloadDocumentRequest gcsSource */
  var gcsSource: js.UndefOr[IGcsSource | Null] = js.undefined
  /** ReloadDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IReloadDocumentRequest {
  @scala.inline
  def apply(
    gcsSource: js.UndefOr[Null | IGcsSource] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IReloadDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gcsSource)) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReloadDocumentRequest]
  }
}

