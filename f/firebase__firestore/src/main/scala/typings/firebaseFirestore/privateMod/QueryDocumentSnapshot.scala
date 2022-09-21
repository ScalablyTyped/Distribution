package typings.firebaseFirestore.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/private", "QueryDocumentSnapshot")
@js.native
open class QueryDocumentSnapshot[T] protected () extends DocumentSnapshot[T] {
  /** @hideconstructor protected */
  def this(
    _firestore: Firestore,
    _userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    _key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any
  ) = this()
  def this(
    _firestore: Firestore,
    _userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    _key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any,
    _document: Document2
  ) = this()
  def this(
    _firestore: Firestore,
    _userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    _key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any,
    _document: Null,
    _converter: UntypedFirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: Firestore,
    _userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    _key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any,
    _document: Document2,
    _converter: UntypedFirestoreDataConverter[T]
  ) = this()
}
