package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketStrings.PADDING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingOpt
  extends StObject
     with GenericOpt[PADDING]
     with PacketOpt {
  
  var length: js.UndefOr[Double] = js.undefined
}
object PaddingOpt {
  
  inline def apply(code: OptCode[PADDING]): PaddingOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingOpt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingOpt] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
