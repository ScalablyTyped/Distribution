package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of field paths on a document. Used to restrict a get or update
  * operation on a document to a subset of its fields. This is different from
  * standard field masks, as this is always scoped to a Document, and takes in
  * account the dynamic nature of Value.
  */
@js.native
trait Schema$DocumentMask extends js.Object {
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  var fieldPaths: js.UndefOr[js.Array[String]] = js.native
}

object Schema$DocumentMask {
  @scala.inline
  def apply(fieldPaths: js.Array[String] = null): Schema$DocumentMask = {
    val __obj = js.Dynamic.literal()
    if (fieldPaths != null) __obj.updateDynamic("fieldPaths")(fieldPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DocumentMask]
  }
}

