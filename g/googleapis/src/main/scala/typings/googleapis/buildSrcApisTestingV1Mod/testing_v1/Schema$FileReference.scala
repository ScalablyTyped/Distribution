package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a file, used for user inputs.
  */
@js.native
trait Schema$FileReference extends js.Object {
  /**
    * A path to a file in Google Cloud Storage. Example:
    * gs://build-app-1414623860166/app-debug-unaligned.apk
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object Schema$FileReference {
  @scala.inline
  def apply(gcsPath: String = null): Schema$FileReference = {
    val __obj = js.Dynamic.literal()
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileReference]
  }
}

