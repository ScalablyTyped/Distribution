package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom information type based on a dictionary of words or phrases. This can
  * be used to match sensitive information specific to the data, such as a list
  * of employee IDs or job titles.  Dictionary words are case-insensitive and
  * all characters other than letters and digits in the unicode [Basic
  * Multilingual
  * Plane](https://en.wikipedia.org/wiki/Plane_%28Unicode%29#Basic_Multilingual_Plane)
  * will be replaced with whitespace when scanning for matches, so the
  * dictionary phrase &quot;Sam Johnson&quot; will match all three phrases
  * &quot;sam johnson&quot;, &quot;Sam, Johnson&quot;, and &quot;Sam
  * (Johnson)&quot;. Additionally, the characters surrounding any match must be
  * of a different type than the adjacent characters within the word, so
  * letters must be next to non-letters and digits next to non-digits. For
  * example, the dictionary word &quot;jen&quot; will match the first three
  * letters of the text &quot;jen123&quot; but will return no matches for
  * &quot;jennifer&quot;.  Dictionary words containing a large number of
  * characters that are not letters or digits may result in unexpected findings
  * because such characters are treated as whitespace. The
  * [limits](https://cloud.google.com/dlp/limits) page contains details about
  * the size limits of dictionaries. For dictionaries that do not fit within
  * these constraints, consider using `LargeCustomDictionaryConfig` in the
  * `StoredInfoType` API.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Dictionary extends js.Object {
  /**
    * Newline-delimited file of words in Cloud Storage. Only a single file is
    * accepted.
    */
  var cloudStoragePath: js.UndefOr[Schema$GooglePrivacyDlpV2CloudStoragePath] = js.native
  /**
    * List of words or phrases to search for.
    */
  var wordList: js.UndefOr[Schema$GooglePrivacyDlpV2WordList] = js.native
}

object Schema$GooglePrivacyDlpV2Dictionary {
  @scala.inline
  def apply(
    cloudStoragePath: Schema$GooglePrivacyDlpV2CloudStoragePath = null,
    wordList: Schema$GooglePrivacyDlpV2WordList = null
  ): Schema$GooglePrivacyDlpV2Dictionary = {
    val __obj = js.Dynamic.literal()
    if (cloudStoragePath != null) __obj.updateDynamic("cloudStoragePath")(cloudStoragePath.asInstanceOf[js.Any])
    if (wordList != null) __obj.updateDynamic("wordList")(wordList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Dictionary]
  }
}

