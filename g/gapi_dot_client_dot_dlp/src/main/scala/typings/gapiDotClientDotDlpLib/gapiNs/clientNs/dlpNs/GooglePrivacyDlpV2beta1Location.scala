package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Location extends js.Object {
  /** Zero-based byte offsets within a content item. */
  var byteRange: js.UndefOr[GooglePrivacyDlpV2beta1Range] = js.undefined
  /**
    * Character offsets within a content item, included when content type
    * is a text. Default charset assumed to be UTF-8.
    */
  var codepointRange: js.UndefOr[GooglePrivacyDlpV2beta1Range] = js.undefined
  /** Field id of the field containing the finding. */
  var fieldId: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
  /** Location within an image's pixels. */
  var imageBoxes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ImageLocation]] = js.undefined
  /** Key of the finding. */
  var recordKey: js.UndefOr[GooglePrivacyDlpV2beta1RecordKey] = js.undefined
  /** Location within a `ContentItem.Table`. */
  var tableLocation: js.UndefOr[GooglePrivacyDlpV2beta1TableLocation] = js.undefined
}

