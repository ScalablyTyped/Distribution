package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTaskSnapshot extends js.Object {
  var bytesTransferred: scala.Double
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURL: java.lang.String | scala.Null
  var metadata: FullMetadata
  var ref: Reference
  var state: TaskState
  var task: UploadTask
  var totalBytes: scala.Double
}

