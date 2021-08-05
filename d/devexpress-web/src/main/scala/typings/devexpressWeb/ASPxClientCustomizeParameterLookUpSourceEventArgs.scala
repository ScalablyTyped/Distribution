package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeParameterLookUpSource and ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource events.
  */
trait ASPxClientCustomizeParameterLookUpSourceEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the data source that provides look-up values for the parameter editor.
    */
  var dataSource: js.Any
  
  /**
    * Provides access to the collection of look-up parameter values.
    */
  var items: js.Array[ASPxDesignerElementEditorItem]
  
  /**
    * Provides access to an object that stores information about a parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor
}
object ASPxClientCustomizeParameterLookUpSourceEventArgs {
  
  inline def apply(
    dataSource: js.Any,
    items: js.Array[ASPxDesignerElementEditorItem],
    parameter: ASPxDesignerElementParameterDescriptor
  ): ASPxClientCustomizeParameterLookUpSourceEventArgs = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeParameterLookUpSourceEventArgs]
  }
  
  extension [Self <: ASPxClientCustomizeParameterLookUpSourceEventArgs](x: Self) {
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[ASPxDesignerElementEditorItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ASPxDesignerElementEditorItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setParameter(value: ASPxDesignerElementParameterDescriptor): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
