package typings
package gapiDotClientDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssResponseBytes extends js.Object {
  /** Number of uncompressed response bytes for CSS resources on the page. */
  var cssResponseBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Number of response bytes for flash resources on the page. */
  var flashResponseBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Number of uncompressed response bytes for the main HTML document and all iframes on the page. */
  var htmlResponseBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Number of response bytes for image resources on the page. */
  var imageResponseBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Number of uncompressed response bytes for JS resources on the page. */
  var javascriptResponseBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Number of CSS resources referenced by the page. */
  var numberCssResources: js.UndefOr[scala.Double] = js.undefined
  /** Number of unique hosts referenced by the page. */
  var numberHosts: js.UndefOr[scala.Double] = js.undefined
  /** Number of JavaScript resources referenced by the page. */
  var numberJsResources: js.UndefOr[scala.Double] = js.undefined
  /** Number of HTTP resources loaded by the page. */
  var numberResources: js.UndefOr[scala.Double] = js.undefined
  /** Number of static (i.e. cacheable) resources on the page. */
  var numberStaticResources: js.UndefOr[scala.Double] = js.undefined
  /** Number of response bytes for other resources on the page. */
  var otherResponseBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Number of uncompressed response bytes for text resources not covered by other statistics (i.e non-HTML, non-script, non-CSS resources) on the page. */
  var textResponseBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Total size of all request bytes sent by the page. */
  var totalRequestBytes: js.UndefOr[java.lang.String] = js.undefined
}

