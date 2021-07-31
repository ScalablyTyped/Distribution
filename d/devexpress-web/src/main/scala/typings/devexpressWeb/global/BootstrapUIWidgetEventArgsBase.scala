package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base data for the client-side events.
  */
@JSGlobal("BootstrapUIWidgetEventArgsBase")
@js.native
class BootstrapUIWidgetEventArgsBase protected ()
  extends StObject
     with typings.devexpressWeb.BootstrapUIWidgetEventArgsBase {
  /**
    * Initializes a new instance of the BootstrapUIWidgetEventArgsBase class with the specified widget and its container.
    * @param component The widget instance.
    * @param element The widget's container.
    */
  def this(component: js.Any, element: js.Any) = this()
  
  /**
    * The widget instance.
    */
  /* CompleteClass */
  var component: js.Any = js.native
  
  /**
    * The widget's container.
    */
  /* CompleteClass */
  var element: js.Any = js.native
}
