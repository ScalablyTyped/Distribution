package typings
package eggDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: scala.Boolean
  var defaultExtension: java.lang.String
  var defaultViewEngine: java.lang.String
  var mapping: eggLib.eggMod.PlainObject[java.lang.String]
  var root: java.lang.String
}

object Anon_Cache {
  @scala.inline
  def apply(
    cache: scala.Boolean,
    defaultExtension: java.lang.String,
    defaultViewEngine: java.lang.String,
    mapping: eggLib.eggMod.PlainObject[java.lang.String],
    root: java.lang.String
  ): Anon_Cache = {
    val __obj = js.Dynamic.literal(cache = cache, defaultExtension = defaultExtension, defaultViewEngine = defaultViewEngine, mapping = mapping, root = root)
  
    __obj.asInstanceOf[Anon_Cache]
  }
}

