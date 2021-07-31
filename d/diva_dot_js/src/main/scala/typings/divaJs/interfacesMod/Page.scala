package typings.divaJs.interfacesMod

import typings.divaJs.anon.D
import typings.divaJs.anon.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var api: Double
  
  var canvas: String
  
  var d: H
  
  var f: String
  
  var facingPages: Boolean
  
  var il: String
  
  var l: String
  
  var m: Double
  
  var otherImages: D
  
  var paged: Boolean
  
  var url: String
  
  var xoffset: Double
  
  var yoffset: Double
}
object Page {
  
  @scala.inline
  def apply(
    api: Double,
    canvas: String,
    d: H,
    f: String,
    facingPages: Boolean,
    il: String,
    l: String,
    m: Double,
    otherImages: D,
    paged: Boolean,
    url: String,
    xoffset: Double,
    yoffset: Double
  ): Page = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], facingPages = facingPages.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], otherImages = otherImages.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: Double): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvas(value: String): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: H): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacingPages(value: Boolean): Self = StObject.set(x, "facingPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIl(value: String): Self = StObject.set(x, "il", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherImages(value: D): Self = StObject.set(x, "otherImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaged(value: Boolean): Self = StObject.set(x, "paged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
  }
}
