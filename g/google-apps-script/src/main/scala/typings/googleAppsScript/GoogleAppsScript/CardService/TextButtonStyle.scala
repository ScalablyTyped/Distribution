package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextButtonStyle extends StObject
/**
  * An enum that specifies the style for TextButton.
  *
  * TEXT is the default; it renders a simple text button with clear background.
  * FILLED buttons have a background color you can set with
  * TextButton.setBackgroundColor(backgroundColor).
  */
@JSGlobal("GoogleAppsScript.Card_Service.TextButtonStyle")
@js.native
object TextButtonStyle extends StObject {
  
  @js.native
  sealed trait FILLED extends TextButtonStyle
  
  @js.native
  sealed trait TEXT extends TextButtonStyle
}
