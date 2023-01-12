package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeDetails extends StObject {
  
  /**
    * Base address.
    */
  var base: NativePointer
  
  /**
    * File mapping details, if available.
    */
  var file: js.UndefOr[FileMapping] = js.undefined
  
  /**
    * Protection.
    */
  var protection: PageProtection
  
  /**
    * Size in bytes.
    */
  var size: Double
}
object RangeDetails {
  
  inline def apply(base: NativePointer, protection: PageProtection, size: Double): RangeDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeDetails] (val x: Self) extends AnyVal {
    
    inline def setBase(value: NativePointer): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setFile(value: FileMapping): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setProtection(value: PageProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
