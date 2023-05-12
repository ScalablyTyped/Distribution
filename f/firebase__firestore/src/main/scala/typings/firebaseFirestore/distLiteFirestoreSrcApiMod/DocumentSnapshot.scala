package typings.firebaseFirestore.distLiteFirestoreSrcApiMod

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/api", "DocumentSnapshot")
@js.native
open class DocumentSnapshot[T] protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.DocumentSnapshot[T] {
  def this(
    _firestore: typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Null,
    metadata: typings.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.SnapshotMetadata
  ) = this()
  /** @hideconstructor protected */
  def this(
    _firestore: typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Document,
    metadata: typings.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.SnapshotMetadata
  ) = this()
  def this(
    _firestore: typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Null,
    metadata: typings.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Document,
    metadata: typings.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
}
