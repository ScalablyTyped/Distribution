package typings.googleDashAppsDashScript.GoogleAppsScript.Utilities

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset.US_ASCII
import typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset.UTF_8
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
  sealed trait US_ASCII
    extends typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset
  
  @js.native
  sealed trait UTF_8
    extends typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset with Double] = js.native
  /* 0 */ @js.native
  object US_ASCII extends TopLevel[US_ASCII with Double]
  
  /* 1 */ @js.native
  object UTF_8 extends TopLevel[UTF_8 with Double]
  
}

