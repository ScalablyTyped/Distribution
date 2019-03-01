package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileReference extends js.Object {
  /**
    * A path to a file in Google Cloud Storage.
    * Example: gs://build-app-1414623860166/app-debug-unaligned.apk
    */
  var gcsPath: js.UndefOr[java.lang.String] = js.undefined
}

object FileReference {
  @scala.inline
  def apply(gcsPath: java.lang.String = null): FileReference = {
    val __obj = js.Dynamic.literal()
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath)
    __obj.asInstanceOf[FileReference]
  }
}

