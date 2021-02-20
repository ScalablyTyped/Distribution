package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the method to convert different units of measurement.
  */
@js.native
trait RichEditUnitConverter extends StObject {
  
  /**
    * Converts a value in centimeters to twips. An integer value representing the value in twips.
    * @param value A floating value specifying the value in centimeters to convert.
    */
  def centimetersToTwips(value: Double): Double = js.native
  
  /**
    * Converts a measurement from inches to twips. The result twips value, as an integer.
    * @param value The inches value (floating) to be converted.
    */
  def inchesToTwips(value: Double): Double = js.native
  
  /**
    * Converts a measurement from pixels to centimeters. The result centimeters value.
    * @param value The pixels value to be converted.
    */
  def pixelsToCentimeters(value: Double): Double = js.native
  
  /**
    * Converts a measurement from pixels to inches. The result inches value.
    * @param value The pixels value to be converted.
    */
  def pixelsToInches(value: Double): Double = js.native
  
  /**
    * Converts a measurement from pixels to points. The result points value.
    * @param value The pixels value to be converted.
    */
  def pixelsToPoints(value: Double): Double = js.native
  
  /**
    * Converts a measurement from pixels to twips. The result twips value.
    * @param value The pixels value to be converted.
    */
  def pixelsToTwips(value: Double): Double = js.native
  
  /**
    * Converts a measurement from points to twips. The result twips value.
    * @param value The points value to be converted.
    */
  def pointsToTwips(value: Double): Double = js.native
  
  /**
    * Converts a measurement from twips to centimeters. The result centimeters value.
    * @param value The twips value to be converted.
    */
  def twipsToCentimeters(value: Double): Double = js.native
  
  /**
    * Converts a measurement from twips to inches. The result inches value.
    * @param value The twips value to be converted.
    */
  def twipsToInches(value: Double): Double = js.native
  
  /**
    * Converts a measurement from twips to points. The result points value.
    * @param value The twips value to be converted.
    */
  def twipsToPoints(value: Double): Double = js.native
}
object RichEditUnitConverter {
  
  @scala.inline
  def apply(
    centimetersToTwips: Double => Double,
    inchesToTwips: Double => Double,
    pixelsToCentimeters: Double => Double,
    pixelsToInches: Double => Double,
    pixelsToPoints: Double => Double,
    pixelsToTwips: Double => Double,
    pointsToTwips: Double => Double,
    twipsToCentimeters: Double => Double,
    twipsToInches: Double => Double,
    twipsToPoints: Double => Double
  ): RichEditUnitConverter = {
    val __obj = js.Dynamic.literal(centimetersToTwips = js.Any.fromFunction1(centimetersToTwips), inchesToTwips = js.Any.fromFunction1(inchesToTwips), pixelsToCentimeters = js.Any.fromFunction1(pixelsToCentimeters), pixelsToInches = js.Any.fromFunction1(pixelsToInches), pixelsToPoints = js.Any.fromFunction1(pixelsToPoints), pixelsToTwips = js.Any.fromFunction1(pixelsToTwips), pointsToTwips = js.Any.fromFunction1(pointsToTwips), twipsToCentimeters = js.Any.fromFunction1(twipsToCentimeters), twipsToInches = js.Any.fromFunction1(twipsToInches), twipsToPoints = js.Any.fromFunction1(twipsToPoints))
    __obj.asInstanceOf[RichEditUnitConverter]
  }
  
  @scala.inline
  implicit class RichEditUnitConverterMutableBuilder[Self <: RichEditUnitConverter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCentimetersToTwips(value: Double => Double): Self = StObject.set(x, "centimetersToTwips", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInchesToTwips(value: Double => Double): Self = StObject.set(x, "inchesToTwips", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPixelsToCentimeters(value: Double => Double): Self = StObject.set(x, "pixelsToCentimeters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPixelsToInches(value: Double => Double): Self = StObject.set(x, "pixelsToInches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPixelsToPoints(value: Double => Double): Self = StObject.set(x, "pixelsToPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPixelsToTwips(value: Double => Double): Self = StObject.set(x, "pixelsToTwips", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointsToTwips(value: Double => Double): Self = StObject.set(x, "pointsToTwips", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTwipsToCentimeters(value: Double => Double): Self = StObject.set(x, "twipsToCentimeters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTwipsToInches(value: Double => Double): Self = StObject.set(x, "twipsToInches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTwipsToPoints(value: Double => Double): Self = StObject.set(x, "twipsToPoints", js.Any.fromFunction1(value))
  }
}
