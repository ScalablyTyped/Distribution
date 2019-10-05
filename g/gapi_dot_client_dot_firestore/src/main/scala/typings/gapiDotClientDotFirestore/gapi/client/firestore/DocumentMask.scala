package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMask extends js.Object {
  /**
    * The list of field paths in the mask. See Document.fields for a field
    * path syntax reference.
    */
  var fieldPaths: js.UndefOr[js.Array[String]] = js.undefined
}

object DocumentMask {
  @scala.inline
  def apply(fieldPaths: js.Array[String] = null): DocumentMask = {
    val __obj = js.Dynamic.literal()
    if (fieldPaths != null) __obj.updateDynamic("fieldPaths")(fieldPaths)
    __obj.asInstanceOf[DocumentMask]
  }
}

