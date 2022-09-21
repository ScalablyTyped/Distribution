package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.NodeClick event.
  */
@JSGlobal("ASPxClientTreeViewNodeClickEventArgs")
@js.native
open class ASPxClientTreeViewNodeClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeViewNodeClickEventArgs {
  /**
    * Initializes a new object of the ASPxClientTreeViewNodeClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param node An ASPxClientTreeViewNode object that represents a node related to the event.
    * @param htmlElement An HTML object that contains the processed node.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    node: typings.devexpressWeb.ASPxClientTreeViewNode,
    htmlElement: Any,
    htmlEvent: Any
  ) = this()
  
  /**
    * Gets the HTML object that contains the processed node.
    */
  /* CompleteClass */
  var htmlElement: Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets a node object related to the event.
    */
  /* CompleteClass */
  var node: typings.devexpressWeb.ASPxClientTreeViewNode = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
