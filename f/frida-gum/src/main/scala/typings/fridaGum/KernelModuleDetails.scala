package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelModuleDetails extends StObject {
  
  /**
    * Base address.
    */
  var base: UInt64 = js.native
  
  /**
    * Canonical module name.
    */
  var name: String = js.native
  
  /**
    * Size in bytes.
    */
  var size: Double = js.native
}
object KernelModuleDetails {
  
  @scala.inline
  def apply(base: UInt64, name: String, size: Double): KernelModuleDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelModuleDetails]
  }
  
  @scala.inline
  implicit class KernelModuleDetailsMutableBuilder[Self <: KernelModuleDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: UInt64): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
