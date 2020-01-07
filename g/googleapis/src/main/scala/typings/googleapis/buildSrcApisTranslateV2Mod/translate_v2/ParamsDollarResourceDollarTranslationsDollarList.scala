package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarTranslationsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The customization id for translate
    */
  var cid: js.UndefOr[js.Array[String]] = js.native
  /**
    * The format of the source text, in either HTML (default) or plain-text. A
    * value of "html" indicates HTML and a value of "text" indicates
    * plain-text.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The `model` type requested for this translation. Valid values are listed
    * in public documentation.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The input text to translate. Repeat this parameter to perform translation
    * operations on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.native
  /**
    * The language of the source text, set to one of the language codes listed
    * in Language Support. If the source language is not specified, the API
    * will attempt to identify the source language automatically and return it
    * within the response.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The language to use for translation of the input text, set to one of the
    * language codes listed in Language Support.
    */
  var target: js.UndefOr[String] = js.native
}

