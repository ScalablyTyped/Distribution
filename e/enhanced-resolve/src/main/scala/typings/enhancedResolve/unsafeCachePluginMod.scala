package typings.enhancedResolve

import typings.enhancedResolve.commonTypesMod.ResolverRequest
import typings.enhancedResolve.concordMod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsafeCachePluginMod {
  
  @JSImport("enhanced-resolve/lib/UnsafeCachePlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends UnsafeCachePlugin {
    def this(
      source: String,
      filterPredicate: js.Function1[/* request */ ResolverRequest, Boolean],
      cache: Dictionary[_],
      target: String
    ) = this()
  }
  
  @js.native
  trait UnsafeCachePlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var cache: Dictionary[_] = js.native
    
    def filterPredicate(request: ResolverRequest): Boolean = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object UnsafeCachePlugin {
    
    @scala.inline
    def apply(
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      cache: Dictionary[_],
      filterPredicate: ResolverRequest => Boolean,
      source: String,
      target: String
    ): UnsafeCachePlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), cache = cache.asInstanceOf[js.Any], filterPredicate = js.Any.fromFunction1(filterPredicate), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsafeCachePlugin]
    }
    
    @scala.inline
    implicit class UnsafeCachePluginMutableBuilder[Self <: UnsafeCachePlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCache(value: Dictionary[_]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPredicate(value: ResolverRequest => Boolean): Self = StObject.set(x, "filterPredicate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
