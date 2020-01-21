package typings.firebaseFirestore.apiDatabaseMod

import typings.firebaseFirestore.modelPathMod.ResourcePath
import typings.firebaseFirestoreTypes.mod.DocumentData
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.firebaseFirestoreTypes.mod.Query because Already inherited
- typings.firebaseFirestoreTypes.mod.CollectionReference because Inheritance from two classes. Inlined id, parent, path, add, doc, doc, isEqual */ @JSImport("@firebase/firestore/dist/src/api/database", "CollectionReference")
@js.native
class CollectionReference[T] protected () extends Query[T] {
  def this(_path: ResourcePath, firestore: Firestore) = this()
  def this(_path: ResourcePath, firestore: Firestore, _converter: FirestoreDataConverter[T]) = this()
  val _path: ResourcePath = js.native
  @JSName("id")
  val id_FCollectionReference: String = js.native
  @JSName("parent")
  val parent_FCollectionReference: typings.firebaseFirestoreTypes.mod.DocumentReference[DocumentData] | Null = js.native
  @JSName("path")
  val path_FCollectionReference: String = js.native
  def add(value: T): js.Promise[typings.firebaseFirestoreTypes.mod.DocumentReference[T]] = js.native
  def doc(): typings.firebaseFirestoreTypes.mod.DocumentReference[T] = js.native
  def doc(pathString: String): typings.firebaseFirestoreTypes.mod.DocumentReference[T] = js.native
  def id(): String = js.native
  def isEqual(other: typings.firebaseFirestoreTypes.mod.CollectionReference[T]): Boolean = js.native
  def parent(): typings.firebaseFirestoreTypes.mod.DocumentReference[DocumentData] | Null = js.native
  def path(): String = js.native
}

