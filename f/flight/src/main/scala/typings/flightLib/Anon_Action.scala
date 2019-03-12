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
    logAll: () => scala.Unit,
    logByAction: java.lang.String => scala.Unit,
    logByName: java.lang.String => scala.Unit,
    logNone: () => scala.Unit
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(logAll = js.Any.fromFunction0(logAll), logByAction = js.Any.fromFunction1(logByAction), logByName = js.Any.fromFunction1(logByName), logNone = js.Any.fromFunction0(logNone))
  
    __obj.asInstanceOf[Anon_Action]
  }
}

