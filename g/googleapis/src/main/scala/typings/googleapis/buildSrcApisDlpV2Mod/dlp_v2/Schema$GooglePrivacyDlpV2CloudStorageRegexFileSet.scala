package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing a set of files in a Cloud Storage bucket. Regular
  * expressions are used to allow fine-grained control over which files in the
  * bucket to include.  Included files are those that match at least one item
  * in `include_regex` and do not match any items in `exclude_regex`. Note that
  * a file that matches items from both lists will _not_ be included. For a
  * match to occur, the entire file path (i.e., everything in the url after the
  * bucket name) must match the regular expression.  For example, given the
  * input `{bucket_name: &quot;mybucket&quot;, include_regex:
  * [&quot;directory1/.*&quot;], exclude_regex:
  * [&quot;directory1/excluded.*&quot;]}`:  * `gs://mybucket/directory1/myfile`
  * will be included * `gs://mybucket/directory1/directory2/myfile` will be
  * included (`.*` matches across `/`) *
  * `gs://mybucket/directory0/directory1/myfile` will _not_ be included (the
  * full path doesn&#39;t match any items in `include_regex`) *
  * `gs://mybucket/directory1/excludedfile` will _not_ be included (the path
  * matches an item in `exclude_regex`)  If `include_regex` is left empty, it
  * will match all files by default (this is equivalent to setting
  * `include_regex: [&quot;.*&quot;]`).  Some other common use cases:  *
  * `{bucket_name: &quot;mybucket&quot;, exclude_regex: [&quot;.*\.pdf&quot;]}`
  * will include all files in `mybucket` except for .pdf files * `{bucket_name:
  * &quot;mybucket&quot;, include_regex: [&quot;directory/[^/]+&quot;]}` will
  * include all files directly under `gs://mybucket/directory/`, without
  * matching across `/`
  */
@js.native
trait Schema$GooglePrivacyDlpV2CloudStorageRegexFileSet extends js.Object {
  /**
    * The name of a Cloud Storage bucket. Required.
    */
  var bucketName: js.UndefOr[String] = js.native
  /**
    * A list of regular expressions matching file paths to exclude. All files
    * in the bucket that match at least one of these regular expressions will
    * be excluded from the scan.  Regular expressions use RE2
    * [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found
    * under the google/re2 repository on GitHub.
    */
  var excludeRegex: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of regular expressions matching file paths to include. All files
    * in the bucket that match at least one of these regular expressions will
    * be included in the set of files, except for those that also match an item
    * in `exclude_regex`. Leaving this field empty will match all files by
    * default (this is equivalent to including `.*` in the list).  Regular
    * expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax);
    * a guide can be found under the google/re2 repository on GitHub.
    */
  var includeRegex: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GooglePrivacyDlpV2CloudStorageRegexFileSet {
  @scala.inline
  def apply(
    bucketName: String = null,
    excludeRegex: js.Array[String] = null,
    includeRegex: js.Array[String] = null
  ): Schema$GooglePrivacyDlpV2CloudStorageRegexFileSet = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (excludeRegex != null) __obj.updateDynamic("excludeRegex")(excludeRegex.asInstanceOf[js.Any])
    if (includeRegex != null) __obj.updateDynamic("includeRegex")(includeRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CloudStorageRegexFileSet]
  }
}

