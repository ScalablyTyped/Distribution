package typings
package envDashEditorLib.envDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editor extends js.Object {
  var bin: java.lang.String
  var id: java.lang.String
  var isTerminalEditor: scala.Boolean
  var keywords: js.Array[java.lang.String]
  var name: java.lang.String
  var paths: js.Array[java.lang.String]
}

object Editor {
  @scala.inline
  def apply(
    bin: java.lang.String,
    id: java.lang.String,
    isTerminalEditor: scala.Boolean,
    keywords: js.Array[java.lang.String],
    name: java.lang.String,
    paths: js.Array[java.lang.String]
  ): Editor = {
    val __obj = js.Dynamic.literal(bin = bin, id = id, isTerminalEditor = isTerminalEditor, keywords = keywords, name = name, paths = paths)
  
    __obj.asInstanceOf[Editor]
  }
}

