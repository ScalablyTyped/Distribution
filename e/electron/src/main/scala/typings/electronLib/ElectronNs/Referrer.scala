package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Referrer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/referrer
  /**
    * Can be default, unsafe-url, no-referrer-when-downgrade, no-referrer, origin,
    * strict-origin-when-cross-origin, same-origin or strict-origin. See the for more
    * details on the meaning of these values.
    */
  var policy: electronLib.electronLibStrings.default | electronLib.electronLibStrings.`unsafe-url` | electronLib.electronLibStrings.`no-referrer-when-downgrade` | electronLib.electronLibStrings.`no-referrer` | electronLib.electronLibStrings.origin | electronLib.electronLibStrings.`strict-origin-when-cross-origin` | electronLib.electronLibStrings.`same-origin` | electronLib.electronLibStrings.`strict-origin`
  /**
    * HTTP Referrer URL.
    */
  var url: java.lang.String
}

object Referrer {
  @scala.inline
  def apply(
    policy: electronLib.electronLibStrings.default | electronLib.electronLibStrings.`unsafe-url` | electronLib.electronLibStrings.`no-referrer-when-downgrade` | electronLib.electronLibStrings.`no-referrer` | electronLib.electronLibStrings.origin | electronLib.electronLibStrings.`strict-origin-when-cross-origin` | electronLib.electronLibStrings.`same-origin` | electronLib.electronLibStrings.`strict-origin`,
    url: java.lang.String
  ): Referrer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Referrer]
  }
}

