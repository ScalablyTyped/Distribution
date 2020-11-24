package typings.fflate.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "zipSync")
@js.native
object zipSync extends js.Object {
  
  def apply(data: Zippable): Uint8Array = js.native
  def apply(data: Zippable, opts: ZipOptions): Uint8Array = js.native
}
