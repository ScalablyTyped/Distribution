package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcApiReferenceMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/reference", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T] {
    def this(firestore: Firestore, converter: Null, _path: ResourcePath) = this()
    /** @hideconstructor */
    def this(firestore: Firestore, converter: FirestoreDataConverter[T], _path: ResourcePath) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/reference", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T] {
    def this(
      firestore: Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _key: DocumentKey
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _key: DocumentKey
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/reference", "Query")
  @js.native
  open class Query[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query[T] {
    def this(
      firestore: Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _query: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
    ) = this()
    /** @hideconstructor protected */
    def this(
      firestore: Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _query: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
    ) = this()
  }
  
  inline def collection(firestore: Firestore, path: String, pathSegments: String*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(firestore: Firestore, collectionId: String): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query[DocumentData]]
  
  inline def doc(firestore: Firestore, path: String, pathSegments: String*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    path: Unit,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
  
  inline def queryEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
