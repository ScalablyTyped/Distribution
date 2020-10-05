package typings.expo.anon

import typings.expo.expoBooleans.`false`
import typings.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsNew extends UpdateFetchResult {
  var isNew: `false` = js.native
}

object IsNew {
  @scala.inline
  def apply(isNew: `false`): IsNew = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNew]
  }
  @scala.inline
  implicit class IsNewOps[Self <: IsNew] (val x: Self) extends AnyVal {
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
    def setIsNew(value: `false`): Self = this.set("isNew", value.asInstanceOf[js.Any])
  }
  
}

