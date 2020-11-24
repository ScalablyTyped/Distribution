package typings.googleAppsScript.GoogleAppsScript.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends js.Object
/**
  * An enum representing the visibility of an event.
  */
@JSGlobal("GoogleAppsScript.Calendar.Visibility")
@js.native
object Visibility extends js.Object {
  
  @js.native
  sealed trait CONFIDENTIAL extends Visibility
  
  @js.native
  sealed trait DEFAULT extends Visibility
  
  @js.native
  sealed trait PRIVATE extends Visibility
  
  @js.native
  sealed trait PUBLIC extends Visibility
}
