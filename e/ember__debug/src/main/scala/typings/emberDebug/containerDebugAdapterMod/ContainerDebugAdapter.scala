package typings.emberDebug.containerDebugAdapterMod

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDebugAdapter extends Object {
  var resolver: typings.emberEngine.resolverMod.default
  def canCatalogEntriesByType(`type`: String): Boolean
  def catalogEntriesByType(`type`: String): js.Array[String]
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
}

