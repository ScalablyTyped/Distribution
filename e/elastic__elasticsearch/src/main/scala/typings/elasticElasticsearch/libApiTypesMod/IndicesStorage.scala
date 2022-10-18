package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStorage extends StObject {
  
  var allow_mmap: js.UndefOr[Boolean] = js.undefined
  
  var `type`: IndicesStorageType
}
object IndicesStorage {
  
  inline def apply(`type`: IndicesStorageType): IndicesStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStorage]
  }
  
  extension [Self <: IndicesStorage](x: Self) {
    
    inline def setAllow_mmap(value: Boolean): Self = StObject.set(x, "allow_mmap", value.asInstanceOf[js.Any])
    
    inline def setAllow_mmapUndefined: Self = StObject.set(x, "allow_mmap", js.undefined)
    
    inline def setType(value: IndicesStorageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
