package typings.easydate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object easydateStrings {
  @js.native
  sealed trait local extends js.Object
  
  @js.native
  sealed trait utc extends js.Object
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def utc: utc = "utc".asInstanceOf[utc]
}

