package typings.esmUtils

import org.scalablytyped.runtime.TopLevel
import typings.esmUtils.anon.Dirname
import typings.std.ImportMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esm-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(importMeta: ImportMeta): Dirname = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(importMeta.asInstanceOf[js.Any]).asInstanceOf[Dirname]
  
  type JsonArray = js.Array[JsonValue]
  
  type JsonObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in string ]:? esm-utils.esm-utils.JsonValue}
    */ typings.esmUtils.esmUtilsStrings.JsonObject & TopLevel[Any]
  
  type JsonPrimitive = String | Double | Boolean | Null
  
  type JsonValue = JsonPrimitive | JsonObject | Any
}
