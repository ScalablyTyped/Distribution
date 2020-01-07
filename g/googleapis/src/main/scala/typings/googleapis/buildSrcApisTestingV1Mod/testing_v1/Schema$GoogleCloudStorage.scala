package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A storage location within Google cloud storage (GCS).
  */
@js.native
trait Schema$GoogleCloudStorage extends js.Object {
  /**
    * Required. The path to a directory in GCS that will eventually contain the
    * results for this test. The requesting user must have write access on the
    * bucket in the supplied path.
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudStorage {
  @scala.inline
  def apply(gcsPath: String = null): Schema$GoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudStorage]
  }
}

