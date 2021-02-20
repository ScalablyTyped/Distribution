package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryScanMatch extends StObject {
  
  /**
    * Memory address where a match was found.
    */
  var address: NativePointer = js.native
  
  /**
    * Size of this match.
    */
  var size: Double = js.native
}
object MemoryScanMatch {
  
  @scala.inline
  def apply(address: NativePointer, size: Double): MemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryScanMatch]
  }
  
  @scala.inline
  implicit class MemoryScanMatchMutableBuilder[Self <: MemoryScanMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
