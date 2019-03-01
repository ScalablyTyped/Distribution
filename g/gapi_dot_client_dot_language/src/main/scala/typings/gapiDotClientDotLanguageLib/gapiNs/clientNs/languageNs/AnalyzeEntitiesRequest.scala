package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzeEntitiesRequest extends js.Object {
  /** Input document. */
  var document: js.UndefOr[Document] = js.undefined
  /** The encoding type used by the API to calculate offsets. */
  var encodingType: js.UndefOr[java.lang.String] = js.undefined
}

object AnalyzeEntitiesRequest {
  @scala.inline
  def apply(document: Document = null, encodingType: java.lang.String = null): AnalyzeEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType)
    __obj.asInstanceOf[AnalyzeEntitiesRequest]
  }
}

