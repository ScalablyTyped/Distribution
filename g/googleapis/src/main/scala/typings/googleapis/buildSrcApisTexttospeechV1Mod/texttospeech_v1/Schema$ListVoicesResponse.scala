package typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned to the client by the `ListVoices` method.
  */
@js.native
trait Schema$ListVoicesResponse extends js.Object {
  /**
    * The list of voices.
    */
  var voices: js.UndefOr[js.Array[Schema$Voice]] = js.native
}

object Schema$ListVoicesResponse {
  @scala.inline
  def apply(voices: js.Array[Schema$Voice] = null): Schema$ListVoicesResponse = {
    val __obj = js.Dynamic.literal()
    if (voices != null) __obj.updateDynamic("voices")(voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListVoicesResponse]
  }
}

