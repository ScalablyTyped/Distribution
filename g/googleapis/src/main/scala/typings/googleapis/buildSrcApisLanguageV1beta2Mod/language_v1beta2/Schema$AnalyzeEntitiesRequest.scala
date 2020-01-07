package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entity analysis request message.
  */
@js.native
trait Schema$AnalyzeEntitiesRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[Schema$Document] = js.native
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.native
}

object Schema$AnalyzeEntitiesRequest {
  @scala.inline
  def apply(document: Schema$Document = null, encodingType: String = null): Schema$AnalyzeEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyzeEntitiesRequest]
  }
}

