package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeToolbox event.
  */
trait ASPxClientReportDesignerCustomizeToolboxEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides information about all controls available in the Toolbox.
    */
  var ControlsFactory: ASPxDesignerControlsFactory
}
object ASPxClientReportDesignerCustomizeToolboxEventArgs {
  
  inline def apply(ControlsFactory: ASPxDesignerControlsFactory): ASPxClientReportDesignerCustomizeToolboxEventArgs = {
    val __obj = js.Dynamic.literal(ControlsFactory = ControlsFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeToolboxEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerCustomizeToolboxEventArgs](x: Self) {
    
    inline def setControlsFactory(value: ASPxDesignerControlsFactory): Self = StObject.set(x, "ControlsFactory", value.asInstanceOf[js.Any])
  }
}
