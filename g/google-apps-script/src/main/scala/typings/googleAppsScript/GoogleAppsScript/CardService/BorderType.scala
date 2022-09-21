package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderType extends StObject
/**
  * An enum that represents the border types that can be applied to widgets.
  */
@JSGlobal("GoogleAppsScript.Card_Service.BorderType")
@js.native
object BorderType extends StObject {
  
  /** No border style. */
  @js.native
  sealed trait NO_BORDER
    extends StObject
       with BorderType
  
  /** Stroke border style. */
  @js.native
  sealed trait STROKE
    extends StObject
       with BorderType
}
