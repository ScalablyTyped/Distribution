package typings.ffi.anon

import typings.ffi.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTLDDEFAUL extends js.Object {
  var RTLD_DEFAUL: Buffer
  var RTLD_GLOBAL: Double
  var RTLD_LAZY: Double
  var RTLD_LOCAL: Double
  var RTLD_NEXT: Buffer
  var RTLD_NODELETE: Double
  var RTLD_NOLOAD: Double
  var RTLD_NOW: Double
}

object RTLDDEFAUL {
  @scala.inline
  def apply(
    RTLD_DEFAUL: Buffer,
    RTLD_GLOBAL: Double,
    RTLD_LAZY: Double,
    RTLD_LOCAL: Double,
    RTLD_NEXT: Buffer,
    RTLD_NODELETE: Double,
    RTLD_NOLOAD: Double,
    RTLD_NOW: Double
  ): RTLDDEFAUL = {
    val __obj = js.Dynamic.literal(RTLD_DEFAUL = RTLD_DEFAUL.asInstanceOf[js.Any], RTLD_GLOBAL = RTLD_GLOBAL.asInstanceOf[js.Any], RTLD_LAZY = RTLD_LAZY.asInstanceOf[js.Any], RTLD_LOCAL = RTLD_LOCAL.asInstanceOf[js.Any], RTLD_NEXT = RTLD_NEXT.asInstanceOf[js.Any], RTLD_NODELETE = RTLD_NODELETE.asInstanceOf[js.Any], RTLD_NOLOAD = RTLD_NOLOAD.asInstanceOf[js.Any], RTLD_NOW = RTLD_NOW.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTLDDEFAUL]
  }
}

