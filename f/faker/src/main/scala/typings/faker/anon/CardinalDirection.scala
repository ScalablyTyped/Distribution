package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardinalDirection extends js.Object {
  
  def cardinalDirection(): String = js.native
  def cardinalDirection(useAbbr: Boolean): String = js.native
  
  def city(): String = js.native
  def city(format: Double): String = js.native
  
  def cityPrefix(): String = js.native
  
  def citySuffix(): String = js.native
  
  def country(): String = js.native
  
  def countryCode(): String = js.native
  def countryCode(alphaCode: String): String = js.native
  
  def county(): String = js.native
  
  def direction(): String = js.native
  def direction(useAbbr: Boolean): String = js.native
  
  def latitude(): String = js.native
  def latitude(max: js.UndefOr[scala.Nothing], min: js.UndefOr[scala.Nothing], precision: Double): String = js.native
  def latitude(max: js.UndefOr[scala.Nothing], min: Double): String = js.native
  def latitude(max: js.UndefOr[scala.Nothing], min: Double, precision: Double): String = js.native
  def latitude(max: Double): String = js.native
  def latitude(max: Double, min: js.UndefOr[scala.Nothing], precision: Double): String = js.native
  def latitude(max: Double, min: Double): String = js.native
  def latitude(max: Double, min: Double, precision: Double): String = js.native
  
  def longitude(): String = js.native
  def longitude(max: js.UndefOr[scala.Nothing], min: js.UndefOr[scala.Nothing], precision: Double): String = js.native
  def longitude(max: js.UndefOr[scala.Nothing], min: Double): String = js.native
  def longitude(max: js.UndefOr[scala.Nothing], min: Double, precision: Double): String = js.native
  def longitude(max: Double): String = js.native
  def longitude(max: Double, min: js.UndefOr[scala.Nothing], precision: Double): String = js.native
  def longitude(max: Double, min: Double): String = js.native
  def longitude(max: Double, min: Double, precision: Double): String = js.native
  
  def nearbyGPSCoordinate(): js.Array[String] = js.native
  def nearbyGPSCoordinate(coordinate: js.UndefOr[scala.Nothing], radius: js.UndefOr[scala.Nothing], isMetric: Boolean): js.Array[String] = js.native
  def nearbyGPSCoordinate(coordinate: js.UndefOr[scala.Nothing], radius: Double): js.Array[String] = js.native
  def nearbyGPSCoordinate(coordinate: js.UndefOr[scala.Nothing], radius: Double, isMetric: Boolean): js.Array[String] = js.native
  def nearbyGPSCoordinate(coordinate: String): js.Array[String] = js.native
  def nearbyGPSCoordinate(coordinate: String, radius: js.UndefOr[scala.Nothing], isMetric: Boolean): js.Array[String] = js.native
  def nearbyGPSCoordinate(coordinate: String, radius: Double): js.Array[String] = js.native
  def nearbyGPSCoordinate(coordinate: String, radius: Double, isMetric: Boolean): js.Array[String] = js.native
  
  def ordinalDirection(): String = js.native
  def ordinalDirection(useAbbr: Boolean): String = js.native
  
  def secondaryAddress(): String = js.native
  
  def state(): String = js.native
  def state(useAbbr: Boolean): String = js.native
  
  def stateAbbr(): String = js.native
  
  def streetAddress(): String = js.native
  def streetAddress(useFullAddress: Boolean): String = js.native
  
  def streetName(): String = js.native
  
  def streetPrefix(): String = js.native
  
  def streetSuffix(): String = js.native
  
  def timeZone(): String = js.native
  
  def zipCode(): String = js.native
  def zipCode(format: String): String = js.native
  
  def zipCodeByState(state: String): String = js.native
}
