package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/check", JSImport.Namespace)
@js.native
object checkMod extends js.Object {
  val body: expressDashValidatorLib.checkValidationDashChainDashBuildersMod.ValidationChainBuilder = js.native
  val check: expressDashValidatorLib.checkValidationDashChainDashBuildersMod.ValidationChainBuilder = js.native
  val cookie: expressDashValidatorLib.checkValidationDashChainDashBuildersMod.ValidationChainBuilder = js.native
  val header: expressDashValidatorLib.checkValidationDashChainDashBuildersMod.ValidationChainBuilder = js.native
  val param: expressDashValidatorLib.checkValidationDashChainDashBuildersMod.ValidationChainBuilder = js.native
  val query: expressDashValidatorLib.checkValidationDashChainDashBuildersMod.ValidationChainBuilder = js.native
  val validationResult: expressDashValidatorLib.checkValidationDashResultMod.ResultFactory = js.native
  def buildCheckFunction(location: js.Array[expressDashValidatorLib.checkLocationMod.Location]): expressDashValidatorLib.checkValidationDashChainDashBuildersMod.ValidationChainBuilder = js.native
  def checkSchema(schema: expressDashValidatorLib.checkSchemaMod.ValidationSchema): js.Array[expressDashValidatorLib.checkCheckMod.ValidationChain] = js.native
  def oneOf(chains: expressDashValidatorLib.checkOneDashOfMod.ValidationChains): expressLib.expressMod.eNs.RequestHandler = js.native
  def oneOf(
    chains: expressDashValidatorLib.checkOneDashOfMod.ValidationChains,
    message: expressDashValidatorLib.checkOneDashOfMod.OneOfCustomMessageBuilder
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def oneOf(chains: expressDashValidatorLib.checkOneDashOfMod.ValidationChains, message: js.Any): expressLib.expressMod.eNs.RequestHandler = js.native
}

