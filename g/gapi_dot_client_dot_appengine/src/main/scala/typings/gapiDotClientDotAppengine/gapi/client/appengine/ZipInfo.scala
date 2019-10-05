package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipInfo extends js.Object {
  /**
    * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for
    * optimizing performance; if not provided, deployment may be slow.
    */
  var filesCount: js.UndefOr[Double] = js.undefined
  /**
    * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form
    * 'http(s)://storage.googleapis.com/<bucket>/<object>'.
    */
  var sourceUrl: js.UndefOr[String] = js.undefined
}

object ZipInfo {
  @scala.inline
  def apply(filesCount: Int | Double = null, sourceUrl: String = null): ZipInfo = {
    val __obj = js.Dynamic.literal()
    if (filesCount != null) __obj.updateDynamic("filesCount")(filesCount.asInstanceOf[js.Any])
    if (sourceUrl != null) __obj.updateDynamic("sourceUrl")(sourceUrl)
    __obj.asInstanceOf[ZipInfo]
  }
}

