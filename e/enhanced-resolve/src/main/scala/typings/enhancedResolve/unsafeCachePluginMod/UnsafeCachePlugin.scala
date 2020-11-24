package typings.enhancedResolve.unsafeCachePluginMod

import typings.enhancedResolve.commonTypesMod.ResolverRequest
import typings.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsafeCachePlugin extends js.Object {
  
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
  implicit class UnsafeCachePluginOps[Self <: UnsafeCachePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCache(value: Dictionary[_]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPredicate(value: ResolverRequest => Boolean): Self = this.set("filterPredicate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
