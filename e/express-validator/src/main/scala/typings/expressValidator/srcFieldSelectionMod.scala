package typings.expressValidator

import typings.expressValidator.srcBaseMod.FieldInstance
import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcBaseMod.UnknownFieldInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFieldSelectionMod {
  
  @JSImport("express-validator/src/field-selection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reconstructFieldPath(segments: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reconstructFieldPath")(segments.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("express-validator/src/field-selection", "selectFields")
  @js.native
  val selectFields: SelectFields_ = js.native
  
  inline def selectUnknownFields(req: Request, knownFields: js.Array[String], locations: js.Array[Location]): js.Array[UnknownFieldInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectUnknownFields")(req.asInstanceOf[js.Any], knownFields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any])).asInstanceOf[js.Array[UnknownFieldInstance]]
  
  type SelectFields_ = js.Function3[
    /* req */ Request, 
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    js.Array[FieldInstance]
  ]
}
