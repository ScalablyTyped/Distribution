package typings.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Intermediates extends js.Object {
  var intermediates: js.UndefOr[Boolean] = js.native
}

object Intermediates {
  @scala.inline
  def apply(): Intermediates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Intermediates]
  }
  @scala.inline
  implicit class IntermediatesOps[Self <: Intermediates] (val x: Self) extends AnyVal {
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
    def setIntermediates(value: Boolean): Self = this.set("intermediates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntermediates: Self = this.set("intermediates", js.undefined)
  }
  
}

