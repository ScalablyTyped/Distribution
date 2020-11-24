package typings.fflate.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "unzlib")
@js.native
object unzlib extends js.Object {
  
  def apply(data: Uint8Array, cb: FlateCallback): AsyncTerminable = js.native
  def apply(data: Uint8Array, opts: AsyncGunzipOptions, cb: FlateCallback): AsyncTerminable = js.native
}
