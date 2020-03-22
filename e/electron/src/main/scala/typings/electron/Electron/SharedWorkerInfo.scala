package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedWorkerInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/shared-worker-info
  /**
    * The unique id of the shared worker.
    */
  var id: String
  /**
    * The url of the shared worker.
    */
  var url: String
}

object SharedWorkerInfo {
  @scala.inline
  def apply(id: String, url: String): SharedWorkerInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharedWorkerInfo]
  }
}

