package typings.expressDashValidator

import typings.expressDashValidator.srcContextMod.Optional
import typings.expressDashValidator.srcMiddlewaresSchemaMod.SanitizerSchemaOptions
import typings.expressDashValidator.srcMiddlewaresSchemaMod.ValidatorSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressDashValidatorBooleans {
  @js.native
  sealed trait `false` extends Optional
  
  @js.native
  sealed trait `true`
    extends SanitizerSchemaOptions[js.Any]
       with ValidatorSchemaOptions[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

