package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(gcsSource: IGcsSource = null, name: String = null): IReloadDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IReloadDocumentRequest]
  }
}

