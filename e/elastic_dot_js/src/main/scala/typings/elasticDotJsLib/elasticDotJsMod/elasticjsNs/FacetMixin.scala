package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetMixin extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): FacetMixin
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): FacetMixin
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): FacetMixin
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): FacetMixin
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): FacetMixin
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): FacetMixin
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object FacetMixin {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cacheFilter: scala.Boolean => FacetMixin,
    facetFilter: js.Object => FacetMixin,
    global: scala.Boolean => FacetMixin,
    mode: java.lang.String => FacetMixin,
    nested: java.lang.String => FacetMixin,
    scope: java.lang.String => FacetMixin,
    toJSON: () => js.Any
  ): FacetMixin = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cacheFilter = js.Any.fromFunction1(cacheFilter), facetFilter = js.Any.fromFunction1(facetFilter), global = js.Any.fromFunction1(global), mode = js.Any.fromFunction1(mode), nested = js.Any.fromFunction1(nested), scope = js.Any.fromFunction1(scope), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[FacetMixin]
  }
}

