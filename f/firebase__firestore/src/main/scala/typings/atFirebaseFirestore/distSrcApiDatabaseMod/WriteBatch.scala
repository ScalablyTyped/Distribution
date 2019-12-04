package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import typings.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "WriteBatch")
@js.native
class WriteBatch protected ()
  extends typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.WriteBatch {
  def this(_firestore: Firestore) = this()
  var _committed: js.Any = js.native
  var _firestore: js.Any = js.native
  var _mutations: js.Any = js.native
  var verifyNotCommitted: js.Any = js.native
  def update(
    documentRef: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference,
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): WriteBatch = js.native
}

