package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the method to convert different units of measurement.
  */
@JSGlobal("RichEditUnitConverter")
@js.native
open class RichEditUnitConverter ()
  extends StObject
     with typings.devexpressWeb.RichEditUnitConverter {
  
  /**
    * Converts a value in centimeters to twips. An integer value representing the value in twips.
    * @param value A floating value specifying the value in centimeters to convert.
    */
  /* CompleteClass */
  override def centimetersToTwips(value: Double): Double = js.native
  
  /**
    * Converts a measurement from inches to twips. The result twips value, as an integer.
    * @param value The inches value (floating) to be converted.
    */
  /* CompleteClass */
  override def inchesToTwips(value: Double): Double = js.native
  
  /**
    * Converts a measurement from pixels to centimeters. The result centimeters value.
    * @param value The pixels value to be converted.
    */
  /* CompleteClass */
  override def pixelsToCentimeters(value: Double): Double = js.native
  
  /**
    * Converts a measurement from pixels to inches. The result inches value.
    * @param value The pixels value to be converted.
    */
  /* CompleteClass */
  override def pixelsToInches(value: Double): Double = js.native
  
  /**
    * Converts a measurement from pixels to points. The result points value.
    * @param value The pixels value to be converted.
    */
  /* CompleteClass */
  override def pixelsToPoints(value: Double): Double = js.native
  
  /**
    * Converts a measurement from pixels to twips. The result twips value.
    * @param value The pixels value to be converted.
    */
  /* CompleteClass */
  override def pixelsToTwips(value: Double): Double = js.native
  
  /**
    * Converts a measurement from points to twips. The result twips value.
    * @param value The points value to be converted.
    */
  /* CompleteClass */
  override def pointsToTwips(value: Double): Double = js.native
  
  /**
    * Converts a measurement from twips to centimeters. The result centimeters value.
    * @param value The twips value to be converted.
    */
  /* CompleteClass */
  override def twipsToCentimeters(value: Double): Double = js.native
  
  /**
    * Converts a measurement from twips to inches. The result inches value.
    * @param value The twips value to be converted.
    */
  /* CompleteClass */
  override def twipsToInches(value: Double): Double = js.native
  
  /**
    * Converts a measurement from twips to points. The result points value.
    * @param value The twips value to be converted.
    */
  /* CompleteClass */
  override def twipsToPoints(value: Double): Double = js.native
}
