package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SwitchControlType extends StObject
/**
  * Type of switch.
  */
@JSGlobal("GoogleAppsScript.Card_Service.SwitchControlType")
@js.native
object SwitchControlType extends StObject {
  
  @js.native
  sealed trait CHECK_BOX
    extends StObject
       with SwitchControlType
  
  @js.native
  sealed trait SWITCH
    extends StObject
       with SwitchControlType
}
