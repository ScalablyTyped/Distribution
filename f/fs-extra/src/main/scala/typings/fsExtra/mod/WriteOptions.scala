package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped node.anon.ObjectEncodingOptionsAbor | node.buffer.<global>.BufferEncoding | null */ trait WriteOptions extends StObject {
  
  var EOL: js.UndefOr[String] = js.undefined
  
  var fs: js.UndefOr[js.Object] = js.undefined
  
  var replacer: js.UndefOr[Any] = js.undefined
  
  var spaces: js.UndefOr[Double | String] = js.undefined
}
object WriteOptions {
  
  inline def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  extension [Self <: WriteOptions](x: Self) {
    
    inline def setEOL(value: String): Self = StObject.set(x, "EOL", value.asInstanceOf[js.Any])
    
    inline def setEOLUndefined: Self = StObject.set(x, "EOL", js.undefined)
    
    inline def setFs(value: js.Object): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setReplacer(value: Any): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
    
    inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
    
    inline def setSpaces(value: Double | String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
  }
}
