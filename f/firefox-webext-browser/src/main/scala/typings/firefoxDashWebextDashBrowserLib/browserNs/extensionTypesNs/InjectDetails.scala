package typings
package firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be
  * set at the same time.
  */
trait InjectDetails extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current
    * page. By default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * JavaScript or CSS code to inject.
    *
    * **Warning:**
    * Be careful using the `code` parameter. Incorrect use of it may open your extension to [cross site
    * scripting](https://en.wikipedia.org/wiki/Cross-site_scripting) attacks.
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** The css origin of the stylesheet to inject. Defaults to "author". */
  var cssOrigin: js.UndefOr[CSSOrigin] = js.undefined
  /** JavaScript or CSS file to inject. */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the frame to inject the script into. This may not be used in combination with `allFrames`. */
  var frameId: js.UndefOr[scala.Double] = js.undefined
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var matchAboutBlank: js.UndefOr[scala.Boolean] = js.undefined
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[RunAt] = js.undefined
}

