package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.PreviewClick and ASPxClientReportDesigner.PreviewClick events.
  */
@js.native
trait ASPxClientPreviewClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides information on a visual brick representing content of a report control that has been clicked.
    */
  var Brick: ASPxClientWebDocumentViewerBrick = js.native
  
  /**
    * Specifies the default function used to handle the ASPxClientWebDocumentViewer.PreviewClick event.
    */
  def DefaultHandler(): Unit = js.native
  
  /**
    * Returns the text displayed by the ASPxClientPreviewClickEventArgs.Brick.
    */
  def GetBrickText(): String = js.native
  
  /**
    * Returns a string providing additional information about the current ASPxClientPreviewClickEventArgs.Brick by the specified key. A string that provides additional information on the current brick by the specified key.
    * @param key A string that specifies a unique key.
    */
  def GetBrickValue(): String = js.native
  def GetBrickValue(key: String): String = js.native
  
  /**
    * Specifies whether or not the event was handled and no default processing is required.
    */
  var Handled: Boolean = js.native
  
  /**
    * Gets a value specifying the zero-based index of the page that has been clicked.
    */
  var PageIndex: Double = js.native
}
