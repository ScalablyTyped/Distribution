package typings.fossilDelta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait VerifyChecksum extends StObject {
    
    var verifyChecksum: Boolean = js.native
  }
  object VerifyChecksum {
    
    @scala.inline
    def apply(verifyChecksum: Boolean): VerifyChecksum = {
      val __obj = js.Dynamic.literal(verifyChecksum = verifyChecksum.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyChecksum]
    }
    
    @scala.inline
    implicit class VerifyChecksumMutableBuilder[Self <: VerifyChecksum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerifyChecksum(value: Boolean): Self = StObject.set(x, "verifyChecksum", value.asInstanceOf[js.Any])
    }
  }
}
