package typings
package firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a panel created by extension. */
trait ExtensionPanel extends js.Object {
  /**
    * Appends a button to the status bar of the panel.
    * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two
    *     32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the
    *     button is pressed.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    * @deprecated Unsupported on Firefox at this time.
    */
  var createStatusBarButton: js.UndefOr[
    js.Function3[
      /* iconPath */ java.lang.String, 
      /* tooltipText */ java.lang.String, 
      /* disabled */ scala.Boolean, 
      Button
    ]
  ] = js.undefined
  /** Fired when the user switches away from the panel. */
  var onHidden: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]]
  /**
    * Fired upon a search action (start of a new search, search result navigation, or search being canceled).
    * @param action Type of search action being performed.
    * @param [queryString] Query string (only for 'performSearch').
    * @deprecated Unsupported on Firefox at this time.
    */
  var onSearch: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[
      /* action */ java.lang.String, 
      /* queryString */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ]
  /**
    * Fired when the user switches to the panel.
    * @param window The JavaScript `window` object of panel's page.
    */
  var onShown: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* window */ js.Object, scala.Unit]]
}

