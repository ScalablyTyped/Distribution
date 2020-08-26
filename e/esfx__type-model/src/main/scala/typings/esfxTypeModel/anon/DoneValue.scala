package typings.esfxTypeModel.anon

import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoneValue extends js.Object {
  var done: `true` = js.native
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ] = js.native
}

object DoneValue {
  @scala.inline
  def apply(done: `true`): DoneValue = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneValue]
  }
  @scala.inline
  implicit class DoneValueOps[Self <: DoneValue] (val x: Self) extends AnyVal {
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
    def setDone(value: `true`): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

