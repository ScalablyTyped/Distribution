package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "NestedFilter")
@js.native
class NestedFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter {
  /*
       Constructs a filter that is capable of executing a filter against objects
       nested within a document.
       */
  def this(path: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value of the nested Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       Enable or disable caching of the filter
       */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       Sets the cache key.
       */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       Sets the nested filter to be executed.
       */
  /* CompleteClass */
  override def filter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       If the nested query should be "joined" with the parent document.
       Defaults to false.
       */
  /* CompleteClass */
  override def join(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       Sets the filter name.
       */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       Sets the root context for the nested filter.
       */
  /* CompleteClass */
  override def path(p: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       Sets the nested query to be executed.
       */
  /* CompleteClass */
  override def query(oQuery: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       Sets the scope of the filter.  A scope allows to run facets on the
       same scope name that will work against the nested documents.
       */
  /* CompleteClass */
  override def scope(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
  /*
       Returns the filter object.
       */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NestedFilter = js.native
}

