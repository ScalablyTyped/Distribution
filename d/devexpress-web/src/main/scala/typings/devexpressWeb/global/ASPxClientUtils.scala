package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an object containing service static functions and properties which can be useful when performing client-side processing.
  */
@JSGlobal("ASPxClientUtils")
@js.native
open class ASPxClientUtils ()
  extends StObject
     with typings.devexpressWeb.ASPxClientUtils
object ASPxClientUtils {
  
  @JSGlobal("ASPxClientUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the class name to the specified element on the page.
    * @param element An object that specifies the element.
    * @param className A string value that specifies the class name.
    */
  /* static member */
  inline def AddClassNameToElement(element: Any, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddClassNameToElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes all items from the specified array object.
    * @param array An object that specifies the array to manipulate.
    */
  /* static member */
  inline def ArrayClear(array: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayClear")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Searches for the specified array item and returns the zero-based index of its first occurrence within the specified array object. The zero-based index of the first occurrence of the specified array item within the specified array, if found; otherwise, negative one (&#0045;1).
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to locate.
    */
  /* static member */
  inline def ArrayIndexOf(array: js.Array[Any], element: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayIndexOf")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Inserts the specified item into the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to insert.
    */
  /* static member */
  inline def ArrayInsert(array: js.Array[Any], element: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayInsert")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes the specified item from the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to remove.
    */
  /* static member */
  inline def ArrayRemove(array: js.Array[Any], element: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayRemove")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes an item at the specified index location from the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param index The zero-based index location of the array item to remove.
    */
  /* static member */
  inline def ArrayRemoveAt(array: js.Array[Any], index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayRemoveAt")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the specified function to a specific element's event, so that the function gets called whenever the event fires on the element.
    * @param element An object specifying the required element.
    * @param eventName A string value that specifies the required event name without the "on" prefix.
    * @param method An object that specifies the event's handling function.
    */
  /* static member */
  inline def AttachEventToElement(element: Any, eventName: String, method: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AttachEventToElement")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Clears any text selection made within the window's client region.
    */
  /* static member */
  inline def ClearSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearSelection")().asInstanceOf[Unit]
  
  /**
    * Deletes a cookie with the specified name.
    * @param name A string value that represents the name of a cookie.
    */
  /* static member */
  inline def DeleteCookie(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DeleteCookie")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Unbinds the specified function from a specific element's event, so that the function stops receiving notifications when the event fires.
    * @param element An object specifying the required element.
    * @param eventName A string value that specifies the required event name.
    * @param method An object that specifies the event's handling function.
    */
  /* static member */
  inline def DetachEventFromElement(element: Any, eventName: String, method: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DetachEventFromElement")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the x-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars. An integer value representing the specified element's x-coordinate, in pixels.
    * @param element An object identifying the HTML element whose position should be obtained.
    */
  /* static member */
  inline def GetAbsoluteX(element: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAbsoluteX")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets the y-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars. An integer value representing the specified element's y-coordinate, in pixels.
    * @param element An object identifying the HTML element whose position should be obtained.
    */
  /* static member */
  inline def GetAbsoluteY(element: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAbsoluteY")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns a reference to the first element that has the specified ID in the parent HTML element specified. An object representing the first element with a matching ID or null if no matching element is found.
    * @param element An object identifying the parent HTML element to search.
    * @param id A string specifying the ID attribute value of the desired child element.
    */
  /* static member */
  inline def GetChildById(element: Any, id: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChildById")(element.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Returns a reference to the particular element that has the specified element name and is contained within the specified parent HTML element. An object representing the matching element; a null value if no matching element is found.
    * @param element An object specifying the parent HTML element to search.
    * @param tagName A string value specifying the element name (tag name) of the desired HTML element.
    * @param index An integer value specifying the zero-based index of the desired element amongst all the matching elements found.
    */
  /* static member */
  inline def GetChildByTagName(element: Any, tagName: String, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChildByTagName")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Retrieves a cookie with the specified name. A string value, if the cookie exists.
    * @param name A string value that represents the name of a cookie.
    */
  /* static member */
  inline def GetCookie(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCookie")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Gets the height of the window's client region.
    */
  /* static member */
  inline def GetDocumentClientHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDocumentClientHeight")().asInstanceOf[Double]
  
  /**
    * Gets the width of the window's client region.
    */
  /* static member */
  inline def GetDocumentClientWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDocumentClientWidth")().asInstanceOf[Double]
  
  /**
    * Returns the distance between the left edge of the document and the leftmost portion of the content currently visible in the window.
    */
  /* static member */
  inline def GetDocumentScrollLeft(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDocumentScrollLeft")().asInstanceOf[Double]
  
  /**
    * Returns the distance between the top edge of the document and the topmost portion of the content currently visible in the window.
    */
  /* static member */
  inline def GetDocumentScrollTop(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDocumentScrollTop")().asInstanceOf[Double]
  
  /**
    * Returns values of editors located in the specified container. An object containing pairs of editor names and values.
    * @param containerOrId A container of editors, or its ID.
    * @param processInvisibleEditors true to process both visible and invisible editors that belong to the specified container; false to process only visible editors.
    */
  /* static member */
  inline def GetEditorValuesInContainer(containerOrId: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEditorValuesInContainer")(containerOrId.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def GetEditorValuesInContainer(containerOrId: Any, processInvisibleEditors: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEditorValuesInContainer")(containerOrId.asInstanceOf[js.Any], processInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Returns the object that fired the event. The object that receives the event that fired.
    * @param htmlEvent An object that represents the current event.
    */
  /* static member */
  inline def GetEventSource(htmlEvent: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEventSource")(htmlEvent.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Gets the x-coordinate of the event-related mouse pointer position relative to an end-user's screen. An integer value representing the x-coordinate of the event-related mouse pointer position relative to an end-user's screen.
    * @param htmlEvent An object specifying the required HTML event.
    */
  /* static member */
  inline def GetEventX(htmlEvent: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEventX")(htmlEvent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets the y-coordinate of the event-related mouse pointer position relative to an end-user's screen. An integer value representing the y-coordinate of the event-related mouse pointer position relative to an end-user's screen.
    * @param htmlEvent An object specifying the required HTML event.
    */
  /* static member */
  inline def GetEventY(htmlEvent: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEventY")(htmlEvent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets a value indicating whether the object passed via the parentElement parameter is a parent of the object passed via the element parameter. true, if the parentElement is a parent for the element; otherwise, false.
    * @param parentElement An object specifying the parent HTML element.
    * @param element An object specifying the child HTML element.
    */
  /* static member */
  inline def GetIsParent(parentElement: Any, element: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIsParent")(parentElement.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Gets the keyboard code for the specified event. An integer value representing the keyboard code of the specified event.
    * @param htmlEvent An object specifying the required HTML event.
    */
  /* static member */
  inline def GetKeyCode(htmlEvent: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetKeyCode")(htmlEvent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns a reference to the specified HTML element's first parent object whose class name matches the specified value. An object representing the first parent element with a matching class name or a null value if no matching element is found.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param className A string value specifying the class name of the desired HTML element.
    */
  /* static member */
  inline def GetParentByClassName(element: Any, className: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetParentByClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Returns a reference to the specified HTML element's first parent object which has an ID that matches the specified value. An object representing the first parent element with a matching ID or a null value if no matching element is found.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param id A string specifying the required parent's ID.
    */
  /* static member */
  inline def GetParentById(element: Any, id: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetParentById")(element.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Returns a reference to the specified HTML element's first parent object whose element name matches the specified value. An object representing the first parent element with a matching element name or a null value if no matching element is found.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param tagName A string value specifying the element name (tag name) of the desired HTML element.
    */
  /* static member */
  inline def GetParentByTagName(element: Any, tagName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetParentByTagName")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Returns a specifically generated code that uniquely identifies the combination of keys specified via the parameters. An integer value that represents the code uniquely identifying the key combination.
    * @param keyCode An integer value that specifies the code of the key. Codes are available via the ASPx.KeyCode client object's members.
    * @param isCtrlKey true, if the CTRL key should be included into the key combination; otherwise, false.
    * @param isShiftKey true, if the SHIFT key should be included into the key combination; otherwise, false.
    * @param isAltKey true, if the ALT key should be included into the key combination; otherwise, false.
    */
  /* static member */
  inline def GetShortcutCode(keyCode: Double, isCtrlKey: Boolean, isShiftKey: Boolean, isAltKey: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetShortcutCode")(keyCode.asInstanceOf[js.Any], isCtrlKey.asInstanceOf[js.Any], isShiftKey.asInstanceOf[js.Any], isAltKey.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns a specifically generated code that uniquely identifies the pressed key combination, which is specified by the related HTML event. An integer value that represents the code uniquely identifying the specified key combination.
    * @param htmlEvent A DHTML event object that relates to a key combination being pressed.
    */
  /* static member */
  inline def GetShortcutCodeByEvent(htmlEvent: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetShortcutCodeByEvent")(htmlEvent.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets a value that indicates whether the specified object exists on the client side. true if the specified object exists; otherwise, false.
    * @param obj The object to test.
    */
  /* static member */
  inline def IsExists(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsExists")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Gets a value that indicates whether the specified object is a function. true if the specified object is a function; otherwise, false.
    * @param obj The object to test.
    */
  /* static member */
  inline def IsFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Removes mouse capture from the specified event's source object. Always false.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  /* static member */
  inline def PreventDragStart(htmlEvent: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("PreventDragStart")(htmlEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Cancels the default action of the specified event. Always false.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  /* static member */
  inline def PreventEvent(htmlEvent: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("PreventEvent")(htmlEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Cancels both the specified event's default action and the event's bubbling upon the hierarchy of event handlers. Always false.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  /* static member */
  inline def PreventEventAndBubble(htmlEvent: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("PreventEventAndBubble")(htmlEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Removes the class name attribute from the element.
    * @param element An object that specifies the element.
    * @param className A string value that specifies the class name.
    */
  /* static member */
  inline def RemoveClassNameFromElement(element: Any, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveClassNameFromElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* static member */
  inline def SendMessageToAssistiveTechnology(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SendMessageToAssistiveTechnology")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the x-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars.
    * @param element An object identifying the HTML element whose position should be defined.
    * @param x An integer value specifying the required element's x-coordinate, in pixels.
    */
  /* static member */
  inline def SetAbsoluteX(element: Any, x: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAbsoluteX")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the y-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars.
    * @param element An object identifying the HTML element whose position should be defined.
    * @param y An integer value specifying the required element's y-coordinate, in pixels.
    */
  /* static member */
  inline def SetAbsoluteY(element: Any, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAbsoluteY")(element.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates or updates the HTTP cookie for the response.
    * @param name A string value that represents the name of a cookie.
    * @param value A string representing the cookie value.
    * @param expirationDate A date-time object that represents the expiration date and time for the cookie.
    */
  /* static member */
  inline def SetCookie(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def SetCookie(name: String, value: String, expirationDate: js.Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expirationDate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets values to editors.
    * @param values An object that specifies the values.
    */
  /* static member */
  inline def SetEditorValues(values: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetEditorValues")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns a specifically generated code that uniquely identifies the combination of keys specified via the parameter. An integer value that represents the code uniquely identifying the key combination.
    * @param shortcutString A string value that specifies the key combination.
    */
  /* static member */
  inline def StringToShortcutCode(shortcutString: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("StringToShortcutCode")(shortcutString.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Adds or removes a class name to an element.
    * @param element The element.
    * @param className The class name.
    * @param toggleState true, to add a class name; otherwise, false.
    */
  /* static member */
  inline def ToggleClassName(element: Any, className: String, toggleState: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToggleClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], toggleState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Trims all leading and trailing whitespaces from the string. A string value representing the trimmed string.
    * @param str A string value representing the string for trimming.
    */
  /* static member */
  inline def Trim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Trim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Trims all trailing whitespaces from the string. A string value representing the trimmed string.
    * @param str A string value representing the string for trimming.
    */
  /* static member */
  inline def TrimEnd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("TrimEnd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Trims all leading whitespaces from the string. A string value representing the trimmed string.
    * @param str A string value representing the string for trimming.
    */
  /* static member */
  inline def TrimStart(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("TrimStart")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Gets the user-agent string, which identifies the client browser and provides certain system details of the client computer.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.agent")
  @js.native
  def agent: String = js.native
  inline def agent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agent")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the application is run under the Android platform.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.androidPlatform")
  @js.native
  def androidPlatform: Boolean = js.native
  inline def androidPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("androidPlatform")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies a client browser's major version.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.browserMajorVersion")
  @js.native
  def browserMajorVersion: Double = js.native
  inline def browserMajorVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserMajorVersion")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies a client browser's full version.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.browserVersion")
  @js.native
  def browserVersion: Double = js.native
  inline def browserVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserVersion")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Google Chrome.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.chrome")
  @js.native
  def chrome: Boolean = js.native
  inline def chrome_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Firefox.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.firefox")
  @js.native
  def firefox: Boolean = js.native
  
  /** @deprecated This property is now obsolete. Use the ASPxClientUtils.firefox and ASPxClientUtils.browserMajorVersion properties instead. */
  /**
    * Gets a value that specifies whether the client browser is Firefox version 3.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.firefox3")
  @js.native
  def firefox3: Boolean = js.native
  inline def firefox3_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox3")(x.asInstanceOf[js.Any])
  
  inline def firefox_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the application is run under an iOS platform.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.iOSPlatform")
  @js.native
  def iOSPlatform: Boolean = js.native
  inline def iOSPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iOSPlatform")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Internet Explorer.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ie")
  @js.native
  def ie: Boolean = js.native
  
  /** @deprecated This property is now obsolete. Use the ASPxClientUtils.ie and ASPxClientUtils.browserMajorVersion properties instead. */
  /**
    * Gets a value that specifies whether the client browser is Internet Explorer version 7.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ie7")
  @js.native
  def ie7: Boolean = js.native
  inline def ie7_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ie7")(x.asInstanceOf[js.Any])
  
  inline def ie_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ie")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the application is run under a MacOS platform.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.macOSPlatform")
  @js.native
  def macOSPlatform: Boolean = js.native
  inline def macOSPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macOSPlatform")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Mozilla.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.mozilla")
  @js.native
  def mozilla: Boolean = js.native
  inline def mozilla_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mozilla")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser supports the Microsoft touch user interface.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.msTouchUI")
  @js.native
  def msTouchUI: Boolean = js.native
  inline def msTouchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("msTouchUI")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Netscape.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.netscape")
  @js.native
  def netscape: Boolean = js.native
  
  /**
    * Gets a value that specifies whether a client browser is based on Netscape.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.netscapeFamily")
  @js.native
  def netscapeFamily: Boolean = js.native
  inline def netscapeFamily_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("netscapeFamily")(x.asInstanceOf[js.Any])
  
  inline def netscape_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("netscape")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Opera.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.opera")
  @js.native
  def opera: Boolean = js.native
  
  /** @deprecated This property is now obsolete. Use the ASPxClientUtils.opera and ASPxClientUtils.browserMajorVersion properties instead. */
  /**
    * Gets a value that specifies whether the client browser is Opera version 9.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.opera9")
  @js.native
  def opera9: Boolean = js.native
  inline def opera9_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opera9")(x.asInstanceOf[js.Any])
  
  inline def opera_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opera")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Safari.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.safari")
  @js.native
  def safari: Boolean = js.native
  
  /** @deprecated This property is now obsolete. Use the ASPxClientUtils.safari and ASPxClientUtils.browserMajorVersion properties instead. */
  /**
    * Gets a value that specifies whether the client browser is Safari version 3.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.safari3")
  @js.native
  def safari3: Boolean = js.native
  inline def safari3_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safari3")(x.asInstanceOf[js.Any])
  
  /** @deprecated This property is now obsolete. Use the ASPxClientUtils.safari and ASPxClientUtils.macOSPlatform properties instead. */
  /**
    * Gets a value that specifies whether the client browser is Safari, running under a MacOS operating system.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.safariMacOS")
  @js.native
  def safariMacOS: Boolean = js.native
  inline def safariMacOS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safariMacOS")(x.asInstanceOf[js.Any])
  
  inline def safari_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safari")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser supports touch.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.touchUI")
  @js.native
  def touchUI: Boolean = js.native
  inline def touchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchUI")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether a client browser is based on WebKit.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.webKitFamily")
  @js.native
  def webKitFamily: Boolean = js.native
  inline def webKitFamily_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webKitFamily")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser supports the WebKit touch user interface.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.webKitTouchUI")
  @js.native
  def webKitTouchUI: Boolean = js.native
  inline def webKitTouchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webKitTouchUI")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the application is run under the Windows platform.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.windowsPlatform")
  @js.native
  def windowsPlatform: Boolean = js.native
  inline def windowsPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windowsPlatform")(x.asInstanceOf[js.Any])
}
