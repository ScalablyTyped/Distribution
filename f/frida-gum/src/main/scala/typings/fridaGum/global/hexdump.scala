package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import typings.fridaGum.HexdumpOptions
import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("hexdump")
@js.native
object hexdump extends js.Object {
  
  def apply(target: ArrayBuffer): String = js.native
  def apply(target: ArrayBuffer, options: HexdumpOptions): String = js.native
  def apply(target: NativePointerValue): String = js.native
  def apply(target: NativePointerValue, options: HexdumpOptions): String = js.native
}
