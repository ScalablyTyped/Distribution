package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClustering extends StObject {
  
  /**
    * [Repeated] One or more fields on which data should be clustered. Only
    * top-level, non-repeated, simple-type fields are supported. When you
    * cluster a table using multiple columns, the order of columns you specify
    * is important. The order of the specified columns determines the sort
    * order of the data.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaClustering {
  
  inline def apply(): SchemaClustering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClustering]
  }
  
  extension [Self <: SchemaClustering](x: Self) {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
