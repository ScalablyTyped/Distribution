package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Priority extends StObject
/**
  * An enum for contact priority.
  */
@JSGlobal("GoogleAppsScript.Contacts.Priority")
@js.native
object Priority extends StObject {
  
  @js.native
  sealed trait HIGH
    extends StObject
       with Priority
  
  @js.native
  sealed trait LOW
    extends StObject
       with Priority
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with Priority
}
