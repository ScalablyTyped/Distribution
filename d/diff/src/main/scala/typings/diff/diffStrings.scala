package typings.diff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object diffStrings {
  @js.native
  sealed trait ` ` extends js.Object
  
  @js.native
  sealed trait `-` extends js.Object
  
  @scala.inline
  def ` `: ` ` = " ".asInstanceOf[` `]
  @scala.inline
  def `-`: `-` = "-".asInstanceOf[`-`]
}

