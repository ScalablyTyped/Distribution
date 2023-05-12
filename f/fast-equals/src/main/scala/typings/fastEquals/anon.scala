package typings.fastEquals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Meta] extends StObject {
    
    var cache: js.UndefOr[typings.fastEquals.distMinTypesInternalTypesMod.Cache[Any, Any]] = js.undefined
    
    var meta: js.UndefOr[Meta] = js.undefined
  }
  object `0` {
    
    inline def apply[Meta](): `0`[Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], Meta] (val x: Self & `0`[Meta]) extends AnyVal {
      
      inline def setCache(value: typings.fastEquals.distMinTypesInternalTypesMod.Cache[Any, Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  trait Cache[Meta] extends StObject {
    
    var cache: js.UndefOr[typings.fastEquals.distCjsTypesInternalTypesMod.Cache[Any, Any]] = js.undefined
    
    var meta: js.UndefOr[Meta] = js.undefined
  }
  object Cache {
    
    inline def apply[Meta](): Cache[Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache[?], Meta] (val x: Self & Cache[Meta]) extends AnyVal {
      
      inline def setCache(value: typings.fastEquals.distCjsTypesInternalTypesMod.Cache[Any, Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  trait CacheMeta[Meta] extends StObject {
    
    var cache: js.UndefOr[typings.fastEquals.distEsmTypesInternalTypesMod.Cache[Any, Any]] = js.undefined
    
    var meta: js.UndefOr[Meta] = js.undefined
  }
  object CacheMeta {
    
    inline def apply[Meta](): CacheMeta[Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheMeta[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheMeta[?], Meta] (val x: Self & CacheMeta[Meta]) extends AnyVal {
      
      inline def setCache(value: typings.fastEquals.distEsmTypesInternalTypesMod.Cache[Any, Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
}
