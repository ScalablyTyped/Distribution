package typings.enhancedResolve.descriptionFileUtilsMod

import typings.enhancedResolve.concordMod.Concord
import typings.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescriptionFileData extends js.Object {
  var browser: js.UndefOr[Dictionary[String | Boolean]] = js.native
  var concord: js.UndefOr[Concord] = js.native
}

object DescriptionFileData {
  @scala.inline
  def apply(): DescriptionFileData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionFileData]
  }
  @scala.inline
  implicit class DescriptionFileDataOps[Self <: DescriptionFileData] (val x: Self) extends AnyVal {
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
    def setBrowser(value: Dictionary[String | Boolean]): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setConcord(value: Concord): Self = this.set("concord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcord: Self = this.set("concord", js.undefined)
  }
  
}

