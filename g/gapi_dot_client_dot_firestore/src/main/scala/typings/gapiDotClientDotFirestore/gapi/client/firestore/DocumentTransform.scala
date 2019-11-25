package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentTransform extends js.Object {
  /** The name of the document to transform. */
  var document: js.UndefOr[String] = js.undefined
  /**
    * The list of transformations to apply to the fields of the document, in
    * order.
    */
  var fieldTransforms: js.UndefOr[js.Array[FieldTransform]] = js.undefined
}

object DocumentTransform {
  @scala.inline
  def apply(document: String = null, fieldTransforms: js.Array[FieldTransform] = null): DocumentTransform = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (fieldTransforms != null) __obj.updateDynamic("fieldTransforms")(fieldTransforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentTransform]
  }
}

