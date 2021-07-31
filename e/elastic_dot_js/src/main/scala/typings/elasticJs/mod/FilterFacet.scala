package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "FilterFacet")
@js.native
class FilterFacet protected ()
  extends StObject
     with Facet {
  /*
    A facet that return a count of the hits matching the given filter.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: Boolean): FilterFacet = js.native
  
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): FilterFacet = js.native
  
  /*
    Sets the filter to be used for this facet.
    */
  def filter(oFilter: js.Object): FilterFacet = js.native
  
  /*
    Computes values across the entire index
    */
  def global(trueFalse: Boolean): FilterFacet = js.native
  
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: String): FilterFacet = js.native
  
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: String): FilterFacet = js.native
  
  /*
    Computes values across the the specified scope
    */
  def scope(scope: String): FilterFacet = js.native
  
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
