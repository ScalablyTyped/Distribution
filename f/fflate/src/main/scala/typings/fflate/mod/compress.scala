package typings.fflate.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "compress")
@js.native
object compress extends js.Object {
  
  def apply(data: Uint8Array, cb: FlateCallback): AsyncTerminable = js.native
  def apply(data: Uint8Array, opts: AsyncGzipOptions, cb: FlateCallback): AsyncTerminable = js.native
}
