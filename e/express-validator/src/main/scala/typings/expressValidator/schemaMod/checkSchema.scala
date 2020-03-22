package typings.expressValidator.schemaMod

import typings.expressValidator.baseMod.Location
import typings.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/schema", "checkSchema")
@js.native
object checkSchema extends js.Object {
  def apply(schema: Schema): js.Array[ValidationChain] = js.native
  def apply(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = js.native
}

