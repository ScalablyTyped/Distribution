package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseFirestore.databaseMod.Firestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "Query")
@js.native
class Query[T] protected ()
  extends typings.firebaseFirestore.referenceMod.Query[T] {
  def this(firestore: Firestore, _query: typings.firebaseFirestore.queryMod.Query) = this()
  def this(
    firestore: Firestore,
    _query: typings.firebaseFirestore.queryMod.Query,
    _converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any
  ) = this()
}

