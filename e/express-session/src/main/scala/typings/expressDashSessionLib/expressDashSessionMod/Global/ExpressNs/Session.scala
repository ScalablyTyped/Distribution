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

object Session {
  @scala.inline
  def apply(
    cookie: SessionCookie,
    destroy: js.Function1[js.Function1[/* err */ js.Any, scala.Unit], scala.Unit],
    id: java.lang.String,
    regenerate: js.Function1[js.Function1[/* err */ js.Any, scala.Unit], scala.Unit],
    reload: js.Function1[js.Function1[/* err */ js.Any, scala.Unit], scala.Unit],
    save: js.Function1[js.Function1[/* err */ js.Any, scala.Unit], scala.Unit],
    touch: js.Function1[js.Function1[/* err */ js.Any, scala.Unit], scala.Unit]
  ): Session = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie")(cookie)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("regenerate")(regenerate)
    __obj.updateDynamic("reload")(reload)
    __obj.updateDynamic("save")(save)
    __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[Session]
  }
}

