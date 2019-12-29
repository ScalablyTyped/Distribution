package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextButtonStyle extends js.Object

/**
  * An enum that specifies the style for TextButton.
  *
  * TEXT is the default; it renders a simple text button with clear background.
  * FILLED buttons have a background color you can set with
  * TextButton.setBackgroundColor(backgroundColor).
  */
@JSGlobal("GoogleAppsScript.Card_Service.TextButtonStyle")
@js.native
object TextButtonStyle extends js.Object {
  @js.native
  sealed trait FILLED extends TextButtonStyle
  
  @js.native
  sealed trait TEXT extends TextButtonStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextButtonStyle with Double] = js.native
  /* 1 */ @js.native
  object FILLED extends TopLevel[FILLED with Double]
  
  /* 0 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
}

