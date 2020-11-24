package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "TopChildrenQuery")
@js.native
class TopChildrenQuery protected () extends Query {
  /*
    Returns child documents matching the query aggregated into the parent docs.
    */
  def this(qry: js.Object, `type`: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): TopChildrenQuery = js.native
  
  /*
    Sets the factor which is the number of hits that are asked for in
    the child query.  Defaults to 5.
    */
  def factor(f: Double): TopChildrenQuery = js.native
  
  /*
    Sets the incremental factor.  The incremental factor is used when not
    enough child documents are returned so the factor is multiplied by
    the incremental factor to fetch more results.  Defaults to 52
    */
  def incrementalFactor(f: Double): TopChildrenQuery = js.native
  
  /*
    Sets the query
    */
  def query(q: js.Object): TopChildrenQuery = js.native
  
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the child documents.
    */
  def scope(s: String): TopChildrenQuery = js.native
  
  /*
    Sets the scoring type.  Valid values are max, sum, or avg. If
    another value is passed it we silently ignore the value.
    */
  def score(s: String): TopChildrenQuery = js.native
  
  /*
    Sets the scoring type.  Valid values are max, sum, total, or avg.
    If another value is passed it we silently ignore the value.
    */
  def scoreMode(s: String): TopChildrenQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Sets the child document type to search against
    */
  def `type`(t: String): TopChildrenQuery = js.native
}
