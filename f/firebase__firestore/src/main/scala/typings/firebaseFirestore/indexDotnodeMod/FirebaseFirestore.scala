package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.databaseMod.Firestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "FirebaseFirestore")
@js.native
class FirebaseFirestore protected () extends Firestore {
  def this(
    app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any,
    authProvider: Provider[FirebaseAuthInternalName]
  ) = this()
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "FirebaseFirestore")
@js.native
object FirebaseFirestore extends js.Object {
  var databaseIdFromApp: js.Any = js.native
}

