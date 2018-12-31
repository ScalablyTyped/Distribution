package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequest extends js.Object {
  var method: java.lang.String
  var session: js.UndefOr[Session] = js.undefined
  var uploadData: js.UndefOr[UploadData] = js.undefined
  var url: java.lang.String
}

