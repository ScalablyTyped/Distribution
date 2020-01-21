package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The zip file information for a zip deployment.
  */
@js.native
trait SchemaZipInfo extends js.Object {
  /**
    * An estimate of the number of files in a zip for a zip deployment. If set,
    * must be greater than or equal to the actual number of files. Used for
    * optimizing performance; if not provided, deployment may be slow.
    */
  var filesCount: js.UndefOr[Double] = js.native
  /**
    * URL of the zip file to deploy from. Must be a URL to a resource in Google
    * Cloud Storage in the form
    * &#39;http(s)://storage.googleapis.com/&lt;bucket&gt;/&lt;object&gt;&#39;.
    */
  var sourceUrl: js.UndefOr[String] = js.native
}

object SchemaZipInfo {
  @scala.inline
  def apply(filesCount: Int | Double = null, sourceUrl: String = null): SchemaZipInfo = {
    val __obj = js.Dynamic.literal()
    if (filesCount != null) __obj.updateDynamic("filesCount")(filesCount.asInstanceOf[js.Any])
    if (sourceUrl != null) __obj.updateDynamic("sourceUrl")(sourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaZipInfo]
  }
}

