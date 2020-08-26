package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackgroundColorsResponse extends js.Object {
  /**
    * The range of background colors behind this element, if it contains any visible text. If no
    * visible text is present, this will be undefined. In the case of a flat background color,
    * this will consist of simply that color. In the case of a gradient, this will consist of each
    * of the color stops. For anything more complicated, this will be an empty array. Images will
    * be ignored (as if the image had failed to load).
    */
  var backgroundColors: js.UndefOr[js.Array[String]] = js.native
  /**
    * The computed font size for this node, as a CSS computed value string (e.g. '12px').
    */
  var computedFontSize: js.UndefOr[String] = js.native
  /**
    * The computed font weight for this node, as a CSS computed value string (e.g. 'normal' or
    * '100').
    */
  var computedFontWeight: js.UndefOr[String] = js.native
}

object GetBackgroundColorsResponse {
  @scala.inline
  def apply(): GetBackgroundColorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundColorsResponse]
  }
  @scala.inline
  implicit class GetBackgroundColorsResponseOps[Self <: GetBackgroundColorsResponse] (val x: Self) extends AnyVal {
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
    def setBackgroundColorsVarargs(value: String*): Self = this.set("backgroundColors", js.Array(value :_*))
    @scala.inline
    def setBackgroundColors(value: js.Array[String]): Self = this.set("backgroundColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColors: Self = this.set("backgroundColors", js.undefined)
    @scala.inline
    def setComputedFontSize(value: String): Self = this.set("computedFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputedFontSize: Self = this.set("computedFontSize", js.undefined)
    @scala.inline
    def setComputedFontWeight(value: String): Self = this.set("computedFontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputedFontWeight: Self = this.set("computedFontWeight", js.undefined)
  }
  
}

