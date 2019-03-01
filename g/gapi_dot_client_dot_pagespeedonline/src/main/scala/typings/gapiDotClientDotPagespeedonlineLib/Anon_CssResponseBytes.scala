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

object Anon_CssResponseBytes {
  @scala.inline
  def apply(
    cssResponseBytes: java.lang.String = null,
    flashResponseBytes: java.lang.String = null,
    htmlResponseBytes: java.lang.String = null,
    imageResponseBytes: java.lang.String = null,
    javascriptResponseBytes: java.lang.String = null,
    numberCssResources: scala.Int | scala.Double = null,
    numberHosts: scala.Int | scala.Double = null,
    numberJsResources: scala.Int | scala.Double = null,
    numberResources: scala.Int | scala.Double = null,
    numberStaticResources: scala.Int | scala.Double = null,
    otherResponseBytes: java.lang.String = null,
    textResponseBytes: java.lang.String = null,
    totalRequestBytes: java.lang.String = null
  ): Anon_CssResponseBytes = {
    val __obj = js.Dynamic.literal()
    if (cssResponseBytes != null) __obj.updateDynamic("cssResponseBytes")(cssResponseBytes)
    if (flashResponseBytes != null) __obj.updateDynamic("flashResponseBytes")(flashResponseBytes)
    if (htmlResponseBytes != null) __obj.updateDynamic("htmlResponseBytes")(htmlResponseBytes)
    if (imageResponseBytes != null) __obj.updateDynamic("imageResponseBytes")(imageResponseBytes)
    if (javascriptResponseBytes != null) __obj.updateDynamic("javascriptResponseBytes")(javascriptResponseBytes)
    if (numberCssResources != null) __obj.updateDynamic("numberCssResources")(numberCssResources.asInstanceOf[js.Any])
    if (numberHosts != null) __obj.updateDynamic("numberHosts")(numberHosts.asInstanceOf[js.Any])
    if (numberJsResources != null) __obj.updateDynamic("numberJsResources")(numberJsResources.asInstanceOf[js.Any])
    if (numberResources != null) __obj.updateDynamic("numberResources")(numberResources.asInstanceOf[js.Any])
    if (numberStaticResources != null) __obj.updateDynamic("numberStaticResources")(numberStaticResources.asInstanceOf[js.Any])
    if (otherResponseBytes != null) __obj.updateDynamic("otherResponseBytes")(otherResponseBytes)
    if (textResponseBytes != null) __obj.updateDynamic("textResponseBytes")(textResponseBytes)
    if (totalRequestBytes != null) __obj.updateDynamic("totalRequestBytes")(totalRequestBytes)
    __obj.asInstanceOf[Anon_CssResponseBytes]
  }
}

