package typings.findJavaHome

import typings.findJavaHome.mod.RegArch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findJavaHomeStrings {
  
  @scala.inline
  def x64: x64 = "x64".asInstanceOf[x64]
  
  @scala.inline
  def x86: x86 = "x86".asInstanceOf[x86]
  
  @js.native
  sealed trait x64 extends RegArch
  
  @js.native
  sealed trait x86 extends RegArch
}
