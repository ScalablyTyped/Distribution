package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X86BaseOperand extends StObject {
  
  var access: OperandAccess
  
  var size: Double
}
object X86BaseOperand {
  
  inline def apply(access: OperandAccess, size: Double): X86BaseOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86BaseOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X86BaseOperand] (val x: Self) extends AnyVal {
    
    inline def setAccess(value: OperandAccess): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
