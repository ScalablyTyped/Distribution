package typings.fossilDelta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait VerifyChecksum extends StObject {
    
    var verifyChecksum: Boolean
  }
  object VerifyChecksum {
    
    inline def apply(verifyChecksum: Boolean): VerifyChecksum = {
      val __obj = js.Dynamic.literal(verifyChecksum = verifyChecksum.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyChecksum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyChecksum] (val x: Self) extends AnyVal {
      
      inline def setVerifyChecksum(value: Boolean): Self = StObject.set(x, "verifyChecksum", value.asInstanceOf[js.Any])
    }
  }
}
