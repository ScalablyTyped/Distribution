package typings
package externalDashEditorLib.externalDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorParams extends js.Object {
  var args: js.Array[java.lang.String]
  var bin: java.lang.String
}

object IEditorParams {
  @scala.inline
  def apply(args: js.Array[java.lang.String], bin: java.lang.String): IEditorParams = {
    val __obj = js.Dynamic.literal(args = args, bin = bin)
  
    __obj.asInstanceOf[IEditorParams]
  }
}

