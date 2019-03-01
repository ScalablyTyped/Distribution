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
    _type: js.Function0[java.lang.String],
    cacheFilter: js.Function1[scala.Boolean, FilterFacet],
    facetFilter: js.Function1[js.Object, FilterFacet],
    filter: js.Function1[js.Object, FilterFacet],
    global: js.Function1[scala.Boolean, FilterFacet],
    mode: js.Function1[java.lang.String, FilterFacet],
    nested: js.Function1[java.lang.String, FilterFacet],
    scope: js.Function1[java.lang.String, FilterFacet],
    toJSON: js.Function0[js.Any]
  ): FilterFacet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cacheFilter")(cacheFilter)
    __obj.updateDynamic("facetFilter")(facetFilter)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("global")(global)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("nested")(nested)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[FilterFacet]
  }
}

