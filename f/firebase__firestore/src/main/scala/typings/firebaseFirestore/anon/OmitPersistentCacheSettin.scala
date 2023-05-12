package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@firebase/firestore.@firebase/firestore/dist/packages/firestore/src/api/cache_config.PersistentCacheSettings, 'tabManager'> */
trait OmitPersistentCacheSettin extends StObject {
  
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
}
object OmitPersistentCacheSettin {
  
  inline def apply(): OmitPersistentCacheSettin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPersistentCacheSettin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitPersistentCacheSettin] (val x: Self) extends AnyVal {
    
    inline def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeBytesUndefined: Self = StObject.set(x, "cacheSizeBytes", js.undefined)
  }
}
