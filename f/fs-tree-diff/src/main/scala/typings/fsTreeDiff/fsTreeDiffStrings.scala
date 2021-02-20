package typings.fsTreeDiff

import typings.fsTreeDiff.mod.Operand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsTreeDiffStrings {
  
  @js.native
  sealed trait change extends Operand
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait create extends Operand
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait mkdir extends Operand
  @scala.inline
  def mkdir: mkdir = "mkdir".asInstanceOf[mkdir]
  
  @js.native
  sealed trait rmdir extends Operand
  @scala.inline
  def rmdir: rmdir = "rmdir".asInstanceOf[rmdir]
  
  @js.native
  sealed trait unlink extends Operand
  @scala.inline
  def unlink: unlink = "unlink".asInstanceOf[unlink]
}
