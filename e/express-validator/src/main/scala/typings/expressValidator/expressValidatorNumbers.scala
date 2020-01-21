package typings.expressValidator

import typings.expressValidator.optionsMod.IPVersion
import typings.expressValidator.optionsMod.UUIDVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressValidatorNumbers {
  @js.native
  sealed trait `3` extends UUIDVersion
  
  @js.native
  sealed trait `4`
    extends IPVersion
       with UUIDVersion
  
  @js.native
  sealed trait `5` extends UUIDVersion
  
  @js.native
  sealed trait `6` extends IPVersion
  
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
}

