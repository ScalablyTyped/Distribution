package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an object containing service static functions and properties which can be useful when performing client-side processing.
  */
@JSGlobal("ASPxClientUtils")
@js.native
class ASPxClientUtils ()
  extends typings.devexpressWeb.ASPxClientUtils
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
  @JSGlobal("ASPxClientUtils.AddClassNameToElement")
  @js.native
  def AddClassNameToElement(element: js.Any, className: String): Unit = js.native
  
  /**
    * Removes all items from the specified array object.
    * @param array An object that specifies the array to manipulate.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ArrayClear")
  @js.native
  def ArrayClear(array: js.Array[_]): Unit = js.native
  
  /**
    * Searches for the specified array item and returns the zero-based index of its first occurrence within the specified array object. The zero-based index of the first occurrence of the specified array item within the specified array, if found; otherwise, negative one (&#0045;1).
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to locate.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ArrayIndexOf")
  @js.native
  def ArrayIndexOf(array: js.Array[_], element: js.Any): Double = js.native
  
  /**
    * Inserts the specified item into the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to insert.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ArrayInsert")
  @js.native
  def ArrayInsert(array: js.Array[_], element: js.Any): Unit = js.native
  
  /**
    * Removes the specified item from the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param element An object that specifies the array item to remove.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ArrayRemove")
  @js.native
  def ArrayRemove(array: js.Array[_], element: js.Any): Unit = js.native
  
  /**
    * Removes an item at the specified index location from the specified array object.
    * @param array An object that specifies the array to manipulate.
    * @param index The zero-based index location of the array item to remove.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ArrayRemoveAt")
  @js.native
  def ArrayRemoveAt(array: js.Array[_], index: Double): Unit = js.native
  
  /**
    * Binds the specified function to a specific element's event, so that the function gets called whenever the event fires on the element.
    * @param element An object specifying the required element.
    * @param eventName A string value that specifies the required event name without the "on" prefix.
    * @param method An object that specifies the event's handling function.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.AttachEventToElement")
  @js.native
  def AttachEventToElement(element: js.Any, eventName: String, method: js.Any): Unit = js.native
  
  /**
    * Clears any text selection made within the window's client region.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ClearSelection")
  @js.native
  def ClearSelection(): Unit = js.native
  
  /**
    * Deletes a cookie with the specified name.
    * @param name A string value that represents the name of a cookie.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.DeleteCookie")
  @js.native
  def DeleteCookie(name: String): Unit = js.native
  
  /**
    * Unbinds the specified function from a specific element's event, so that the function stops receiving notifications when the event fires.
    * @param element An object specifying the required element.
    * @param eventName A string value that specifies the required event name.
    * @param method An object that specifies the event's handling function.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.DetachEventFromElement")
  @js.native
  def DetachEventFromElement(element: js.Any, eventName: String, method: js.Any): Unit = js.native
  
  /**
    * Gets the x-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars. An integer value representing the specified element's x-coordinate, in pixels.
    * @param element An object identifying the HTML element whose position should be obtained.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetAbsoluteX")
  @js.native
  def GetAbsoluteX(element: js.Any): Double = js.native
  
  /**
    * Gets the y-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars. An integer value representing the specified element's y-coordinate, in pixels.
    * @param element An object identifying the HTML element whose position should be obtained.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetAbsoluteY")
  @js.native
  def GetAbsoluteY(element: js.Any): Double = js.native
  
  /**
    * Returns a reference to the first element that has the specified ID in the parent HTML element specified. An object representing the first element with a matching ID or null if no matching element is found.
    * @param element An object identifying the parent HTML element to search.
    * @param id A string specifying the ID attribute value of the desired child element.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetChildById")
  @js.native
  def GetChildById(element: js.Any, id: String): js.Any = js.native
  
  /**
    * Returns a reference to the particular element that has the specified element name and is contained within the specified parent HTML element. An object representing the matching element; a null value if no matching element is found.
    * @param element An object specifying the parent HTML element to search.
    * @param tagName A string value specifying the element name (tag name) of the desired HTML element.
    * @param index An integer value specifying the zero-based index of the desired element amongst all the matching elements found.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetChildByTagName")
  @js.native
  def GetChildByTagName(element: js.Any, tagName: String, index: Double): js.Any = js.native
  
  /**
    * Retrieves a cookie with the specified name. A string value, if the cookie exists.
    * @param name A string value that represents the name of a cookie.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetCookie")
  @js.native
  def GetCookie(name: String): String = js.native
  
  /**
    * Gets the height of the window's client region.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetDocumentClientHeight")
  @js.native
  def GetDocumentClientHeight(): Double = js.native
  
  /**
    * Gets the width of the window's client region.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetDocumentClientWidth")
  @js.native
  def GetDocumentClientWidth(): Double = js.native
  
  /**
    * Returns the distance between the left edge of the document and the leftmost portion of the content currently visible in the window.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetDocumentScrollLeft")
  @js.native
  def GetDocumentScrollLeft(): Double = js.native
  
  /**
    * Returns the distance between the top edge of the document and the topmost portion of the content currently visible in the window.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetDocumentScrollTop")
  @js.native
  def GetDocumentScrollTop(): Double = js.native
  
  /**
    * Returns values of editors located in the specified container. An object containing pairs of editor names and values.
    * @param containerOrId A container of editors, or its ID.
    * @param processInvisibleEditors true to process both visible and invisible editors that belong to the specified container; false to process only visible editors.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetEditorValuesInContainer")
  @js.native
  def GetEditorValuesInContainer(containerOrId: js.Any): js.Any = js.native
  @JSGlobal("ASPxClientUtils.GetEditorValuesInContainer")
  @js.native
  def GetEditorValuesInContainer(containerOrId: js.Any, processInvisibleEditors: Boolean): js.Any = js.native
  
  /**
    * Returns the object that fired the event. The object that receives the event that fired.
    * @param htmlEvent An object that represents the current event.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetEventSource")
  @js.native
  def GetEventSource(htmlEvent: js.Any): js.Any = js.native
  
  /**
    * Gets the x-coordinate of the event-related mouse pointer position relative to an end-user's screen. An integer value representing the x-coordinate of the event-related mouse pointer position relative to an end-user's screen.
    * @param htmlEvent An object specifying the required HTML event.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetEventX")
  @js.native
  def GetEventX(htmlEvent: js.Any): Double = js.native
  
  /**
    * Gets the y-coordinate of the event-related mouse pointer position relative to an end-user's screen. An integer value representing the y-coordinate of the event-related mouse pointer position relative to an end-user's screen.
    * @param htmlEvent An object specifying the required HTML event.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetEventY")
  @js.native
  def GetEventY(htmlEvent: js.Any): Double = js.native
  
  /**
    * Gets a value indicating whether the object passed via the parentElement parameter is a parent of the object passed via the element parameter. true, if the parentElement is a parent for the element; otherwise, false.
    * @param parentElement An object specifying the parent HTML element.
    * @param element An object specifying the child HTML element.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetIsParent")
  @js.native
  def GetIsParent(parentElement: js.Any, element: js.Any): Boolean = js.native
  
  /**
    * Gets the keyboard code for the specified event. An integer value representing the keyboard code of the specified event.
    * @param htmlEvent An object specifying the required HTML event.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetKeyCode")
  @js.native
  def GetKeyCode(htmlEvent: js.Any): Double = js.native
  
  /**
    * Returns a reference to the specified HTML element's first parent object whose class name matches the specified value. An object representing the first parent element with a matching class name or a null value if no matching element is found.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param className A string value specifying the class name of the desired HTML element.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetParentByClassName")
  @js.native
  def GetParentByClassName(element: js.Any, className: String): js.Any = js.native
  
  /**
    * Returns a reference to the specified HTML element's first parent object which has an ID that matches the specified value. An object representing the first parent element with a matching ID or a null value if no matching element is found.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param id A string specifying the required parent's ID.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetParentById")
  @js.native
  def GetParentById(element: js.Any, id: String): js.Any = js.native
  
  /**
    * Returns a reference to the specified HTML element's first parent object whose element name matches the specified value. An object representing the first parent element with a matching element name or a null value if no matching element is found.
    * @param element An object specifying the child HTML element whose parent elements are searched.
    * @param tagName A string value specifying the element name (tag name) of the desired HTML element.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetParentByTagName")
  @js.native
  def GetParentByTagName(element: js.Any, tagName: String): js.Any = js.native
  
  /**
    * Returns a specifically generated code that uniquely identifies the combination of keys specified via the parameters. An integer value that represents the code uniquely identifying the key combination.
    * @param keyCode An integer value that specifies the code of the key. Codes are available via the ASPx.KeyCode client object's members.
    * @param isCtrlKey true, if the CTRL key should be included into the key combination; otherwise, false.
    * @param isShiftKey true, if the SHIFT key should be included into the key combination; otherwise, false.
    * @param isAltKey true, if the ALT key should be included into the key combination; otherwise, false.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetShortcutCode")
  @js.native
  def GetShortcutCode(keyCode: Double, isCtrlKey: Boolean, isShiftKey: Boolean, isAltKey: Boolean): Double = js.native
  
  /**
    * Returns a specifically generated code that uniquely identifies the pressed key combination, which is specified by the related HTML event. An integer value that represents the code uniquely identifying the specified key combination.
    * @param htmlEvent A DHTML event object that relates to a key combination being pressed.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.GetShortcutCodeByEvent")
  @js.native
  def GetShortcutCodeByEvent(htmlEvent: js.Any): Double = js.native
  
  /**
    * Gets a value that indicates whether the specified object exists on the client side. true if the specified object exists; otherwise, false.
    * @param obj The object to test.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.IsExists")
  @js.native
  def IsExists(obj: js.Any): Boolean = js.native
  
  /**
    * Gets a value that indicates whether the specified object is a function. true if the specified object is a function; otherwise, false.
    * @param obj The object to test.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.IsFunction")
  @js.native
  def IsFunction(obj: js.Any): Boolean = js.native
  
  /**
    * Removes mouse capture from the specified event's source object. Always false.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.PreventDragStart")
  @js.native
  def PreventDragStart(htmlEvent: js.Any): Boolean = js.native
  
  /**
    * Cancels the default action of the specified event. Always false.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.PreventEvent")
  @js.native
  def PreventEvent(htmlEvent: js.Any): Boolean = js.native
  
  /**
    * Cancels both the specified event's default action and the event's bubbling upon the hierarchy of event handlers. Always false.
    * @param htmlEvent An object that specifies the required HTML event.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.PreventEventAndBubble")
  @js.native
  def PreventEventAndBubble(htmlEvent: js.Any): Boolean = js.native
  
  /**
    * Removes the class name attribute from the element.
    * @param element An object that specifies the element.
    * @param className A string value that specifies the class name.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.RemoveClassNameFromElement")
  @js.native
  def RemoveClassNameFromElement(element: js.Any, className: String): Unit = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.SendMessageToAssistiveTechnology")
  @js.native
  def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /**
    * Sets the x-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars.
    * @param element An object identifying the HTML element whose position should be defined.
    * @param x An integer value specifying the required element's x-coordinate, in pixels.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.SetAbsoluteX")
  @js.native
  def SetAbsoluteX(element: js.Any, x: Double): Unit = js.native
  
  /**
    * Sets the y-coordinate of the specified element's top left corner relative to the client area of the window, excluding scroll bars.
    * @param element An object identifying the HTML element whose position should be defined.
    * @param y An integer value specifying the required element's y-coordinate, in pixels.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.SetAbsoluteY")
  @js.native
  def SetAbsoluteY(element: js.Any, y: Double): Unit = js.native
  
  /**
    * Creates or updates the HTTP cookie for the response.
    * @param name A string value that represents the name of a cookie.
    * @param value A string representing the cookie value.
    * @param expirationDate A date-time object that represents the expiration date and time for the cookie.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.SetCookie")
  @js.native
  def SetCookie(name: String, value: String): Unit = js.native
  @JSGlobal("ASPxClientUtils.SetCookie")
  @js.native
  def SetCookie(name: String, value: String, expirationDate: Date): Unit = js.native
  
  /**
    * Sets values to editors.
    * @param values An object that specifies the values.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.SetEditorValues")
  @js.native
  def SetEditorValues(values: js.Any): Unit = js.native
  
  /**
    * Returns a specifically generated code that uniquely identifies the combination of keys specified via the parameter. An integer value that represents the code uniquely identifying the key combination.
    * @param shortcutString A string value that specifies the key combination.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.StringToShortcutCode")
  @js.native
  def StringToShortcutCode(shortcutString: String): Double = js.native
  
  /**
    * Adds or removes a class name to an element.
    * @param element The element.
    * @param className The class name.
    * @param toggleState true, to add a class name; otherwise, false.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.ToggleClassName")
  @js.native
  def ToggleClassName(element: js.Any, className: String, toggleState: Boolean): Unit = js.native
  
  /**
    * Trims all leading and trailing whitespaces from the string. A string value representing the trimmed string.
    * @param str A string value representing the string for trimming.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.Trim")
  @js.native
  def Trim(str: String): String = js.native
  
  /**
    * Trims all trailing whitespaces from the string. A string value representing the trimmed string.
    * @param str A string value representing the string for trimming.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.TrimEnd")
  @js.native
  def TrimEnd(str: String): String = js.native
  
  /**
    * Trims all leading whitespaces from the string. A string value representing the trimmed string.
    * @param str A string value representing the string for trimming.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.TrimStart")
  @js.native
  def TrimStart(str: String): String = js.native
  
  /**
    * Gets the user-agent string, which identifies the client browser and provides certain system details of the client computer.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.agent")
  @js.native
  def agent: String = js.native
  @scala.inline
  def agent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agent")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the application is run under the Android platform.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.androidPlatform")
  @js.native
  def androidPlatform: Boolean = js.native
  @scala.inline
  def androidPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("androidPlatform")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies a client browser's major version.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.browserMajorVersion")
  @js.native
  def browserMajorVersion: Double = js.native
  @scala.inline
  def browserMajorVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserMajorVersion")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies a client browser's full version.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.browserVersion")
  @js.native
  def browserVersion: Double = js.native
  @scala.inline
  def browserVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserVersion")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Google Chrome.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.chrome")
  @js.native
  def chrome: Boolean = js.native
  @scala.inline
  def chrome_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
  
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
  @scala.inline
  def firefox3_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox3")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def firefox_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the application is run under an iOS platform.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.iOSPlatform")
  @js.native
  def iOSPlatform: Boolean = js.native
  @scala.inline
  def iOSPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iOSPlatform")(x.asInstanceOf[js.Any])
  
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
  @scala.inline
  def ie7_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ie7")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ie_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ie")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the application is run under a MacOS platform.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.macOSPlatform")
  @js.native
  def macOSPlatform: Boolean = js.native
  @scala.inline
  def macOSPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macOSPlatform")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser is Mozilla.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.mozilla")
  @js.native
  def mozilla: Boolean = js.native
  @scala.inline
  def mozilla_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mozilla")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser supports the Microsoft touch user interface.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.msTouchUI")
  @js.native
  def msTouchUI: Boolean = js.native
  @scala.inline
  def msTouchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("msTouchUI")(x.asInstanceOf[js.Any])
  
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
  @scala.inline
  def netscapeFamily_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("netscapeFamily")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def netscape_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("netscape")(x.asInstanceOf[js.Any])
  
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
  @scala.inline
  def opera9_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opera9")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def opera_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opera")(x.asInstanceOf[js.Any])
  
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
  @scala.inline
  def safari3_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safari3")(x.asInstanceOf[js.Any])
  
  /** @deprecated This property is now obsolete. Use the ASPxClientUtils.safari and ASPxClientUtils.macOSPlatform properties instead. */
  /**
    * Gets a value that specifies whether the client browser is Safari, running under a MacOS operating system.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.safariMacOS")
  @js.native
  def safariMacOS: Boolean = js.native
  @scala.inline
  def safariMacOS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safariMacOS")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def safari_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safari")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser supports touch.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.touchUI")
  @js.native
  def touchUI: Boolean = js.native
  @scala.inline
  def touchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchUI")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether a client browser is based on WebKit.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.webKitFamily")
  @js.native
  def webKitFamily: Boolean = js.native
  @scala.inline
  def webKitFamily_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webKitFamily")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the client browser supports the WebKit touch user interface.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.webKitTouchUI")
  @js.native
  def webKitTouchUI: Boolean = js.native
  @scala.inline
  def webKitTouchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webKitTouchUI")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value that specifies whether the application is run under the Windows platform.
    */
  /* static member */
  @JSGlobal("ASPxClientUtils.windowsPlatform")
  @js.native
  def windowsPlatform: Boolean = js.native
  @scala.inline
  def windowsPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windowsPlatform")(x.asInstanceOf[js.Any])
}
