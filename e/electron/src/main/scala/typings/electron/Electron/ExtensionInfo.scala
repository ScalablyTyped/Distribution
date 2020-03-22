package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/extension-info
  var name: String
  var version: String
}

object ExtensionInfo {
  @scala.inline
  def apply(name: String, version: String): ExtensionInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionInfo]
  }
}

