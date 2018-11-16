package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "HasParentQuery")
@js.native
class HasParentQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasParentQuery {
  /*
       Returns results that have parent documents matching the query.
       */
  def this(qry: js.Object, parentType: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasParentQuery = js.native
  /*
       Sets the child document type to search against
       */
  /* CompleteClass */
  override def parentType(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasParentQuery = js.native
  /*
       Sets the query
       */
  /* CompleteClass */
  override def query(q: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasParentQuery = js.native
  /*
       Sets the scope of the query.  A scope allows to run facets on the
       same scope name that will work against the parent documents.
       */
  /* CompleteClass */
  override def scope(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasParentQuery = js.native
  /*
       Sets the scoring method.  Valid values are:
  
       none - the default, no scoring
       score - the score of the parent is used in all child documents.
       */
  /* CompleteClass */
  override def scoreMode(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasParentQuery = js.native
  /*
       Sets the scoring method.  Valid values are:
  
       none - the default, no scoring
       score - the score of the parent is used in all child documents.
       */
  /* CompleteClass */
  override def scoreType(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasParentQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

