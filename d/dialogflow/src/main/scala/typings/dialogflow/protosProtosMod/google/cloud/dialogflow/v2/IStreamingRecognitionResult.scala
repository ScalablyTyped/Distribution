package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingRecognitionResult. */
trait IStreamingRecognitionResult extends js.Object {
  /** StreamingRecognitionResult confidence */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  /** StreamingRecognitionResult isFinal */
  var isFinal: js.UndefOr[Boolean | Null] = js.undefined
  /** StreamingRecognitionResult messageType */
  var messageType: js.UndefOr[MessageType | Null] = js.undefined
  /** StreamingRecognitionResult transcript */
  var transcript: js.UndefOr[String | Null] = js.undefined
}

object IStreamingRecognitionResult {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    isFinal: js.UndefOr[Boolean] = js.undefined,
    messageType: MessageType = null,
    transcript: String = null
  ): IStreamingRecognitionResult = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(isFinal)) __obj.updateDynamic("isFinal")(isFinal)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType)
    if (transcript != null) __obj.updateDynamic("transcript")(transcript)
    __obj.asInstanceOf[IStreamingRecognitionResult]
  }
}

