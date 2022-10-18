package typings.esmUtils

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
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in string ]:? esm-utils.esm-utils.JsonValue}
    }}}
    */
  @js.native
  trait JsonObject extends StObject
  
  type JsonPrimitive = String | Double | Boolean | Null
  
  type JsonValue = JsonPrimitive | JsonObject | Any
}
