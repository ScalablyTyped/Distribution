package typings.ethers.anon

import typings.ethers.typesAbiFragmentsMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayChildren extends StObject {
  
  var arrayChildren: ParamType
  
  var arrayLength: Double
}
object ArrayChildren {
  
  inline def apply(arrayChildren: ParamType, arrayLength: Double): ArrayChildren = {
    val __obj = js.Dynamic.literal(arrayChildren = arrayChildren.asInstanceOf[js.Any], arrayLength = arrayLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChildren]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayChildren] (val x: Self) extends AnyVal {
    
    inline def setArrayChildren(value: ParamType): Self = StObject.set(x, "arrayChildren", value.asInstanceOf[js.Any])
    
    inline def setArrayLength(value: Double): Self = StObject.set(x, "arrayLength", value.asInstanceOf[js.Any])
  }
}
