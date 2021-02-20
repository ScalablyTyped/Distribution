package typings.emberDebug

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerDebugAdapterMod {
  
  @JSImport("@ember/debug/container-debug-adapter", JSImport.Default)
  @js.native
  class default () extends ContainerDebugAdapter
  
  @js.native
  trait ContainerDebugAdapter extends Object {
    
    def canCatalogEntriesByType(`type`: String): Boolean = js.native
    
    def catalogEntriesByType(`type`: String): js.Array[String] = js.native
    
    var resolver: typings.emberEngine.resolverMod.default = js.native
  }
  object ContainerDebugAdapter {
    
    @scala.inline
    def apply(
      canCatalogEntriesByType: String => Boolean,
      catalogEntriesByType: String => js.Array[String],
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean,
      resolver: typings.emberEngine.resolverMod.default
    ): ContainerDebugAdapter = {
      val __obj = js.Dynamic.literal(canCatalogEntriesByType = js.Any.fromFunction1(canCatalogEntriesByType), catalogEntriesByType = js.Any.fromFunction1(catalogEntriesByType), constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resolver = resolver.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerDebugAdapter]
    }
    
    @scala.inline
    implicit class ContainerDebugAdapterMutableBuilder[Self <: ContainerDebugAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanCatalogEntriesByType(value: String => Boolean): Self = StObject.set(x, "canCatalogEntriesByType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCatalogEntriesByType(value: String => js.Array[String]): Self = StObject.set(x, "catalogEntriesByType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolver(value: typings.emberEngine.resolverMod.default): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    }
  }
}
