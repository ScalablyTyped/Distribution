package typings.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeofencingEventType extends js.Object

@JSImport("expo-location", "GeofencingEventType")
@js.native
object GeofencingEventType extends js.Object {
  @js.native
  sealed trait Enter extends GeofencingEventType
  
  @js.native
  sealed trait Exit extends GeofencingEventType
  
  /* 1 */ val Enter: typings.expoDashLocation.expoDashLocationMod.GeofencingEventType.Enter with Double = js.native
  /* 2 */ val Exit: typings.expoDashLocation.expoDashLocationMod.GeofencingEventType.Exit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofencingEventType with Double] = js.native
}

