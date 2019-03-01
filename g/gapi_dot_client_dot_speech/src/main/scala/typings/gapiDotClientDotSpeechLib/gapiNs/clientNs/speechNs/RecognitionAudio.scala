package typings
package gapiDotClientDotSpeechLib.gapiNs.clientNs.speechNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecognitionAudio extends js.Object {
  /**
    * The audio data bytes encoded as specified in
    * `RecognitionConfig`. Note: as with all bytes fields, protobuffers use a
    * pure binary representation, whereas JSON representations use base64.
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URI that points to a file that contains audio data bytes as specified in
    * `RecognitionConfig`. Currently, only Google Cloud Storage URIs are
    * supported, which must be specified in the following format:
    * `gs://bucket_name/object_name` (other URI formats return
    * google.rpc.Code.INVALID_ARGUMENT). For more information, see
    * [Request URIs](https://cloud.google.com/storage/docs/reference-uris).
    */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object RecognitionAudio {
  @scala.inline
  def apply(content: java.lang.String = null, uri: java.lang.String = null): RecognitionAudio = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[RecognitionAudio]
  }
}

