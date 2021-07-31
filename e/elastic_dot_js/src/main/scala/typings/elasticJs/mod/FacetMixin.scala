package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "FacetMixin")
@js.native
class FacetMixin () extends StObject {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: Boolean): FacetMixin = js.native
  
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): FacetMixin = js.native
  
  /*
    Computes values across the entire index
    */
  def global(trueFalse: Boolean): FacetMixin = js.native
  
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: String): FacetMixin = js.native
  
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: String): FacetMixin = js.native
  
  /*
    Computes values across the the specified scope
    */
  def scope(scope: String): FacetMixin = js.native
  
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
