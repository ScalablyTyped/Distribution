package typings.fsExtra.anon

import typings.fsExtra.fsExtraStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var encoding: buffer
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(encoding = "buffer")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
