package typings.googleAppsScript.GoogleAppsScript.Utilities

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Charset with Double] = js.native
  /* 0 */ @js.native
  object US_ASCII extends TopLevel[US_ASCII with Double]
  
  /* 1 */ @js.native
  object UTF_8 extends TopLevel[UTF_8 with Double]
  
}

