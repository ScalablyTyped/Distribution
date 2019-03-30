package typings
package editorconfigLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECFile extends js.Object {
  var contents: java.lang.String | nodeLib.Buffer
  var name: java.lang.String
}

object ECFile {
  @scala.inline
  def apply(contents: java.lang.String | nodeLib.Buffer, name: java.lang.String): ECFile = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[ECFile]
  }
}

