package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
/**
  * An enumeration denoting the type of triggered event.
  */
@JSGlobal("GoogleAppsScript.Script.EventType")
@js.native
object EventType extends StObject {
  
  @js.native
  sealed trait CLOCK
    extends StObject
       with EventType
  
  @js.native
  sealed trait ON_CHANGE
    extends StObject
       with EventType
  
  @js.native
  sealed trait ON_EDIT
    extends StObject
       with EventType
  
  @js.native
  sealed trait ON_EVENT_UPDATED
    extends StObject
       with EventType
  
  @js.native
  sealed trait ON_FORM_SUBMIT
    extends StObject
       with EventType
  
  @js.native
  sealed trait ON_OPEN
    extends StObject
       with EventType
}
