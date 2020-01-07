package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for the text annotation API, which can perform multiple
  * analysis types (sentiment, entities, and syntax) in one call.
  */
@js.native
trait Schema$AnnotateTextRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[Schema$Document] = js.native
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.native
  /**
    * The enabled features.
    */
  var features: js.UndefOr[Schema$Features] = js.native
}

object Schema$AnnotateTextRequest {
  @scala.inline
  def apply(document: Schema$Document = null, encodingType: String = null, features: Schema$Features = null): Schema$AnnotateTextRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnnotateTextRequest]
  }
}

