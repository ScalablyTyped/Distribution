package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelModuleDetails extends StObject {
  
  /**
    * Base address.
    */
  var base: UInt64
  
  /**
    * Canonical module name.
    */
  var name: String
  
  /**
    * Size in bytes.
    */
  var size: Double
}
object KernelModuleDetails {
  
  inline def apply(base: UInt64, name: String, size: Double): KernelModuleDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelModuleDetails]
  }
  
  extension [Self <: KernelModuleDetails](x: Self) {
    
    inline def setBase(value: UInt64): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
