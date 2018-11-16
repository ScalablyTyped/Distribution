package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "StatisticalFacet")
@js.native
class StatisticalFacet protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet {
  /*
       A facet which returns statistical information about a numeric field
       */
  def this(name: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Enables caching of the facetFilter
       */
  /* CompleteClass */
  override def cacheFilter(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Allows you to reduce the documents used for computing facet results.
       */
  /* CompleteClass */
  override def facetFilter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Sets the field to be used to construct the this facet.
       */
  /* CompleteClass */
  override def field(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Aggregate statistical info across a set of fields.
       */
  /* CompleteClass */
  override def fields(aFieldName: js.Array[_]): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Computes values across the entire index
       */
  /* CompleteClass */
  override def global(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       The script language being used. Currently supported values are
       javascript, groovy, and mvel.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Sets the mode the facet will use.
  
  
       collector
       post
  
       */
  /* CompleteClass */
  override def mode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Sets the path to the nested document if faceting against a
       nested field.
       */
  /* CompleteClass */
  override def nested(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Allows you to set script parameters to be used during the execution of the script.
       */
  /* CompleteClass */
  override def params(oParams: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Computes values across the the specified scope
       */
  /* CompleteClass */
  override def scope(scope: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Define a script to evaluate of which the result will be used to generate
       the statistical information.
       */
  /* CompleteClass */
  override def script(code: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.StatisticalFacet = js.native
  /*
       Retrieves the internal facet object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

