package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "StatisticalFacet")
@js.native
class StatisticalFacet protected () extends Facet {
  /*
    A facet which returns statistical information about a numeric field
    */
  def this(name: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: Boolean): StatisticalFacet = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): StatisticalFacet = js.native
  /*
    Sets the field to be used to construct the this facet.
    */
  def field(fieldName: String): StatisticalFacet = js.native
  /*
    Aggregate statistical info across a set of fields.
    */
  def fields(aFieldName: js.Array[_]): StatisticalFacet = js.native
  /*
    Computes values across the entire index
    */
  def global(trueFalse: Boolean): StatisticalFacet = js.native
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: String): StatisticalFacet = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: String): StatisticalFacet = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: String): StatisticalFacet = js.native
  /*
    Allows you to set script parameters to be used during the execution of the script.
    */
  def params(oParams: js.Object): StatisticalFacet = js.native
  /*
    Computes values across the the specified scope
    */
  def scope(scope: String): StatisticalFacet = js.native
  /*
    Define a script to evaluate of which the result will be used to generate
    the statistical information.
    */
  def script(code: String): StatisticalFacet = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

