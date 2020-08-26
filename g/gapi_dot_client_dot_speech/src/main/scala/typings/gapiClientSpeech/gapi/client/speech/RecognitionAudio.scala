package typings.gapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecognitionAudio extends js.Object {
  /**
    * The audio data bytes encoded as specified in
    * `RecognitionConfig`. Note: as with all bytes fields, protobuffers use a
    * pure binary representation, whereas JSON representations use base64.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * URI that points to a file that contains audio data bytes as specified in
    * `RecognitionConfig`. Currently, only Google Cloud Storage URIs are
    * supported, which must be specified in the following format:
    * `gs://bucket_name/object_name` (other URI formats return
    * google.rpc.Code.INVALID_ARGUMENT). For more information, see
    * [Request URIs](https://cloud.google.com/storage/docs/reference-uris).
    */
  var uri: js.UndefOr[String] = js.native
}

object RecognitionAudio {
  @scala.inline
  def apply(): RecognitionAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognitionAudio]
  }
  @scala.inline
  implicit class RecognitionAudioOps[Self <: RecognitionAudio] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

