package typings.fabric.fabricImplMod

import typings.fabric.fabricStrings._empty
import typings.fabric.fabricStrings.`use-credentials`
import typings.fabric.fabricStrings.anonymous
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPatternOptions extends js.Object {
  /**
    * crossOrigin value (one of "", "anonymous", "use-credentials")
    * @see https://developer.mozilla.org/en-US/docs/HTML/CORS_settings_attributes
    * @type String
    */
  var crossOrigin: js.UndefOr[_empty | anonymous | `use-credentials`] = js.native
  /**
    * Pattern horizontal offset from object's left/top corner
    */
  var offsetX: js.UndefOr[Double] = js.native
  /**
    * Pattern vertical offset from object's left/top corner
    */
  var offsetY: js.UndefOr[Double] = js.native
  /**
    * Transform matrix to change the pattern, imported from svgs
    */
  var patternTransform: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
    */
  var repeat: js.UndefOr[String] = js.native
  /**
    * The source for the pattern
    */
  var source: String | HTMLImageElement = js.native
}

object IPatternOptions {
  @scala.inline
  def apply(source: String | HTMLImageElement): IPatternOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPatternOptions]
  }
  @scala.inline
  implicit class IPatternOptionsOps[Self <: IPatternOptions] (val x: Self) extends AnyVal {
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
    def setSource(value: String | HTMLImageElement): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrossOrigin(value: _empty | anonymous | `use-credentials`): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setPatternTransformVarargs(value: Double*): Self = this.set("patternTransform", js.Array(value :_*))
    @scala.inline
    def setPatternTransform(value: js.Array[Double]): Self = this.set("patternTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternTransform: Self = this.set("patternTransform", js.undefined)
    @scala.inline
    def setRepeat(value: String): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

