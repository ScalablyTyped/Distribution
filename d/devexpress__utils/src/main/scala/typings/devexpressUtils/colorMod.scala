package typings.devexpressUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils")
  @js.native
  open class ColorUtils () extends StObject
  /* static members */
  object ColorUtils {
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.DARK_COLOR")
    @js.native
    val DARK_COLOR: /* -16777216 */ Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.LIGHT_COLOR")
    @js.native
    val LIGHT_COLOR: /* -1 */ Double = js.native
    
    inline def bluePartToString(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bluePartToString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@devexpress/utils/lib/utils/color", "ColorUtils.colorNames")
    @js.native
    def colorNames: Record[String, String] = js.native
    inline def colorNames_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorNames")(x.asInstanceOf[js.Any])
    
    inline def colorToHash(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToHash")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromArgbNumber(alpha: Double, red: Double, green: Double, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArgbNumber")(alpha.asInstanceOf[js.Any], red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
    
    inline def fromColorName(color: String): Color | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColorName")(color.asInstanceOf[js.Any]).asInstanceOf[Color | Null]
    inline def fromColorName(color: String, alpha: Double): Color | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColorName")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color | Null]
    
    inline def fromHashString(hash: String): Color | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHashString")(hash.asInstanceOf[js.Any]).asInstanceOf[Color | Null]
    inline def fromHashString(hash: String, alpha: Double): Color | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHashString")(hash.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color | Null]
    
    inline def fromRgbaString(color: String): Color | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRgbaString")(color.asInstanceOf[js.Any]).asInstanceOf[Color | Null]
    inline def fromRgbaString(color: String, alpha: Double): Color | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRgbaString")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color | Null]
    
    inline def fromString(color: String): Color | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(color.asInstanceOf[js.Any]).asInstanceOf[Color | Null]
    inline def fromString(color: String, alpha: Double): Color | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color | Null]
    
    inline def getAlpha(color: Color): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlpha")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getBlue(color: Color): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getGreen(color: Color): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGreen")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getRed(color: Color): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRed")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def greenPartToString(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("greenPartToString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isGray(color: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGray")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isHashColorString(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHashColorString")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isKnownColorName(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKnownColorName")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def redPartToString(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("redPartToString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def stringToHash(color: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToHash")(color.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  type Color = Double
}
