package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a file.
  */
@js.native
trait Schema$FileReference extends js.Object {
  /**
    * The URI of a file stored in Google Cloud Storage.  For example:
    * http://storage.googleapis.com/mybucket/path/to/test.xml or in gsutil
    * format: gs://mybucket/path/to/test.xml with version-specific info,
    * gs://mybucket/path/to/test.xml#1360383693690000  An INVALID_ARGUMENT
    * error will be returned if the URI format is not supported.  - In
    * response: always set - In create/update request: always set
    */
  var fileUri: js.UndefOr[String] = js.native
}

object Schema$FileReference {
  @scala.inline
  def apply(fileUri: String = null): Schema$FileReference = {
    val __obj = js.Dynamic.literal()
    if (fileUri != null) __obj.updateDynamic("fileUri")(fileUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileReference]
  }
}

