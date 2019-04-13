package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FacetMixin")
@js.native
class FacetMixin () extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): FacetMixin = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): FacetMixin = js.native
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): FacetMixin = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): FacetMixin = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): FacetMixin = js.native
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): FacetMixin = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

