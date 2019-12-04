package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import typings.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath
import typings.atFirebaseFirestore.distSrcModelDocumentMod.Document
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "DocumentSnapshot")
@js.native
class DocumentSnapshot protected ()
  extends typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentSnapshot {
  def this(
    _firestore: Firestore,
    _key: DocumentKey,
    _document: Null,
    _fromCache: Boolean,
    _hasPendingWrites: Boolean
  ) = this()
  def this(
    _firestore: Firestore,
    _key: DocumentKey,
    _document: Document,
    _fromCache: Boolean,
    _hasPendingWrites: Boolean
  ) = this()
  var _document: Document | Null = js.native
  var _firestore: js.Any = js.native
  var _fromCache: js.Any = js.native
  var _hasPendingWrites: js.Any = js.native
  var _key: js.Any = js.native
  var convertArray: js.Any = js.native
  var convertObject: js.Any = js.native
  var convertValue: js.Any = js.native
  def get(fieldPath: FieldPath): js.Any = js.native
  def get(
    fieldPath: FieldPath,
    options: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.SnapshotOptions
  ): js.Any = js.native
}

