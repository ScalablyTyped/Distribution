package typings.gapiDotClientDotLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotateTextRequest extends js.Object {
  /** Input document. */
  var document: js.UndefOr[Document] = js.undefined
  /** The encoding type used by the API to calculate offsets. */
  var encodingType: js.UndefOr[String] = js.undefined
  /** The enabled features. */
  var features: js.UndefOr[Features] = js.undefined
}

object AnnotateTextRequest {
  @scala.inline
  def apply(document: Document = null, encodingType: String = null, features: Features = null): AnnotateTextRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotateTextRequest]
  }
}

