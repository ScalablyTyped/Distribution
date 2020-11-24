package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontVariationAxis extends js.Object {
  
  /**
    * The default value.
    */
  var defaultValue: Double = js.native
  
  /**
    * The maximum value (inclusive) the font supports for this tag.
    */
  var maxValue: Double = js.native
  
  /**
    * The minimum value (inclusive) the font supports for this tag.
    */
  var minValue: Double = js.native
  
  /**
    * Human-readable variation name in the default language (normally, "en").
    */
  var name: String = js.native
  
  /**
    * The font-variation-setting tag (a.k.a. "axis tag").
    */
  var tag: String = js.native
}
object FontVariationAxis {
  
  @scala.inline
  def apply(defaultValue: Double, maxValue: Double, minValue: Double, name: String, tag: String): FontVariationAxis = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontVariationAxis]
  }
  
  @scala.inline
  implicit class FontVariationAxisOps[Self <: FontVariationAxis] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
