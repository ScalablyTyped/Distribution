package typings.expressDashValidator.srcMiddlewaresSchemaMod

import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/schema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkSchema(schema: Schema): js.Array[ValidationChain] = js.native
  def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = js.native
}

