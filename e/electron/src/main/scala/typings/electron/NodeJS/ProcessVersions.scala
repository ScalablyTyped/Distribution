package typings.electron.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessVersions extends js.Object {
  val chrome: String
  val electron: String
}

object ProcessVersions {
  @scala.inline
  def apply(chrome: String, electron: String): ProcessVersions = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], electron = electron.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessVersions]
  }
}

