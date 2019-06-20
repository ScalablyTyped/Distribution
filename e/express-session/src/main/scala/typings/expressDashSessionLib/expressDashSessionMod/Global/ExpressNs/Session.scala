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
  def touch(): scala.Unit
}

object Session {
  @scala.inline
  def apply(
    cookie: SessionCookie,
    destroy: js.Function1[/* err */ js.Any, scala.Unit] => scala.Unit,
    id: java.lang.String,
    regenerate: js.Function1[/* err */ js.Any, scala.Unit] => scala.Unit,
    reload: js.Function1[/* err */ js.Any, scala.Unit] => scala.Unit,
    save: js.Function1[/* err */ js.Any, scala.Unit] => scala.Unit,
    touch: () => scala.Unit
  ): Session = {
    val __obj = js.Dynamic.literal(cookie = cookie, destroy = js.Any.fromFunction1(destroy), id = id, regenerate = js.Any.fromFunction1(regenerate), reload = js.Any.fromFunction1(reload), save = js.Any.fromFunction1(save), touch = js.Any.fromFunction0(touch))
  
    __obj.asInstanceOf[Session]
  }
}

