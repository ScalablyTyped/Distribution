package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the change word to replace the error word.
    */
  var changeWord: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the error word to change.
    */
  var changeableWord: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the custom word to add into dictionary file.
    */
  var customWord: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the error word to ignore.
    */
  var ignoreWord: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the index of an error word.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the validating request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the target content.
    */
  var targetContent: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ValidatingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    changeWord: java.lang.String = null,
    changeableWord: java.lang.String = null,
    customWord: java.lang.String = null,
    ignoreWord: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    model: Model = null,
    requestType: java.lang.String = null,
    targetContent: java.lang.String = null,
    `type`: java.lang.String = null
  ): ValidatingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (changeWord != null) __obj.updateDynamic("changeWord")(changeWord)
    if (changeableWord != null) __obj.updateDynamic("changeableWord")(changeableWord)
    if (customWord != null) __obj.updateDynamic("customWord")(customWord)
    if (ignoreWord != null) __obj.updateDynamic("ignoreWord")(ignoreWord)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (targetContent != null) __obj.updateDynamic("targetContent")(targetContent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValidatingEventArgs]
  }
}

