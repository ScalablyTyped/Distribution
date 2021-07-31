package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitConverterMod {
  
  @JSImport("@devexpress/utils/lib/class/unit-converter", "UnitConverter")
  @js.native
  class UnitConverter () extends StObject
  /* static members */
  object UnitConverter {
    
    @JSImport("@devexpress/utils/lib/class/unit-converter", "UnitConverter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/class/unit-converter", "UnitConverter.CENTIMETERS_PER_INCH")
    @js.native
    def CENTIMETERS_PER_INCH: Double = js.native
    @scala.inline
    def CENTIMETERS_PER_INCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTIMETERS_PER_INCH")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/class/unit-converter", "UnitConverter.DPI")
    @js.native
    def DPI: Double = js.native
    @scala.inline
    def DPI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DPI")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/class/unit-converter", "UnitConverter.PICAS_PER_INCH")
    @js.native
    def PICAS_PER_INCH: Double = js.native
    @scala.inline
    def PICAS_PER_INCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PICAS_PER_INCH")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def centimeterToPixel(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("centimeterToPixel")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def centimetersToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("centimetersToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def centimetersToTwipsF(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("centimetersToTwipsF")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def degreesToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def documentsToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("documentsToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def emuToTwips(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("emuToTwips")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fdToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fdToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def hundredthsOfMillimeterToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hundredthsOfMillimeterToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def hundredthsOfMillimeterToTwipsRound(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hundredthsOfMillimeterToTwipsRound")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def inchesToPixels(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inchesToPixels")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def inchesToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inchesToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def inchesToTwipsF(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inchesToTwipsF")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def millimetersToPixel(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("millimetersToPixel")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def picasToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("picasToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pixelToCentimeters(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pixelToCentimeters")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pixelsToHundredthsOfMillimeter(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToHundredthsOfMillimeter")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pixelsToInches(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToInches")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pixelsToPoints(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToPoints")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pixelsToPointsF(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToPointsF")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pixelsToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pixelsToTwipsCustomDpi(value: Double, dpi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToTwipsCustomDpi")(value.asInstanceOf[js.Any], dpi.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def pixelsToTwipsF(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToTwipsF")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pixelsToTwipsFCustomDpi(value: Double, dpi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToTwipsFCustomDpi")(value.asInstanceOf[js.Any], dpi.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def pointsToPixels(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pointsToPixels")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pointsToPixelsF(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pointsToPixelsF")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pointsToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pointsToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def pointsToTwipsF(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pointsToTwipsF")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def radiansToDegrees(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radiansToDegrees")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def radiansToTwips(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radiansToTwips")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToCentimeters(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToCentimeters")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToDegree(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToDegree")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToDegrees(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToDegrees")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToEmu(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToEmu")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToFD(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToFD")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToHundredthsOfMillimeter(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToHundredthsOfMillimeter")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToInches(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToInches")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToPixels(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToPixels")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToPixelsF(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToPixelsF")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToPoints(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToPoints")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToPointsF(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToPointsF")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def twipsToRadians(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("twipsToRadians")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
