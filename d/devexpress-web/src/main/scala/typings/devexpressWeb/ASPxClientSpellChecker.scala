package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxSpellChecker class.
  */
@JSGlobal("ASPxClientSpellChecker")
@js.native
class ASPxClientSpellChecker () extends ASPxClientControl {
  /**
    * Client-side event that occurs when a spell check is finished.
    */
  var AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]] = js.native
  /**
    * Client-side event that occurs before the spell check starts.
    */
  var BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]] = js.native
  /**
    * Client-side event that occurs before a message box informing about process completion is shown.
    */
  var CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]] = js.native
  /**
    * Occurs after a word is changed in a checked text.
    */
  var WordChanged: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]] = js.native
  /**
    * Starts the spelling check of the text contained within the element specified by the ASPxSpellChecker.CheckedElementID value.
    */
  def Check(): Unit = js.native
  /**
    * Starts checking contents of the specified element.
    * @param element An object representing the element being checked.
    */
  def CheckElement(element: js.Any): Unit = js.native
  /**
    * Starts checking contents of the specified element.
    * @param id A string representing the identifier of the element being checked.
    */
  def CheckElementById(id: String): Unit = js.native
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerElement An object representing a control which contains elements being checked.
    */
  def CheckElementsInContainer(containerElement: js.Any): Unit = js.native
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerId A string, specifying the control's identifier.
    */
  def CheckElementsInContainerById(containerId: String): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientSpellChecker")
@js.native
object ASPxClientSpellChecker extends js.Object {
  /**
    * Converts the specified object to the ASPxClientSpellChecker type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientSpellChecker = js.native
}

