package typings
package dispatchrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionName extends js.Object {
  var actionName: js.UndefOr[java.lang.String] = js.undefined
  var error: nodeLib.Error
  var payload: js.UndefOr[js.Any] = js.undefined
}

object Anon_ActionName {
  @scala.inline
  def apply(error: nodeLib.Error, actionName: java.lang.String = null, payload: js.Any = null): Anon_ActionName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Anon_ActionName]
  }
}

