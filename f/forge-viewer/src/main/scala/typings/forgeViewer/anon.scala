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
    
    @scala.inline
    def apply(): AllowList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowList]
    }
    
    @scala.inline
    implicit class AllowListMutableBuilder[Self <: AllowList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowList(value: js.Array[Double]): Self = StObject.set(x, "allowList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowListUndefined: Self = StObject.set(x, "allowList", js.undefined)
      
      @scala.inline
      def setAllowListVarargs(value: Double*): Self = StObject.set(x, "allowList", js.Array(value :_*))
      
      @scala.inline
      def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setIgnoreTransform(value: Boolean): Self = StObject.set(x, "ignoreTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTransformUndefined: Self = StObject.set(x, "ignoreTransform", js.undefined)
      
      @scala.inline
      def setQuantil(value: Double): Self = StObject.set(x, "quantil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantilUndefined: Self = StObject.set(x, "quantil", js.undefined)
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
    
    @scala.inline
    def apply(): Bimwalk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bimwalk]
    }
    
    @scala.inline
    implicit class BimwalkMutableBuilder[Self <: Bimwalk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBimwalk(value: Boolean): Self = StObject.set(x, "bimwalk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBimwalkUndefined: Self = StObject.set(x, "bimwalk", js.undefined)
      
      @scala.inline
      def setHyperlink(value: Boolean): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
      
      @scala.inline
      def setMeasure(value: Boolean): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
      
      @scala.inline
      def setScalarisSimulation(value: Boolean): Self = StObject.set(x, "scalarisSimulation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalarisSimulationUndefined: Self = StObject.set(x, "scalarisSimulation", js.undefined)
      
      @scala.inline
      def setSection(value: Boolean): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
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
    
    @scala.inline
    def apply(messageKey: String, msgTitleKey: String): ButtonText = {
      val __obj = js.Dynamic.literal(messageKey = messageKey.asInstanceOf[js.Any], msgTitleKey = msgTitleKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonText]
    }
    
    @scala.inline
    implicit class ButtonTextMutableBuilder[Self <: ButtonText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setCheckboxChecked(value: Boolean): Self = StObject.set(x, "checkboxChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxCheckedUndefined: Self = StObject.set(x, "checkboxChecked", js.undefined)
      
      @scala.inline
      def setMessageDefaultValue(value: String): Self = StObject.set(x, "messageDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageDefaultValueUndefined: Self = StObject.set(x, "messageDefaultValue", js.undefined)
      
      @scala.inline
      def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgTitleDefault(value: String): Self = StObject.set(x, "msgTitleDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgTitleDefaultUndefined: Self = StObject.set(x, "msgTitleDefault", js.undefined)
      
      @scala.inline
      def setMsgTitleKey(value: String): Self = StObject.set(x, "msgTitleKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConserveMemory extends StObject {
    
    var conserveMemory: js.UndefOr[Boolean] = js.undefined
    
    var createWireFrame: js.UndefOr[Boolean] = js.undefined
  }
  object ConserveMemory {
    
    @scala.inline
    def apply(): ConserveMemory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConserveMemory]
    }
    
    @scala.inline
    implicit class ConserveMemoryMutableBuilder[Self <: ConserveMemory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConserveMemory(value: Boolean): Self = StObject.set(x, "conserveMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConserveMemoryUndefined: Self = StObject.set(x, "conserveMemory", js.undefined)
      
      @scala.inline
      def setCreateWireFrame(value: Boolean): Self = StObject.set(x, "createWireFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateWireFrameUndefined: Self = StObject.set(x, "createWireFrame", js.undefined)
    }
  }
  
  trait CreateWireframe extends StObject {
    
    var conserveMemory: js.UndefOr[Boolean] = js.undefined
    
    var createWireframe: js.UndefOr[Boolean] = js.undefined
  }
  object CreateWireframe {
    
    @scala.inline
    def apply(): CreateWireframe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateWireframe]
    }
    
    @scala.inline
    implicit class CreateWireframeMutableBuilder[Self <: CreateWireframe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConserveMemory(value: Boolean): Self = StObject.set(x, "conserveMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConserveMemoryUndefined: Self = StObject.set(x, "conserveMemory", js.undefined)
      
      @scala.inline
      def setCreateWireframe(value: Boolean): Self = StObject.set(x, "createWireframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateWireframeUndefined: Self = StObject.set(x, "createWireframe", js.undefined)
    }
  }
  
  trait DisplayName extends StObject {
    
    var displayName: String
    
    var displayValue: js.Any
  }
  object DisplayName {
    
    @scala.inline
    def apply(displayName: String, displayValue: js.Any): DisplayName = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    @scala.inline
    implicit class DisplayNameMutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayValue(value: js.Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): ForceSnapEdges = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceSnapEdges]
    }
    
    @scala.inline
    implicit class ForceSnapEdgesMutableBuilder[Self <: ForceSnapEdges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceSnapEdges(value: Boolean): Self = StObject.set(x, "forceSnapEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSnapEdgesUndefined: Self = StObject.set(x, "forceSnapEdges", js.undefined)
      
      @scala.inline
      def setForceSnapVertices(value: Boolean): Self = StObject.set(x, "forceSnapVertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSnapVerticesUndefined: Self = StObject.set(x, "forceSnapVertices", js.undefined)
      
      @scala.inline
      def setMarkupMode(value: Boolean): Self = StObject.set(x, "markupMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupModeUndefined: Self = StObject.set(x, "markupMode", js.undefined)
      
      @scala.inline
      def setRenderSnappedGeometry(value: Boolean): Self = StObject.set(x, "renderSnappedGeometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderSnappedGeometryUndefined: Self = StObject.set(x, "renderSnappedGeometry", js.undefined)
      
      @scala.inline
      def setRenderSnappedTopology(value: Boolean): Self = StObject.set(x, "renderSnappedTopology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderSnappedTopologyUndefined: Self = StObject.set(x, "renderSnappedTopology", js.undefined)
      
      @scala.inline
      def setToolName(value: String): Self = StObject.set(x, "toolName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolNameUndefined: Self = StObject.set(x, "toolName", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var inMemory: Boolean
    
    var isAsync: Boolean
  }
  object Id {
    
    @scala.inline
    def apply(id: String, inMemory: Boolean, isAsync: Boolean): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inMemory = inMemory.asInstanceOf[js.Any], isAsync = isAsync.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInMemory(value: Boolean): Self = StObject.set(x, "inMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
