package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameManager extends js.Object {
  /** Specifies the name for the cell or a range.
    */
  var name: js.UndefOr[String] = js.native
  /** Specifies the address for the cell or a range.
    */
  var refersto: js.UndefOr[String] = js.native
}

object NameManager {
  @scala.inline
  def apply(): NameManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameManager]
  }
  @scala.inline
  implicit class NameManagerOps[Self <: NameManager] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRefersto(value: String): Self = this.set("refersto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefersto: Self = this.set("refersto", js.undefined)
  }
  
}

