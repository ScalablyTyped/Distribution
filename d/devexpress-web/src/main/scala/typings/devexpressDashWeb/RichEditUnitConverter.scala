package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the method to convert different units of measurement.
  */
@JSGlobal("RichEditUnitConverter")
@js.native
class RichEditUnitConverter () extends js.Object {
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

