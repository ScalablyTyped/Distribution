package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ComponentAdded event.
  */
trait ASPxClientReportDesignerComponentAddedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the model of a component that has been added to a report.
    */
  var Model: js.Any
  
  /**
    * Gets the parent of a component that has been added to a report.
    */
  var Parent: js.Any
}
object ASPxClientReportDesignerComponentAddedEventArgs {
  
  inline def apply(Model: js.Any, Parent: js.Any): ASPxClientReportDesignerComponentAddedEventArgs = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerComponentAddedEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerComponentAddedEventArgs](x: Self) {
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
