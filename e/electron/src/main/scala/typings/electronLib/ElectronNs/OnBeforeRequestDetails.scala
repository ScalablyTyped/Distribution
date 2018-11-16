package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnBeforeRequestDetails extends js.Object {
  var id: scala.Double
  var method: java.lang.String
  var resourceType: java.lang.String
  var timestamp: scala.Double
  var uploadData: js.Array[UploadData]
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

