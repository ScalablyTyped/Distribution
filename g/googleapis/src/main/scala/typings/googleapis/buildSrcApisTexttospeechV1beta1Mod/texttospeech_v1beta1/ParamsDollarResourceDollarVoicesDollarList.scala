package typings.googleapis.buildSrcApisTexttospeechV1beta1Mod.texttospeech_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarVoicesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional (but recommended)
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If
    * specified, the ListVoices call will only return voices that can be used
    * to synthesize this language_code. E.g. when specifying "en-NZ", you will
    * get supported "en-*" voices; when specifying "no", you will get supported
    * "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh"
    * will also get supported "cmn-*" voices; specifying "zh-hk" will also get
    * supported "yue-*" voices.
    */
  var languageCode: js.UndefOr[String] = js.native
}

