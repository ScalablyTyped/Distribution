package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconParams extends Params {
  var mask: js.UndefOr[IconLookup] = js.native
  var maskId: js.UndefOr[String] = js.native
  var symbol: js.UndefOr[FaSymbol] = js.native
  var transform: js.UndefOr[Transform] = js.native
}

object IconParams {
  @scala.inline
  def apply(): IconParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconParams]
  }
  @scala.inline
  implicit class IconParamsOps[Self <: IconParams] (val x: Self) extends AnyVal {
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
    def setMask(value: IconLookup): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskId(value: String): Self = this.set("maskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskId: Self = this.set("maskId", js.undefined)
    @scala.inline
    def setSymbol(value: FaSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setTransform(value: Transform): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

