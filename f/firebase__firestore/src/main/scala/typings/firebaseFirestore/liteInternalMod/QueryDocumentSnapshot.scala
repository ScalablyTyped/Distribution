package typings.firebaseFirestore.liteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/internal", "QueryDocumentSnapshot")
@js.native
open class QueryDocumentSnapshot[T] protected () extends DocumentSnapshot[T] {
  /** @hideconstructor protected */
  def this(_firestore: Firestore, _userDataWriter: AbstractUserDataWriter, _key: DocumentKey) = this()
  def this(
    _firestore: Firestore,
    _userDataWriter: AbstractUserDataWriter,
    _key: DocumentKey,
    _document: Document2
  ) = this()
  def this(
    _firestore: Firestore,
    _userDataWriter: AbstractUserDataWriter,
    _key: DocumentKey,
    _document: Null,
    _converter: UntypedFirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: Firestore,
    _userDataWriter: AbstractUserDataWriter,
    _key: DocumentKey,
    _document: Document2,
    _converter: UntypedFirestoreDataConverter[T]
  ) = this()
}
