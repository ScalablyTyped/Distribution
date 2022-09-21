package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "QueryDocumentSnapshot")
@js.native
open class QueryDocumentSnapshot[T] protected () extends DocumentSnapshot[T] {
  def this(
    _firestore: Firestore,
    userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    document: Null,
    metadata: SnapshotMetadata
  ) = this()
  /** @hideconstructor protected */
  def this(
    _firestore: Firestore,
    userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    document: Document2,
    metadata: SnapshotMetadata
  ) = this()
  def this(
    _firestore: Firestore,
    userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    document: Null,
    metadata: SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: Firestore,
    userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    document: Document2,
    metadata: SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
}
