package typings
package ecolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ecolLibStrings {
  @js.native
  sealed trait erase extends js.Object
  
  @js.native
  sealed trait insert extends js.Object
  
  @js.native
  sealed trait refresh extends js.Object
  
  def erase: erase = "erase".asInstanceOf[erase]
  def insert: insert = "insert".asInstanceOf[insert]
  def refresh: refresh = "refresh".asInstanceOf[refresh]
}

