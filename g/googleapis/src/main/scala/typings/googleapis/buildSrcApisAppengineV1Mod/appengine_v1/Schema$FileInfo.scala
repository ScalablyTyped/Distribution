package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Single source file that is part of the version to be deployed. Each source
  * file that is deployed must be specified separately.
  */
@js.native
trait Schema$FileInfo extends js.Object {
  /**
    * The MIME type of the file.Defaults to the value from Google Cloud
    * Storage.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The SHA1 hash of the file, in hex.
    */
  var sha1Sum: js.UndefOr[String] = js.native
  /**
    * URL source to use to fetch this file. Must be a URL to a resource in
    * Google Cloud Storage in the form
    * &#39;http(s)://storage.googleapis.com/&lt;bucket&gt;/&lt;object&gt;&#39;.
    */
  var sourceUrl: js.UndefOr[String] = js.native
}

object Schema$FileInfo {
  @scala.inline
  def apply(mimeType: String = null, sha1Sum: String = null, sourceUrl: String = null): Schema$FileInfo = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (sha1Sum != null) __obj.updateDynamic("sha1Sum")(sha1Sum.asInstanceOf[js.Any])
    if (sourceUrl != null) __obj.updateDynamic("sourceUrl")(sourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileInfo]
  }
}

