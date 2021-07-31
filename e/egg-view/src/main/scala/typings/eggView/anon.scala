package typings.eggView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cache extends StObject {
    
    var cache: Boolean
    
    var defaultExtension: String
    
    var defaultViewEngine: String
    
    var mapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any
    
    var root: String
  }
  object Cache {
    
    @scala.inline
    def apply(
      cache: Boolean,
      defaultExtension: String,
      defaultViewEngine: String,
      mapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any,
      root: String
    ): Cache = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], defaultExtension = defaultExtension.asInstanceOf[js.Any], defaultViewEngine = defaultViewEngine.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExtension(value: String): Self = StObject.set(x, "defaultExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewEngine(value: String): Self = StObject.set(x, "defaultViewEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapping(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any
      ): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
