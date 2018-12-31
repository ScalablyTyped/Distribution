package typings
package enzymeDashAsyncDashHelpersLib.enzymeDashAsyncDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
   // Default: true, logs the wrapper's rendered structure when the wait times out. An attempt to help out in finding what's wrong.
  var logStructureOnSuccess: js.UndefOr[scala.Boolean] = js.undefined
  var logStructureOnTimeout: js.UndefOr[scala.Boolean] = js.undefined
   // Default: 50, how often to check for validity
  var timeout: js.UndefOr[scala.Double] = js.undefined
   // Default: 2000 (2 seconds), how long to wait before timing out
  var timeoutMessage: js.UndefOr[java.lang.String] = js.undefined
}

