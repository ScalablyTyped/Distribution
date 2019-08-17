package typings.expressDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcSelectDashFieldsMod {
  import typings.expressDashValidator.srcBaseMod.FieldInstance
  import typings.expressDashValidator.srcBaseMod.Location
  import typings.expressDashValidator.srcBaseMod.Request

  type SelectFields = js.Function3[
    /* req */ Request, 
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    js.Array[FieldInstance]
  ]
}
