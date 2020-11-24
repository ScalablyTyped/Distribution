package typings.fflate.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "gzipSync")
@js.native
object gzipSync extends js.Object {
  
  def apply(data: Uint8Array): Uint8Array = js.native
  def apply(data: Uint8Array, opts: GzipOptions): Uint8Array = js.native
}
