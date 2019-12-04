package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentTransform extends js.Object {
  var document: js.UndefOr[String] = js.undefined
  var fieldTransforms: js.UndefOr[
    js.Array[
      typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.FieldTransform
    ]
  ] = js.undefined
}

object DocumentTransform {
  @scala.inline
  def apply(
    document: String = null,
    fieldTransforms: js.Array[
      typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.FieldTransform
    ] = null
  ): DocumentTransform = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (fieldTransforms != null) __obj.updateDynamic("fieldTransforms")(fieldTransforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentTransform]
  }
}

