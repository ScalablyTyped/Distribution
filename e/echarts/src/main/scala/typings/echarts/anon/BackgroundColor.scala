package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: js.UndefOr[String] = js.native
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[String]] = js.native
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: js.UndefOr[Double] = js.native
  // Exporting format, can be either png, or jpeg
  var `type`: js.UndefOr[String] = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setExcludeComponentsVarargs(value: String*): Self = this.set("excludeComponents", js.Array(value :_*))
    @scala.inline
    def setExcludeComponents(value: js.Array[String]): Self = this.set("excludeComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeComponents: Self = this.set("excludeComponents", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

