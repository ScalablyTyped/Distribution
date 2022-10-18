package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.UpdateData
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.QuerySnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter
import typings.firebaseFirestoreTypes.mod.DocumentData
import typings.firebaseFirestoreTypes.mod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLiteApiReferenceImplMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/reference_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/reference_impl", "LiteUserDataWriter")
  @js.native
  open class LiteUserDataWriter protected () extends AbstractUserDataWriter {
    def this(firestore: Firestore) = this()
    
    /* protected */ var firestore: Firestore = js.native
  }
  
  inline def addDoc[T](reference: CollectionReference[T], data: WithFieldValue[T]): js.Promise[DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentReference[T]]]
  
  inline def applyFirestoreDataConverter[T](converter: Null, value: PartialWithFieldValue[T] | WithFieldValue[T]): DocumentData = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFirestoreDataConverter")(converter.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DocumentData]
  inline def applyFirestoreDataConverter[T](converter: Null, value: PartialWithFieldValue[T] | WithFieldValue[T], options: SetOptions): DocumentData = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFirestoreDataConverter")(converter.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DocumentData]
  inline def applyFirestoreDataConverter[T](converter: UntypedFirestoreDataConverter[T], value: PartialWithFieldValue[T] | WithFieldValue[T]): DocumentData = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFirestoreDataConverter")(converter.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DocumentData]
  inline def applyFirestoreDataConverter[T](
    converter: UntypedFirestoreDataConverter[T],
    value: PartialWithFieldValue[T] | WithFieldValue[T],
    options: SetOptions
  ): DocumentData = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFirestoreDataConverter")(converter.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DocumentData]
  
  inline def deleteDoc(reference: DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getDoc[T](reference: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: Query[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]
  
  inline def setDoc[T](
    reference: DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](reference: DocumentReference[T], data: WithFieldValue[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(reference: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(reference: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](reference: DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
