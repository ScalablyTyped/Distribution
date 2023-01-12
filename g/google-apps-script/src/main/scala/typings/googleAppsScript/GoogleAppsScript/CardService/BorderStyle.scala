package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class that represents a complete border style that can be applied to widgets.
  */
trait BorderStyle extends StObject {
  
  /**
    * Sets the corner radius of the border, for example 8.
    */
  def setCornerRadius(radius: Double): BorderStyle
  
  /**
    * The color in #RGB format to be applied to the border.
    */
  def setStrokeColor(color: String): BorderStyle
  
  /**
    * Sets the type of the border.
    */
  def setType(`type`: BorderType): BorderStyle
}
object BorderStyle {
  
  inline def apply(
    setCornerRadius: Double => BorderStyle,
    setStrokeColor: String => BorderStyle,
    setType: BorderType => BorderStyle
  ): BorderStyle = {
    val __obj = js.Dynamic.literal(setCornerRadius = js.Any.fromFunction1(setCornerRadius), setStrokeColor = js.Any.fromFunction1(setStrokeColor), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[BorderStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderStyle] (val x: Self) extends AnyVal {
    
    inline def setSetCornerRadius(value: Double => BorderStyle): Self = StObject.set(x, "setCornerRadius", js.Any.fromFunction1(value))
    
    inline def setSetStrokeColor(value: String => BorderStyle): Self = StObject.set(x, "setStrokeColor", js.Any.fromFunction1(value))
    
    inline def setSetType(value: BorderType => BorderStyle): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
  }
}
