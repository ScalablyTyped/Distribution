package typings.fingerprintjs2

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeIE extends js.Object {
  var excludeIE: Boolean
  var sortPluginsFor: js.Array[RegExp]
}

object Anon_ExcludeIE {
  @scala.inline
  def apply(excludeIE: Boolean, sortPluginsFor: js.Array[RegExp]): Anon_ExcludeIE = {
    val __obj = js.Dynamic.literal(excludeIE = excludeIE, sortPluginsFor = sortPluginsFor)
  
    __obj.asInstanceOf[Anon_ExcludeIE]
  }
}

