package typings.googleAppsScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Charset extends js.Object
/**
  * A typesafe enum for character sets.
  */
@JSGlobal("GoogleAppsScript.Utilities.Charset")
@js.native
object Charset extends js.Object {
  
  @js.native
  sealed trait US_ASCII extends Charset
  
  @js.native
  sealed trait UTF_8 extends Charset
}
