package typings
package expressDashSessionLib.expressDashSessionMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends SessionData {
  @JSName("cookie")
  var cookie_Session: SessionCookie
  var id: java.lang.String
  def destroy(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  def regenerate(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  def reload(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  def save(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  def touch(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
}

