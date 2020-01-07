package typings.googleapis.buildSrcApisLanguageV1Mod.language_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ################################################################ #
  * Represents the input to API methods.
  */
@js.native
trait Schema$Document extends js.Object {
  /**
    * The content of the input in string format. Cloud audit logging exempt
    * since it is based on user data.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Storage URI where the file content is located. This URI
    * must be of the form: gs://bucket_name/object_name. For more details, see
    * https://cloud.google.com/storage/docs/reference-uris. NOTE: Cloud Storage
    * object versioning is not supported.
    */
  var gcsContentUri: js.UndefOr[String] = js.native
  /**
    * The language of the document (if not specified, the language is
    * automatically detected). Both ISO and BCP-47 language codes are
    * accepted.&lt;br&gt; [Language Support](/natural-language/docs/languages)
    * lists currently supported languages for each API method. If the language
    * (either specified by the caller or automatically detected) is not
    * supported by the called API method, an `INVALID_ARGUMENT` error is
    * returned.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Required. If the type is not set or is `TYPE_UNSPECIFIED`, returns an
    * `INVALID_ARGUMENT` error.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Document {
  @scala.inline
  def apply(
    content: String = null,
    gcsContentUri: String = null,
    language: String = null,
    `type`: String = null
  ): Schema$Document = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (gcsContentUri != null) __obj.updateDynamic("gcsContentUri")(gcsContentUri.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Document]
  }
}

