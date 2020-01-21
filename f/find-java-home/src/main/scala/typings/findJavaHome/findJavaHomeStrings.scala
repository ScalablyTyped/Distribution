package typings.findJavaHome

import typings.findJavaHome.mod.RegArch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object findJavaHomeStrings {
  @js.native
  sealed trait x64 extends RegArch
  
  @js.native
  sealed trait x86 extends RegArch
  
  @scala.inline
  def x64: x64 = "x64".asInstanceOf[x64]
  @scala.inline
  def x86: x86 = "x86".asInstanceOf[x86]
}

