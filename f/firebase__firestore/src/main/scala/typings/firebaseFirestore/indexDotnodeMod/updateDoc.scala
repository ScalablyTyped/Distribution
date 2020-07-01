package typings.firebaseFirestore.indexDotnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "updateDoc")
@js.native
object updateDoc extends js.Object {
  def apply(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.UpdateData */ js.Any
  ): js.Promise[Unit] = js.native
  def apply(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    field: String,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): js.Promise[Unit] = js.native
  def apply(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldPath */ js.Any,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): js.Promise[Unit] = js.native
}

