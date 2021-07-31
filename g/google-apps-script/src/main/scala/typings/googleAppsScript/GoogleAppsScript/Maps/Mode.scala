package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Mode extends StObject
/**
  * An enum representing the mode of travel to use when finding directions.
  */
@JSGlobal("GoogleAppsScript.Maps.Mode")
@js.native
object Mode extends StObject {
  
  @js.native
  sealed trait BICYCLING
    extends StObject
       with Mode
  
  @js.native
  sealed trait DRIVING
    extends StObject
       with Mode
  
  @js.native
  sealed trait TRANSIT
    extends StObject
       with Mode
  
  @js.native
  sealed trait WALKING
    extends StObject
       with Mode
}
