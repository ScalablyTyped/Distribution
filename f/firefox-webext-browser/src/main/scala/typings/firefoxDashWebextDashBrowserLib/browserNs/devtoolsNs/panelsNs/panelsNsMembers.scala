package typings
package firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.devtools.panels")
@js.native
object panelsNsMembers extends js.Object {
  /* devtools.panels properties */
  /** Elements panel. */
  val elements: ElementsPanel = js.native
  /* devtools.panels events */
  /**
       * Fired when the devtools theme changes.
       * @param themeName The name of the current devtools theme.
       */
  val onThemeChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* themeName */ java.lang.String, scala.Unit]] = js.native
  /** Sources panel. */
  val sources: SourcesPanel = js.native
  /** The name of the current devtools theme. */
  val themeName: java.lang.String = js.native
  /* devtools.panels functions */
  /**
       * Creates an extension panel.
       * @param title Title that is displayed next to the extension icon in the Developer Tools toolbar.
       * @param iconPath Path of the panel's icon relative to the extension directory, or an empty string to use the
       *     default extension icon as the panel icon.
       * @param pagePath Path of the panel's HTML page relative to the extension directory.
       */
  def create(
    title: java.lang.String,
    iconPath: _Create,
    pagePath: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL
  ): stdLib.Promise[js.UndefOr[ExtensionPanel]] = js.native
  /* devtools.panels functions */
  /**
       * Creates an extension panel.
       * @param title Title that is displayed next to the extension icon in the Developer Tools toolbar.
       * @param iconPath Path of the panel's icon relative to the extension directory, or an empty string to use the
       *     default extension icon as the panel icon.
       * @param pagePath Path of the panel's HTML page relative to the extension directory.
       */
  def create(
    title: java.lang.String,
    iconPath: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL,
    pagePath: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL
  ): stdLib.Promise[js.UndefOr[ExtensionPanel]] = js.native
  /**
       * Requests DevTools to open a URL in a Developer Tools panel.
       * @param url The URL of the resource to open.
       * @param lineNumber Specifies the line number to scroll to when the resource is loaded.
       * @deprecated Unsupported on Firefox at this time.
       */
  def openResource(url: java.lang.String, lineNumber: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Specifies the function to be called when the user clicks a resource link in the Developer Tools window. To unset
       * the handler, either call the method with no parameters or pass null as the parameter.
       * @deprecated Unsupported on Firefox at this time.
       */
  def setOpenResourceHandler(): stdLib.Promise[
    js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.inspectedWindowNs.Resource]
  ] = js.native
}

