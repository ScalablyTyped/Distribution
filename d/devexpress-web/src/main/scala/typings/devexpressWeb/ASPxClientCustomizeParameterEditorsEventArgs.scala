package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeParameterEditors and ASPxClientReportDesigner.CustomizeParameterEditors events.
  */
trait ASPxClientCustomizeParameterEditorsEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides access to an object that stores information required to serialize a parameter editor.
    */
  var info: ASPxDesignerElementSerializationInfo
  
  /**
    * Provides access to an object that stores information about a parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor
}
object ASPxClientCustomizeParameterEditorsEventArgs {
  
  inline def apply(info: ASPxDesignerElementSerializationInfo, parameter: ASPxDesignerElementParameterDescriptor): ASPxClientCustomizeParameterEditorsEventArgs = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeParameterEditorsEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientCustomizeParameterEditorsEventArgs] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: ASPxDesignerElementSerializationInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: ASPxDesignerElementParameterDescriptor): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
