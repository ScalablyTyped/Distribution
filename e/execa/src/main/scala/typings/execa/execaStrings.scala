package typings.execa

import typings.execa.mod._StdioOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object execaStrings {
  @js.native
  sealed trait ignore extends _StdioOption
  
  @js.native
  sealed trait inherit extends _StdioOption
  
  @js.native
  sealed trait ipc extends _StdioOption
  
  @js.native
  sealed trait pipe extends _StdioOption
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  @scala.inline
  def ipc: ipc = "ipc".asInstanceOf[ipc]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
}

