package typings
package flightLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  def logAll(): scala.Unit
  def logByAction(action: java.lang.String): scala.Unit
  def logByName(name: java.lang.String): scala.Unit
  def logNone(): scala.Unit
}

object Anon_Action {
  @scala.inline
  def apply(
    logAll: js.Function0[scala.Unit],
    logByAction: js.Function1[java.lang.String, scala.Unit],
    logByName: js.Function1[java.lang.String, scala.Unit],
    logNone: js.Function0[scala.Unit]
  ): Anon_Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logAll")(logAll)
    __obj.updateDynamic("logByAction")(logByAction)
    __obj.updateDynamic("logByName")(logByName)
    __obj.updateDynamic("logNone")(logNone)
    __obj.asInstanceOf[Anon_Action]
  }
}

