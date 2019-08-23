package typings.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-location", "Accuracy")
@js.native
object Accuracy extends js.Object {
  /* 3 */ val Balanced: typings.expoDashLocation.expoDashLocationMod.LocationAccuracy.Balanced with Double = js.native
  /* 6 */ val BestForNavigation: typings.expoDashLocation.expoDashLocationMod.LocationAccuracy.BestForNavigation with Double = js.native
  /* 4 */ val High: typings.expoDashLocation.expoDashLocationMod.LocationAccuracy.High with Double = js.native
  /* 5 */ val Highest: typings.expoDashLocation.expoDashLocationMod.LocationAccuracy.Highest with Double = js.native
  /* 2 */ val Low: typings.expoDashLocation.expoDashLocationMod.LocationAccuracy.Low with Double = js.native
  /* 1 */ val Lowest: typings.expoDashLocation.expoDashLocationMod.LocationAccuracy.Lowest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationAccuracy with Double] = js.native
}

