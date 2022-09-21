package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declares client constants that identify the reason the popup window closes.
  */
@JSGlobal("ASPxClientPopupControlCloseReason")
@js.native
open class ASPxClientPopupControlCloseReason ()
  extends StObject
     with typings.devexpressWeb.ASPxClientPopupControlCloseReason
object ASPxClientPopupControlCloseReason {
  
  /**
    * The window has been closed by an API.
    */
  /* static member */
  @JSGlobal("ASPxClientPopupControlCloseReason.API")
  @js.native
  val API: String = js.native
  
  /**
    * An end-user clicks the close header button.
    */
  /* static member */
  @JSGlobal("ASPxClientPopupControlCloseReason.CloseButton")
  @js.native
  val CloseButton: String = js.native
  
  /**
    * An end-user presses the ESC key.
    */
  /* static member */
  @JSGlobal("ASPxClientPopupControlCloseReason.Escape")
  @js.native
  val Escape: String = js.native
  
  /**
    * An end-user moves the mouse pointer out of the window region.
    */
  /* static member */
  @JSGlobal("ASPxClientPopupControlCloseReason.MouseOut")
  @js.native
  val MouseOut: String = js.native
  
  /**
    * An end-user clicks outside the window's region
    */
  /* static member */
  @JSGlobal("ASPxClientPopupControlCloseReason.OuterMouseClick")
  @js.native
  val OuterMouseClick: String = js.native
}
