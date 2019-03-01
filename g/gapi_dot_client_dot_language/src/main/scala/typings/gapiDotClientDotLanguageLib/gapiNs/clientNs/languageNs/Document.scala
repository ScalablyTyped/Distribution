package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  /** The content of the input in string format. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Google Cloud Storage URI where the file content is located.
    * This URI must be of the form: gs://bucket_name/object_name. For more
    * details, see https://cloud.google.com/storage/docs/reference-uris.
    * NOTE: Cloud Storage object versioning is not supported.
    */
  var gcsContentUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The language of the document (if not specified, the language is
    * automatically detected). Both ISO and BCP-47 language codes are
    * accepted.<br>
    * [Language Support](/natural-language/docs/languages)
    * lists currently supported languages for each API method.
    * If the language (either specified by the caller or automatically detected)
    * is not supported by the called API method, an `INVALID_ARGUMENT` error
    * is returned.
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
    * returns an `INVALID_ARGUMENT` error.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    gcsContentUri: java.lang.String = null,
    language: java.lang.String = null,
    `type`: java.lang.String = null
  ): Document = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (gcsContentUri != null) __obj.updateDynamic("gcsContentUri")(gcsContentUri)
    if (language != null) __obj.updateDynamic("language")(language)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Document]
  }
}

