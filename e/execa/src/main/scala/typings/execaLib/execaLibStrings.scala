package typings
package execaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object execaLibStrings {
  @js.native
  sealed trait ignore
    extends execaLib.execaMod._StdIOOption
  
  @js.native
  sealed trait inherit
    extends execaLib.execaMod._StdIOOption
  
  @js.native
  sealed trait ipc
    extends execaLib.execaMod._StdIOOption
  
  @js.native
  sealed trait pipe
    extends execaLib.execaMod._StdIOOption
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  @scala.inline
  def ipc: ipc = "ipc".asInstanceOf[ipc]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
}

