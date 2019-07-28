package typings.expressDashFlashDash2.expressDashFlashDash2Mod.Global.ExpressNs

import typings.expressDashFlashDash2.Anon_Flash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var locals: Anon_Flash = js.native
  /**
    * Queue flash `msg` of the given `type`.
    *
    * Examples:
    *
    *      req.flash('info', 'email sent');
    *      req.flash('error', 'email delivery failed');
    *      req.flash('info', 'email re-sent');
    *
    *
    * Formatting:
    *
    * Flash notifications also support arbitrary formatting support.
    * For example you may pass variable arguments to `req.flash()`
    * and use the %s specifier to be replaced by the associated argument:
    *
    *     req.flash('info', 'email has been sent to %s.', userName);
    *
    * Formatting uses `util.format()`, which is available on Node 0.6+.
    */
  def flash(`type`: String, msg: String): Unit = js.native
  def flash(`type`: String, msg: js.Array[_]): Unit = js.native
}

