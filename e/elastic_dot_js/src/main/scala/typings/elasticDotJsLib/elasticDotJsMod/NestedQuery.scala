package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "NestedQuery")
@js.native
class NestedQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedQuery {
  /*
       Constructs a query that is capable of executing a search against objects
       nested within a document.
       */
  def this(path: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedQuery = js.native
  /*
       Sets the nested filter to be executed.
       */
  /* CompleteClass */
  override def filter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedQuery = js.native
  /*
       Sets the root context for the nested query.
       */
  /* CompleteClass */
  override def path(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedQuery = js.native
  /*
       Sets the nested query to be executed.
       */
  /* CompleteClass */
  override def query(oQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedQuery = js.native
  /*
       Sets the scope of the query.  A scope allows to run facets on the
       same scope name that will work against the nested documents.
       */
  /* CompleteClass */
  override def scope(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedQuery = js.native
  /*
       Sets how the inner (nested) matches affect scoring on the parent document.
       */
  /* CompleteClass */
  override def scoreMode(mode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

