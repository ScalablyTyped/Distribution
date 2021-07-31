package typings.glaze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  val borderWidth: `2`
  
  val duration: `1000ms`
  
  val fontSize: `05`
  
  val letterSpacing: Normal
  
  val lineHeight: Base
  
  val radius: Full
  
  val shadow: Inner
  
  val size: `1`
  
  val spacing: `0`
}
object Border {
  
  @scala.inline
  def apply(
    borderWidth: `2`,
    duration: `1000ms`,
    fontSize: `05`,
    letterSpacing: Normal,
    lineHeight: Base,
    radius: Full,
    shadow: Inner,
    size: `1`,
    spacing: `0`
  ): Border = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderWidth(value: `2`): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `1000ms`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: `05`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacing(value: Normal): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: Base): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Full): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: Inner): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: `1`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: `0`): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
  }
}
