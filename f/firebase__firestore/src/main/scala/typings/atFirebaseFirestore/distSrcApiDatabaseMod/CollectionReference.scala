package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import typings.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query because Already inherited
- typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.CollectionReference because Inheritance from two classes. Inlined id, parent, path, add, doc, doc, isEqual */ @JSImport("@firebase/firestore/dist/src/api/database", "CollectionReference")
@js.native
class CollectionReference protected () extends Query {
  def this(path: ResourcePath, firestore: Firestore) = this()
  @JSName("id")
  val id_FCollectionReference: String = js.native
  @JSName("parent")
  val parent_FCollectionReference: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference | Null = js.native
  @JSName("path")
  val path_FCollectionReference: String = js.native
  def add(value: DocumentData): js.Promise[
    typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference
  ] = js.native
  def doc(): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference = js.native
  def doc(pathString: String): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference = js.native
  def id(): String = js.native
  def isEqual(other: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.CollectionReference): Boolean = js.native
  def parent(): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference | Null = js.native
  def path(): String = js.native
}

