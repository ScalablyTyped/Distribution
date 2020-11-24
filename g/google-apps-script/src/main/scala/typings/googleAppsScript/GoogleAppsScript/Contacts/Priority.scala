package typings.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Priority extends js.Object
/**
  * An enum for contact priority.
  */
@JSGlobal("GoogleAppsScript.Contacts.Priority")
@js.native
object Priority extends js.Object {
  
  @js.native
  sealed trait HIGH extends Priority
  
  @js.native
  sealed trait LOW extends Priority
  
  @js.native
  sealed trait NORMAL extends Priority
}
