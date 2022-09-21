package typings.field

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(topObj: Any, fields: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(topObj.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def set(topObj: Any, fields: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(topObj.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
}
