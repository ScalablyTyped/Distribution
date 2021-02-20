package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Format extends StObject
/**
  * An enum representing the format of the map image.
  * See also
  *
  * Google Static Maps API
  */
@JSGlobal("GoogleAppsScript.Maps.Format")
@js.native
object Format extends StObject {
  
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
}
