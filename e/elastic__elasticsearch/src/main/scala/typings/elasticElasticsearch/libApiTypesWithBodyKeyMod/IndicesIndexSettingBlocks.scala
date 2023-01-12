package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexSettingBlocks extends StObject {
  
  var metadata: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[Boolean] = js.undefined
  
  var read_only: js.UndefOr[Boolean] = js.undefined
  
  var read_only_allow_delete: js.UndefOr[Boolean] = js.undefined
  
  var write: js.UndefOr[Boolean | String] = js.undefined
}
object IndicesIndexSettingBlocks {
  
  inline def apply(): IndicesIndexSettingBlocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexSettingBlocks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexSettingBlocks] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setRead_only(value: Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
    
    inline def setRead_onlyUndefined: Self = StObject.set(x, "read_only", js.undefined)
    
    inline def setRead_only_allow_delete(value: Boolean): Self = StObject.set(x, "read_only_allow_delete", value.asInstanceOf[js.Any])
    
    inline def setRead_only_allow_deleteUndefined: Self = StObject.set(x, "read_only_allow_delete", js.undefined)
    
    inline def setWrite(value: Boolean | String): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
