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
  var Model: Any
  
  /**
    * Gets the parent of a component that has been added to a report.
    */
  var Parent: Any
}
object ASPxClientReportDesignerComponentAddedEventArgs {
  
  inline def apply(Model: Any, Parent: Any): ASPxClientReportDesignerComponentAddedEventArgs = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerComponentAddedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientReportDesignerComponentAddedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
