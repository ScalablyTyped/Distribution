package typings.externalEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorParams extends js.Object {
  var args: js.Array[String]
  var bin: String
}

object IEditorParams {
  @scala.inline
  def apply(args: js.Array[String], bin: String): IEditorParams = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEditorParams]
  }
}

