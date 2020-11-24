package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationGeofencingRegionState extends js.Object
@JSImport("expo-location/build/Location.types", "LocationGeofencingRegionState")
@js.native
object LocationGeofencingRegionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationGeofencingRegionState with Double] = js.native
  
  @js.native
  sealed trait Inside extends LocationGeofencingRegionState
  /* 1 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  @js.native
  sealed trait Outside extends LocationGeofencingRegionState
  /* 2 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
  @js.native
  sealed trait Unknown extends LocationGeofencingRegionState
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
