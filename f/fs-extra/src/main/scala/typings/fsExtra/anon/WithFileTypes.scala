package typings.fsExtra.anon

import typings.fsExtra.fsExtraBooleans.`false`
import typings.fsExtra.fsExtraStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithFileTypes extends StObject {
  
  var encoding: buffer
  
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}
object WithFileTypes {
  
  inline def apply(): WithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = "buffer")
    __obj.asInstanceOf[WithFileTypes]
  }
  
  extension [Self <: WithFileTypes](x: Self) {
    
    inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
