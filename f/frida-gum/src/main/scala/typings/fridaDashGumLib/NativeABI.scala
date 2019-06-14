package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.default
  - fridaDashGumLib.fridaDashGumLibStrings.sysv
  - fridaDashGumLib.fridaDashGumLibStrings.stdcall
  - fridaDashGumLib.fridaDashGumLibStrings.thiscall
  - fridaDashGumLib.fridaDashGumLibStrings.fastcall
  - fridaDashGumLib.fridaDashGumLibStrings.mscdecl
  - fridaDashGumLib.fridaDashGumLibStrings.win64
  - fridaDashGumLib.fridaDashGumLibStrings.unix64
  - fridaDashGumLib.fridaDashGumLibStrings.vfp
*/
trait NativeABI extends js.Object

object NativeABI {
  @scala.inline
  def Default: fridaDashGumLib.fridaDashGumLibStrings.default = this.cast("default")
  @scala.inline
  def FastCall: fridaDashGumLib.fridaDashGumLibStrings.fastcall = this.cast("fastcall")
  @scala.inline
  def MSCDecl: fridaDashGumLib.fridaDashGumLibStrings.mscdecl = this.cast("mscdecl")
  @scala.inline
  def StdCall: fridaDashGumLib.fridaDashGumLibStrings.stdcall = this.cast("stdcall")
  @scala.inline
  def SysV: fridaDashGumLib.fridaDashGumLibStrings.sysv = this.cast("sysv")
  @scala.inline
  def ThisCall: fridaDashGumLib.fridaDashGumLibStrings.thiscall = this.cast("thiscall")
  @scala.inline
  def Unix64: fridaDashGumLib.fridaDashGumLibStrings.unix64 = this.cast("unix64")
  @scala.inline
  def VFP: fridaDashGumLib.fridaDashGumLibStrings.vfp = this.cast("vfp")
  @scala.inline
  def Win64: fridaDashGumLib.fridaDashGumLibStrings.win64 = this.cast("win64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

