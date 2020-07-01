package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseFirestore.databaseMod.Firestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "initializeFirestore")
@js.native
object initializeFirestore extends js.Object {
  def apply(
    app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any,
    settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Settings */ js.Any
  ): Firestore = js.native
}

