package typings.fsDashTreeDashDiff

import typings.fsDashTreeDashDiff.fsDashTreeDashDiffMod.ChangeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fsDashTreeDashDiffStrings {
  @js.native
  sealed trait FSTreeDelegates extends js.Object
  
  @js.native
  sealed trait change extends ChangeType
  
  @js.native
  sealed trait create extends ChangeType
  
  @js.native
  sealed trait mkdir extends ChangeType
  
  @js.native
  sealed trait rmdir extends ChangeType
  
  @js.native
  sealed trait unlink extends ChangeType
  
  @scala.inline
  def FSTreeDelegates: FSTreeDelegates = "FSTreeDelegates".asInstanceOf[FSTreeDelegates]
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
}

