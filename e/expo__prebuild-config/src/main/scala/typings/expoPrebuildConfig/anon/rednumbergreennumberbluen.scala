package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.expoPrebuildConfigStrings.custom
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.displayP3
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.sRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined / ** Custom color * / {  red :number,   green :number,   blue :number,   alpha :number,   colorSpace :'custom' | string,   customColorSpace :'displayP3' | 'sRGB' | string} & {  key :string} */
trait rednumbergreennumberbluen extends StObject {
  
  /** @example `1` */
  var alpha: Double
  
  /** @example `0.3248577810203549` */
  var blue: Double
  
  var colorSpace: custom | String
  
  var customColorSpace: displayP3 | sRGB | String
  
  /** @example `0.26445041990630447` */
  var green: Double
  
  /** @example `textColor` */
  var key: String
  
  /** @example `0.86584504117670746` */
  var red: Double
}
object rednumbergreennumberbluen {
  
  inline def apply(
    alpha: Double,
    blue: Double,
    colorSpace: custom | String,
    customColorSpace: displayP3 | sRGB | String,
    green: Double,
    key: String,
    red: Double
  ): rednumbergreennumberbluen = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], customColorSpace = customColorSpace.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[rednumbergreennumberbluen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rednumbergreennumberbluen] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: custom | String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setCustomColorSpace(value: displayP3 | sRGB | String): Self = StObject.set(x, "customColorSpace", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
