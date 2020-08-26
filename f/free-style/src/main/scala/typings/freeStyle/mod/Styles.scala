package typings.freeStyle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styles
  extends /* selector */ StringDictionary[js.UndefOr[Null | PropertyValue | js.Array[PropertyValue] | Styles]] {
  @JSName("$displayName")
  var $displayName: js.UndefOr[String] = js.native
  @JSName("$unique")
  var $unique: js.UndefOr[Boolean] = js.native
}

object Styles {
  @scala.inline
  def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
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
    def set$displayName(value: String): Self = this.set("$displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$displayName: Self = this.set("$displayName", js.undefined)
    @scala.inline
    def set$unique(value: Boolean): Self = this.set("$unique", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$unique: Self = this.set("$unique", js.undefined)
  }
  
}

