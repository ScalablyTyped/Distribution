package typings
package entLib.entMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EntOpts extends js.Object {
  /**
  	 * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
  	 */
  var named: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
  	 */
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If opts.special is set to an Object, the key names will be forced to be encoded (defaults to forcing: <>'"&)
  	 */
  var special: js.UndefOr[js.Any] = js.undefined
}

