package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Format extends js.Object

/**
  * An enum representing the format of the map image.
  * See also
  *
  * Google Static Maps API
  */
@JSGlobal("GoogleAppsScript.Maps.Format")
@js.native
object Format extends js.Object {
  @js.native
  sealed trait GIF extends Format
  
  @js.native
  sealed trait JPG extends Format
  
  @js.native
  sealed trait JPG_BASELINE extends Format
  
  @js.native
  sealed trait PNG extends Format
  
  @js.native
  sealed trait PNG32 extends Format
  
  @js.native
  sealed trait PNG8 extends Format
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Format with Double] = js.native
  /* 3 */ @js.native
  object GIF extends TopLevel[GIF with Double]
  
  /* 4 */ @js.native
  object JPG extends TopLevel[JPG with Double]
  
  /* 5 */ @js.native
  object JPG_BASELINE extends TopLevel[JPG_BASELINE with Double]
  
  /* 0 */ @js.native
  object PNG extends TopLevel[PNG with Double]
  
  /* 2 */ @js.native
  object PNG32 extends TopLevel[PNG32 with Double]
  
  /* 1 */ @js.native
  object PNG8 extends TopLevel[PNG8 with Double]
  
}

