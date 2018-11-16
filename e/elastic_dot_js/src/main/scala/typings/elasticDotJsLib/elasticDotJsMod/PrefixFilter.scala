package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "PrefixFilter")
@js.native
class PrefixFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.PrefixFilter {
  /*
       Filters documents that have fields containing terms with a specified prefix.
       */
  def this(fieldName: java.lang.String, prefix: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Enable or disable caching of the filter
       */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PrefixFilter = js.native
  /*
       Sets the cache key.
       */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PrefixFilter = js.native
  /*
       Returns the field name used to create this object.
       */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PrefixFilter = js.native
  /*
       Sets the filter name.
       */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PrefixFilter = js.native
  /*
       Sets the prefix to search for.
       */
  /* CompleteClass */
  override def prefix(value: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PrefixFilter = js.native
  /*
       Returns the filter object.
       */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PrefixFilter = js.native
}

