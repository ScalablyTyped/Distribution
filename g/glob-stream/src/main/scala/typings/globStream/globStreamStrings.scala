package typings.globStream

import typings.globStream.mod.UniqueByStringPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globStreamStrings {
  
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @scala.inline
  def cwd: cwd = "cwd".asInstanceOf[cwd]
  
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait base extends UniqueByStringPredicate
  
  @js.native
  sealed trait cwd extends UniqueByStringPredicate
  
  @js.native
  sealed trait path extends UniqueByStringPredicate
}
