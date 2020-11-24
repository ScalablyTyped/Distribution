package typings.fsTreeDiff

import typings.fsTreeDiff.mod.Operand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsTreeDiffStrings {
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @scala.inline
  def mkdir: mkdir = "mkdir".asInstanceOf[mkdir]
  
  @scala.inline
  def rmdir: rmdir = "rmdir".asInstanceOf[rmdir]
  
  @scala.inline
  def unlink: unlink = "unlink".asInstanceOf[unlink]
  
  @js.native
  sealed trait change extends Operand
  
  @js.native
  sealed trait create extends Operand
  
  @js.native
  sealed trait mkdir extends Operand
  
  @js.native
  sealed trait rmdir extends Operand
  
  @js.native
  sealed trait unlink extends Operand
}
