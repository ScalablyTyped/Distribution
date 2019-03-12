package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterFacet extends Facet {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): FilterFacet
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): FilterFacet
  /*
    Sets the filter to be used for this facet.
    */
  def filter(oFilter: js.Object): FilterFacet
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): FilterFacet
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): FilterFacet
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): FilterFacet
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): FilterFacet
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object FilterFacet {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cacheFilter: scala.Boolean => FilterFacet,
    facetFilter: js.Object => FilterFacet,
    filter: js.Object => FilterFacet,
    global: scala.Boolean => FilterFacet,
    mode: java.lang.String => FilterFacet,
    nested: java.lang.String => FilterFacet,
    scope: java.lang.String => FilterFacet,
    toJSON: () => js.Any
  ): FilterFacet = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cacheFilter = js.Any.fromFunction1(cacheFilter), facetFilter = js.Any.fromFunction1(facetFilter), filter = js.Any.fromFunction1(filter), global = js.Any.fromFunction1(global), mode = js.Any.fromFunction1(mode), nested = js.Any.fromFunction1(nested), scope = js.Any.fromFunction1(scope), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[FilterFacet]
  }
}

