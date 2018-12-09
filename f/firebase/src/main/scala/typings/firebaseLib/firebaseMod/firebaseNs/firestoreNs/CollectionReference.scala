package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionReference extends Query {
  /** The identifier of the collection. */
  val id: java.lang.String = js.native
  /**
       * A reference to the containing Document if this is a subcollection, else
       * null.
       */
  val parent: DocumentReference | scala.Null = js.native
  /**
       * A string representing the path of the referenced collection (relative
       * to the root of the database).
       */
  val path: java.lang.String = js.native
  /**
       * Add a new document to this collection with the specified data, assigning
       * it a document ID automatically.
       *
       * @param data An Object containing the data for the new document.
       * @return A Promise resolved with a `DocumentReference` pointing to the
       * newly created document after it has been written to the backend.
       */
  def add(data: DocumentData): js.Promise[DocumentReference] = js.native
  /**
       * Get a `DocumentReference` for the document within the collection at the
       * specified path. If no path is specified, an automatically-generated
       * unique ID will be used for the returned DocumentReference.
       *
       * @param documentPath A slash-separated path to a document.
       * @return The `DocumentReference` instance.
       */
  def doc(): DocumentReference = js.native
  /**
       * Get a `DocumentReference` for the document within the collection at the
       * specified path. If no path is specified, an automatically-generated
       * unique ID will be used for the returned DocumentReference.
       *
       * @param documentPath A slash-separated path to a document.
       * @return The `DocumentReference` instance.
       */
  def doc(documentPath: java.lang.String): DocumentReference = js.native
  /**
       * Returns true if this `CollectionReference` is equal to the provided one.
       *
       * @param other The `CollectionReference` to compare against.
       * @return true if this `CollectionReference` is equal to the provided one.
       */
  def isEqual(other: CollectionReference): scala.Boolean = js.native
}

