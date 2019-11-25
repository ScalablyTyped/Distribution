package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.default
  - typings.fridaDashGum.fridaDashGumStrings.sysv
  - typings.fridaDashGum.fridaDashGumStrings.stdcall
  - typings.fridaDashGum.fridaDashGumStrings.thiscall
  - typings.fridaDashGum.fridaDashGumStrings.fastcall
  - typings.fridaDashGum.fridaDashGumStrings.mscdecl
  - typings.fridaDashGum.fridaDashGumStrings.win64
  - typings.fridaDashGum.fridaDashGumStrings.unix64
  - typings.fridaDashGum.fridaDashGumStrings.vfp
*/
trait NativeABI extends js.Object

object NativeABI {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.fridaDashGum.fridaDashGumStrings.default = this.cast("default")
  @scala.inline
  def fastcall: typings.fridaDashGum.fridaDashGumStrings.fastcall = this.cast("fastcall")
  @scala.inline
  def mscdecl: typings.fridaDashGum.fridaDashGumStrings.mscdecl = this.cast("mscdecl")
  @scala.inline
  def stdcall: typings.fridaDashGum.fridaDashGumStrings.stdcall = this.cast("stdcall")
  @scala.inline
  def sysv: typings.fridaDashGum.fridaDashGumStrings.sysv = this.cast("sysv")
  @scala.inline
  def thiscall: typings.fridaDashGum.fridaDashGumStrings.thiscall = this.cast("thiscall")
  @scala.inline
  def unix64: typings.fridaDashGum.fridaDashGumStrings.unix64 = this.cast("unix64")
  @scala.inline
  def vfp: typings.fridaDashGum.fridaDashGumStrings.vfp = this.cast("vfp")
  @scala.inline
  def win64: typings.fridaDashGum.fridaDashGumStrings.win64 = this.cast("win64")
}

