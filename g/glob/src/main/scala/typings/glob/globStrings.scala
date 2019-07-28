package typings.glob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object globStrings {
  @js.native
  sealed trait DIR extends js.Object
  
  @js.native
  sealed trait FILE extends js.Object
  
  @scala.inline
  def DIR: DIR = "DIR".asInstanceOf[DIR]
  @scala.inline
  def FILE: FILE = "FILE".asInstanceOf[FILE]
}

