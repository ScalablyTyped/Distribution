package typings.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssResponsebytes extends js.Object {
  
  /**
    * Number of uncompressed response bytes for CSS resources on the page.
    */
  var cssResponsebytes: String = js.native
  
  /**
    * Number of response bytes for Flash resources on the page.
    */
  var flashResponseBytes: String = js.native
  
  /**
    * Number of uncompressed response bytes for the main HTML document and all iframes on the page.
    */
  var htmlResponseBytes: String = js.native
  
  /**
    * Number of response bytes for image resources on the page.
    */
  var imageResponseBytes: String = js.native
  
  /**
    * Number of uncompressed response bytes for JS resources on the page.
    */
  var javascriptResponsebytes: String = js.native
  
  /**
    * Number of CSS resources referenced by the page.
    */
  var numberCssResources: Double = js.native
  
  /**
    * Number of unique hosts referenced by the page.
    */
  var numberHosts: Double = js.native
  
  /**
    * Number of JavaScript resources referenced by the page.
    */
  var numberJsResources: Double = js.native
  
  /**
    * Number of HTTP resources loaded by the page.
    */
  var numberResources: Double = js.native
  
  /**
    * Number of static (that is, cacheable) resources on the page.
    */
  var numberStaticResources: Double = js.native
  
  /**
    * Number of response bytes for other resources on the page.
    */
  var otherResponsebytes: String = js.native
  
  /**
    * Number of uncompressed response bytes for text resources on the page that aren't covered by other statistics; that is, non-HTML, non-script, non-CSS resources.
    */
  var textResponseBytes: String = js.native
  
  /**
    * Total size of all request bytes sent by the page.
    */
  var totalRequestBytes: String = js.native
}
object CssResponsebytes {
  
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
  ): CssResponsebytes = {
    val __obj = js.Dynamic.literal(cssResponsebytes = cssResponsebytes.asInstanceOf[js.Any], flashResponseBytes = flashResponseBytes.asInstanceOf[js.Any], htmlResponseBytes = htmlResponseBytes.asInstanceOf[js.Any], imageResponseBytes = imageResponseBytes.asInstanceOf[js.Any], javascriptResponsebytes = javascriptResponsebytes.asInstanceOf[js.Any], numberCssResources = numberCssResources.asInstanceOf[js.Any], numberHosts = numberHosts.asInstanceOf[js.Any], numberJsResources = numberJsResources.asInstanceOf[js.Any], numberResources = numberResources.asInstanceOf[js.Any], numberStaticResources = numberStaticResources.asInstanceOf[js.Any], otherResponsebytes = otherResponsebytes.asInstanceOf[js.Any], textResponseBytes = textResponseBytes.asInstanceOf[js.Any], totalRequestBytes = totalRequestBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssResponsebytes]
  }
  
  @scala.inline
  implicit class CssResponsebytesOps[Self <: CssResponsebytes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCssResponsebytes(value: String): Self = this.set("cssResponsebytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashResponseBytes(value: String): Self = this.set("flashResponseBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResponseBytes(value: String): Self = this.set("htmlResponseBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageResponseBytes(value: String): Self = this.set("imageResponseBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavascriptResponsebytes(value: String): Self = this.set("javascriptResponsebytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberCssResources(value: Double): Self = this.set("numberCssResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberHosts(value: Double): Self = this.set("numberHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberJsResources(value: Double): Self = this.set("numberJsResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberResources(value: Double): Self = this.set("numberResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberStaticResources(value: Double): Self = this.set("numberStaticResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherResponsebytes(value: String): Self = this.set("otherResponsebytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextResponseBytes(value: String): Self = this.set("textResponseBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRequestBytes(value: String): Self = this.set("totalRequestBytes", value.asInstanceOf[js.Any])
  }
}
