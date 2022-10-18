package typings.fsExtra.anon

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var encoding: BufferEncoding | String | Null
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setEncoding(value: BufferEncoding | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
  }
}
