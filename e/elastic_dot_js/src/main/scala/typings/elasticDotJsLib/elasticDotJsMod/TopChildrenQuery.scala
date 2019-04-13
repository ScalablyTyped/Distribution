package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TopChildrenQuery")
@js.native
class TopChildrenQuery protected () extends Query {
  /*
    Returns child documents matching the query aggregated into the parent docs.
    */
  def this(qry: js.Object, `type`: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): TopChildrenQuery = js.native
  /*
    Sets the factor which is the number of hits that are asked for in
    the child query.  Defaults to 5.
    */
  def factor(f: scala.Double): TopChildrenQuery = js.native
  /*
    Sets the incremental factor.  The incremental factor is used when not
    enough child documents are returned so the factor is multiplied by
    the incremental factor to fetch more results.  Defaults to 52
    */
  def incrementalFactor(f: scala.Double): TopChildrenQuery = js.native
  /*
    Sets the query
    */
  def query(q: js.Object): TopChildrenQuery = js.native
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the child documents.
    */
  def scope(s: java.lang.String): TopChildrenQuery = js.native
  /*
    Sets the scoring type.  Valid values are max, sum, or avg. If
    another value is passed it we silently ignore the value.
    */
  def score(s: java.lang.String): TopChildrenQuery = js.native
  /*
    Sets the scoring type.  Valid values are max, sum, total, or avg.
    If another value is passed it we silently ignore the value.
    */
  def scoreMode(s: java.lang.String): TopChildrenQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Sets the child document type to search against
    */
  def `type`(t: java.lang.String): TopChildrenQuery = js.native
}

