package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryExpression extends js.Object {
  
  /**
    * Computed length of media query expression (if applicable).
    */
  var computedLength: js.UndefOr[Double] = js.native
  
  /**
    * Media query expression feature.
    */
  var feature: String = js.native
  
  /**
    * Media query expression units.
    */
  var unit: String = js.native
  
  /**
    * Media query expression value.
    */
  var value: Double = js.native
  
  /**
    * The associated range of the value text in the enclosing stylesheet (if available).
    */
  var valueRange: js.UndefOr[SourceRange] = js.native
}
object MediaQueryExpression {
  
  @scala.inline
  def apply(feature: String, unit: String, value: Double): MediaQueryExpression = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryExpression]
  }
  
  @scala.inline
  implicit class MediaQueryExpressionOps[Self <: MediaQueryExpression] (val x: Self) extends AnyVal {
    
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
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedLength(value: Double): Self = this.set("computedLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputedLength: Self = this.set("computedLength", js.undefined)
    
    @scala.inline
    def setValueRange(value: SourceRange): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
  }
}
