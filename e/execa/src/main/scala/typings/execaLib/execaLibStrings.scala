package typings
package execaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object execaLibStrings {
  @js.native
  sealed trait ignore extends js.Object
  
  @js.native
  sealed trait inherit extends js.Object
  
  @js.native
  sealed trait ipc extends js.Object
  
  @js.native
  sealed trait pipe extends js.Object
  
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  def ipc: ipc = "ipc".asInstanceOf[ipc]
  def pipe: pipe = "pipe".asInstanceOf[pipe]
}

