package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadata extends UploadMetadata {
  var bucket: java.lang.String
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURLs: coreDashJsLib.Array[java.lang.String]
  var fullPath: java.lang.String
  var generation: java.lang.String
  var metageneration: java.lang.String
  var name: java.lang.String
  var size: scala.Double
  var timeCreated: java.lang.String
  var updated: java.lang.String
}

