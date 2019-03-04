package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): ScriptFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): ScriptFilter
  /*
    Sets the script language.
    */
  def lang(lang: java.lang.String): ScriptFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): ScriptFilter
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): ScriptFilter
  /*
    Sets the script.
    */
  def script(s: java.lang.String): ScriptFilter
  /*
    Returns the filter object.
    */
  def toJSON(): ScriptFilter
}

object ScriptFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, ScriptFilter],
    cacheKey: js.Function1[java.lang.String, ScriptFilter],
    lang: js.Function1[java.lang.String, ScriptFilter],
    name: js.Function1[java.lang.String, ScriptFilter],
    params: js.Function1[js.Object, ScriptFilter],
    script: js.Function1[java.lang.String, ScriptFilter],
    toJSON: js.Function0[ScriptFilter]
  ): ScriptFilter = {
    val __obj = js.Dynamic.literal(_type = _type, cache = cache, cacheKey = cacheKey, lang = lang, name = name, params = params, script = script, toJSON = toJSON)
  
    __obj.asInstanceOf[ScriptFilter]
  }
}

