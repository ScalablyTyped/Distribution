package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowMultiple extends StObject {
  
  /**
    * Indicates whether or not several resources of this kind can be assigned to an appointment.
    */
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the resource object field that is used as a resource color.
    */
  var colorExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies available resource instances.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies which field from the resource data objects provides values to be displayed in the resource editor.
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* resource */ Any, String])] = js.undefined
  
  /**
    * The name of the appointment object field that specifies a resource of this kind.
    */
  var fieldExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the label of the Appointment popup window field that allows end users to assign a resource of this kind.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether appointments are colored like this resource kind.
    */
  var useColorAsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the resource object field that is used as a value of the Resource editor in the Appointment popup window.
    */
  var valueExpr: js.UndefOr[String | js.Function] = js.undefined
}
object AllowMultiple {
  
  inline def apply(): AllowMultiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMultiple]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowMultiple] (val x: Self) extends AnyVal {
    
    inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    inline def setColorExpr(value: String): Self = StObject.set(x, "colorExpr", value.asInstanceOf[js.Any])
    
    inline def setColorExprUndefined: Self = StObject.set(x, "colorExpr", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDisplayExpr(value: String | (js.Function1[/* resource */ Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* resource */ Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setFieldExpr(value: String): Self = StObject.set(x, "fieldExpr", value.asInstanceOf[js.Any])
    
    inline def setFieldExprUndefined: Self = StObject.set(x, "fieldExpr", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setUseColorAsDefault(value: Boolean): Self = StObject.set(x, "useColorAsDefault", value.asInstanceOf[js.Any])
    
    inline def setUseColorAsDefaultUndefined: Self = StObject.set(x, "useColorAsDefault", js.undefined)
    
    inline def setValueExpr(value: String | js.Function): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
