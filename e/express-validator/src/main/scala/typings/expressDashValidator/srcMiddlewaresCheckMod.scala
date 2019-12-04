package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/check", JSImport.Namespace)
@js.native
object srcMiddlewaresCheckMod extends js.Object {
  def check(): ValidationChain = js.native
  def check(fields: String): ValidationChain = js.native
  def check(fields: String, locations: js.Array[Location]): ValidationChain = js.native
  def check(fields: String, locations: js.Array[Location], message: js.Any): ValidationChain = js.native
  def check(fields: js.Array[String]): ValidationChain = js.native
  def check(fields: js.Array[String], locations: js.Array[Location]): ValidationChain = js.native
  def check(fields: js.Array[String], locations: js.Array[Location], message: js.Any): ValidationChain = js.native
}

