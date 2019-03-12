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
    _type: () => java.lang.String,
    cache: scala.Boolean => ScriptFilter,
    cacheKey: java.lang.String => ScriptFilter,
    lang: java.lang.String => ScriptFilter,
    name: java.lang.String => ScriptFilter,
    params: js.Object => ScriptFilter,
    script: java.lang.String => ScriptFilter,
    toJSON: () => ScriptFilter
  ): ScriptFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), lang = js.Any.fromFunction1(lang), name = js.Any.fromFunction1(name), params = js.Any.fromFunction1(params), script = js.Any.fromFunction1(script), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[ScriptFilter]
  }
}

