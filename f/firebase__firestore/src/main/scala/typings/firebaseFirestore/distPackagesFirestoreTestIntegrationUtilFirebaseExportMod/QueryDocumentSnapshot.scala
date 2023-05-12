package typings.firebaseFirestore.distPackagesFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/test/integration/util/firebase_export", "QueryDocumentSnapshot")
@js.native
open class QueryDocumentSnapshot[T] protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcMod.QueryDocumentSnapshot[T] {
  def this(
    _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Null,
    metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata
  ) = this()
  /** @hideconstructor protected */
  def this(
    _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Document,
    metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata
  ) = this()
  def this(
    _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Null,
    metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
    document: Document,
    metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
}
