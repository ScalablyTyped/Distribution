package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableFieldSchemaCategories extends StObject {
  
  var names: js.UndefOr[js.Array[String]] = js.native
}
object TableFieldSchemaCategories {
  
  @scala.inline
  def apply(): TableFieldSchemaCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldSchemaCategories]
  }
  
  @scala.inline
  implicit class TableFieldSchemaCategoriesMutableBuilder[Self <: TableFieldSchemaCategories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
