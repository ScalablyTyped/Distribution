package typings.firebase.firebaseMod.firebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionReference[T]
  extends StObject
     with Query[T] {
  
  /**
    * Add a new document to this collection with the specified data, assigning
    * it a document ID automatically.
    *
    * @param data An Object containing the data for the new document.
    * @return A Promise resolved with a `DocumentReference` pointing to the
    * newly created document after it has been written to the backend.
    */
  def add(data: T): js.Promise[DocumentReference[T]] = js.native
  
  /**
    * Get a `DocumentReference` for the document within the collection at the
    * specified path. If no path is specified, an automatically-generated
    * unique ID will be used for the returned DocumentReference.
    *
    * @param documentPath A slash-separated path to a document.
    * @return The `DocumentReference` instance.
    */
  def doc(): DocumentReference[T] = js.native
  def doc(documentPath: String): DocumentReference[T] = js.native
  
  /** The collection's identifier. */
  val id: String = js.native
  
  /**
    * Returns true if this `CollectionReference` is equal to the provided one.
    *
    * @param other The `CollectionReference` to compare against.
    * @return true if this `CollectionReference` is equal to the provided one.
    */
  def isEqual(other: CollectionReference[T]): Boolean = js.native
  
  /**
    * A reference to the containing `DocumentReference` if this is a subcollection.
    * If this isn't a subcollection, the reference is null.
    */
  val parent: DocumentReference[DocumentData] | Null = js.native
  
  /**
    * A string representing the path of the referenced collection (relative
    * to the root of the database).
    */
  val path: String = js.native
}
