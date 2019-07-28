package typings.gapiDotClientDotLanguage.gapiNs.clientNs.languageNs

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
    if (document != null) __obj.updateDynamic("document")(document)
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType)
    if (features != null) __obj.updateDynamic("features")(features)
    __obj.asInstanceOf[AnnotateTextRequest]
  }
}

