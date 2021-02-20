package typings.devexpressUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils")
  @js.native
  class ColorUtils () extends StObject
  /* static members */
  object ColorUtils {
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.DARK_COLOR")
    @js.native
    val DARK_COLOR: js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.LIGHT_COLOR")
    @js.native
    val LIGHT_COLOR: js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.bluePartToString")
    @js.native
    def bluePartToString(color: Color): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.colorNames")
    @js.native
    def colorNames: Record[String, String] = js.native
    @scala.inline
    def colorNames_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorNames")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.colorToHash")
    @js.native
    def colorToHash(color: Color): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromArgbNumber")
    @js.native
    def fromArgbNumber(alpha: Double, red: Double, green: Double, blue: Double): Color = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromColorName")
    @js.native
    def fromColorName(color: String): Color | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromColorName")
    @js.native
    def fromColorName(color: String, alpha: Double): Color | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromHashString")
    @js.native
    def fromHashString(hash: String): Color | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromHashString")
    @js.native
    def fromHashString(hash: String, alpha: Double): Color | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromRgbaString")
    @js.native
    def fromRgbaString(color: String): Color | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromRgbaString")
    @js.native
    def fromRgbaString(color: String, alpha: Double): Color | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromString")
    @js.native
    def fromString(color: String): Color | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.fromString")
    @js.native
    def fromString(color: String, alpha: Double): Color | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.getAlpha")
    @js.native
    def getAlpha(color: Color): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.getBlue")
    @js.native
    def getBlue(color: Color): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.getGreen")
    @js.native
    def getGreen(color: Color): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.getRed")
    @js.native
    def getRed(color: Color): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.greenPartToString")
    @js.native
    def greenPartToString(color: Color): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.isGray")
    @js.native
    def isGray(color: Double): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.isHashColorString")
    @js.native
    def isHashColorString(color: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.isKnownColorName")
    @js.native
    def isKnownColorName(color: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.redPartToString")
    @js.native
    def redPartToString(color: Color): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.stringToHash")
    @js.native
    def stringToHash(color: String): String | Null = js.native
  }
  
  type Color = Double
}
