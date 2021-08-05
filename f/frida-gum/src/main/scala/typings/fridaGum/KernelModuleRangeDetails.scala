package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelModuleRangeDetails extends StObject {
  
  /**
    * Base address.
    */
  var base: UInt64
  
  /**
    * Name.
    */
  var name: String
  
  /**
    * Protection.
    */
  var protection: PageProtection
  
  /**
    * Size in bytes.
    */
  var size: Double
}
object KernelModuleRangeDetails {
  
  inline def apply(base: UInt64, name: String, protection: PageProtection, size: Double): KernelModuleRangeDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelModuleRangeDetails]
  }
  
  extension [Self <: KernelModuleRangeDetails](x: Self) {
    
    inline def setBase(value: UInt64): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtection(value: PageProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
