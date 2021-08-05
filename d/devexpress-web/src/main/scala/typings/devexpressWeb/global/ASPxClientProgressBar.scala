package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxProgressBar control.
  */
@JSGlobal("ASPxClientProgressBar")
@js.native
class ASPxClientProgressBar ()
  extends StObject
     with typings.devexpressWeb.ASPxClientProgressBar {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Returns the text displayed in the editor caption.
    */
  /* CompleteClass */
  override def GetCaption(): String = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns the text displayed within the progress bar.
    */
  /* CompleteClass */
  override def GetDisplayText(): String = js.native
  
  /**
    * Returns a value indicating whether an editor is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  
  /**
    * Gets the maximum range value of the progress bar.
    */
  /* CompleteClass */
  override def GetMaximum(): Double = js.native
  
  /**
    * Gets the minimum range value of the progress bar.
    */
  /* CompleteClass */
  override def GetMinimum(): Double = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  
  /**
    * Sets the percentage representation of the progress position.
    */
  /* CompleteClass */
  override def GetPercent(): Double = js.native
  
  /**
    * Gets the position of the operation's progress.
    */
  /* CompleteClass */
  override def GetPosition(): Double = js.native
  
  /**
    * Returns the editor's value.
    */
  /* CompleteClass */
  override def GetValue(): js.Any = js.native
  
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
  
  /**
    * Specifies the text displayed in the editor caption.
    * @param caption A string value specifying the editor caption.
    */
  /* CompleteClass */
  override def SetCaption(caption: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Sets the pattern used to format the displayed text for the progress bar.
    * @param text A  value that is the format pattern.
    */
  /* CompleteClass */
  override def SetCustomDisplayFormat(text: String): Unit = js.native
  
  /**
    * Specifies whether an editor is enabled.
    * @param value true to enable the editor; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Sets the maximum range value of the progress bar.
    * @param max An integer value specifying the maximum value of the progress bar range.
    */
  /* CompleteClass */
  override def SetMaximum(max: Double): Unit = js.native
  
  /**
    * Sets the minimum and maximum range values of the progress bar.
    * @param minValue An integer value specifying the minimum value of the progress bar range.
    * @param maxValue An integer value specifying the maximum value of the progress bar range.
    */
  /* CompleteClass */
  override def SetMinMaxValues(minValue: Double, maxValue: Double): Unit = js.native
  
  /**
    * Sets the minimum range value of the progress bar.
    * @param min An integer value specifying the minimum value of the progress bar range.
    */
  /* CompleteClass */
  override def SetMinimum(min: Double): Unit = js.native
  
  /**
    * Sets the position of the operation's progress.
    * @param position An integer value specifying the progress position.
    */
  /* CompleteClass */
  override def SetPosition(position: Double): Unit = js.native
  
  /**
    * Changes the editor's value.
    * @param value An object representing the data to be assigned to the editor's edit value.
    */
  /* CompleteClass */
  override def SetValue(value: js.Any): Unit = js.native
  
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
object ASPxClientProgressBar {
  
  @JSGlobal("ASPxClientProgressBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the ASPxClientProgressBar type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientProgressBar = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.devexpressWeb.ASPxClientProgressBar]
}
