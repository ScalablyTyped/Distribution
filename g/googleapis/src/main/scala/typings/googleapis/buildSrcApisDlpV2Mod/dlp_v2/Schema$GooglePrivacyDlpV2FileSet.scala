package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of files to scan.
  */
@js.native
trait Schema$GooglePrivacyDlpV2FileSet extends js.Object {
  /**
    * The regex-filtered set of files to scan. Exactly one of `url` or
    * `regex_file_set` must be set.
    */
  var regexFileSet: js.UndefOr[Schema$GooglePrivacyDlpV2CloudStorageRegexFileSet] = js.native
  /**
    * The Cloud Storage url of the file(s) to scan, in the format
    * `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing wildcard in the path is
    * allowed.  If the url ends in a trailing slash, the bucket or directory
    * represented by the url will be scanned non-recursively (content in
    * sub-directories will not be scanned). This means that `gs://mybucket/` is
    * equivalent to `gs://mybucket/x, and `gs://mybucket/directory/` is
    * equivalent to `gs://mybucket/directory/x.  Exactly one of `url` or
    * `regex_file_set` must be set.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2FileSet {
  @scala.inline
  def apply(regexFileSet: Schema$GooglePrivacyDlpV2CloudStorageRegexFileSet = null, url: String = null): Schema$GooglePrivacyDlpV2FileSet = {
    val __obj = js.Dynamic.literal()
    if (regexFileSet != null) __obj.updateDynamic("regexFileSet")(regexFileSet.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2FileSet]
  }
}

