package typings.expoLocation.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofencingEventType with Double] = js.native
  /* 1 */ @js.native
  object Enter extends TopLevel[Enter with Double]
  
  /* 2 */ @js.native
  object Exit extends TopLevel[Exit with Double]
  
}

