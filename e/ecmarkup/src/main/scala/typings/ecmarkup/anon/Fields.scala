package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.record
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields
  extends StObject
     with typings.ecmarkup.libBiblioMod.Type {
  
  var fields: Record[String, typings.ecmarkup.libBiblioMod.Type | Null]
  
  var kind: record
}
object Fields {
  
  inline def apply(fields: Record[String, typings.ecmarkup.libBiblioMod.Type | Null]): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = "record")
    __obj.asInstanceOf[Fields]
  }
  
  extension [Self <: Fields](x: Self) {
    
    inline def setFields(value: Record[String, typings.ecmarkup.libBiblioMod.Type | Null]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setKind(value: record): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
