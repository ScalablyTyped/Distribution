package typings.expoLocation.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeofencingRegionState extends js.Object

@JSImport("expo-location", "GeofencingRegionState")
@js.native
object GeofencingRegionState extends js.Object {
  @js.native
  sealed trait Inside extends GeofencingRegionState
  
  @js.native
  sealed trait Outside extends GeofencingRegionState
  
  @js.native
  sealed trait Unknown extends GeofencingRegionState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofencingRegionState with Double] = js.native
  /* 1 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  /* 2 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

