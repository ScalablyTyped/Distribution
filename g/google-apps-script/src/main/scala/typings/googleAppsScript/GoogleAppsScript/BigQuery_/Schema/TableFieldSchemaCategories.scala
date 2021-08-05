package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldSchemaCategories extends StObject {
  
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object TableFieldSchemaCategories {
  
  inline def apply(): TableFieldSchemaCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldSchemaCategories]
  }
  
  extension [Self <: TableFieldSchemaCategories](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
