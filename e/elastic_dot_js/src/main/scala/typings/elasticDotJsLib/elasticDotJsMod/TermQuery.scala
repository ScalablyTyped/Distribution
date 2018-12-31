package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermQuery")
@js.native
class TermQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermQuery {
  /*
    A Query that matches documents containing a term. This may be
    combined with other terms with a BooleanQuery.
    */
  def this(field: java.lang.String, term: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  /* CompleteClass */
  override def boost(boost: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermQuery = js.native
  /*
    Sets the fields to query against.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermQuery = js.native
  /*
    Sets the term.
    */
  /* CompleteClass */
  override def term(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

