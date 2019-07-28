package typings.expressDashValidator

import typings.expressDashValidator.srcContextMod.Optional
import typings.expressDashValidator.srcMiddlewaresSchemaMod.SanitizerSchemaOptions
import typings.expressDashValidator.srcMiddlewaresSchemaMod.ValidatorSchemaOptions
import typings.expressDashValidator.srcOptionsMod.IPVersion
import typings.expressDashValidator.srcOptionsMod.UUIDVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressDashValidatorNumbers {
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
  
  @js.native
  sealed trait `false` extends Optional
  
  @js.native
  sealed trait `true`
    extends SanitizerSchemaOptions[js.Any]
       with ValidatorSchemaOptions[js.Any]
  
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

