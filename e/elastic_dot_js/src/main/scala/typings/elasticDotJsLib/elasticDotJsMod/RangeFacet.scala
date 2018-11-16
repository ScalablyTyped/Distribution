package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RangeFacet")
@js.native
class RangeFacet protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet {
  /*
       A facet which provides information over a range of numeric intervals.
       */
  def this(name: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Adds a new bounded range.
       */
  /* CompleteClass */
  override def addRange(from: stdLib.Number, to: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Adds a new unbounded lower limit.
       */
  /* CompleteClass */
  override def addUnboundedFrom(from: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Adds a new unbounded upper limit.
       */
  /* CompleteClass */
  override def addUnboundedTo(to: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Enables caching of the facetFilter
       */
  /* CompleteClass */
  override def cacheFilter(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Allows you to reduce the documents used for computing facet results.
       */
  /* CompleteClass */
  override def facetFilter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Sets the document field to be used for the facet.
       */
  /* CompleteClass */
  override def field(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Computes values across the entire index
       */
  /* CompleteClass */
  override def global(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Allows you to specify an alternate key field to be used to compute the interval.
       */
  /* CompleteClass */
  override def keyField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Allows you modify the key field using a script. The modified value
       is then used to generate the interval.
       */
  /* CompleteClass */
  override def keyScript(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       The script language being used. Currently supported values are
       javascript, groovy, and mvel.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Sets the mode the facet will use.
  
  
       collector
       post
  
       */
  /* CompleteClass */
  override def mode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Sets the path to the nested document if faceting against a
       nested field.
       */
  /* CompleteClass */
  override def nested(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Computes values across the the specified scope
       */
  /* CompleteClass */
  override def scope(scope: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Retrieves the internal facet object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
       Allows you to specify an alternate value field to be used to compute statistical information.
       */
  /* CompleteClass */
  override def valueField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
  /*
       Allows you modify the value field using a script. The modified value
       is then used to compute the statistical data.
       */
  /* CompleteClass */
  override def valueScript(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFacet = js.native
}

