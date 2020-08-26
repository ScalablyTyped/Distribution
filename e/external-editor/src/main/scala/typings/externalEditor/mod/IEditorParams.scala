package typings.externalEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorParams extends js.Object {
  var args: js.Array[String] = js.native
  var bin: String = js.native
}

object IEditorParams {
  @scala.inline
  def apply(args: js.Array[String], bin: String): IEditorParams = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorParams]
  }
  @scala.inline
  implicit class IEditorParamsOps[Self <: IEditorParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
  }
  
}

