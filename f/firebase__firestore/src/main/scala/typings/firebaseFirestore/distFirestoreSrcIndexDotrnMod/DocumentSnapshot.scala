package typings.firebaseFirestore.distFirestoreSrcIndexDotrnMod

import typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src/index.rn", "DocumentSnapshot")
@js.native
open class DocumentSnapshot[T] protected ()
  extends typings.firebaseFirestore.distFirestoreSrcApiMod.DocumentSnapshot[T] {
  def this(
    _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Null,
    metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata
  ) = this()
  /** @hideconstructor protected */
  def this(
    _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Document,
    metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata
  ) = this()
  def this(
    _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Null,
    metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Document,
    metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
}
