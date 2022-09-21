package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore", "CollectionReference")
@js.native
/* private */ open class CollectionReference[T] () extends Query_[T] {
  
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
