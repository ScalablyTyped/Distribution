package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/query", "InFilter")
@js.native
class InFilter protected () extends FieldFilter {
  def this(
    field: FieldPath,
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ) = this()
}

