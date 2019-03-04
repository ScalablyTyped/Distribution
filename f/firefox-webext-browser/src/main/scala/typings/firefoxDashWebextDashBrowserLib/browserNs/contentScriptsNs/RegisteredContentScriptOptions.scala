package typings
package firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* contentScripts types */
/** Details of a content script registered programmatically */
trait RegisteredContentScriptOptions extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current
    * page. By default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[scala.Boolean] = js.undefined
  /** The list of CSS files to inject */
  var css: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.ExtensionFileOrCode]
  ] = js.undefined
  var excludeGlobs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var excludeMatches: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern]
  ] = js.undefined
  var includeGlobs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of JS files to inject */
  @JSName("js")
  var js_ : js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.ExtensionFileOrCode]
  ] = js.undefined
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var matchAboutBlank: js.UndefOr[scala.Boolean] = js.undefined
  var matches: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern]
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.RunAt] = js.undefined
}

object RegisteredContentScriptOptions {
  @scala.inline
  def apply(
    matches: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern],
    allFrames: js.UndefOr[scala.Boolean] = js.undefined,
    css: js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.ExtensionFileOrCode] = null,
    excludeGlobs: js.Array[java.lang.String] = null,
    excludeMatches: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern] = null,
    includeGlobs: js.Array[java.lang.String] = null,
    js_ : js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.ExtensionFileOrCode] = null,
    matchAboutBlank: js.UndefOr[scala.Boolean] = js.undefined,
    runAt: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.RunAt = null
  ): RegisteredContentScriptOptions = {
    val __obj = js.Dynamic.literal(matches = matches)
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames)
    if (css != null) __obj.updateDynamic("css")(css)
    if (excludeGlobs != null) __obj.updateDynamic("excludeGlobs")(excludeGlobs)
    if (excludeMatches != null) __obj.updateDynamic("excludeMatches")(excludeMatches)
    if (includeGlobs != null) __obj.updateDynamic("includeGlobs")(includeGlobs)
    if (js_ != null) __obj.updateDynamic("js")(js_)
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank)
    if (runAt != null) __obj.updateDynamic("runAt")(runAt)
    __obj.asInstanceOf[RegisteredContentScriptOptions]
  }
}

