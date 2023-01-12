package typings.fsExtra.mod

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOptions extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | String] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
  
  var fs: js.UndefOr[js.Object] = js.undefined
  
  var reviver: js.UndefOr[Any] = js.undefined
  
  var throws: js.UndefOr[Boolean] = js.undefined
}
object ReadOptions {
  
  inline def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: BufferEncoding | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setFs(value: js.Object): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setReviver(value: Any): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
    
    inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    
    inline def setThrows(value: Boolean): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
    
    inline def setThrowsUndefined: Self = StObject.set(x, "throws", js.undefined)
  }
}
