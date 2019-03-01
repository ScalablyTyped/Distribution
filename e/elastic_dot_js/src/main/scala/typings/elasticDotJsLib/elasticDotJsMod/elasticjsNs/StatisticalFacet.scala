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
    _type: js.Function0[java.lang.String],
    cacheFilter: js.Function1[scala.Boolean, StatisticalFacet],
    facetFilter: js.Function1[js.Object, StatisticalFacet],
    field: js.Function1[java.lang.String, StatisticalFacet],
    fields: js.Function1[js.Array[_], StatisticalFacet],
    global: js.Function1[scala.Boolean, StatisticalFacet],
    lang: js.Function1[java.lang.String, StatisticalFacet],
    mode: js.Function1[java.lang.String, StatisticalFacet],
    nested: js.Function1[java.lang.String, StatisticalFacet],
    params: js.Function1[js.Object, StatisticalFacet],
    scope: js.Function1[java.lang.String, StatisticalFacet],
    script: js.Function1[java.lang.String, StatisticalFacet],
    toJSON: js.Function0[js.Any]
  ): StatisticalFacet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cacheFilter")(cacheFilter)
    __obj.updateDynamic("facetFilter")(facetFilter)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("global")(global)
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("nested")(nested)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("script")(script)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[StatisticalFacet]
  }
}

