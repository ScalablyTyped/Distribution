package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseFirestore.databaseMod.Firestore
import typings.firebaseFirestore.pathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "CollectionReference")
@js.native
class CollectionReference[T] protected ()
  extends typings.firebaseFirestore.referenceMod.CollectionReference[T] {
  def this(firestore: Firestore, _path: ResourcePath) = this()
  def this(
    firestore: Firestore,
    _path: ResourcePath,
    _converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any
  ) = this()
}

