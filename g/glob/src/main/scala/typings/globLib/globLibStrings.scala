package typings
package globLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object globLibStrings {
  @js.native
  sealed trait DIR extends js.Object
  
  @js.native
  sealed trait FILE extends js.Object
  
  def DIR: DIR = "DIR".asInstanceOf[DIR]
  def FILE: FILE = "FILE".asInstanceOf[FILE]
}

