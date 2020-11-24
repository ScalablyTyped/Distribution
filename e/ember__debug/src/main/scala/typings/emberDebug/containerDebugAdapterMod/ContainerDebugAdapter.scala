package typings.emberDebug.containerDebugAdapterMod

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ContainerDebugAdapterOps[Self <: ContainerDebugAdapter] (val x: Self) extends AnyVal {
    
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
    def setCanCatalogEntriesByType(value: String => Boolean): Self = this.set("canCatalogEntriesByType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCatalogEntriesByType(value: String => js.Array[String]): Self = this.set("catalogEntriesByType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolver(value: typings.emberEngine.resolverMod.default): Self = this.set("resolver", value.asInstanceOf[js.Any])
  }
}
