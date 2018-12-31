package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webNavigationNs {
  type TransitionQualifier = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.client_redirect | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.server_redirect | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.forward_back | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.from_address_bar
  /* webNavigation types */
  /**
    * Cause of the navigation. The same transition types as defined in the history API are used. These are the same
    * transition types as defined in the history API except with `"start_page"` in place of `"auto_toplevel"` (for
    * backwards compatibility).
    */
  type TransitionType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.link | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.typed | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.auto_bookmark | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.auto_subframe | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.manual_subframe | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.generated | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.start_page | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.form_submit | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.reload | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.keyword | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.keyword_generated
  type _WebNavigationOnBeforeNavigateEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filters */ js.UndefOr[EventUrlFilters], scala.Unit], 
    T
  ]
  type _WebNavigationOnCommittedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filters */ js.UndefOr[EventUrlFilters], scala.Unit], 
    T
  ]
  type _WebNavigationOnCompletedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filters */ js.UndefOr[EventUrlFilters], scala.Unit], 
    T
  ]
  type _WebNavigationOnCreatedNavigationTargetEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filters */ js.UndefOr[EventUrlFilters], scala.Unit], 
    T
  ]
  type _WebNavigationOnDOMContentLoadedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filters */ js.UndefOr[EventUrlFilters], scala.Unit], 
    T
  ]
  type _WebNavigationOnErrorOccurredEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filters */ js.UndefOr[EventUrlFilters], scala.Unit], 
    T
  ]
  type _WebNavigationOnHistoryStateUpdatedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filters */ js.UndefOr[EventUrlFilters], scala.Unit], 
    T
  ]
  type _WebNavigationOnReferenceFragmentUpdatedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filters */ js.UndefOr[EventUrlFilters], scala.Unit], 
    T
  ]
}
