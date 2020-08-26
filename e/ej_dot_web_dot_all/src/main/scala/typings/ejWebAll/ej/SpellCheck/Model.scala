package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers on the AJAX call request beginning.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggers when the AJAX call request failure.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Triggers on the success of AJAX call request.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.native
  /** Sets the data type for the ajax call used within the SpellCheck control, denoting the type of data that are expected to be retrieved from the server. The applicable values are
    * json and jsonp.
    * @Default {jsonp}
    */
  var ajaxDataType: js.UndefOr[String] = js.native
  /** To set either â€˜Postâ€™ or â€˜Getâ€™ for ajax request type which invokes when validate, get suggestion and dictionary action.Possible values are â€˜POSTâ€™ or â€˜GETâ€™
    * @Default {GET}
    */
  var ajaxRequestType: js.UndefOr[String] = js.native
  /** Triggers when the spell check operations completed through dialog mode.
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.native
  /** Triggers when the context menu item clicked.
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.native
  /** Holds all options related to the context menu settings of SpellCheck.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggers before context menu opening.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.native
  /** It allows to spell check the multiple target HTML element's texts and correct its error words.
    * @Default {null}
    */
  var controlsToValidate: js.UndefOr[String] = js.native
  /** Triggers before the spell check dialog opens.
    */
  var dialogBeforeOpen: js.UndefOr[js.Function1[/* e */ DialogBeforeOpenEventArgs, Unit]] = js.native
  /** Triggers when the spell check dialog closed.
    */
  var dialogClose: js.UndefOr[js.Function1[/* e */ DialogCloseEventArgs, Unit]] = js.native
  /** Triggers after the spell check dialog opens.
    */
  var dialogOpen: js.UndefOr[js.Function1[/* e */ DialogOpenEventArgs, Unit]] = js.native
  /** It includes the service method path to find the error words and its suggestions also adding the custom word into the custom dictionary.
    */
  var dictionarySettings: js.UndefOr[DictionarySettings] = js.native
  /** When set to true, allows sending Asynchronous ajax request for checking the spelling errors.
    * @Default {true}
    */
  var enableAsync: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the spellcheck operation on Enter/Space key-press.
    * @Default {false}
    */
  var enableValidateOnType: js.UndefOr[Boolean] = js.native
  /** It helps to ignore the uppercase, mixed case words, alpha numeric words, file path and email addresses based on the property values.
    */
  var ignoreSettings: js.UndefOr[IgnoreSettings] = js.native
  /** To ignore the words from the error word consideration.
    * @Default {[]}
    */
  var ignoreWords: js.UndefOr[js.Array[_]] = js.native
  /** When set to true, allows the spellcheck to render based upon screen size.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Sets the specific culture to the SpellCheck.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** To set the maximum suggestion display count.
    * @Default {6}
    */
  var maxSuggestionCount: js.UndefOr[Double] = js.native
  /** To display the error word in a customized style.
    * @Default {e-errorword}
    */
  var misspellWordCss: js.UndefOr[String] = js.native
  /** Triggers when the dialog mode spell check starting.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
  /** Triggers before loading the target HTML element text into the dialog sentence area.
    */
  var targetUpdating: js.UndefOr[js.Function1[/* e */ TargetUpdatingEventArgs, Unit]] = js.native
  /** Triggers when the spell check control performing the spell check operations such as ignore, ignoreAll, change, changeAll and addToDictionary.
    */
  var validating: js.UndefOr[js.Function1[/* e */ ValidatingEventArgs, Unit]] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = this.set("actionBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionBegin: Self = this.set("actionBegin", js.undefined)
    @scala.inline
    def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = this.set("actionFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionFailure: Self = this.set("actionFailure", js.undefined)
    @scala.inline
    def setActionSuccess(value: /* e */ ActionSuccessEventArgs => Unit): Self = this.set("actionSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionSuccess: Self = this.set("actionSuccess", js.undefined)
    @scala.inline
    def setAjaxDataType(value: String): Self = this.set("ajaxDataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxDataType: Self = this.set("ajaxDataType", js.undefined)
    @scala.inline
    def setAjaxRequestType(value: String): Self = this.set("ajaxRequestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxRequestType: Self = this.set("ajaxRequestType", js.undefined)
    @scala.inline
    def setComplete(value: /* e */ CompleteEventArgs => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = this.set("contextClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextClick: Self = this.set("contextClick", js.undefined)
    @scala.inline
    def setContextMenuSettings(value: ContextMenuSettings): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    @scala.inline
    def setContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = this.set("contextOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextOpen: Self = this.set("contextOpen", js.undefined)
    @scala.inline
    def setControlsToValidate(value: String): Self = this.set("controlsToValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsToValidate: Self = this.set("controlsToValidate", js.undefined)
    @scala.inline
    def setDialogBeforeOpen(value: /* e */ DialogBeforeOpenEventArgs => Unit): Self = this.set("dialogBeforeOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDialogBeforeOpen: Self = this.set("dialogBeforeOpen", js.undefined)
    @scala.inline
    def setDialogClose(value: /* e */ DialogCloseEventArgs => Unit): Self = this.set("dialogClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDialogClose: Self = this.set("dialogClose", js.undefined)
    @scala.inline
    def setDialogOpen(value: /* e */ DialogOpenEventArgs => Unit): Self = this.set("dialogOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDialogOpen: Self = this.set("dialogOpen", js.undefined)
    @scala.inline
    def setDictionarySettings(value: DictionarySettings): Self = this.set("dictionarySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictionarySettings: Self = this.set("dictionarySettings", js.undefined)
    @scala.inline
    def setEnableAsync(value: Boolean): Self = this.set("enableAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAsync: Self = this.set("enableAsync", js.undefined)
    @scala.inline
    def setEnableValidateOnType(value: Boolean): Self = this.set("enableValidateOnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableValidateOnType: Self = this.set("enableValidateOnType", js.undefined)
    @scala.inline
    def setIgnoreSettings(value: IgnoreSettings): Self = this.set("ignoreSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSettings: Self = this.set("ignoreSettings", js.undefined)
    @scala.inline
    def setIgnoreWordsVarargs(value: js.Any*): Self = this.set("ignoreWords", js.Array(value :_*))
    @scala.inline
    def setIgnoreWords(value: js.Array[_]): Self = this.set("ignoreWords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreWords: Self = this.set("ignoreWords", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxSuggestionCount(value: Double): Self = this.set("maxSuggestionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSuggestionCount: Self = this.set("maxSuggestionCount", js.undefined)
    @scala.inline
    def setMisspellWordCss(value: String): Self = this.set("misspellWordCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMisspellWordCss: Self = this.set("misspellWordCss", js.undefined)
    @scala.inline
    def setStart(value: /* e */ StartEventArgs => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTargetUpdating(value: /* e */ TargetUpdatingEventArgs => Unit): Self = this.set("targetUpdating", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTargetUpdating: Self = this.set("targetUpdating", js.undefined)
    @scala.inline
    def setValidating(value: /* e */ ValidatingEventArgs => Unit): Self = this.set("validating", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidating: Self = this.set("validating", js.undefined)
  }
  
}

