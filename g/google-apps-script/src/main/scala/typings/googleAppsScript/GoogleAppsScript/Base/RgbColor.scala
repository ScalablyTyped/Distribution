package typings.googleAppsScript.GoogleAppsScript.Base

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A color defined by red, green, blue color channels.
  */
trait RgbColor extends StObject {
  
  def asHexString(): String
  
  def getBlue(): Integer
  
  def getColorType(): ColorType
  
  def getGreen(): Integer
  
  def getRed(): Integer
}
object RgbColor {
  
  inline def apply(
    asHexString: () => String,
    getBlue: () => Integer,
    getColorType: () => ColorType,
    getGreen: () => Integer,
    getRed: () => Integer
  ): RgbColor = {
    val __obj = js.Dynamic.literal(asHexString = js.Any.fromFunction0(asHexString), getBlue = js.Any.fromFunction0(getBlue), getColorType = js.Any.fromFunction0(getColorType), getGreen = js.Any.fromFunction0(getGreen), getRed = js.Any.fromFunction0(getRed))
    __obj.asInstanceOf[RgbColor]
  }
  
  extension [Self <: RgbColor](x: Self) {
    
    inline def setAsHexString(value: () => String): Self = StObject.set(x, "asHexString", js.Any.fromFunction0(value))
    
    inline def setGetBlue(value: () => Integer): Self = StObject.set(x, "getBlue", js.Any.fromFunction0(value))
    
    inline def setGetColorType(value: () => ColorType): Self = StObject.set(x, "getColorType", js.Any.fromFunction0(value))
    
    inline def setGetGreen(value: () => Integer): Self = StObject.set(x, "getGreen", js.Any.fromFunction0(value))
    
    inline def setGetRed(value: () => Integer): Self = StObject.set(x, "getRed", js.Any.fromFunction0(value))
  }
}
