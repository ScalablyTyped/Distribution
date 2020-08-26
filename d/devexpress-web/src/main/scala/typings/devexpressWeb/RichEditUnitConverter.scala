package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the method to convert different units of measurement.
  */
@js.native
trait RichEditUnitConverter extends js.Object {
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
  implicit class RichEditUnitConverterOps[Self <: RichEditUnitConverter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCentimetersToTwips(value: Double => Double): Self = this.set("centimetersToTwips", js.Any.fromFunction1(value))
    @scala.inline
    def setInchesToTwips(value: Double => Double): Self = this.set("inchesToTwips", js.Any.fromFunction1(value))
    @scala.inline
    def setPixelsToCentimeters(value: Double => Double): Self = this.set("pixelsToCentimeters", js.Any.fromFunction1(value))
    @scala.inline
    def setPixelsToInches(value: Double => Double): Self = this.set("pixelsToInches", js.Any.fromFunction1(value))
    @scala.inline
    def setPixelsToPoints(value: Double => Double): Self = this.set("pixelsToPoints", js.Any.fromFunction1(value))
    @scala.inline
    def setPixelsToTwips(value: Double => Double): Self = this.set("pixelsToTwips", js.Any.fromFunction1(value))
    @scala.inline
    def setPointsToTwips(value: Double => Double): Self = this.set("pointsToTwips", js.Any.fromFunction1(value))
    @scala.inline
    def setTwipsToCentimeters(value: Double => Double): Self = this.set("twipsToCentimeters", js.Any.fromFunction1(value))
    @scala.inline
    def setTwipsToInches(value: Double => Double): Self = this.set("twipsToInches", js.Any.fromFunction1(value))
    @scala.inline
    def setTwipsToPoints(value: Double => Double): Self = this.set("twipsToPoints", js.Any.fromFunction1(value))
  }
  
}

