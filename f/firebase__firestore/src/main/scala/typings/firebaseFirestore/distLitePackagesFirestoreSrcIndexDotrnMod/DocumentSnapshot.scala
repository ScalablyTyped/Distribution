package typings.firebaseFirestore.distLitePackagesFirestoreSrcIndexDotrnMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/index.rn", "DocumentSnapshot")
@js.native
open class DocumentSnapshot[T] protected ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod.DocumentSnapshot[T] {
  def this(
    _firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Null,
    metadata: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata
  ) = this()
  /** @hideconstructor protected */
  def this(
    _firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Document,
    metadata: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata
  ) = this()
  def this(
    _firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Null,
    metadata: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Document,
    metadata: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
}
