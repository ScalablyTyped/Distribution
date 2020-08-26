package typings.extjs.Ext.form.action

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStandardSubmit extends ISubmit {
  /** [Config Option] (String) */
  var target: js.UndefOr[String] = js.native
}

object IStandardSubmit {
  @scala.inline
  def apply(): IStandardSubmit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStandardSubmit]
  }
  @scala.inline
  implicit class IStandardSubmitOps[Self <: IStandardSubmit] (val x: Self) extends AnyVal {
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

