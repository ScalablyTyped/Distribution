package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMask extends js.Object {
  var fieldPaths: js.UndefOr[js.Array[String]] = js.undefined
}

object DocumentMask {
  @scala.inline
  def apply(fieldPaths: js.Array[String] = null): DocumentMask = {
    val __obj = js.Dynamic.literal()
    if (fieldPaths != null) __obj.updateDynamic("fieldPaths")(fieldPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMask]
  }
}

