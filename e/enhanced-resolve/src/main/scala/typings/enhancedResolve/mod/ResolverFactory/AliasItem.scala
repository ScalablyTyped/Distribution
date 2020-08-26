package typings.enhancedResolve.mod.ResolverFactory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasItem extends js.Object {
  var alias: String = js.native
  var name: String = js.native
  var onlyModule: js.UndefOr[Boolean] = js.native
}

object AliasItem {
  @scala.inline
  def apply(alias: String, name: String): AliasItem = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasItem]
  }
  @scala.inline
  implicit class AliasItemOps[Self <: AliasItem] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyModule(value: Boolean): Self = this.set("onlyModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyModule: Self = this.set("onlyModule", js.undefined)
  }
  
}

