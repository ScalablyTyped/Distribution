package typings.devextreme.anon

import typings.devextreme.devextremeStrings.array
import typings.devextreme.devextremeStrings.local
import typings.devextreme.devextremeStrings.odata
import typings.devextreme.devextremeStrings.xmla
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  var `type`: js.UndefOr[array | local | odata | xmla] = js.native
}

object Type {
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
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
    def setType(value: array | local | odata | xmla): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

