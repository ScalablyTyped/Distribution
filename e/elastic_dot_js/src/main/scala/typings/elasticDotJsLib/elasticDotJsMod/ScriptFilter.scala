package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ScriptFilter")
@js.native
class ScriptFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptFilter {
  /*
       A filter allowing to define scripts as filters.
       */
  def this(script: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Enable or disable caching of the filter
       */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptFilter = js.native
  /*
       Sets the cache key.
       */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptFilter = js.native
  /*
       Sets the script language.
       */
  /* CompleteClass */
  override def lang(lang: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptFilter = js.native
  /*
       Sets the filter name.
       */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptFilter = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptFilter = js.native
  /*
       Sets the script.
       */
  /* CompleteClass */
  override def script(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptFilter = js.native
  /*
       Returns the filter object.
       */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptFilter = js.native
}

