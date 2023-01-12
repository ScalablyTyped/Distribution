package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bimwalk extends StObject {
  
  var bimwalk: js.UndefOr[Boolean] = js.undefined
  
  var hyperlink: js.UndefOr[Boolean] = js.undefined
  
  var measure: js.UndefOr[Boolean] = js.undefined
  
  var scalarisSimulation: js.UndefOr[Boolean] = js.undefined
  
  var section: js.UndefOr[Boolean] = js.undefined
}
object Bimwalk {
  
  inline def apply(): Bimwalk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bimwalk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bimwalk] (val x: Self) extends AnyVal {
    
    inline def setBimwalk(value: Boolean): Self = StObject.set(x, "bimwalk", value.asInstanceOf[js.Any])
    
    inline def setBimwalkUndefined: Self = StObject.set(x, "bimwalk", js.undefined)
    
    inline def setHyperlink(value: Boolean): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setMeasure(value: Boolean): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def setScalarisSimulation(value: Boolean): Self = StObject.set(x, "scalarisSimulation", value.asInstanceOf[js.Any])
    
    inline def setScalarisSimulationUndefined: Self = StObject.set(x, "scalarisSimulation", js.undefined)
    
    inline def setSection(value: Boolean): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
