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

