package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RangeFacet extends Facet {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Adds a new bounded range.
       */
  def addRange(from: stdLib.Number, to: stdLib.Number): RangeFacet
  /*
       Adds a new unbounded lower limit.
       */
  def addUnboundedFrom(from: stdLib.Number): RangeFacet
  /*
       Adds a new unbounded upper limit.
       */
  def addUnboundedTo(to: stdLib.Number): RangeFacet
  /*
       Enables caching of the facetFilter
       */
  def cacheFilter(trueFalse: scala.Boolean): RangeFacet
  /*
       Allows you to reduce the documents used for computing facet results.
       */
  def facetFilter(oFilter: js.Object): RangeFacet
  /*
       Sets the document field to be used for the facet.
       */
  def field(fieldName: java.lang.String): RangeFacet
  /*
       Computes values across the entire index
       */
  def global(trueFalse: scala.Boolean): RangeFacet
  /*
       Allows you to specify an alternate key field to be used to compute the interval.
       */
  def keyField(fieldName: java.lang.String): RangeFacet
  /*
       Allows you modify the key field using a script. The modified value
       is then used to generate the interval.
       */
  def keyScript(scriptCode: java.lang.String): RangeFacet
  /*
       The script language being used. Currently supported values are
       javascript, groovy, and mvel.
       */
  def lang(language: java.lang.String): RangeFacet
  /*
       Sets the mode the facet will use.
  
  
       collector
       post
  
       */
  def mode(m: java.lang.String): RangeFacet
  /*
       Sets the path to the nested document if faceting against a
       nested field.
       */
  def nested(path: java.lang.String): RangeFacet
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  def params(p: js.Object): RangeFacet
  /*
       Computes values across the the specified scope
       */
  def scope(scope: java.lang.String): RangeFacet
  /*
       Retrieves the internal facet object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
  /*
       Allows you to specify an alternate value field to be used to compute statistical information.
       */
  def valueField(fieldName: java.lang.String): RangeFacet
  /*
       Allows you modify the value field using a script. The modified value
       is then used to compute the statistical data.
       */
  def valueScript(scriptCode: java.lang.String): RangeFacet
}

