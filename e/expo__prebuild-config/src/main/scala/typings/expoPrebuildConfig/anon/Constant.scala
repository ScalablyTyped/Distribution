package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.interfaceBuilderMod.ConstraintAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constant extends StObject {
  
  var constant: js.UndefOr[Double] = js.undefined
  
  var firstAttribute: ConstraintAttribute
  
  var firstItem: String
  
  var id: String
  
  var secondAttribute: ConstraintAttribute
  
  var secondItem: String
}
object Constant {
  
  inline def apply(
    firstAttribute: ConstraintAttribute,
    firstItem: String,
    id: String,
    secondAttribute: ConstraintAttribute,
    secondItem: String
  ): Constant = {
    val __obj = js.Dynamic.literal(firstAttribute = firstAttribute.asInstanceOf[js.Any], firstItem = firstItem.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], secondAttribute = secondAttribute.asInstanceOf[js.Any], secondItem = secondItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constant]
  }
  
  extension [Self <: Constant](x: Self) {
    
    inline def setConstant(value: Double): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
    
    inline def setFirstAttribute(value: ConstraintAttribute): Self = StObject.set(x, "firstAttribute", value.asInstanceOf[js.Any])
    
    inline def setFirstItem(value: String): Self = StObject.set(x, "firstItem", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSecondAttribute(value: ConstraintAttribute): Self = StObject.set(x, "secondAttribute", value.asInstanceOf[js.Any])
    
    inline def setSecondItem(value: String): Self = StObject.set(x, "secondItem", value.asInstanceOf[js.Any])
  }
}
