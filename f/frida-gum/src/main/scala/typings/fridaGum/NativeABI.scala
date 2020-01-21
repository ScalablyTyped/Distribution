package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.default
  - typings.fridaGum.fridaGumStrings.sysv
  - typings.fridaGum.fridaGumStrings.stdcall
  - typings.fridaGum.fridaGumStrings.thiscall
  - typings.fridaGum.fridaGumStrings.fastcall
  - typings.fridaGum.fridaGumStrings.mscdecl
  - typings.fridaGum.fridaGumStrings.win64
  - typings.fridaGum.fridaGumStrings.unix64
  - typings.fridaGum.fridaGumStrings.vfp
*/
trait NativeABI extends js.Object

object NativeABI {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.fridaGum.fridaGumStrings.default = this.cast("default")
  @scala.inline
  def fastcall: typings.fridaGum.fridaGumStrings.fastcall = this.cast("fastcall")
  @scala.inline
  def mscdecl: typings.fridaGum.fridaGumStrings.mscdecl = this.cast("mscdecl")
  @scala.inline
  def stdcall: typings.fridaGum.fridaGumStrings.stdcall = this.cast("stdcall")
  @scala.inline
  def sysv: typings.fridaGum.fridaGumStrings.sysv = this.cast("sysv")
  @scala.inline
  def thiscall: typings.fridaGum.fridaGumStrings.thiscall = this.cast("thiscall")
  @scala.inline
  def unix64: typings.fridaGum.fridaGumStrings.unix64 = this.cast("unix64")
  @scala.inline
  def vfp: typings.fridaGum.fridaGumStrings.vfp = this.cast("vfp")
  @scala.inline
  def win64: typings.fridaGum.fridaGumStrings.win64 = this.cast("win64")
}

