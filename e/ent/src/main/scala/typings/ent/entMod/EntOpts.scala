package typings.ent.entMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntOpts extends js.Object {
  /**
  	 * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
  	 */
  var named: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
  	 */
  var numeric: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If opts.special is set to an Object, the key names will be forced to be encoded (defaults to forcing: <>'"&)
  	 */
  var special: js.UndefOr[js.Any] = js.undefined
}

object EntOpts {
  @scala.inline
  def apply(
    named: js.UndefOr[Boolean] = js.undefined,
    numeric: js.UndefOr[Boolean] = js.undefined,
    special: js.Any = null
  ): EntOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(named)) __obj.updateDynamic("named")(named.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (special != null) __obj.updateDynamic("special")(special.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntOpts]
  }
}

