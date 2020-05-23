package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typings.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientEndCallbackEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxHiddenField control.
  */
@JSGlobal("ASPxClientHiddenField")
@js.native
class ASPxClientHiddenField ()
  extends typings.devexpressWeb.ASPxClientHiddenField {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  override var BeginCallback: typings.devexpressWeb.ASPxClientEvent[ASPxClientBeginCallbackEventHandler[typings.devexpressWeb.ASPxClientHiddenField]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientHiddenField.
    */
  /* CompleteClass */
  override var CallbackError: typings.devexpressWeb.ASPxClientEvent[ASPxClientCallbackErrorEventHandler[typings.devexpressWeb.ASPxClientHiddenField]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typings.devexpressWeb.ASPxClientEvent[ASPxClientEndCallbackEventHandler[typings.devexpressWeb.ASPxClientHiddenField]] = js.native
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
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the value of the specified property.
    */
  /* CompleteClass */
  override def Add(propertyName: String, propertyValue: js.Any): Unit = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Clears the ASPxHiddenField's value collection.
    */
  /* CompleteClass */
  override def Clear(): Unit = js.native
  /**
    * Returns a value indicating whether the value with the specified property name is contained within the ASPxHiddenField control's value collection. true if this value is contained within the collection; otherwise, false.
    * @param propertyName A string value that specifies the property name.
    */
  /* CompleteClass */
  override def Contains(propertyName: String): Boolean = js.native
  /**
    * Returns the value with the specified property name. An object that represents the value of the specified property.
    * @param propertyName A string value that specifies the property name.
    */
  /* CompleteClass */
  override def Get(propertyName: String): js.Any = js.native
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
    * Sends a callback to the server and generates the server-side ASPxHiddenField.CustomCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxHiddenField.CustomCallback event.
    */
  /* CompleteClass */
  override def PerformCallback(parameter: String): Unit = js.native
  /**
    * Removes the specified value from the ASPxHiddenField collection.
    * @param propertyName A string value representing the property name.
    */
  /* CompleteClass */
  override def Remove(propertyName: String): Unit = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the property value.
    */
  /* CompleteClass */
  override def Set(propertyName: String, propertyValue: js.Any): Unit = js.native
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
@JSGlobal("ASPxClientHiddenField")
@js.native
object ASPxClientHiddenField extends js.Object {
  /**
    * Converts the specified object to the ASPxClientHiddenField type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientHiddenField = js.native
}

