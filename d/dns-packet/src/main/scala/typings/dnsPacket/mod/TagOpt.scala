package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketStrings.KEY_TAG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagOpt
  extends StObject
     with GenericOpt[KEY_TAG]
     with PacketOpt {
  
  var tags: js.Array[Double]
}
object TagOpt {
  
  inline def apply(code: OptCode[KEY_TAG], tags: js.Array[Double]): TagOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOpt]
  }
  
  extension [Self <: TagOpt](x: Self) {
    
    inline def setTags(value: js.Array[Double]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Double*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
