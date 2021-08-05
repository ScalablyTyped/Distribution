package typings.forgeViewer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowList extends StObject {
    
    var allowList: js.UndefOr[js.Array[Double]] = js.undefined
    
    var center: js.UndefOr[Double] = js.undefined
    
    var ignoreTransform: js.UndefOr[Boolean] = js.undefined
    
    var quantil: js.UndefOr[Double] = js.undefined
  }
  object AllowList {
    
    inline def apply(): AllowList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowList]
    }
    
    extension [Self <: AllowList](x: Self) {
      
      inline def setAllowList(value: js.Array[Double]): Self = StObject.set(x, "allowList", value.asInstanceOf[js.Any])
      
      inline def setAllowListUndefined: Self = StObject.set(x, "allowList", js.undefined)
      
      inline def setAllowListVarargs(value: Double*): Self = StObject.set(x, "allowList", js.Array(value :_*))
      
      inline def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setIgnoreTransform(value: Boolean): Self = StObject.set(x, "ignoreTransform", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTransformUndefined: Self = StObject.set(x, "ignoreTransform", js.undefined)
      
      inline def setQuantil(value: Double): Self = StObject.set(x, "quantil", value.asInstanceOf[js.Any])
      
      inline def setQuantilUndefined: Self = StObject.set(x, "quantil", js.undefined)
    }
  }
  
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
    
    extension [Self <: Bimwalk](x: Self) {
      
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
  
  trait ButtonText extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var checkboxChecked: js.UndefOr[Boolean] = js.undefined
    
    var messageDefaultValue: js.UndefOr[String] = js.undefined
    
    var messageKey: String
    
    var msgTitleDefault: js.UndefOr[String] = js.undefined
    
    var msgTitleKey: String
  }
  object ButtonText {
    
    inline def apply(messageKey: String, msgTitleKey: String): ButtonText = {
      val __obj = js.Dynamic.literal(messageKey = messageKey.asInstanceOf[js.Any], msgTitleKey = msgTitleKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonText]
    }
    
    extension [Self <: ButtonText](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setCheckboxChecked(value: Boolean): Self = StObject.set(x, "checkboxChecked", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCheckedUndefined: Self = StObject.set(x, "checkboxChecked", js.undefined)
      
      inline def setMessageDefaultValue(value: String): Self = StObject.set(x, "messageDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setMessageDefaultValueUndefined: Self = StObject.set(x, "messageDefaultValue", js.undefined)
      
      inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
      
      inline def setMsgTitleDefault(value: String): Self = StObject.set(x, "msgTitleDefault", value.asInstanceOf[js.Any])
      
      inline def setMsgTitleDefaultUndefined: Self = StObject.set(x, "msgTitleDefault", js.undefined)
      
      inline def setMsgTitleKey(value: String): Self = StObject.set(x, "msgTitleKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConserveMemory extends StObject {
    
    var conserveMemory: js.UndefOr[Boolean] = js.undefined
    
    var createWireFrame: js.UndefOr[Boolean] = js.undefined
  }
  object ConserveMemory {
    
    inline def apply(): ConserveMemory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConserveMemory]
    }
    
    extension [Self <: ConserveMemory](x: Self) {
      
      inline def setConserveMemory(value: Boolean): Self = StObject.set(x, "conserveMemory", value.asInstanceOf[js.Any])
      
      inline def setConserveMemoryUndefined: Self = StObject.set(x, "conserveMemory", js.undefined)
      
      inline def setCreateWireFrame(value: Boolean): Self = StObject.set(x, "createWireFrame", value.asInstanceOf[js.Any])
      
      inline def setCreateWireFrameUndefined: Self = StObject.set(x, "createWireFrame", js.undefined)
    }
  }
  
  trait CreateWireframe extends StObject {
    
    var conserveMemory: js.UndefOr[Boolean] = js.undefined
    
    var createWireframe: js.UndefOr[Boolean] = js.undefined
  }
  object CreateWireframe {
    
    inline def apply(): CreateWireframe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateWireframe]
    }
    
    extension [Self <: CreateWireframe](x: Self) {
      
      inline def setConserveMemory(value: Boolean): Self = StObject.set(x, "conserveMemory", value.asInstanceOf[js.Any])
      
      inline def setConserveMemoryUndefined: Self = StObject.set(x, "conserveMemory", js.undefined)
      
      inline def setCreateWireframe(value: Boolean): Self = StObject.set(x, "createWireframe", value.asInstanceOf[js.Any])
      
      inline def setCreateWireframeUndefined: Self = StObject.set(x, "createWireframe", js.undefined)
    }
  }
  
  trait DisplayName extends StObject {
    
    var displayName: String
    
    var displayValue: js.Any
  }
  object DisplayName {
    
    inline def apply(displayName: String, displayValue: js.Any): DisplayName = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    extension [Self <: DisplayName](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayValue(value: js.Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForceSnapEdges extends StObject {
    
    var forceSnapEdges: js.UndefOr[Boolean] = js.undefined
    
    var forceSnapVertices: js.UndefOr[Boolean] = js.undefined
    
    var markupMode: js.UndefOr[Boolean] = js.undefined
    
    var renderSnappedGeometry: js.UndefOr[Boolean] = js.undefined
    
    var renderSnappedTopology: js.UndefOr[Boolean] = js.undefined
    
    var toolName: js.UndefOr[String] = js.undefined
  }
  object ForceSnapEdges {
    
    inline def apply(): ForceSnapEdges = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceSnapEdges]
    }
    
    extension [Self <: ForceSnapEdges](x: Self) {
      
      inline def setForceSnapEdges(value: Boolean): Self = StObject.set(x, "forceSnapEdges", value.asInstanceOf[js.Any])
      
      inline def setForceSnapEdgesUndefined: Self = StObject.set(x, "forceSnapEdges", js.undefined)
      
      inline def setForceSnapVertices(value: Boolean): Self = StObject.set(x, "forceSnapVertices", value.asInstanceOf[js.Any])
      
      inline def setForceSnapVerticesUndefined: Self = StObject.set(x, "forceSnapVertices", js.undefined)
      
      inline def setMarkupMode(value: Boolean): Self = StObject.set(x, "markupMode", value.asInstanceOf[js.Any])
      
      inline def setMarkupModeUndefined: Self = StObject.set(x, "markupMode", js.undefined)
      
      inline def setRenderSnappedGeometry(value: Boolean): Self = StObject.set(x, "renderSnappedGeometry", value.asInstanceOf[js.Any])
      
      inline def setRenderSnappedGeometryUndefined: Self = StObject.set(x, "renderSnappedGeometry", js.undefined)
      
      inline def setRenderSnappedTopology(value: Boolean): Self = StObject.set(x, "renderSnappedTopology", value.asInstanceOf[js.Any])
      
      inline def setRenderSnappedTopologyUndefined: Self = StObject.set(x, "renderSnappedTopology", js.undefined)
      
      inline def setToolName(value: String): Self = StObject.set(x, "toolName", value.asInstanceOf[js.Any])
      
      inline def setToolNameUndefined: Self = StObject.set(x, "toolName", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var inMemory: Boolean
    
    var isAsync: Boolean
  }
  object Id {
    
    inline def apply(id: String, inMemory: Boolean, isAsync: Boolean): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inMemory = inMemory.asInstanceOf[js.Any], isAsync = isAsync.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInMemory(value: Boolean): Self = StObject.set(x, "inMemory", value.asInstanceOf[js.Any])
      
      inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
