package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document classification request message.
  */
@js.native
trait Schema$ClassifyTextRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[Schema$Document] = js.native
}

object Schema$ClassifyTextRequest {
  @scala.inline
  def apply(document: Schema$Document = null): Schema$ClassifyTextRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClassifyTextRequest]
  }
}

