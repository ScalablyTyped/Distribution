package typings
package globDashBaseLib.globDashBaseMod.globbaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobBaseResult extends js.Object {
  var base: java.lang.String
  var glob: java.lang.String
  var isGlob: scala.Boolean
}

object GlobBaseResult {
  @scala.inline
  def apply(base: java.lang.String, glob: java.lang.String, isGlob: scala.Boolean): GlobBaseResult = {
    val __obj = js.Dynamic.literal(base = base, glob = glob, isGlob = isGlob)
  
    __obj.asInstanceOf[GlobBaseResult]
  }
}

