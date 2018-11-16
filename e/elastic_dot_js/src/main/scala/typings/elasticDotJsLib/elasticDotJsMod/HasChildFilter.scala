package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "HasChildFilter")
@js.native
class HasChildFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter {
  /*
       Returns results that have child documents matching the filter.
       */
  def this(qry: js.Object, `type`: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Enable or disable caching of the filter
       */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
  /*
       Sets the cache key.
       */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
  /*
       Sets the filter
       */
  /* CompleteClass */
  override def filter(f: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
  /*
       Sets the filter name.
       */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
  /*
       Sets the query
       */
  /* CompleteClass */
  override def query(q: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
  /*
       Sets the scope of the filter.  A scope allows to run facets on the
       same scope name that will work against the child documents.
       */
  /* CompleteClass */
  override def scope(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
  /*
       Sets the cutoff value to short circuit processing.
       */
  /* CompleteClass */
  override def shortCircuitCutoff(cutoff: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
  /*
       Returns the filter object.
       */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
  /*
       Sets the child document type to search against
       */
  /* CompleteClass */
  override def `type`(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HasChildFilter = js.native
}

