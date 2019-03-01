package typings
package atFirebaseFirestoreDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delete extends js.Object {
  def delete(): js.Promise[scala.Unit]
}

object Anon_Delete {
  @scala.inline
  def apply(delete: js.Function0[js.Promise[scala.Unit]]): Anon_Delete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.asInstanceOf[Anon_Delete]
  }
}

