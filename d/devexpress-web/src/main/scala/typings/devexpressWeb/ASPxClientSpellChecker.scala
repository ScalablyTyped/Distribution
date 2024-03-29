package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxSpellChecker class.
  */
trait ASPxClientSpellChecker
  extends StObject
     with ASPxClientControl {
  
  /**
    * Client-side event that occurs when a spell check is finished.
    */
  var AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]]
  
  /**
    * Client-side event that occurs before the spell check starts.
    */
  var BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]]
  
  /**
    * Starts the spelling check of the text contained within the element specified by the ASPxSpellChecker.CheckedElementID value.
    */
  def Check(): Unit
  
  /**
    * Client-side event that occurs before a message box informing about process completion is shown.
    */
  var CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]]
  
  /**
    * Starts checking contents of the specified element.
    * @param element An object representing the element being checked.
    */
  def CheckElement(element: Any): Unit
  
  /**
    * Starts checking contents of the specified element.
    * @param id A string representing the identifier of the element being checked.
    */
  def CheckElementById(id: String): Unit
  
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerElement An object representing a control which contains elements being checked.
    */
  def CheckElementsInContainer(containerElement: Any): Unit
  
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerId A string, specifying the control's identifier.
    */
  def CheckElementsInContainerById(containerId: String): Unit
  
  /**
    * Occurs after a word is changed in a checked text.
    */
  var WordChanged: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]]
}
object ASPxClientSpellChecker {
  
  inline def apply(
    AdjustControl: () => Unit,
    AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]],
    BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]],
    Check: () => Unit,
    CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]],
    CheckElement: Any => Unit,
    CheckElementById: String => Unit,
    CheckElementsInContainer: Any => Unit,
    CheckElementsInContainerById: String => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
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
  implicit open class MutableBuilder[Self <: ASPxClientSpellChecker] (val x: Self) extends AnyVal {
    
    inline def setAfterCheck(value: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]]): Self = StObject.set(x, "AfterCheck", value.asInstanceOf[js.Any])
    
    inline def setBeforeCheck(value: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]]): Self = StObject.set(x, "BeforeCheck", value.asInstanceOf[js.Any])
    
    inline def setCheck(value: () => Unit): Self = StObject.set(x, "Check", js.Any.fromFunction0(value))
    
    inline def setCheckCompleteFormShowing(value: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]]): Self = StObject.set(x, "CheckCompleteFormShowing", value.asInstanceOf[js.Any])
    
    inline def setCheckElement(value: Any => Unit): Self = StObject.set(x, "CheckElement", js.Any.fromFunction1(value))
    
    inline def setCheckElementById(value: String => Unit): Self = StObject.set(x, "CheckElementById", js.Any.fromFunction1(value))
    
    inline def setCheckElementsInContainer(value: Any => Unit): Self = StObject.set(x, "CheckElementsInContainer", js.Any.fromFunction1(value))
    
    inline def setCheckElementsInContainerById(value: String => Unit): Self = StObject.set(x, "CheckElementsInContainerById", js.Any.fromFunction1(value))
    
    inline def setWordChanged(value: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]]): Self = StObject.set(x, "WordChanged", value.asInstanceOf[js.Any])
  }
}
