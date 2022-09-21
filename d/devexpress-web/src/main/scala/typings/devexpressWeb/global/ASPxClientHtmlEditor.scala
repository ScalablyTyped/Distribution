package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxHtmlEditor control.
  */
@JSGlobal("ASPxClientHtmlEditor")
@js.native
open class ASPxClientHtmlEditor ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditor {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
object ASPxClientHtmlEditor {
  
  @JSGlobal("ASPxClientHtmlEditor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the ASPxClientHtmlEditor type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: Any): typings.devexpressWeb.ASPxClientHtmlEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.devexpressWeb.ASPxClientHtmlEditor]
  
  /**
    * Programmatically closes a custom dialog, supplying it with specific parameters.
    * @param status An object representing a custom dialog's closing status.
    * @param data An object representing custom data associated with a custom dialog.
    */
  /* static member */
  inline def CustomDialogComplete(status: Any, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CustomDialogComplete")(status.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Highlights the text with the specified text color and background color.
    * @param text A string value specifying the text to be highlighted.
    * @param searchContainer An object specifying the container where the specified text should be searched.
    * @param color A string value specifying the text color.
    * @param backgroundColor A string value specifying the background color.
    */
  /* static member */
  inline def HighlightText(text: String, searchContainer: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HighlightText")(text.asInstanceOf[js.Any], searchContainer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HighlightText(text: String, searchContainer: Any, color: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HighlightText")(text.asInstanceOf[js.Any], searchContainer.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HighlightText(text: String, searchContainer: Any, color: String, backgroundColor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HighlightText")(text.asInstanceOf[js.Any], searchContainer.asInstanceOf[js.Any], color.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HighlightText(text: String, searchContainer: Any, color: Unit, backgroundColor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HighlightText")(text.asInstanceOf[js.Any], searchContainer.asInstanceOf[js.Any], color.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
