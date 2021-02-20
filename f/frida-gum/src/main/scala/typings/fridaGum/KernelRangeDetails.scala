package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelRangeDetails extends StObject {
  
  /**
    * Base address.
    */
  var base: UInt64 = js.native
  
  /**
    * Protection.
    */
  var protection: PageProtection = js.native
  
  /**
    * Size in bytes.
    */
  var size: Double = js.native
}
object KernelRangeDetails {
  
  @scala.inline
  def apply(base: UInt64, protection: PageProtection, size: Double): KernelRangeDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelRangeDetails]
  }
  
  @scala.inline
  implicit class KernelRangeDetailsMutableBuilder[Self <: KernelRangeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: UInt64): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection(value: PageProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
