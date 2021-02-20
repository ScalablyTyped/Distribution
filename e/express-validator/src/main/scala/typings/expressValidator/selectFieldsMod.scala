package typings.expressValidator

import typings.expressValidator.baseMod.FieldInstance
import typings.expressValidator.baseMod.Location
import typings.expressValidator.baseMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectFieldsMod {
  
  @JSImport("express-validator/src/select-fields", "selectFields")
  @js.native
  val selectFields: SelectFields_ = js.native
  
  type SelectFields_ = js.Function3[
    /* req */ Request, 
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    js.Array[FieldInstance]
  ]
}
