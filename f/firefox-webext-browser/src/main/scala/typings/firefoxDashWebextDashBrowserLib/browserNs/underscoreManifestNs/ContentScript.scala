package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be
     * set at the same time. Based on InjectDetails, but using underscore rather than camel case naming conventions.
     */

trait ContentScript extends js.Object {
  /**
           * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current
           * page. By default, it's `false` and is only injected into the top frame.
           */
  var all_frames: js.UndefOr[scala.Boolean] = js.undefined
  /** The list of CSS files to inject */
  var css: js.UndefOr[js.Array[ExtensionURL]] = js.undefined
  var exclude_globs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exclude_matches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  var include_globs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of JS files to inject */
  @JSName("js")
  var `js_`: js.UndefOr[js.Array[ExtensionURL]] = js.undefined
  /**
           * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
           * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
           * it is `false`.
           */
  var match_about_blank: js.UndefOr[scala.Boolean] = js.undefined
  var matches: js.Array[MatchPattern]
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var run_at: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.RunAt] = js.undefined
}

