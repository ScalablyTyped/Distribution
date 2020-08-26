package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeComponents extends js.Object {
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: String = js.native
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[String]] = js.native
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: Double = js.native
  // Exporting format, can be either png, or jpeg
  var `type`: String = js.native
}

object ExcludeComponents {
  @scala.inline
  def apply(backgroundColor: String, pixelRatio: Double, `type`: String): ExcludeComponents = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeComponents]
  }
  @scala.inline
  implicit class ExcludeComponentsOps[Self <: ExcludeComponents] (val x: Self) extends AnyVal {
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
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeComponentsVarargs(value: String*): Self = this.set("excludeComponents", js.Array(value :_*))
    @scala.inline
    def setExcludeComponents(value: js.Array[String]): Self = this.set("excludeComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeComponents: Self = this.set("excludeComponents", js.undefined)
  }
  
}

