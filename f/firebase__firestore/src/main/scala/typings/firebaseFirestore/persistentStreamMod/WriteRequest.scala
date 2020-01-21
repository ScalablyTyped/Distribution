package typings.firebaseFirestore.persistentStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteRequest * / any */ trait WriteRequest extends js.Object {
  var database: js.UndefOr[String] = js.undefined
}

object WriteRequest {
  @scala.inline
  def apply(database: String = null): WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRequest]
  }
}

