package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SpeechWordInfo. */
trait ISpeechWordInfo extends js.Object {
  /** SpeechWordInfo confidence */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  /** SpeechWordInfo endOffset */
  var endOffset: js.UndefOr[IDuration | Null] = js.undefined
  /** SpeechWordInfo startOffset */
  var startOffset: js.UndefOr[IDuration | Null] = js.undefined
  /** SpeechWordInfo word */
  var word: js.UndefOr[String | Null] = js.undefined
}

object ISpeechWordInfo {
  @scala.inline
  def apply(
    confidence: js.UndefOr[Null | Double] = js.undefined,
    endOffset: js.UndefOr[Null | IDuration] = js.undefined,
    startOffset: js.UndefOr[Null | IDuration] = js.undefined,
    word: js.UndefOr[Null | String] = js.undefined
  ): ISpeechWordInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(endOffset)) __obj.updateDynamic("endOffset")(endOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(startOffset)) __obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(word)) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpeechWordInfo]
  }
}

