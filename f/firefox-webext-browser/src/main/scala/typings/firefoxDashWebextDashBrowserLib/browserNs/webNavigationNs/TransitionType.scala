package typings
package firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* webNavigation types */
/**
  * Cause of the navigation. The same transition types as defined in the history API are used. These are the same
  * transition types as defined in the history API except with `"start_page"` in place of `"auto_toplevel"` (for
  * backwards compatibility).
  */
/* Rewritten from type alias, can be one of: 
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.link
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.typed
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.auto_bookmark
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.auto_subframe
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.manual_subframe
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.generated
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.start_page
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.form_submit
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.reload
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.keyword
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.keyword_generated
*/
trait TransitionType extends js.Object

