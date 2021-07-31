package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerSize extends StObject
/**
  * An enum representing the size of a marker added to a map.
  * See also
  *
  * Google Static Maps API
  */
@JSGlobal("GoogleAppsScript.Maps.MarkerSize")
@js.native
object MarkerSize extends StObject {
  
  @js.native
  sealed trait MID
    extends StObject
       with MarkerSize
  
  @js.native
  sealed trait SMALL
    extends StObject
       with MarkerSize
  
  @js.native
  sealed trait TINY
    extends StObject
       with MarkerSize
}
