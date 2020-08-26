package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxSpellChecker class.
  */
@js.native
trait ASPxClientSpellChecker extends ASPxClientControl {
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

object ASPxClientSpellChecker {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]],
    BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]],
    Check: () => Unit,
    CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]],
    CheckElement: js.Any => Unit,
    CheckElementById: String => Unit,
    CheckElementsInContainer: js.Any => Unit,
    CheckElementsInContainerById: String => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
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
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AfterCheck = AfterCheck.asInstanceOf[js.Any], BeforeCheck = BeforeCheck.asInstanceOf[js.Any], Check = js.Any.fromFunction0(Check), CheckCompleteFormShowing = CheckCompleteFormShowing.asInstanceOf[js.Any], CheckElement = js.Any.fromFunction1(CheckElement), CheckElementById = js.Any.fromFunction1(CheckElementById), CheckElementsInContainer = js.Any.fromFunction1(CheckElementsInContainer), CheckElementsInContainerById = js.Any.fromFunction1(CheckElementsInContainerById), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), WordChanged = WordChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpellChecker]
  }
  @scala.inline
  implicit class ASPxClientSpellCheckerOps[Self <: ASPxClientSpellChecker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterCheck(value: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]]): Self = this.set("AfterCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeCheck(value: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]]): Self = this.set("BeforeCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheck(value: () => Unit): Self = this.set("Check", js.Any.fromFunction0(value))
    @scala.inline
    def setCheckCompleteFormShowing(value: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]]): Self = this.set("CheckCompleteFormShowing", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckElement(value: js.Any => Unit): Self = this.set("CheckElement", js.Any.fromFunction1(value))
    @scala.inline
    def setCheckElementById(value: String => Unit): Self = this.set("CheckElementById", js.Any.fromFunction1(value))
    @scala.inline
    def setCheckElementsInContainer(value: js.Any => Unit): Self = this.set("CheckElementsInContainer", js.Any.fromFunction1(value))
    @scala.inline
    def setCheckElementsInContainerById(value: String => Unit): Self = this.set("CheckElementsInContainerById", js.Any.fromFunction1(value))
    @scala.inline
    def setWordChanged(value: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]]): Self = this.set("WordChanged", value.asInstanceOf[js.Any])
  }
  
}

