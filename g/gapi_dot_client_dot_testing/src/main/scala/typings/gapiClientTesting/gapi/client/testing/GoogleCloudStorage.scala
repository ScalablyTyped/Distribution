package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudStorage extends js.Object {
  /**
    * The path to a directory in GCS that will
    * eventually contain the results for this test.
    * The requesting user must have write access on the bucket in the supplied
    * path.
    * Required
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object GoogleCloudStorage {
  @scala.inline
  def apply(): GoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudStorage]
  }
  @scala.inline
  implicit class GoogleCloudStorageOps[Self <: GoogleCloudStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGcsPath(value: String): Self = this.set("gcsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsPath: Self = this.set("gcsPath", js.undefined)
  }
  
}

