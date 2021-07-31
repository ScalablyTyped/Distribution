package typings.expressValidator

import typings.expressValidator.baseMod.Location
import typings.expressValidator.validationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMod {
  
  @JSImport("express-validator/src/middlewares/check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def check(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: String, locations: js.Array[Location]): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: String, locations: js.Array[Location], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: String, locations: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: js.Array[String], locations: js.Array[Location]): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: js.Array[String], locations: js.Array[Location], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: js.Array[String], locations: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: Unit, locations: js.Array[Location]): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: Unit, locations: js.Array[Location], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: Unit, locations: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
}
