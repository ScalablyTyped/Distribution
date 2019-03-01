package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileReference extends js.Object {
  /**
    * The URI of a file stored in Google Cloud Storage.
    *
    * For example: http://storage.googleapis.com/mybucket/path/to/test.xml or in gsutil format: gs://mybucket/path/to/test.xml with version-specific info,
    * gs://mybucket/path/to/test.xml#1360383693690000
    *
    * An INVALID_ARGUMENT error will be returned if the URI format is not supported.
    *
    * - In response: always set - In create/update request: always set
    */
  var fileUri: js.UndefOr[java.lang.String] = js.undefined
}

object FileReference {
  @scala.inline
  def apply(fileUri: java.lang.String = null): FileReference = {
    val __obj = js.Dynamic.literal()
    if (fileUri != null) __obj.updateDynamic("fileUri")(fileUri)
    __obj.asInstanceOf[FileReference]
  }
}

