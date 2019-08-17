package typings.atEmberDebug.containerDashDebugDashAdapterMod

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDebugAdapter extends Object {
  var resolver: typings.atEmberEngine.dashPrivateResolverMod.default
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
    resolver: typings.atEmberEngine.dashPrivateResolverMod.default
  ): ContainerDebugAdapter = {
    val __obj = js.Dynamic.literal(canCatalogEntriesByType = js.Any.fromFunction1(canCatalogEntriesByType), catalogEntriesByType = js.Any.fromFunction1(catalogEntriesByType), constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resolver = resolver)
  
    __obj.asInstanceOf[ContainerDebugAdapter]
  }
}

