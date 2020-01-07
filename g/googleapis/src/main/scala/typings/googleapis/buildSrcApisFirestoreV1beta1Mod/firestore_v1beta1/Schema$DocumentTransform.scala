package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation of a document.
  */
@js.native
trait Schema$DocumentTransform extends js.Object {
  /**
    * The name of the document to transform.
    */
  var document: js.UndefOr[String] = js.native
  /**
    * The list of transformations to apply to the fields of the document, in
    * order. This must not be empty.
    */
  var fieldTransforms: js.UndefOr[js.Array[Schema$FieldTransform]] = js.native
}

object Schema$DocumentTransform {
  @scala.inline
  def apply(document: String = null, fieldTransforms: js.Array[Schema$FieldTransform] = null): Schema$DocumentTransform = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (fieldTransforms != null) __obj.updateDynamic("fieldTransforms")(fieldTransforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DocumentTransform]
  }
}

