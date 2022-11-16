package typings.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typings.joi.mod.AnySchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type SchemaType = {[key: string] : joi.joi.AnySchema<any> | dynogels.dynogels.SchemaType}
}}}
to avoid circular code involving: 
- dynogels.dynogels.SchemaType
*/
trait SchemaType
  extends StObject
     with /* key */ StringDictionary[AnySchema[Any] | SchemaType]
object SchemaType {
  
  inline def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
}
