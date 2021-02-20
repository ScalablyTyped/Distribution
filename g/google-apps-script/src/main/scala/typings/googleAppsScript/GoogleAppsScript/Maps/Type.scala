package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
/**
  * An enum representing the type of map to render.
  * See also
  *
  * Google Static Maps API
  */
@JSGlobal("GoogleAppsScript.Maps.Type")
@js.native
object Type extends StObject {
  
  @js.native
  sealed trait HYBRID extends Type
  
  @js.native
  sealed trait ROADMAP extends Type
  
  @js.native
  sealed trait SATELLITE extends Type
  
  @js.native
  sealed trait TERRAIN extends Type
}
