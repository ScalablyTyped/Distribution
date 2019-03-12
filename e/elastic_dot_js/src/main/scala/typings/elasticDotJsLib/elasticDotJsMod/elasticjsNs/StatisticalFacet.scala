package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatisticalFacet extends Facet {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): StatisticalFacet
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): StatisticalFacet
  /*
    Sets the field to be used to construct the this facet.
    */
  def field(fieldName: java.lang.String): StatisticalFacet
  /*
    Aggregate statistical info across a set of fields.
    */
  def fields(aFieldName: js.Array[_]): StatisticalFacet
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): StatisticalFacet
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: java.lang.String): StatisticalFacet
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): StatisticalFacet
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): StatisticalFacet
  /*
    Allows you to set script parameters to be used during the execution of the script.
    */
  def params(oParams: js.Object): StatisticalFacet
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): StatisticalFacet
  /*
    Define a script to evaluate of which the result will be used to generate
    the statistical information.
    */
  def script(code: java.lang.String): StatisticalFacet
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object StatisticalFacet {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cacheFilter: scala.Boolean => StatisticalFacet,
    facetFilter: js.Object => StatisticalFacet,
    field: java.lang.String => StatisticalFacet,
    fields: js.Array[_] => StatisticalFacet,
    global: scala.Boolean => StatisticalFacet,
    lang: java.lang.String => StatisticalFacet,
    mode: java.lang.String => StatisticalFacet,
    nested: java.lang.String => StatisticalFacet,
    params: js.Object => StatisticalFacet,
    scope: java.lang.String => StatisticalFacet,
    script: java.lang.String => StatisticalFacet,
    toJSON: () => js.Any
  ): StatisticalFacet = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cacheFilter = js.Any.fromFunction1(cacheFilter), facetFilter = js.Any.fromFunction1(facetFilter), field = js.Any.fromFunction1(field), fields = js.Any.fromFunction1(fields), global = js.Any.fromFunction1(global), lang = js.Any.fromFunction1(lang), mode = js.Any.fromFunction1(mode), nested = js.Any.fromFunction1(nested), params = js.Any.fromFunction1(params), scope = js.Any.fromFunction1(scope), script = js.Any.fromFunction1(script), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[StatisticalFacet]
  }
}

