package typings.expressDashSession.expressDashSessionMod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends SessionData {
  @JSName("cookie")
  var cookie_Session: SessionCookie
  var id: String
  def destroy(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  def regenerate(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  def reload(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  def save(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  def touch(): Unit
}

object Session {
  @scala.inline
  def apply(
    cookie: SessionCookie,
    destroy: js.Function1[/* err */ js.Any, Unit] => Unit,
    id: String,
    regenerate: js.Function1[/* err */ js.Any, Unit] => Unit,
    reload: js.Function1[/* err */ js.Any, Unit] => Unit,
    save: js.Function1[/* err */ js.Any, Unit] => Unit,
    touch: () => Unit
  ): Session = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), id = id.asInstanceOf[js.Any], regenerate = js.Any.fromFunction1(regenerate), reload = js.Any.fromFunction1(reload), save = js.Any.fromFunction1(save), touch = js.Any.fromFunction0(touch))
  
    __obj.asInstanceOf[Session]
  }
}

