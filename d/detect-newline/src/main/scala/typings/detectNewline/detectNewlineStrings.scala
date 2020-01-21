package typings.detectNewline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object detectNewlineStrings {
  @js.native
  sealed trait CarriagereturnLinefeed extends js.Object
  
  @js.native
  sealed trait Linefeed extends js.Object
  
  @scala.inline
  def CarriagereturnLinefeed: CarriagereturnLinefeed = "\r\n".asInstanceOf[CarriagereturnLinefeed]
  @scala.inline
  def Linefeed: Linefeed = "\n".asInstanceOf[Linefeed]
}

