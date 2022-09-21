package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramChangeConnectorTextArgs extends StObject {
  
  /**
    * The processed connector.
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.undefined
  
  /**
    * The index of the processed text in the connector&apos;s texts collection.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The new connector text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxDiagramChangeConnectorTextArgs {
  
  inline def apply(): dxDiagramChangeConnectorTextArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramChangeConnectorTextArgs]
  }
  
  extension [Self <: dxDiagramChangeConnectorTextArgs](x: Self) {
    
    inline def setConnector(value: dxDiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
