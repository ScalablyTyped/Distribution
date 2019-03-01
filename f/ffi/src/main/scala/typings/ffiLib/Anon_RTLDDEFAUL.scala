package typings
package ffiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RTLDDEFAUL extends js.Object {
  var RTLD_DEFAUL: Buffer
  var RTLD_GLOBAL: scala.Double
  var RTLD_LAZY: scala.Double
  var RTLD_LOCAL: scala.Double
  var RTLD_NEXT: Buffer
  var RTLD_NODELETE: scala.Double
  var RTLD_NOLOAD: scala.Double
  var RTLD_NOW: scala.Double
}

object Anon_RTLDDEFAUL {
  @scala.inline
  def apply(
    RTLD_DEFAUL: Buffer,
    RTLD_GLOBAL: scala.Double,
    RTLD_LAZY: scala.Double,
    RTLD_LOCAL: scala.Double,
    RTLD_NEXT: Buffer,
    RTLD_NODELETE: scala.Double,
    RTLD_NOLOAD: scala.Double,
    RTLD_NOW: scala.Double
  ): Anon_RTLDDEFAUL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RTLD_DEFAUL")(RTLD_DEFAUL)
    __obj.updateDynamic("RTLD_GLOBAL")(RTLD_GLOBAL)
    __obj.updateDynamic("RTLD_LAZY")(RTLD_LAZY)
    __obj.updateDynamic("RTLD_LOCAL")(RTLD_LOCAL)
    __obj.updateDynamic("RTLD_NEXT")(RTLD_NEXT)
    __obj.updateDynamic("RTLD_NODELETE")(RTLD_NODELETE)
    __obj.updateDynamic("RTLD_NOLOAD")(RTLD_NOLOAD)
    __obj.updateDynamic("RTLD_NOW")(RTLD_NOW)
    __obj.asInstanceOf[Anon_RTLDDEFAUL]
  }
}

