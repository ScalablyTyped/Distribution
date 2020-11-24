package typings.devexpressUtils

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/color", JSImport.Namespace)
@js.native
object colorMod extends js.Object {
  
  @js.native
  class ColorUtils () extends js.Object
  /* static members */
  @js.native
  object ColorUtils extends js.Object {
    
    val DARK_COLOR: js.Any = js.native
    
    val LIGHT_COLOR: js.Any = js.native
    
    def bluePartToString(color: Color): String = js.native
    
    var colorNames: Record[String, String] = js.native
    
    def colorToHash(color: Color): String = js.native
    
    def fromArgbNumber(alpha: Double, red: Double, green: Double, blue: Double): Color = js.native
    
    def fromColorName(color: String): Color | Null = js.native
    def fromColorName(color: String, alpha: Double): Color | Null = js.native
    
    def fromHashString(hash: String): Color | Null = js.native
    def fromHashString(hash: String, alpha: Double): Color | Null = js.native
    
    def fromRgbaString(color: String): Color | Null = js.native
    def fromRgbaString(color: String, alpha: Double): Color | Null = js.native
    
    def fromString(color: String): Color | Null = js.native
    def fromString(color: String, alpha: Double): Color | Null = js.native
    
    def getAlpha(color: Color): Double = js.native
    
    def getBlue(color: Color): Double = js.native
    
    def getGreen(color: Color): Double = js.native
    
    def getRed(color: Color): Double = js.native
    
    def greenPartToString(color: Color): String = js.native
    
    def isGray(color: Double): Boolean = js.native
    
    def isHashColorString(color: String): Boolean = js.native
    
    def isKnownColorName(color: String): Boolean = js.native
    
    def redPartToString(color: Color): String = js.native
    
    def stringToHash(color: String): String | Null = js.native
  }
  
  type Color = Double
}
