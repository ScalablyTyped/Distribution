package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TopChildrenQuery")
@js.native
class TopChildrenQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery {
  /*
    Returns child documents matching the query aggregated into the parent docs.
    */
  def this(qry: js.Object, `type`: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery = js.native
  /*
    Sets the factor which is the number of hits that are asked for in
    the child query.  Defaults to 5.
    */
  /* CompleteClass */
  override def factor(f: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery = js.native
  /*
    Sets the incremental factor.  The incremental factor is used when not
    enough child documents are returned so the factor is multiplied by
    the incremental factor to fetch more results.  Defaults to 52
    */
  /* CompleteClass */
  override def incrementalFactor(f: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery = js.native
  /*
    Sets the query
    */
  /* CompleteClass */
  override def query(q: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery = js.native
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the child documents.
    */
  /* CompleteClass */
  override def scope(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery = js.native
  /*
    Sets the scoring type.  Valid values are max, sum, or avg. If
    another value is passed it we silently ignore the value.
    */
  /* CompleteClass */
  override def score(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery = js.native
  /*
    Sets the scoring type.  Valid values are max, sum, total, or avg.
    If another value is passed it we silently ignore the value.
    */
  /* CompleteClass */
  override def scoreMode(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
    Sets the child document type to search against
    */
  /* CompleteClass */
  override def `type`(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TopChildrenQuery = js.native
}

