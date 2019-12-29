package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.FieldInstance
import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcBaseMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/select-fields", JSImport.Namespace)
@js.native
object srcSelectDashFieldsMod extends js.Object {
  val selectFields: SelectFields = js.native
  type SelectFields = js.Function3[
    /* req */ Request, 
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    js.Array[FieldInstance]
  ]
}

