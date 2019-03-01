package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the error words details.
    */
  var errorWords: js.UndefOr[js.Any] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the input string.
    */
  var targetSentence: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object StartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    errorWords: js.Any = null,
    model: Model = null,
    requestType: java.lang.String = null,
    targetSentence: java.lang.String = null,
    `type`: java.lang.String = null
  ): StartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (errorWords != null) __obj.updateDynamic("errorWords")(errorWords)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (targetSentence != null) __obj.updateDynamic("targetSentence")(targetSentence)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StartEventArgs]
  }
}

