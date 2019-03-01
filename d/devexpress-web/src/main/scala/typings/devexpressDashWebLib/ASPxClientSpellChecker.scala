package typings
package devexpressDashWebLib

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
  def Check(): scala.Unit
  /**
    * Starts checking contents of the specified element.
    * @param element An object representing the element being checked.
    */
  def CheckElement(element: js.Object): scala.Unit
  /**
    * Starts checking contents of the specified element.
    * @param id A string representing the identifier of the element being checked.
    */
  def CheckElementById(id: java.lang.String): scala.Unit
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerElement An object representing a control which contains elements being checked.
    */
  def CheckElementsInContainer(containerElement: js.Object): scala.Unit
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerId A string, specifying the control's identifier.
    */
  def CheckElementsInContainerById(containerId: java.lang.String): scala.Unit
}

object ASPxClientSpellChecker {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]],
    BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]],
    Check: js.Function0[scala.Unit],
    CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]],
    CheckElement: js.Function1[js.Object, scala.Unit],
    CheckElementById: js.Function1[java.lang.String, scala.Unit],
    CheckElementsInContainer: js.Function1[js.Object, scala.Unit],
    CheckElementsInContainerById: js.Function1[java.lang.String, scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    WordChanged: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]],
    name: java.lang.String
  ): ASPxClientSpellChecker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("AfterCheck")(AfterCheck)
    __obj.updateDynamic("BeforeCheck")(BeforeCheck)
    __obj.updateDynamic("Check")(Check)
    __obj.updateDynamic("CheckCompleteFormShowing")(CheckCompleteFormShowing)
    __obj.updateDynamic("CheckElement")(CheckElement)
    __obj.updateDynamic("CheckElementById")(CheckElementById)
    __obj.updateDynamic("CheckElementsInContainer")(CheckElementsInContainer)
    __obj.updateDynamic("CheckElementsInContainerById")(CheckElementsInContainerById)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("WordChanged")(WordChanged)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientSpellChecker]
  }
}

