package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxSpellChecker class.
  */
trait ASPxClientSpellChecker extends ASPxClientControl {
  /**
    * Client-side event that occurs when a spell check is finished.
    */
  var AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]]
  /**
    * Client-side event that occurs before the spell check starts.
    */
  var BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]]
  /**
    * Client-side event that occurs before a message box informing about process completion is shown.
    */
  var CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]]
  /**
    * Occurs after a word is changed in a checked text.
    */
  var WordChanged: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]]
  /**
    * Starts the spelling check of the text contained within the element specified by the CheckedElementID value.
    */
  def Check(): Unit
  /**
    * Starts checking contents of the specified element.
    * @param element An object representing the element being checked.
    */
  def CheckElement(element: js.Object): Unit
  /**
    * Starts checking contents of the specified element.
    * @param id A string representing the identifier of the element being checked.
    */
  def CheckElementById(id: String): Unit
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerElement An object representing a control which contains elements being checked.
    */
  def CheckElementsInContainer(containerElement: js.Object): Unit
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerId A string, specifying the control's identifier.
    */
  def CheckElementsInContainerById(containerId: String): Unit
}

object ASPxClientSpellChecker {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]],
    BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]],
    Check: () => Unit,
    CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]],
    CheckElement: js.Object => Unit,
    CheckElementById: String => Unit,
    CheckElementsInContainer: js.Object => Unit,
    CheckElementsInContainerById: String => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    WordChanged: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]],
    name: String
  ): ASPxClientSpellChecker = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AfterCheck = AfterCheck, BeforeCheck = BeforeCheck, Check = js.Any.fromFunction0(Check), CheckCompleteFormShowing = CheckCompleteFormShowing, CheckElement = js.Any.fromFunction1(CheckElement), CheckElementById = js.Any.fromFunction1(CheckElementById), CheckElementsInContainer = js.Any.fromFunction1(CheckElementsInContainer), CheckElementsInContainerById = js.Any.fromFunction1(CheckElementsInContainerById), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), WordChanged = WordChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientSpellChecker]
  }
}

