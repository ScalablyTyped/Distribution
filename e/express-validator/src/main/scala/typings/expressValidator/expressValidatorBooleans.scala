package typings.expressValidator

import typings.expressValidator.contextMod.Optional
import typings.expressValidator.schemaMod.SanitizerSchemaOptions
import typings.expressValidator.schemaMod.ValidatorSchemaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressValidatorBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with Optional
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with SanitizerSchemaOptions[js.Any]
       with ValidatorSchemaOptions[js.Any]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}
