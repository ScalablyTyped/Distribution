package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudStorage extends js.Object {
  /**
    * The path to a directory in GCS that will
    * eventually contain the results for this test.
    * The requesting user must have write access on the bucket in the supplied
    * path.
    * Required
    */
  var gcsPath: js.UndefOr[String] = js.undefined
}

object GoogleCloudStorage {
  @scala.inline
  def apply(gcsPath: String = null): GoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath)
    __obj.asInstanceOf[GoogleCloudStorage]
  }
}

