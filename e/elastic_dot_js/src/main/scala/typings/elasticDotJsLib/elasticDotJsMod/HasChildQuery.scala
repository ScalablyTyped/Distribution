package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "HasChildQuery")
@js.native
class HasChildQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildQuery {
  /*
    Returns results that have child documents matching the query.
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
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildQuery = js.native
  /*
    Sets the query
    */
  /* CompleteClass */
  override def query(q: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildQuery = js.native
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the child documents.
    */
  /* CompleteClass */
  override def scope(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildQuery = js.native
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    max - the highest score of all matched child documents is used
    sum - the sum the all the matched child documents is used
    avg - the average of all matched child documents is used
    */
  /* CompleteClass */
  override def scoreMode(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildQuery = js.native
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    max - the highest score of all matched child documents is used
    sum - the sum the all the matched child documents is used
    avg - the average of all matched child documents is used
    */
  /* CompleteClass */
  override def scoreType(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildQuery = js.native
  /*
    Sets the cutoff value to short circuit processing.
    */
  /* CompleteClass */
  override def shortCircuitCutoff(cutoff: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildQuery = js.native
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
  override def `type`(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildQuery = js.native
}

