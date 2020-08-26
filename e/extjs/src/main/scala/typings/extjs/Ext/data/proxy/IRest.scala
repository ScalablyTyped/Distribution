package typings.extjs.Ext.data.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRest extends IAjax {
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
}

object IRest {
  @scala.inline
  def apply(): IRest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRest]
  }
  @scala.inline
  implicit class IRestOps[Self <: IRest] (val x: Self) extends AnyVal {
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
    def setAppendId(value: Boolean): Self = this.set("appendId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendId: Self = this.set("appendId", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

