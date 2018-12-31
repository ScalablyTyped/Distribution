package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermStatsFacet")
@js.native
class TermStatsFacet protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet {
  /*
    A facet which computes statistical data based on an aggregate key.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Allows you to return all terms, even if the frequency count is 0. This should not be
    used on fields that contain a large number of unique terms because it could cause
    out-of-memory errors.
    */
  /* CompleteClass */
  override def allTerms(trueFalse: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Enables caching of the facetFilter
    */
  /* CompleteClass */
  override def cacheFilter(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  /* CompleteClass */
  override def facetFilter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Computes values across the entire index
    */
  /* CompleteClass */
  override def global(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Sets the field which will be used to pivot on (group-by).
    */
  /* CompleteClass */
  override def keyField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  /* CompleteClass */
  override def mode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  /* CompleteClass */
  override def nested(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Sets the type of ordering that will be performed on the date
    buckets.  Valid values are:
    count - default, sort by the number of items in the bucket
    term - sort by term value.
    reverse_count - reverse sort of the number of items in the bucket
    reverse_term - reverse sort of the term value.
    total - sorts by the total value of the bucket contents
    reverse_total - reverse sort of the total value of bucket contents
    min - the minimum value in the bucket
    reverse_min - the reverse sort of the minimum value
    max - the maximum value in the bucket
    reverse_max - the reverse sort of the maximum value
    mean - the mean value of the bucket contents
    reverse_mean - the reverse sort of the mean value of bucket contents.
    */
  /* CompleteClass */
  override def order(o: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Allows you to set script parameters to be used during the execution of the script.
    */
  /* CompleteClass */
  override def params(oParams: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Computes values across the the specified scope
    */
  /* CompleteClass */
  override def scope(scope: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Sets a script that will provide the terms for a given document.
    */
  /* CompleteClass */
  override def scriptField(script: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Sets the number of facet entries that will be returned for this facet. For instance, you
    might ask for only the top 5 aggregate keys although there might be hundreds of
    unique keys. Higher settings could cause memory strain.
    */
  /* CompleteClass */
  override def size(facetSize: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
    Sets the field for which statistical information will be generated.
    */
  /* CompleteClass */
  override def valueField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
  /*
    Define a script to evaluate of which the result will be used to generate
    the statistical information.
    */
  /* CompleteClass */
  override def valueScript(code: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermStatsFacet = js.native
}

