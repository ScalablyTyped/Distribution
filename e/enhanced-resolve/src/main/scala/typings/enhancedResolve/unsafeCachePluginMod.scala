package typings.enhancedResolve

import typings.enhancedResolve.commonTypesMod.ResolverRequest
import typings.enhancedResolve.concordMod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsafeCachePluginMod {
  
  @JSImport("enhanced-resolve/lib/UnsafeCachePlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with UnsafeCachePlugin {
    def this(
      source: String,
      filterPredicate: js.Function1[/* request */ ResolverRequest, Boolean],
      cache: Dictionary[js.Any],
      target: String
    ) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var cache: Dictionary[js.Any] = js.native
    
    /* CompleteClass */
    override def filterPredicate(request: ResolverRequest): Boolean = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var target: String = js.native
  }
  
  trait UnsafeCachePlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var cache: Dictionary[js.Any]
    
    def filterPredicate(request: ResolverRequest): Boolean
    
    var source: String
    
    var target: String
  }
  object UnsafeCachePlugin {
    
    inline def apply(
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      cache: Dictionary[js.Any],
      filterPredicate: ResolverRequest => Boolean,
      source: String,
      target: String
    ): UnsafeCachePlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), cache = cache.asInstanceOf[js.Any], filterPredicate = js.Any.fromFunction1(filterPredicate), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsafeCachePlugin]
    }
    
    extension [Self <: UnsafeCachePlugin](x: Self) {
      
      inline def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setCache(value: Dictionary[js.Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setFilterPredicate(value: ResolverRequest => Boolean): Self = StObject.set(x, "filterPredicate", js.Any.fromFunction1(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
