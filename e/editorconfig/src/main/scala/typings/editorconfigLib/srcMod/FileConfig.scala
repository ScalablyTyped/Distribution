package typings
package editorconfigLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConfig extends js.Object {
  var contents: editorconfigLib.srcLibIniMod.ParseStringResult
  var name: java.lang.String
}

object FileConfig {
  @scala.inline
  def apply(contents: editorconfigLib.srcLibIniMod.ParseStringResult, name: java.lang.String): FileConfig = {
    val __obj = js.Dynamic.literal(contents = contents, name = name)
  
    __obj.asInstanceOf[FileConfig]
  }
}

