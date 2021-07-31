package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Avoid extends StObject
/**
  * An enum representing the types of restrictions to avoid when finding directions.
  */
@JSGlobal("GoogleAppsScript.Maps.Avoid")
@js.native
object Avoid extends StObject {
  
  @js.native
  sealed trait HIGHWAYS
    extends StObject
       with Avoid
  
  @js.native
  sealed trait TOLLS
    extends StObject
       with Avoid
}
