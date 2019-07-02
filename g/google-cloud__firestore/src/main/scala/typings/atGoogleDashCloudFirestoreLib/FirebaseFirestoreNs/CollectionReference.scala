package typings
package atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.CollectionReference")
@js.native
class CollectionReference protected () extends Query {
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
    * Get a `DocumentReference` for a randomly-named document within this
    * collection. An automatically-generated unique ID will be used as the
    * document ID.
    *
    * @return The `DocumentReference` instance.
    */
  def doc(): DocumentReference = js.native
  /**
    * Get a `DocumentReference` for the document within the collection at the
    * specified path.
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
  /**
    * Retrieves the list of documents in this collection.
    *
    * The document references returned may include references to "missing
    * documents", i.e. document locations that have no document present but
    * which contain subcollections with documents. Attempting to read such a
    * document reference (e.g. via `.get()` or `.onSnapshot()`) will return a
    * `DocumentSnapshot` whose `.exists` property is false.
    *
    * @return {Promise<DocumentReference[]>} The list of documents in this
    * collection.
    */
  def listDocuments(): js.Promise[js.Array[DocumentReference]] = js.native
}

