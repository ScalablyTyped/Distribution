package typings.glaze.anon

import typings.glaze.glazeStrings.background
import typings.glaze.glazeStrings.margin
import typings.glaze.glazeStrings.marginBottom
import typings.glaze.glazeStrings.marginLeft
import typings.glaze.glazeStrings.marginRight
import typings.glaze.glazeStrings.marginTop
import typings.glaze.glazeStrings.marginX
import typings.glaze.glazeStrings.marginY
import typings.glaze.glazeStrings.padding
import typings.glaze.glazeStrings.paddingBottom
import typings.glaze.glazeStrings.paddingLeft
import typings.glaze.glazeStrings.paddingRight
import typings.glaze.glazeStrings.paddingTop
import typings.glaze.glazeStrings.paddingX
import typings.glaze.glazeStrings.paddingY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bg extends StObject {
  
  val bg: background
  
  val m: margin
  
  val mb: marginBottom
  
  val ml: marginLeft
  
  val mr: marginRight
  
  val mt: marginTop
  
  val mx: marginX
  
  val my: marginY
  
  val p: padding
  
  val pb: paddingBottom
  
  val pl: paddingLeft
  
  val pr: paddingRight
  
  val pt: paddingTop
  
  val px: paddingX
  
  val py: paddingY
}
object Bg {
  
  @scala.inline
  def apply(): Bg = {
    val __obj = js.Dynamic.literal(bg = "background", m = "margin", mb = "marginBottom", ml = "marginLeft", mr = "marginRight", mt = "marginTop", mx = "marginX", my = "marginY", p = "padding", pb = "paddingBottom", pl = "paddingLeft", pr = "paddingRight", pt = "paddingTop", px = "paddingX", py = "paddingY")
    __obj.asInstanceOf[Bg]
  }
  
  @scala.inline
  implicit class BgMutableBuilder[Self <: Bg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(value: background): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: margin): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMb(value: marginBottom): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMl(value: marginLeft): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMr(value: marginRight): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMt(value: marginTop): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMx(value: marginX): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMy(value: marginY): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: padding): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPb(value: paddingBottom): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPl(value: paddingLeft): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPr(value: paddingRight): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPt(value: paddingTop): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPx(value: paddingX): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPy(value: paddingY): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
  }
}
