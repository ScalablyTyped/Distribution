package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for an event that occurs before a spelling check is started. Represents the client-side equivalent of the BeforeCheckEventArgs class.
  */
@JSGlobal("ASPxClientSpellCheckerBeforeCheckEventArgs")
@js.native
open class ASPxClientSpellCheckerBeforeCheckEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSpellCheckerBeforeCheckEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpellCheckerBeforeCheckEventArgs class with specified settings.
    * @param controlId A string, containing the control's programmatic identifier.
    */
  def this(controlId: String) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the programmatic identifier assigned to the control which is going to be checked.
    */
  /* CompleteClass */
  var controlId: String = js.native
}
