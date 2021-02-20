package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryExpression extends StObject {
  
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
  implicit class MediaQueryExpressionMutableBuilder[Self <: MediaQueryExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputedLength(value: Double): Self = StObject.set(x, "computedLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedLengthUndefined: Self = StObject.set(x, "computedLength", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRange(value: SourceRange): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
