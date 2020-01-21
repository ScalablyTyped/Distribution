package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ScriptFilter")
@js.native
class ScriptFilter protected () extends Filter {
  /*
    A filter allowing to define scripts as filters.
    */
  def this(script: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): ScriptFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): ScriptFilter = js.native
  /*
    Sets the script language.
    */
  def lang(lang: String): ScriptFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): ScriptFilter = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): ScriptFilter = js.native
  /*
    Sets the script.
    */
  def script(s: String): ScriptFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): ScriptFilter = js.native
}

