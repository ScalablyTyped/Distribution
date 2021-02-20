package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoadIndicator extends StObject
/**
  * An enum type that specifies the type of loading or progress indicator to display while an Action is being processed.
  */
@JSGlobal("GoogleAppsScript.Card_Service.LoadIndicator")
@js.native
object LoadIndicator extends StObject {
  
  @js.native
  sealed trait NONE extends LoadIndicator
  
  @js.native
  sealed trait SPINNER extends LoadIndicator
}
