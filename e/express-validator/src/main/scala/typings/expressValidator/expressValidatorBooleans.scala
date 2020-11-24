package typings.expressValidator

import typings.expressValidator.contextMod.Optional
import typings.expressValidator.schemaMod.SanitizerSchemaOptions
import typings.expressValidator.schemaMod.ValidatorSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressValidatorBooleans {
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
  
  @js.native
  sealed trait `false` extends Optional
  
  @js.native
  sealed trait `true`
    extends SanitizerSchemaOptions[js.Any]
       with ValidatorSchemaOptions[js.Any]
}
