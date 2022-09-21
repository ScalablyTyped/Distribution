package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base functionality for the ASPxClientScheduler's forms.
  */
@JSGlobal("ASPxClientFormBase")
@js.native
open class ASPxClientFormBase ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFormBase {
  
  /**
    * Closes the form.
    */
  /* CompleteClass */
  override def Close(): Unit = js.native
  
  /**
    * Occurs when the form has been closed.
    */
  /* CompleteClass */
  var FormClosed: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientFormBase]] = js.native
  
  /**
    * Sets the visibility state of the specified form element.
    * @param element An object specifying the element whose visibility state should be changed.
    * @param isVisible true to display the element; false to hide the element.
    */
  /* CompleteClass */
  override def SetVisibleCore(element: Any, isVisible: Boolean): Unit = js.native
}
