package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers on the AJAX call request beginning.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the AJAX call request failure.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggers on the success of AJAX call request.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, scala.Unit]] = js.undefined
  /** Sets the data type for the ajax call used within the SpellCheck control, denoting the type of data that are expected to be retrieved from the server. The applicable values are
    * json and jsonp.
    * @Default {jsonp}
    */
  var ajaxDataType: js.UndefOr[java.lang.String] = js.undefined
  /** To set either â€˜Postâ€™ or â€˜Getâ€™ for ajax request type which invokes when validate, get suggestion and dictionary action.Possible values are â€˜POSTâ€™ or â€˜GETâ€™
    * @Default {GET}
    */
  var ajaxRequestType: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when the spell check operations completed through dialog mode.
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the context menu item clicked.
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, scala.Unit]] = js.undefined
  /** Holds all options related to the context menu settings of SpellCheck.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggers before context menu opening.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, scala.Unit]] = js.undefined
  /** It allows to spell check the multiple target HTML element's texts and correct its error words.
    * @Default {null}
    */
  var controlsToValidate: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers before the spell check dialog opens.
    */
  var dialogBeforeOpen: js.UndefOr[js.Function1[/* e */ DialogBeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the spell check dialog closed.
    */
  var dialogClose: js.UndefOr[js.Function1[/* e */ DialogCloseEventArgs, scala.Unit]] = js.undefined
  /** Triggers after the spell check dialog opens.
    */
  var dialogOpen: js.UndefOr[js.Function1[/* e */ DialogOpenEventArgs, scala.Unit]] = js.undefined
  /** It includes the service method path to find the error words and its suggestions also adding the custom word into the custom dictionary.
    */
  var dictionarySettings: js.UndefOr[DictionarySettings] = js.undefined
  /** When set to true, allows sending Asynchronous ajax request for checking the spelling errors.
    * @Default {true}
    */
  var enableAsync: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the spellcheck operation on Enter/Space key-press.
    * @Default {false}
    */
  var enableValidateOnType: js.UndefOr[scala.Boolean] = js.undefined
  /** It helps to ignore the uppercase, mixed case words, alpha numeric words, file path and email addresses based on the property values.
    */
  var ignoreSettings: js.UndefOr[IgnoreSettings] = js.undefined
  /** To ignore the words from the error word consideration.
    * @Default {[]}
    */
  var ignoreWords: js.UndefOr[js.Array[_]] = js.undefined
  /** When set to true, allows the spellcheck to render based upon screen size.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the specific culture to the SpellCheck.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** To set the maximum suggestion display count.
    * @Default {6}
    */
  var maxSuggestionCount: js.UndefOr[scala.Double] = js.undefined
  /** To display the error word in a customized style.
    * @Default {e-errorword}
    */
  var misspellWordCss: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when the dialog mode spell check starting.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, scala.Unit]] = js.undefined
  /** Triggers before loading the target HTML element text into the dialog sentence area.
    */
  var targetUpdating: js.UndefOr[js.Function1[/* e */ TargetUpdatingEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the spell check control performing the spell check operations such as ignore, ignoreAll, change, changeAll and addToDictionary.
    */
  var validating: js.UndefOr[js.Function1[/* e */ ValidatingEventArgs, scala.Unit]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: js.Function1[/* e */ ActionBeginEventArgs, scala.Unit] = null,
    actionFailure: js.Function1[/* e */ ActionFailureEventArgs, scala.Unit] = null,
    actionSuccess: js.Function1[/* e */ ActionSuccessEventArgs, scala.Unit] = null,
    ajaxDataType: java.lang.String = null,
    ajaxRequestType: java.lang.String = null,
    complete: js.Function1[/* e */ CompleteEventArgs, scala.Unit] = null,
    contextClick: js.Function1[/* e */ ContextClickEventArgs, scala.Unit] = null,
    contextMenuSettings: ContextMenuSettings = null,
    contextOpen: js.Function1[/* e */ ContextOpenEventArgs, scala.Unit] = null,
    controlsToValidate: java.lang.String = null,
    dialogBeforeOpen: js.Function1[/* e */ DialogBeforeOpenEventArgs, scala.Unit] = null,
    dialogClose: js.Function1[/* e */ DialogCloseEventArgs, scala.Unit] = null,
    dialogOpen: js.Function1[/* e */ DialogOpenEventArgs, scala.Unit] = null,
    dictionarySettings: DictionarySettings = null,
    enableAsync: js.UndefOr[scala.Boolean] = js.undefined,
    enableValidateOnType: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSettings: IgnoreSettings = null,
    ignoreWords: js.Array[_] = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    maxSuggestionCount: scala.Int | scala.Double = null,
    misspellWordCss: java.lang.String = null,
    start: js.Function1[/* e */ StartEventArgs, scala.Unit] = null,
    targetUpdating: js.Function1[/* e */ TargetUpdatingEventArgs, scala.Unit] = null,
    validating: js.Function1[/* e */ ValidatingEventArgs, scala.Unit] = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(actionBegin)
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(actionFailure)
    if (actionSuccess != null) __obj.updateDynamic("actionSuccess")(actionSuccess)
    if (ajaxDataType != null) __obj.updateDynamic("ajaxDataType")(ajaxDataType)
    if (ajaxRequestType != null) __obj.updateDynamic("ajaxRequestType")(ajaxRequestType)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (contextClick != null) __obj.updateDynamic("contextClick")(contextClick)
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings)
    if (contextOpen != null) __obj.updateDynamic("contextOpen")(contextOpen)
    if (controlsToValidate != null) __obj.updateDynamic("controlsToValidate")(controlsToValidate)
    if (dialogBeforeOpen != null) __obj.updateDynamic("dialogBeforeOpen")(dialogBeforeOpen)
    if (dialogClose != null) __obj.updateDynamic("dialogClose")(dialogClose)
    if (dialogOpen != null) __obj.updateDynamic("dialogOpen")(dialogOpen)
    if (dictionarySettings != null) __obj.updateDynamic("dictionarySettings")(dictionarySettings)
    if (!js.isUndefined(enableAsync)) __obj.updateDynamic("enableAsync")(enableAsync)
    if (!js.isUndefined(enableValidateOnType)) __obj.updateDynamic("enableValidateOnType")(enableValidateOnType)
    if (ignoreSettings != null) __obj.updateDynamic("ignoreSettings")(ignoreSettings)
    if (ignoreWords != null) __obj.updateDynamic("ignoreWords")(ignoreWords)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxSuggestionCount != null) __obj.updateDynamic("maxSuggestionCount")(maxSuggestionCount.asInstanceOf[js.Any])
    if (misspellWordCss != null) __obj.updateDynamic("misspellWordCss")(misspellWordCss)
    if (start != null) __obj.updateDynamic("start")(start)
    if (targetUpdating != null) __obj.updateDynamic("targetUpdating")(targetUpdating)
    if (validating != null) __obj.updateDynamic("validating")(validating)
    __obj.asInstanceOf[Model]
  }
}

