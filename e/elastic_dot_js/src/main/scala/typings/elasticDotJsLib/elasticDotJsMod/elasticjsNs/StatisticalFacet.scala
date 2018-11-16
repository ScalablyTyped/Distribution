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

