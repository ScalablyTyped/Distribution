package typings.expressValidator

import typings.expressValidator.baseMod.Location
import typings.expressValidator.validationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationChainBuildersMod {
  
  @JSImport("express-validator/src/middlewares/validation-chain-builders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def body(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")().asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def buildCheckFunction(locations: js.Array[Location]): js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[js.Any], 
    ValidationChain
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCheckFunction")(locations.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[js.Any], 
    ValidationChain
  ]]
  
  @scala.inline
  def check(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def cookie(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")().asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def header(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")().asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def param(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")().asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def query(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
}
