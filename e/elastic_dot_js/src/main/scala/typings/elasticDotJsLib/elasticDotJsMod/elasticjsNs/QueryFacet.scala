package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFacet extends Facet {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): QueryFacet
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): QueryFacet
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): QueryFacet
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): QueryFacet
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): QueryFacet
  /*
    Sets the query to be used for this facet.
    */
  def query(oQuery: js.Object): QueryFacet
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): QueryFacet
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object QueryFacet {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cacheFilter: js.Function1[scala.Boolean, QueryFacet],
    facetFilter: js.Function1[js.Object, QueryFacet],
    global: js.Function1[scala.Boolean, QueryFacet],
    mode: js.Function1[java.lang.String, QueryFacet],
    nested: js.Function1[java.lang.String, QueryFacet],
    query: js.Function1[js.Object, QueryFacet],
    scope: js.Function1[java.lang.String, QueryFacet],
    toJSON: js.Function0[js.Any]
  ): QueryFacet = {
    val __obj = js.Dynamic.literal(_type = _type, cacheFilter = cacheFilter, facetFilter = facetFilter, global = global, mode = mode, nested = nested, query = query, scope = scope, toJSON = toJSON)
  
    __obj.asInstanceOf[QueryFacet]
  }
}

