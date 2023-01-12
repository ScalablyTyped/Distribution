package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpellCheck
  extends StObject
     with Widget_ {
  
  /** To add the words into the custom dictionary.
    * @param {string} Word to add into the dictionary file
    * @returns {any}
    */
  def addToDictionary(customWord: String): Any = js.native
  
  /** To change the error word once from the given input sentence.
    * @param {string} Error word to change from the target content
    * @param {string} Content to perform the change operation
    * @param {string} Word to replace with the error word
    * @param {number} Index of the error word present in the target content
    * @returns {any}
    */
  def change(word: String, targetSentence: String, changeWord: String, index: Double): Any = js.native
  
  /** To change all the error word occurrences from the given input sentence.
    * @param {string} Error word to change from the target content
    * @param {string} Content to perform the change all operation
    * @param {string} Word to replace with the error word
    * @returns {any}
    */
  def changeAll(word: String, targetSentence: String, changeWord: String): Any = js.native
  
  var defaults: Model = js.native
  
  /** Retrieves the possible suggestion words for the error word passed as an argument.
    * @param {string} Error word to get the suggestions
    * @returns {any}
    */
  def getSuggestionWords(errorWord: String): Any = js.native
  
  /** To ignore the error word once from the given input sentence.
    * @param {string} Error word to ignore from the target content
    * @param {string} Content to perform the ignore operation
    * @param {number} Index of the error word present in the target content
    * @returns {any}
    */
  def ignore(word: String, targetSentence: String, index: Double): Any = js.native
  
  /** To ignore all the error word occurrences from the given input sentence.
    * @param {string} Error word to ignore from the target content
    * @param {string} Content to perform the ignore all operation
    * @returns {any}
    */
  def ignoreAll(word: String, targetSentence: String): Any = js.native
  
  @JSName("model")
  var model_SpellCheck: Model = js.native
  
  /** Open the dialog to correct the spelling of the target content.
    * @returns {void}
    */
  def showInDialog(): Unit = js.native
  
  /** To get the error word highlighted string by passing the given input sentence.
    * @param {string} Content to be spell check
    * @param {string} Class name that contains style value to highlight the error word
    * @returns {any}
    */
  def spellCheck(targetSentence: String, misspellWordCss: String): Any = js.native
  
  /** Highlighting the error word in the target area itself and correct the spelling using the context menu.
    * @returns {void}
    */
  def validate(): Unit = js.native
}
object SpellCheck {
  
  trait ActionBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the misspellWordCss class name.
      */
    var misspellWordCss: js.UndefOr[String] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the input string.
      */
    var targetSentence: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionBeginEventArgs {
    
    inline def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setMisspellWordCss(value: String): Self = StObject.set(x, "misspellWordCss", value.asInstanceOf[js.Any])
      
      inline def setMisspellWordCssUndefined: Self = StObject.set(x, "misspellWordCss", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setTargetSentence(value: String): Self = StObject.set(x, "targetSentence", value.asInstanceOf[js.Any])
      
      inline def setTargetSentenceUndefined: Self = StObject.set(x, "targetSentence", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionFailureEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns AJAX request failure error message.
      */
    var errorMessage: js.UndefOr[String] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionFailureEventArgs {
    
    inline def apply(): ActionFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFailureEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionFailureEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionSuccessEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the error word details of the given input.
      */
    var errorWordDetails: js.UndefOr[Any] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the error word highlighted string.
      */
    var resultHTML: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionSuccessEventArgs {
    
    inline def apply(): ActionSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSuccessEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionSuccessEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setErrorWordDetails(value: Any): Self = StObject.set(x, "errorWordDetails", value.asInstanceOf[js.Any])
      
      inline def setErrorWordDetailsUndefined: Self = StObject.set(x, "errorWordDetails", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setResultHTML(value: String): Self = StObject.set(x, "resultHTML", value.asInstanceOf[js.Any])
      
      inline def setResultHTMLUndefined: Self = StObject.set(x, "resultHTML", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the error word highlighted string.
      */
    var resultHTML: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CompleteEventArgs {
    
    inline def apply(): CompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setResultHTML(value: String): Self = StObject.set(x, "resultHTML", value.asInstanceOf[js.Any])
      
      inline def setResultHTMLUndefined: Self = StObject.set(x, "resultHTML", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the selected option in the context menu.
      */
    var selectedOption: js.UndefOr[String] = js.undefined
    
    /** Returns the selected error word.
      */
    var selectedValue: js.UndefOr[String] = js.undefined
    
    /** Returns the input string.
      */
    var targetContent: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ContextClickEventArgs {
    
    inline def apply(): ContextClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setSelectedOption(value: String): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
      
      inline def setSelectedOptionUndefined: Self = StObject.set(x, "selectedOption", js.undefined)
      
      inline def setSelectedValue(value: String): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setTargetContent(value: String): Self = StObject.set(x, "targetContent", value.asInstanceOf[js.Any])
      
      inline def setTargetContentUndefined: Self = StObject.set(x, "targetContent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextMenuSettings extends StObject {
    
    /** When set to true, enables the context menu options available for the SpellCheck.
      * @Default {true}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Contains all the default context menu options that are applicable for SpellCheck. It also supports adding custom menu items. All the SpellCheck related context menu items are
      * grouped under this menu collection.
      * @Default {{% highlight javascript %}[{ id: IgnoreAll, text: Ignore All },{ id: AddToDictionary, text: Add To Dictionary }]{% endhighlight %}}
      */
    var menuItems: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ContextMenuSettings {
    
    inline def apply(): ContextMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMenuItems(value: js.Array[Any]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
      
      inline def setMenuItemsVarargs(value: Any*): Self = StObject.set(x, "menuItems", js.Array(value*))
    }
  }
  
  trait ContextOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the selected error word.
      */
    var selectedErrorWord: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ContextOpenEventArgs {
    
    inline def apply(): ContextOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setSelectedErrorWord(value: String): Self = StObject.set(x, "selectedErrorWord", value.asInstanceOf[js.Any])
      
      inline def setSelectedErrorWordUndefined: Self = StObject.set(x, "selectedErrorWord", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DialogBeforeOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the spell check window details.
      */
    var spellCheckDialog: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DialogBeforeOpenEventArgs {
    
    inline def apply(): DialogBeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogBeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogBeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setSpellCheckDialog(value: Any): Self = StObject.set(x, "spellCheckDialog", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckDialogUndefined: Self = StObject.set(x, "spellCheckDialog", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DialogCloseEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the error corrected string.
      */
    var updatedText: js.UndefOr[String] = js.undefined
  }
  object DialogCloseEventArgs {
    
    inline def apply(): DialogCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogCloseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogCloseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpdatedText(value: String): Self = StObject.set(x, "updatedText", value.asInstanceOf[js.Any])
      
      inline def setUpdatedTextUndefined: Self = StObject.set(x, "updatedText", js.undefined)
    }
  }
  
  trait DialogOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the target input.
      */
    var targetText: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DialogOpenEventArgs {
    
    inline def apply(): DialogOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setTargetText(value: String): Self = StObject.set(x, "targetText", value.asInstanceOf[js.Any])
      
      inline def setTargetTextUndefined: Self = StObject.set(x, "targetText", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DictionarySettings extends StObject {
    
    /** The customDictionaryUrl option accepts string, which is the method path to add the error word into the custom dictionary.
      */
    var customDictionaryUrl: js.UndefOr[String] = js.undefined
    
    /** The dictionaryUrl option accepts string, which is the method path to find the error words and get the suggestions to correct the errors.
      */
    var dictionaryUrl: js.UndefOr[String] = js.undefined
  }
  object DictionarySettings {
    
    inline def apply(): DictionarySettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictionarySettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictionarySettings] (val x: Self) extends AnyVal {
      
      inline def setCustomDictionaryUrl(value: String): Self = StObject.set(x, "customDictionaryUrl", value.asInstanceOf[js.Any])
      
      inline def setCustomDictionaryUrlUndefined: Self = StObject.set(x, "customDictionaryUrl", js.undefined)
      
      inline def setDictionaryUrl(value: String): Self = StObject.set(x, "dictionaryUrl", value.asInstanceOf[js.Any])
      
      inline def setDictionaryUrlUndefined: Self = StObject.set(x, "dictionaryUrl", js.undefined)
    }
  }
  
  trait IgnoreSettings extends StObject {
    
    /** When set to true, ignoring the alphanumeric words from the error word consideration.
      * @Default {true}
      */
    var ignoreAlphaNumericWords: js.UndefOr[String] = js.undefined
    
    /** When set to true, ignoring the Email address from the error word consideration.
      * @Default {true}
      */
    var ignoreEmailAddress: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, ignoring the file address path from the error word consideration.
      * @Default {true}
      */
    var ignoreFileNames: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, ignoring the MixedCase words from the error word consideration.
      * @Default {true}
      */
    var ignoreMixedCaseWords: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, ignoring the UpperCase words from the error word consideration.
      * @Default {true}
      */
    var ignoreUpperCase: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, ignoring the Url from the error word consideration.
      * @Default {true}
      */
    var ignoreUrl: js.UndefOr[Boolean] = js.undefined
  }
  object IgnoreSettings {
    
    inline def apply(): IgnoreSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoreSettings] (val x: Self) extends AnyVal {
      
      inline def setIgnoreAlphaNumericWords(value: String): Self = StObject.set(x, "ignoreAlphaNumericWords", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAlphaNumericWordsUndefined: Self = StObject.set(x, "ignoreAlphaNumericWords", js.undefined)
      
      inline def setIgnoreEmailAddress(value: Boolean): Self = StObject.set(x, "ignoreEmailAddress", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmailAddressUndefined: Self = StObject.set(x, "ignoreEmailAddress", js.undefined)
      
      inline def setIgnoreFileNames(value: Boolean): Self = StObject.set(x, "ignoreFileNames", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFileNamesUndefined: Self = StObject.set(x, "ignoreFileNames", js.undefined)
      
      inline def setIgnoreMixedCaseWords(value: Boolean): Self = StObject.set(x, "ignoreMixedCaseWords", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMixedCaseWordsUndefined: Self = StObject.set(x, "ignoreMixedCaseWords", js.undefined)
      
      inline def setIgnoreUpperCase(value: Boolean): Self = StObject.set(x, "ignoreUpperCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUpperCaseUndefined: Self = StObject.set(x, "ignoreUpperCase", js.undefined)
      
      inline def setIgnoreUrl(value: Boolean): Self = StObject.set(x, "ignoreUrl", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUrlUndefined: Self = StObject.set(x, "ignoreUrl", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers on the AJAX call request beginning.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggers when the AJAX call request failure.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
    
    /** Triggers on the success of AJAX call request.
      */
    var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.undefined
    
    /** Sets the data type for the ajax call used within the SpellCheck control, denoting the type of data that are expected to be retrieved from the server. The applicable values are
      * json and jsonp.
      * @Default {jsonp}
      */
    var ajaxDataType: js.UndefOr[String] = js.undefined
    
    /** To set either â€˜Postâ€™ or â€˜Getâ€™ for ajax request type which invokes when validate, get suggestion and dictionary action.Possible values are â€˜POSTâ€™ or â€˜GETâ€™
      * @Default {GET}
      */
    var ajaxRequestType: js.UndefOr[String] = js.undefined
    
    /** Triggers when the spell check operations completed through dialog mode.
      */
    var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when the context menu item clicked.
      */
    var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.undefined
    
    /** Holds all options related to the context menu settings of SpellCheck.
      */
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
    
    /** Triggers before context menu opening.
      */
    var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.undefined
    
    /** It allows to spell check the multiple target HTML element's texts and correct its error words.
      * @Default {null}
      */
    var controlsToValidate: js.UndefOr[String] = js.undefined
    
    /** Triggers before the spell check dialog opens.
      */
    var dialogBeforeOpen: js.UndefOr[js.Function1[/* e */ DialogBeforeOpenEventArgs, Unit]] = js.undefined
    
    /** Triggers when the spell check dialog closed.
      */
    var dialogClose: js.UndefOr[js.Function1[/* e */ DialogCloseEventArgs, Unit]] = js.undefined
    
    /** Triggers after the spell check dialog opens.
      */
    var dialogOpen: js.UndefOr[js.Function1[/* e */ DialogOpenEventArgs, Unit]] = js.undefined
    
    /** It includes the service method path to find the error words and its suggestions also adding the custom word into the custom dictionary.
      */
    var dictionarySettings: js.UndefOr[DictionarySettings] = js.undefined
    
    /** When set to true, allows sending Asynchronous ajax request for checking the spelling errors.
      * @Default {true}
      */
    var enableAsync: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the spellcheck operation on Enter/Space key-press.
      * @Default {false}
      */
    var enableValidateOnType: js.UndefOr[Boolean] = js.undefined
    
    /** It helps to ignore the uppercase, mixed case words, alpha numeric words, file path and email addresses based on the property values.
      */
    var ignoreSettings: js.UndefOr[IgnoreSettings] = js.undefined
    
    /** To ignore the words from the error word consideration.
      * @Default {[]}
      */
    var ignoreWords: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** When set to true, allows the spellcheck to render based upon screen size.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the specific culture to the SpellCheck.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** To set the maximum suggestion display count.
      * @Default {6}
      */
    var maxSuggestionCount: js.UndefOr[Double] = js.undefined
    
    /** To display the error word in a customized style.
      * @Default {e-errorword}
      */
    var misspellWordCss: js.UndefOr[String] = js.undefined
    
    /** Triggers when the dialog mode spell check starting.
      */
    var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
    
    /** Triggers before loading the target HTML element text into the dialog sentence area.
      */
    var targetUpdating: js.UndefOr[js.Function1[/* e */ TargetUpdatingEventArgs, Unit]] = js.undefined
    
    /** Triggers when the spell check control performing the spell check operations such as ignore, ignoreAll, change, changeAll and addToDictionary.
      */
    var validating: js.UndefOr[js.Function1[/* e */ ValidatingEventArgs, Unit]] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.SpellCheck.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.SpellCheck.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.SpellCheck.Model] (val x: Self) extends AnyVal {
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = StObject.set(x, "actionFailure", js.Any.fromFunction1(value))
      
      inline def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      inline def setActionSuccess(value: /* e */ ActionSuccessEventArgs => Unit): Self = StObject.set(x, "actionSuccess", js.Any.fromFunction1(value))
      
      inline def setActionSuccessUndefined: Self = StObject.set(x, "actionSuccess", js.undefined)
      
      inline def setAjaxDataType(value: String): Self = StObject.set(x, "ajaxDataType", value.asInstanceOf[js.Any])
      
      inline def setAjaxDataTypeUndefined: Self = StObject.set(x, "ajaxDataType", js.undefined)
      
      inline def setAjaxRequestType(value: String): Self = StObject.set(x, "ajaxRequestType", value.asInstanceOf[js.Any])
      
      inline def setAjaxRequestTypeUndefined: Self = StObject.set(x, "ajaxRequestType", js.undefined)
      
      inline def setComplete(value: /* e */ CompleteEventArgs => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = StObject.set(x, "contextClick", js.Any.fromFunction1(value))
      
      inline def setContextClickUndefined: Self = StObject.set(x, "contextClick", js.undefined)
      
      inline def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      inline def setContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = StObject.set(x, "contextOpen", js.Any.fromFunction1(value))
      
      inline def setContextOpenUndefined: Self = StObject.set(x, "contextOpen", js.undefined)
      
      inline def setControlsToValidate(value: String): Self = StObject.set(x, "controlsToValidate", value.asInstanceOf[js.Any])
      
      inline def setControlsToValidateUndefined: Self = StObject.set(x, "controlsToValidate", js.undefined)
      
      inline def setDialogBeforeOpen(value: /* e */ DialogBeforeOpenEventArgs => Unit): Self = StObject.set(x, "dialogBeforeOpen", js.Any.fromFunction1(value))
      
      inline def setDialogBeforeOpenUndefined: Self = StObject.set(x, "dialogBeforeOpen", js.undefined)
      
      inline def setDialogClose(value: /* e */ DialogCloseEventArgs => Unit): Self = StObject.set(x, "dialogClose", js.Any.fromFunction1(value))
      
      inline def setDialogCloseUndefined: Self = StObject.set(x, "dialogClose", js.undefined)
      
      inline def setDialogOpen(value: /* e */ DialogOpenEventArgs => Unit): Self = StObject.set(x, "dialogOpen", js.Any.fromFunction1(value))
      
      inline def setDialogOpenUndefined: Self = StObject.set(x, "dialogOpen", js.undefined)
      
      inline def setDictionarySettings(value: DictionarySettings): Self = StObject.set(x, "dictionarySettings", value.asInstanceOf[js.Any])
      
      inline def setDictionarySettingsUndefined: Self = StObject.set(x, "dictionarySettings", js.undefined)
      
      inline def setEnableAsync(value: Boolean): Self = StObject.set(x, "enableAsync", value.asInstanceOf[js.Any])
      
      inline def setEnableAsyncUndefined: Self = StObject.set(x, "enableAsync", js.undefined)
      
      inline def setEnableValidateOnType(value: Boolean): Self = StObject.set(x, "enableValidateOnType", value.asInstanceOf[js.Any])
      
      inline def setEnableValidateOnTypeUndefined: Self = StObject.set(x, "enableValidateOnType", js.undefined)
      
      inline def setIgnoreSettings(value: IgnoreSettings): Self = StObject.set(x, "ignoreSettings", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSettingsUndefined: Self = StObject.set(x, "ignoreSettings", js.undefined)
      
      inline def setIgnoreWords(value: js.Array[Any]): Self = StObject.set(x, "ignoreWords", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWordsUndefined: Self = StObject.set(x, "ignoreWords", js.undefined)
      
      inline def setIgnoreWordsVarargs(value: Any*): Self = StObject.set(x, "ignoreWords", js.Array(value*))
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxSuggestionCount(value: Double): Self = StObject.set(x, "maxSuggestionCount", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestionCountUndefined: Self = StObject.set(x, "maxSuggestionCount", js.undefined)
      
      inline def setMisspellWordCss(value: String): Self = StObject.set(x, "misspellWordCss", value.asInstanceOf[js.Any])
      
      inline def setMisspellWordCssUndefined: Self = StObject.set(x, "misspellWordCss", js.undefined)
      
      inline def setStart(value: /* e */ StartEventArgs => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTargetUpdating(value: /* e */ TargetUpdatingEventArgs => Unit): Self = StObject.set(x, "targetUpdating", js.Any.fromFunction1(value))
      
      inline def setTargetUpdatingUndefined: Self = StObject.set(x, "targetUpdating", js.undefined)
      
      inline def setValidating(value: /* e */ ValidatingEventArgs => Unit): Self = StObject.set(x, "validating", js.Any.fromFunction1(value))
      
      inline def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
    }
  }
  
  trait StartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the error words details.
      */
    var errorWords: js.UndefOr[Any] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type value.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the input string.
      */
    var targetSentence: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object StartEventArgs {
    
    inline def apply(): StartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setErrorWords(value: Any): Self = StObject.set(x, "errorWords", value.asInstanceOf[js.Any])
      
      inline def setErrorWordsUndefined: Self = StObject.set(x, "errorWords", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setTargetSentence(value: String): Self = StObject.set(x, "targetSentence", value.asInstanceOf[js.Any])
      
      inline def setTargetSentenceUndefined: Self = StObject.set(x, "targetSentence", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TargetUpdatingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current target element value.
      */
    var currentElement: js.UndefOr[Any] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the previous target element value.
      */
    var previousElement: js.UndefOr[Any] = js.undefined
    
    /** Returns the target html value.
      */
    var targetHtml: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TargetUpdatingEventArgs {
    
    inline def apply(): TargetUpdatingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetUpdatingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetUpdatingEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousElement(value: Any): Self = StObject.set(x, "previousElement", value.asInstanceOf[js.Any])
      
      inline def setPreviousElementUndefined: Self = StObject.set(x, "previousElement", js.undefined)
      
      inline def setTargetHtml(value: String): Self = StObject.set(x, "targetHtml", value.asInstanceOf[js.Any])
      
      inline def setTargetHtmlUndefined: Self = StObject.set(x, "targetHtml", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ValidatingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the change word to replace the error word.
      */
    var changeWord: js.UndefOr[String] = js.undefined
    
    /** Returns the error word to change.
      */
    var changeableWord: js.UndefOr[String] = js.undefined
    
    /** Returns the custom word to add into dictionary file.
      */
    var customWord: js.UndefOr[String] = js.undefined
    
    /** Returns the error word to ignore.
      */
    var ignoreWord: js.UndefOr[String] = js.undefined
    
    /** Returns the index of an error word.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Returns the SpellCheck model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the validating request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the target content.
      */
    var targetContent: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ValidatingEventArgs {
    
    inline def apply(): ValidatingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatingEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setChangeWord(value: String): Self = StObject.set(x, "changeWord", value.asInstanceOf[js.Any])
      
      inline def setChangeWordUndefined: Self = StObject.set(x, "changeWord", js.undefined)
      
      inline def setChangeableWord(value: String): Self = StObject.set(x, "changeableWord", value.asInstanceOf[js.Any])
      
      inline def setChangeableWordUndefined: Self = StObject.set(x, "changeableWord", js.undefined)
      
      inline def setCustomWord(value: String): Self = StObject.set(x, "customWord", value.asInstanceOf[js.Any])
      
      inline def setCustomWordUndefined: Self = StObject.set(x, "customWord", js.undefined)
      
      inline def setIgnoreWord(value: String): Self = StObject.set(x, "ignoreWord", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWordUndefined: Self = StObject.set(x, "ignoreWord", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setTargetContent(value: String): Self = StObject.set(x, "targetContent", value.asInstanceOf[js.Any])
      
      inline def setTargetContentUndefined: Self = StObject.set(x, "targetContent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
