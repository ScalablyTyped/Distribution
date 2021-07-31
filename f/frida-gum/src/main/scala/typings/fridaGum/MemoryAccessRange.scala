package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryAccessRange extends StObject {
  
  /**
    * Base address.
    */
  var base: NativePointer
  
  /**
    * Size in bytes.
    */
  var size: Double
}
object MemoryAccessRange {
  
  @scala.inline
  def apply(base: NativePointer, size: Double): MemoryAccessRange = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryAccessRange]
  }
  
  @scala.inline
  implicit class MemoryAccessRangeMutableBuilder[Self <: MemoryAccessRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: NativePointer): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
