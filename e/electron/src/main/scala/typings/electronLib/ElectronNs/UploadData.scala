package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UploadData extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-data
  /**
       * UUID of blob data. Use method to retrieve the data.
       */
  var blobUUID: java.lang.String
  /**
       * Content being sent.
       */
  var bytes: nodeLib.Buffer
  /**
       * Path of file being uploaded.
       */
  var file: java.lang.String
}

