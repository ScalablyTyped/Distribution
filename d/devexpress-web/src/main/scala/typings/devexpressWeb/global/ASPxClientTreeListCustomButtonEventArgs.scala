package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.CustomButtonClick event.
  */
@JSGlobal("ASPxClientTreeListCustomButtonEventArgs")
@js.native
open class ASPxClientTreeListCustomButtonEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListCustomButtonEventArgs {
  
  /**
    * Gets the value which identifies the custom button.
    */
  /* CompleteClass */
  var buttonID: String = js.native
  
  /**
    * Gets the button's index.
    */
  /* CompleteClass */
  var buttonIndex: Double = js.native
  
  /**
    * Gets the key value of the node whose custom button has been clicked.
    */
  /* CompleteClass */
  var nodeKey: String = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
