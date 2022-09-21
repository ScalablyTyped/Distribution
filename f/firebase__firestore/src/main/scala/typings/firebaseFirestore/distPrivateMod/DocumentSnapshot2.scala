package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `DocumentSnapshot` contains data read from a document in your Firestore
  * database. The data can be extracted with `.data()` or `.get(<field>)` to
  * get a specific field.
  *
  * For a `DocumentSnapshot` that points to a non-existing document, any data
  * access will return 'undefined'. You can use the `exists()` method to
  * explicitly verify a document's existence.
  */
@js.native
trait DocumentSnapshot2[T] extends StObject {
  
  var _converter: UntypedFirestoreDataConverter[T] | Null = js.native
  
  var _document: Document2 | Null = js.native
  
  var _firestore: Firestore2 = js.native
  
  var _key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any = js.native
  
  var _userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any = js.native
  
  /**
    * Retrieves all fields in the document as an `Object`. Returns `undefined` if
    * the document doesn't exist.
    *
    * @returns An `Object` containing all fields in the document or `undefined`
    * if the document doesn't exist.
    */
  def data(): js.UndefOr[T] = js.native
  
  /**
    * Signals whether or not the document at the snapshot's location exists.
    *
    * @returns true if the document exists.
    */
  def exists(): /* is @firebase/firestore.@firebase/firestore/dist/private.QueryDocumentSnapshot_2<T> */ Boolean = js.native
  
  /**
    * Retrieves the field specified by `fieldPath`. Returns `undefined` if the
    * document or field doesn't exist.
    *
    * @param fieldPath - The path (for example 'foo' or 'foo.bar') to a specific
    * field.
    * @returns The data at the specified field location or undefined if no such
    * field exists in the document.
    */
  def get(fieldPath: String): Any = js.native
  def get(fieldPath: FieldPath): Any = js.native
  
  /** Property of the `DocumentSnapshot` that provides the document's ID. */
  def id: String = js.native
  
  /**
    * The `DocumentReference` for the document included in the `DocumentSnapshot`.
    */
  def ref: DocumentReference[T] = js.native
}
