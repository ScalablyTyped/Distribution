package typings.expressSession.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends SessionData {
  @JSName("cookie")
  var cookie_Session: SessionCookie = js.native
  var id: String = js.native
  def destroy(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def regenerate(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def reload(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def save(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def touch(): Unit = js.native
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
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCookie(value: SessionCookie): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegenerate(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = this.set("regenerate", js.Any.fromFunction1(value))
    @scala.inline
    def setReload(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = this.set("reload", js.Any.fromFunction1(value))
    @scala.inline
    def setSave(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def setTouch(value: () => Unit): Self = this.set("touch", js.Any.fromFunction0(value))
  }
  
}

