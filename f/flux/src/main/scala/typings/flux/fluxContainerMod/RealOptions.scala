package typings.flux.fluxContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealOptions extends js.Object {
  /** @default true */
  var pure: js.UndefOr[Boolean] = js.native
  /** @default false */
  var withContext: js.UndefOr[Boolean] = js.native
  /** @default false */
  var withProps: js.UndefOr[Boolean] = js.native
}

object RealOptions {
  @scala.inline
  def apply(): RealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealOptions]
  }
  @scala.inline
  implicit class RealOptionsOps[Self <: RealOptions] (val x: Self) extends AnyVal {
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
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
    @scala.inline
    def setWithContext(value: Boolean): Self = this.set("withContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithContext: Self = this.set("withContext", js.undefined)
    @scala.inline
    def setWithProps(value: Boolean): Self = this.set("withProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithProps: Self = this.set("withProps", js.undefined)
  }
  
}

