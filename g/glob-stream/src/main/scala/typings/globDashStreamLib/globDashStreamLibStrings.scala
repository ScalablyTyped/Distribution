package typings
package globDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object globDashStreamLibStrings {
  @js.native
  sealed trait base
    extends globDashStreamLib.globDashStreamMod.UniqueByStringPredicate
  
  @js.native
  sealed trait cwd
    extends globDashStreamLib.globDashStreamMod.UniqueByStringPredicate
  
  @js.native
  sealed trait path
    extends globDashStreamLib.globDashStreamMod.UniqueByStringPredicate
  
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  @scala.inline
  def cwd: cwd = "cwd".asInstanceOf[cwd]
  @scala.inline
  def path: path = "path".asInstanceOf[path]
}

