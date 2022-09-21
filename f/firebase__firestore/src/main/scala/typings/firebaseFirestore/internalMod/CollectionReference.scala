package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "CollectionReference")
@js.native
open class CollectionReference[T] protected () extends Query_[T] {
  def this(firestore: Firestore2, converter: Null, _path: ResourcePath) = this()
  /** @hideconstructor */
  def this(firestore: Firestore2, converter: FirestoreDataConverter2[T], _path: ResourcePath) = this()
  
  val _path: ResourcePath = js.native
  
  /** The collection's identifier. */
  def id: String = js.native
  
  /**
    * A reference to the containing `DocumentReference` if this is a
    * subcollection. If this isn't a subcollection, the reference is null.
    */
  def parent: DocumentReference[DocumentData] | Null = js.native
  
  /**
    * A string representing the path of the referenced collection (relative
    * to the root of the database).
    */
  def path: String = js.native
  
  /** The type of this Firestore reference. */
  @JSName("type")
  val type_CollectionReference: /* "collection" */ String = js.native
}
