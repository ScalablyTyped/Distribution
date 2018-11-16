package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsNs {
  /* tabs types */
  /** An event that caused a muted state change. */
  type MutedInfoReason = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.user | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.capture | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.extension
  /** Whether the tabs have completed loading. */
  type TabStatus = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.loading | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.complete
  /** Event names supported in onUpdated. */
  type UpdatePropertyName = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.attention | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.audible | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.discarded | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.favIconUrl | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.hidden | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.isarticle | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.isArticle | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.mutedInfo | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.pinned | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.sharingState | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.status | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.title
  /** The type of window. */
  type WindowType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.normal | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.popup | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.panel | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.app | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.devtools
  /**
       * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page;
       * defaults to `automatic`.
       */
  type ZoomSettingsMode = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.automatic | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.manual | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.disabled
  /**
       * Defines whether zoom changes will persist for the page's origin, or only take effect in this tab; defaults to
       * `per-origin` when in `automatic` mode, and `per-tab` otherwise.
       */
  type ZoomSettingsScope = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.`per-origin` | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.`per-tab`
  type _QueryScreen = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.Screen | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.Window | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.Application
  type _TabsOnUpdatedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filter */ js.UndefOr[UpdateFilter], scala.Unit], 
    T
  ]
}
