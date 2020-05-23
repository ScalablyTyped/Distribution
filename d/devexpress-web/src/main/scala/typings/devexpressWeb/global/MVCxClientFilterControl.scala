package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typings.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientEndCallbackEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientFilterAppliedEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the FilterControl extension.
  */
@JSGlobal("MVCxClientFilterControl")
@js.native
class MVCxClientFilterControl ()
  extends typings.devexpressWeb.MVCxClientFilterControl {
  /**
    * Occurs after a new filter expression has been applied.
    */
  /* CompleteClass */
  override var Applied: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientFilterAppliedEventHandler[typings.devexpressWeb.ASPxClientFilterControl]
  ] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  override var BeginCallback: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientBeginCallbackEventHandler[typings.devexpressWeb.ASPxClientFilterControl]
  ] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientFilterControl.
    */
  /* CompleteClass */
  override var CallbackError: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientCallbackErrorEventHandler[typings.devexpressWeb.ASPxClientFilterControl]
  ] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typings.devexpressWeb.ASPxClientEvent[ASPxClientEndCallbackEventHandler[typings.devexpressWeb.ASPxClientFilterControl]] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Applies a filter constructed by an end-user.
    */
  /* CompleteClass */
  override def Apply(): Unit = js.native
  /**
    * Returns the filter control's state.
    * @param obj An object that receives a filter control's callback parameters.
    */
  /* CompleteClass */
  override def FillStateObject(obj: js.Any): Unit = js.native
  /**
    * Returns the applied filter expression.
    */
  /* CompleteClass */
  override def GetAppliedFilterExpression(): String = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  /**
    * Returns the editor used to edit operand values for the specified filter column. An ASPxClientEditBase descendant that represents the editor used to edit operand values for the specified filter column.
    * @param editorIndex An integer value that identifies the filter column by its index within the collection.
    */
  /* CompleteClass */
  override def GetEditor(editorIndex: Double): typings.devexpressWeb.ASPxClientEditBase = js.native
  /**
    * Returns the filter expression.
    */
  /* CompleteClass */
  override def GetFilterExpression(): String = js.native
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
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
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
    * Returns a value indicating whether the filter expression being currently composed on the client side is valid - all expression conditions are filled.
    */
  /* CompleteClass */
  override def IsFilterExpressionValid(): Boolean = js.native
  /**
    * Resets the current filter expression to a previously applied filter expression.
    */
  /* CompleteClass */
  override def Reset(): Unit = js.native
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
}

/* static members */
@JSGlobal("MVCxClientFilterControl")
@js.native
object MVCxClientFilterControl extends js.Object {
  /**
    * Converts the specified object to the MVCxClientFilterControl type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typings.devexpressWeb.MVCxClientFilterControl = js.native
}

