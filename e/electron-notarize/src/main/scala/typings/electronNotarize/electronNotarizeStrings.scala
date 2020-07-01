package typings.electronNotarize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object electronNotarizeStrings {
  @js.native
  sealed trait `in progress` extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def `in progress`: `in progress` = ("in progress").asInstanceOf[`in progress`]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

