package typings.gapiDotPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssResponsebytes extends js.Object {
  /**
    * Number of uncompressed response bytes for CSS resources on the page.
    */
  var cssResponsebytes: String
  /**
    * Number of response bytes for Flash resources on the page.
    */
  var flashResponseBytes: String
  /**
    * Number of uncompressed response bytes for the main HTML document and all iframes on the page.
    */
  var htmlResponseBytes: String
  /**
    * Number of response bytes for image resources on the page.
    */
  var imageResponseBytes: String
  /**
    * Number of uncompressed response bytes for JS resources on the page.
    */
  var javascriptResponsebytes: String
  /**
    * Number of CSS resources referenced by the page.
    */
  var numberCssResources: Double
  /**
    * Number of unique hosts referenced by the page.
    */
  var numberHosts: Double
  /**
    * Number of JavaScript resources referenced by the page.
    */
  var numberJsResources: Double
  /**
    * Number of HTTP resources loaded by the page.
    */
  var numberResources: Double
  /**
    * Number of static (that is, cacheable) resources on the page.
    */
  var numberStaticResources: Double
  /**
    * Number of response bytes for other resources on the page.
    */
  var otherResponsebytes: String
  /**
    * Number of uncompressed response bytes for text resources on the page that aren't covered by other statistics; that is, non-HTML, non-script, non-CSS resources.
    */
  var textResponseBytes: String
  /**
    * Total size of all request bytes sent by the page.
    */
  var totalRequestBytes: String
}

object Anon_CssResponsebytes {
  @scala.inline
  def apply(
    cssResponsebytes: String,
    flashResponseBytes: String,
    htmlResponseBytes: String,
    imageResponseBytes: String,
    javascriptResponsebytes: String,
    numberCssResources: Double,
    numberHosts: Double,
    numberJsResources: Double,
    numberResources: Double,
    numberStaticResources: Double,
    otherResponsebytes: String,
    textResponseBytes: String,
    totalRequestBytes: String
  ): Anon_CssResponsebytes = {
    val __obj = js.Dynamic.literal(cssResponsebytes = cssResponsebytes, flashResponseBytes = flashResponseBytes, htmlResponseBytes = htmlResponseBytes, imageResponseBytes = imageResponseBytes, javascriptResponsebytes = javascriptResponsebytes, numberCssResources = numberCssResources, numberHosts = numberHosts, numberJsResources = numberJsResources, numberResources = numberResources, numberStaticResources = numberStaticResources, otherResponsebytes = otherResponsebytes, textResponseBytes = textResponseBytes, totalRequestBytes = totalRequestBytes)
  
    __obj.asInstanceOf[Anon_CssResponsebytes]
  }
}

