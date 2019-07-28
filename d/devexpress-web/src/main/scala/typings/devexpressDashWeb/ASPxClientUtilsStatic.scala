package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientUtilsStatic extends js.Object {
  /**
    * Gets the user-agent string, which identifies the client browser and provides certain system details of the client computer.
    * Value: A string value representing the browser's user-agent string.
    */
  var agent: String = js.native
  /**
    * Gets a value that specifies whether the application is run under the Android platform.
    * Value: true if the application is run under the Android platform; otherwise, false.
    */
  var androidPlatform: Boolean = js.native
  /**
    * Gets a value that specifies a client browser's major version.
    * Value: An integer value that specifies a client browser's major version.
    */
  var browserMajorVersion: Double = js.native
  /**
    * Gets a value that specifies a client browser's full version.
    * Value: A double precision floating-point value that specifies a client browser's version.
    */
  var browserVersion: Double = js.native
  /**
    * Gets a value that specifies whether the client browser is Google Chrome.
    * Value: true if the client browser is Google Chrome; otherwise, false.
    */
  var chrome: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Firefox.
    * Value: true if the client browser is Firefox; otherwise, false.
    */
  var firefox: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Firefox version 3.
    * Value: true if the client browser is Firefox version 3; otherwise, false.
    */
  var firefox3: Boolean = js.native
  /**
    * Gets a value that specifies whether the application is run under an iOS platform.
    * Value: true if the application is run under the iOS platform; otherwise, false.
    */
  var iOSPlatform: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Internet Explorer.
    * Value: true if the client browser is Intenet Explorer; otherwise, false.
    */
  var ie: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Internet Explorer version 7.
    * Value: true if the client browser is Intenet Explorer version 7; otherwise, false.
    */
  var ie7: Boolean = js.native
  /**
    * Gets a value that specifies whether the application is run under a MacOS platform.
    * Value: true if the application is run under the MacOS platform; otherwise, false.
    */
  var macOSPlatform: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Mozilla.
    * Value: true if the client browser is Mozilla; otherwise, false.
    */
  var mozilla: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser supports the Microsoft touch user interface.
    * Value: true if the client browser supports the Microsoft touch user interface; otherwise, false.
    */
  var msTouchUI: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Netscape.
    * Value: true if the client browser is Netscape; otherwise, false.
    */
  var netscape: Boolean = js.native
  /**
    * Gets a value that specifies whether a client browser is based on Netscape.
    * Value: true if client browser is based on Netscape; otherwise, false.
    */
  var netscapeFamily: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Opera.
    * Value: true if the client browser is Opera; otherwise, false.
    */
  var opera: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Opera version 9.
    * Value: true if the client browser is Opera version 9; otherwise, false.
    */
  var opera9: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Safari.
    * Value: true if the client browser is Safari; otherwise, false.
    */
  var safari: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Safari version 3.
    * Value: true if the client browser is Safari version 3; otherwise, false.
    */
  var safari3: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser is Safari, running under a MacOS operating system.
    * Value: true if the client browser is Safari, running under a MacOS operating system; otherwise, false.
    */
  var safariMacOS: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser supports touch.
    * Value: true if the client browser supports touch; otherwise, false.
    */
  var touchUI: Boolean = js.native
  /**
    * Gets a value that specifies whether a client browser is based on WebKit.
    * Value: true if the client browser is based on WebKit; otherwise, false.
    */
  var webKitFamily: Boolean = js.native
  /**
    * Gets a value that specifies whether the client browser supports the WebKit touch user interface.
    * Value: true if the client browser supports the WebKit touch user interface; otherwise, false.
    */
  var webKitTouchUI: Boolean = js.native
  /**
    * Gets a value that specifies whether the application is run under the Windows platform.
    * Value: true if the application is run under the Windows platform; otherwise, false.
    */
  var windowsPlatform: Boolean = js.native
  /**
    * 
    * @param element 
    * @param className 
    */
  def AddClassNameToElement(element: js.Object, className: String): Unit = js.native
  /**
    * Removes all items from the specified array object.
    * @param array An object that specifies the array to manipulate.
    */
  def ArrayClear(array: js.Array[js.Object]): Unit = js.native
  /**
    * Searches for the specified array item and returns the zero-based index of its first occurrence within the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to locate.
    */
  def ArrayIndexOf(array: js.Array[js.Object], element: js.Object): Double = js.native
  /**
    * Inserts the specified item into the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to insert.
    */
  def ArrayInsert(array: js.Array[js.Object], element: js.Object): Unit = js.native
  /**
    * Removes the specified item from the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to remove.
    */
  def ArrayRemove(array: js.Array[js.Object], element: js.Object): Unit = js.native
  /**
    * Removes an item at the specified index location from the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param index The zero-based index location of the array item to remove.
    */
  def ArrayRemoveAt(array: js.Array[js.Object], index: Double): Unit = js.native
  /**
    * Binds the specified function to a specific element's event, so that the function gets called whenever the event fires on the element.
    * @param element An object specifying the required element.
    * @param eventName A string value that specifies the required event name without the "on" prefix.
    * @param method An object that specifies the event's handling function.
    */
  def AttachEventToElement(element: js.Object, eventName: String, method: js.Object): Unit = js.native
  /**
    * Clears any text selection made within the window's client region.
    */
  def ClearSelection(): Unit = js.native
  /**
    * Deletes a cookie with the specified name.
    * @param name A string value that represents the name of a cookie.
    */
  def DeleteCookie(name: String): Unit = js.native
  /**
    * Unbinds the specified function from a specific element's event, so that the function stops receiving notifications when the event fires.
    * @param element An object specifying the required element.
    * @param eventName A string value that specifies the required event name.
    * @param method An object that specifies the event's handling function.
    */
  def DetachEventFromElement(element: js.Object, eventName: String, method: js.Object): Unit = js.native
  /**
    * Gets the x-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars.
    * @param element An object identifying the HTML element whose position should be obtained.
    */
  def GetAbsoluteX(element: js.Object): Double = js.native
  /**
    * Gets the y-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars.
    * @param element An object identifying the HTML element whose position should be obtained.
    */
  def GetAbsoluteY(element: js.Object): Double = js.native
  /**
    * Returns a reference to the first element that has the specified ID in the parent HTML element specified.
    * @param element An object identifying the parent HTML element to search.
    * @param id A string specifying the ID attribute value of the desired child element.
    */
  def GetChildById(element: js.Object, id: String): js.Object = js.native
  /**
    * Returns a reference to the particular element that has the specified element name and is contained within the specified parent HTML element.
    * @param element An object specifying the parent HTML element to search.
    * @param tagName A string value specifying the element name (tag name) of the desired HTML element.
    * @param index An integer value specifying the zero-based index of the desired element amongst all the matching elements found.
    */
  def GetChildByTagName(element: js.Object, tagName: String, index: Double): js.Object = js.native
  /**
    * Retrieves a cookie with the specified name.
    * @param name A string value that represents the name of a cookie.
    */
  def GetCookie(name: String): String = js.native
  /**
    * Gets the height of the window's client region.
    */
  def GetDocumentClientHeight(): Double = js.native
  /**
    * Gets the width of the window's client region.
    */
  def GetDocumentClientWidth(): Double = js.native
  /**
    * Returns the distance between the left edge of the document and the leftmost portion of the content currently visible in the window.
    */
  def GetDocumentScrollLeft(): Double = js.native
  /**
    * Returns the distance between the top edge of the document and the topmost portion of the content currently visible in the window.
    */
  def GetDocumentScrollTop(): Double = js.native
  /**
    * Returns values of editors located in the specified container.
    * @param containerOrId A container of editors, or its ID.
    */
  def GetEditorValuesInContainer(containerOrId: js.Object): js.Object = js.native
  /**
    * Returns values of editors located in the specified container.
    * @param containerOrId A container of editors, or its ID.
    * @param processInvisibleEditors true to process both visible and invisible editors that belong to the specified container; false to process only visible editors.
    */
  def GetEditorValuesInContainer(containerOrId: js.Object, processInvisibleEditors: Boolean): js.Object = js.native
  /**
    * Returns the object that fired the event.
    * @param htmlEvent An object that represents the current event.
    */
  def GetEventSource(htmlEvent: js.Object): js.Object = js.native
  /**
    * Gets the x-coordinate of the event-related mouse pointer position relative to an end-user's screen.
    * @param htmlEvent An object specifying the required HTML event.
    */
  def GetEventX(htmlEvent: js.Object): Double = js.native
  /**
    * Gets the y-coordinate of the event-related mouse pointer position relative to an end-user's screen.
    * @param htmlEvent An object specifying the required HTML event.
    */
  def GetEventY(htmlEvent: js.Object): Double = js.native
  /**
    * Gets a value indicating whether the object passed via the parentElement parameter is a parent of the object passed via the element parameter.
    * @param parentElement An object specifying the parent HTML element.
    * @param element An object specifying the child HTML element.
    */
  def GetIsParent(parentElement: js.Object, element: js.Object): Boolean = js.native
  /**
    * Gets the keyboard code for the specified event.
    * @param htmlEvent An object specifying the required HTML event.
    */
  def GetKeyCode(htmlEvent: js.Object): Double = js.native
  /**
    * Returns a reference to the specified HTML element's first parent object whose class name matches the specified value.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param className A string value specifying the class name of the desired HTML element.
    */
  def GetParentByClassName(element: js.Object, className: String): js.Object = js.native
  /**
    * Returns a reference to the specified HTML element's first parent object which has an ID that matches the specified value.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param id A string specifying the required parent's ID.
    */
  def GetParentById(element: js.Object, id: String): js.Object = js.native
  /**
    * Returns a reference to the specified HTML element's first parent object whose element name matches the specified value.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param tagName A string value specifying the element name (tag name) of the desired HTML element.
    */
  def GetParentByTagName(element: js.Object, tagName: String): js.Object = js.native
  /**
    * Returns a specifically generated code that uniquely identifies the combination of keys specified via the parameters.
    * @param keyCode An integer value that specifies the code of the key. Codes are available via the ASPx.KeyCode client object's members.
    * @param isCtrlKey true, if the CTRL key should be included into the key combination; otherwise, false.
    * @param isShiftKey true, if the SHIFT key should be included into the key combination; otherwise, false.
    * @param isAltKey true, if the ALT key should be included into the key combination; otherwise, false.
    */
  def GetShortcutCode(keyCode: Double, isCtrlKey: Boolean, isShiftKey: Boolean, isAltKey: Boolean): Double = js.native
  /**
    * Returns a specifically generated code that uniquely identifies the pressed key combination, which is specified by the related HTML event.
    * @param htmlEvent A DHTML event object that relates to a key combination being pressed.
    */
  def GetShortcutCodeByEvent(htmlEvent: js.Object): Double = js.native
  /**
    * Gets a value that indicates whether the specified object exists on the client side.
    * @param obj The object to test.
    */
  def IsExists(obj: js.Object): Boolean = js.native
  /**
    * Gets a value that indicates whether the specified object is a function.
    * @param obj The object to test.
    */
  def IsFunction(obj: js.Object): Boolean = js.native
  /**
    * Removes mouse capture from the specified event's source object.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  def PreventDragStart(htmlEvent: js.Object): Boolean = js.native
  /**
    * Cancels the default action of the specified event.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  def PreventEvent(htmlEvent: js.Object): Boolean = js.native
  /**
    * Cancels both the specified event's default action and the event's bubbling upon the hierarchy of event handlers.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  def PreventEventAndBubble(htmlEvent: js.Object): Boolean = js.native
  /**
    * 
    * @param element 
    * @param className 
    */
  def RemoveClassNameFromElement(element: js.Object, className: String): Unit = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /**
    * Sets the x-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars.
    * @param element An object identifying the HTML element whose position should be defined.
    * @param x An integer value specifying the required element's x-coordinate, in pixels.
    */
  def SetAbsoluteX(element: js.Object, x: Double): Unit = js.native
  /**
    * Sets the y-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars.
    * @param element An object identifying the HTML element whose position should be defined.
    * @param y An integer value specifying the required element's y-coordinate, in pixels.
    */
  def SetAbsoluteY(element: js.Object, y: Double): Unit = js.native
  /**
    * Creates or updates the HTTP cookie for the response.
    * @param name A string value that represents the name of a cookie.
    * @param value A string representing the cookie value.
    */
  def SetCookie(name: String, value: String): Unit = js.native
  /**
    * Creates or updates the HTTP cookie for the response.
    * @param name A string value that represents the name of a cookie.
    * @param value A string representing the cookie value.
    * @param expirationDate A date-time object that represents the expiration date and time for the cookie.
    */
  def SetCookie(name: String, value: String, expirationDate: Date): Unit = js.native
  def SetEditorValues(values: js.Object): Unit = js.native
  /**
    * Returns a specifically generated code that uniquely identifies the combination of keys specified via the parameter.
    * @param shortcutString A string value that specifies the key combination.
    */
  def StringToShortcutCode(shortcutString: String): Double = js.native
  /**
    * Trims all leading and trailing whitespaces from the string.
    * @param str A string value representing the string for trimming.
    */
  def Trim(str: String): String = js.native
  /**
    * Trims all trailing whitespaces from the string.
    * @param str A string value representing the string for trimming.
    */
  def TrimEnd(str: String): String = js.native
  /**
    * Trims all leading whitespaces from the string.
    * @param str A string value representing the string for trimming.
    */
  def TrimStart(str: String): String = js.native
}

