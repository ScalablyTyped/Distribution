package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShadowOptions extends js.Object {
  /**
    * Whether the shadow should affect stroke operations
    */
  var affectStroke: js.UndefOr[Boolean] = js.native
  /**
    * Shadow blur
    */
  var blur: js.UndefOr[Double] = js.native
  /**
    * Shadow color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Indicates whether toObject should include default values
    */
  var includeDefaultValues: js.UndefOr[Boolean] = js.native
  /**
    * When `false`, the shadow will scale with the object.
    * When `true`, the shadow's offsetX, offsetY, and blur will not be affected by the object's scale.
    * default to false
    * @type Boolean
    * @default
    */
  var nonScaling: js.UndefOr[Boolean] = js.native
  /**
    * Shadow horizontal offset
    */
  var offsetX: js.UndefOr[Double] = js.native
  /**
    * Shadow vertical offset
    */
  var offsetY: js.UndefOr[Double] = js.native
}

object IShadowOptions {
  @scala.inline
  def apply(): IShadowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShadowOptions]
  }
  @scala.inline
  implicit class IShadowOptionsOps[Self <: IShadowOptions] (val x: Self) extends AnyVal {
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
    def setAffectStroke(value: Boolean): Self = this.set("affectStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffectStroke: Self = this.set("affectStroke", js.undefined)
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setIncludeDefaultValues(value: Boolean): Self = this.set("includeDefaultValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDefaultValues: Self = this.set("includeDefaultValues", js.undefined)
    @scala.inline
    def setNonScaling(value: Boolean): Self = this.set("nonScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonScaling: Self = this.set("nonScaling", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
  }
  
}

