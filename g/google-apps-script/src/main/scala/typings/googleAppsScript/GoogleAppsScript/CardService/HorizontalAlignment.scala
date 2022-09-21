package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalAlignment extends StObject
/**
  * An enum that specifies the horizontal alignment of a widget.
  */
@JSGlobal("GoogleAppsScript.Card_Service.HorizontalAlignment")
@js.native
object HorizontalAlignment extends StObject {
  
  /** Align the widget to the center. */
  @js.native
  sealed trait CENTER
    extends StObject
       with HorizontalAlignment
  
  /** Align the widget to the end of the sentence side. */
  @js.native
  sealed trait END
    extends StObject
       with HorizontalAlignment
  
  /** Align the widget to the start of the sentence side. */
  @js.native
  sealed trait START
    extends StObject
       with HorizontalAlignment
}
