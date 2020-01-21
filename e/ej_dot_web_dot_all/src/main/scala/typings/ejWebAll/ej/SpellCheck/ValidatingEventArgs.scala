package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatingEventArgs extends js.Object {
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
  var model: js.UndefOr[Model] = js.undefined
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
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    changeWord: String = null,
    changeableWord: String = null,
    customWord: String = null,
    ignoreWord: String = null,
    index: Int | Double = null,
    model: Model = null,
    requestType: String = null,
    targetContent: String = null,
    `type`: String = null
  ): ValidatingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (changeWord != null) __obj.updateDynamic("changeWord")(changeWord.asInstanceOf[js.Any])
    if (changeableWord != null) __obj.updateDynamic("changeableWord")(changeableWord.asInstanceOf[js.Any])
    if (customWord != null) __obj.updateDynamic("customWord")(customWord.asInstanceOf[js.Any])
    if (ignoreWord != null) __obj.updateDynamic("ignoreWord")(ignoreWord.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (targetContent != null) __obj.updateDynamic("targetContent")(targetContent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatingEventArgs]
  }
}

