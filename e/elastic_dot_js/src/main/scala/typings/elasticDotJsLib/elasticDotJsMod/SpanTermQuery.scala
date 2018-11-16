package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanTermQuery")
@js.native
class SpanTermQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanTermQuery {
  /*
       Matches spans containing a term
       */
  def this(field: java.lang.String, value: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanTermQuery = js.native
  /*
       Sets the field to query against.
       */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanTermQuery = js.native
  /*
       Sets the term.
       */
  /* CompleteClass */
  override def term(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanTermQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

