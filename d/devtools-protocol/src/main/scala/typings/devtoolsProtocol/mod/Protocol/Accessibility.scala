package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accessibility {
  
  @js.native
  trait AXNode extends StObject {
    
    /**
      * The backend ID for the associated DOM node, if any.
      */
    var backendDOMNodeId: js.UndefOr[BackendNodeId] = js.native
    
    /**
      * IDs for each of this node's child nodes.
      */
    var childIds: js.UndefOr[js.Array[AXNodeId]] = js.native
    
    /**
      * The accessible description for this `Node`.
      */
    var description: js.UndefOr[AXValue] = js.native
    
    /**
      * Whether this node is ignored for accessibility
      */
    var ignored: Boolean = js.native
    
    /**
      * Collection of reasons why this node is hidden.
      */
    var ignoredReasons: js.UndefOr[js.Array[AXProperty]] = js.native
    
    /**
      * The accessible name for this `Node`.
      */
    var name: js.UndefOr[AXValue] = js.native
    
    /**
      * Unique identifier for this node.
      */
    var nodeId: AXNodeId = js.native
    
    /**
      * All other properties
      */
    var properties: js.UndefOr[js.Array[AXProperty]] = js.native
    
    /**
      * This `Node`'s role, whether explicit or implicit.
      */
    var role: js.UndefOr[AXValue] = js.native
    
    /**
      * The value for this `Node`.
      */
    var value: js.UndefOr[AXValue] = js.native
  }
  object AXNode {
    
    @scala.inline
    def apply(ignored: Boolean, nodeId: AXNodeId): AXNode = {
      val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXNode]
    }
    
    @scala.inline
    implicit class AXNodeMutableBuilder[Self <: AXNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendDOMNodeId(value: BackendNodeId): Self = StObject.set(x, "backendDOMNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendDOMNodeIdUndefined: Self = StObject.set(x, "backendDOMNodeId", js.undefined)
      
      @scala.inline
      def setChildIds(value: js.Array[AXNodeId]): Self = StObject.set(x, "childIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIdsUndefined: Self = StObject.set(x, "childIds", js.undefined)
      
      @scala.inline
      def setChildIdsVarargs(value: AXNodeId*): Self = StObject.set(x, "childIds", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: AXValue): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredReasons(value: js.Array[AXProperty]): Self = StObject.set(x, "ignoredReasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredReasonsUndefined: Self = StObject.set(x, "ignoredReasons", js.undefined)
      
      @scala.inline
      def setIgnoredReasonsVarargs(value: AXProperty*): Self = StObject.set(x, "ignoredReasons", js.Array(value :_*))
      
      @scala.inline
      def setName(value: AXValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNodeId(value: AXNodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Array[AXProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertiesVarargs(value: AXProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setRole(value: AXValue): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type AXNodeId = String
  
  @js.native
  trait AXProperty extends StObject {
    
    /**
      * The name of this property.
      */
    var name: AXPropertyName = js.native
    
    /**
      * The value of this property.
      */
    var value: AXValue = js.native
  }
  object AXProperty {
    
    @scala.inline
    def apply(name: AXPropertyName, value: AXValue): AXProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXProperty]
    }
    
    @scala.inline
    implicit class AXPropertyMutableBuilder[Self <: AXProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: AXPropertyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.busy
    - typings.devtoolsProtocol.devtoolsProtocolStrings.disabled
    - typings.devtoolsProtocol.devtoolsProtocolStrings.editable
    - typings.devtoolsProtocol.devtoolsProtocolStrings.focusable
    - typings.devtoolsProtocol.devtoolsProtocolStrings.focused
    - typings.devtoolsProtocol.devtoolsProtocolStrings.hidden
    - typings.devtoolsProtocol.devtoolsProtocolStrings.hiddenRoot
    - typings.devtoolsProtocol.devtoolsProtocolStrings.invalid
    - typings.devtoolsProtocol.devtoolsProtocolStrings.keyshortcuts
    - typings.devtoolsProtocol.devtoolsProtocolStrings.settable
    - typings.devtoolsProtocol.devtoolsProtocolStrings.roledescription
    - typings.devtoolsProtocol.devtoolsProtocolStrings.live
    - typings.devtoolsProtocol.devtoolsProtocolStrings.atomic
    - typings.devtoolsProtocol.devtoolsProtocolStrings.relevant
    - typings.devtoolsProtocol.devtoolsProtocolStrings.root
    - typings.devtoolsProtocol.devtoolsProtocolStrings.autocomplete
    - typings.devtoolsProtocol.devtoolsProtocolStrings.hasPopup
    - typings.devtoolsProtocol.devtoolsProtocolStrings.level
    - typings.devtoolsProtocol.devtoolsProtocolStrings.multiselectable
    - typings.devtoolsProtocol.devtoolsProtocolStrings.orientation
    - typings.devtoolsProtocol.devtoolsProtocolStrings.multiline
    - typings.devtoolsProtocol.devtoolsProtocolStrings.readonly
    - typings.devtoolsProtocol.devtoolsProtocolStrings.required
    - typings.devtoolsProtocol.devtoolsProtocolStrings.valuemin
    - typings.devtoolsProtocol.devtoolsProtocolStrings.valuemax
    - typings.devtoolsProtocol.devtoolsProtocolStrings.valuetext
    - typings.devtoolsProtocol.devtoolsProtocolStrings.checked
    - typings.devtoolsProtocol.devtoolsProtocolStrings.expanded
    - typings.devtoolsProtocol.devtoolsProtocolStrings.modal
    - typings.devtoolsProtocol.devtoolsProtocolStrings.pressed
    - typings.devtoolsProtocol.devtoolsProtocolStrings.selected
    - typings.devtoolsProtocol.devtoolsProtocolStrings.activedescendant
    - typings.devtoolsProtocol.devtoolsProtocolStrings.controls
    - typings.devtoolsProtocol.devtoolsProtocolStrings.describedby
    - typings.devtoolsProtocol.devtoolsProtocolStrings.details
    - typings.devtoolsProtocol.devtoolsProtocolStrings.errormessage
    - typings.devtoolsProtocol.devtoolsProtocolStrings.flowto
    - typings.devtoolsProtocol.devtoolsProtocolStrings.labelledby
    - typings.devtoolsProtocol.devtoolsProtocolStrings.owns
  */
  trait AXPropertyName extends StObject
  object AXPropertyName {
    
    @scala.inline
    def activedescendant: typings.devtoolsProtocol.devtoolsProtocolStrings.activedescendant = "activedescendant".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.activedescendant]
    
    @scala.inline
    def atomic: typings.devtoolsProtocol.devtoolsProtocolStrings.atomic = "atomic".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.atomic]
    
    @scala.inline
    def autocomplete: typings.devtoolsProtocol.devtoolsProtocolStrings.autocomplete = "autocomplete".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.autocomplete]
    
    @scala.inline
    def busy: typings.devtoolsProtocol.devtoolsProtocolStrings.busy = "busy".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.busy]
    
    @scala.inline
    def checked: typings.devtoolsProtocol.devtoolsProtocolStrings.checked = "checked".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.checked]
    
    @scala.inline
    def controls: typings.devtoolsProtocol.devtoolsProtocolStrings.controls = "controls".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.controls]
    
    @scala.inline
    def describedby: typings.devtoolsProtocol.devtoolsProtocolStrings.describedby = "describedby".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.describedby]
    
    @scala.inline
    def details: typings.devtoolsProtocol.devtoolsProtocolStrings.details = "details".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.details]
    
    @scala.inline
    def disabled: typings.devtoolsProtocol.devtoolsProtocolStrings.disabled = "disabled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.disabled]
    
    @scala.inline
    def editable: typings.devtoolsProtocol.devtoolsProtocolStrings.editable = "editable".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.editable]
    
    @scala.inline
    def errormessage: typings.devtoolsProtocol.devtoolsProtocolStrings.errormessage = "errormessage".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.errormessage]
    
    @scala.inline
    def expanded: typings.devtoolsProtocol.devtoolsProtocolStrings.expanded = "expanded".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.expanded]
    
    @scala.inline
    def flowto: typings.devtoolsProtocol.devtoolsProtocolStrings.flowto = "flowto".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.flowto]
    
    @scala.inline
    def focusable: typings.devtoolsProtocol.devtoolsProtocolStrings.focusable = "focusable".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.focusable]
    
    @scala.inline
    def focused: typings.devtoolsProtocol.devtoolsProtocolStrings.focused = "focused".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.focused]
    
    @scala.inline
    def hasPopup: typings.devtoolsProtocol.devtoolsProtocolStrings.hasPopup = "hasPopup".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.hasPopup]
    
    @scala.inline
    def hidden: typings.devtoolsProtocol.devtoolsProtocolStrings.hidden = "hidden".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.hidden]
    
    @scala.inline
    def hiddenRoot: typings.devtoolsProtocol.devtoolsProtocolStrings.hiddenRoot = "hiddenRoot".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.hiddenRoot]
    
    @scala.inline
    def invalid: typings.devtoolsProtocol.devtoolsProtocolStrings.invalid = "invalid".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.invalid]
    
    @scala.inline
    def keyshortcuts: typings.devtoolsProtocol.devtoolsProtocolStrings.keyshortcuts = "keyshortcuts".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.keyshortcuts]
    
    @scala.inline
    def labelledby: typings.devtoolsProtocol.devtoolsProtocolStrings.labelledby = "labelledby".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.labelledby]
    
    @scala.inline
    def level: typings.devtoolsProtocol.devtoolsProtocolStrings.level = "level".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.level]
    
    @scala.inline
    def live: typings.devtoolsProtocol.devtoolsProtocolStrings.live = "live".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.live]
    
    @scala.inline
    def modal: typings.devtoolsProtocol.devtoolsProtocolStrings.modal = "modal".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.modal]
    
    @scala.inline
    def multiline: typings.devtoolsProtocol.devtoolsProtocolStrings.multiline = "multiline".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.multiline]
    
    @scala.inline
    def multiselectable: typings.devtoolsProtocol.devtoolsProtocolStrings.multiselectable = "multiselectable".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.multiselectable]
    
    @scala.inline
    def orientation: typings.devtoolsProtocol.devtoolsProtocolStrings.orientation = "orientation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.orientation]
    
    @scala.inline
    def owns: typings.devtoolsProtocol.devtoolsProtocolStrings.owns = "owns".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.owns]
    
    @scala.inline
    def pressed: typings.devtoolsProtocol.devtoolsProtocolStrings.pressed = "pressed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.pressed]
    
    @scala.inline
    def readonly: typings.devtoolsProtocol.devtoolsProtocolStrings.readonly = "readonly".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.readonly]
    
    @scala.inline
    def relevant: typings.devtoolsProtocol.devtoolsProtocolStrings.relevant = "relevant".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.relevant]
    
    @scala.inline
    def required: typings.devtoolsProtocol.devtoolsProtocolStrings.required = "required".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.required]
    
    @scala.inline
    def roledescription: typings.devtoolsProtocol.devtoolsProtocolStrings.roledescription = "roledescription".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.roledescription]
    
    @scala.inline
    def root: typings.devtoolsProtocol.devtoolsProtocolStrings.root = "root".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.root]
    
    @scala.inline
    def selected: typings.devtoolsProtocol.devtoolsProtocolStrings.selected = "selected".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.selected]
    
    @scala.inline
    def settable: typings.devtoolsProtocol.devtoolsProtocolStrings.settable = "settable".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.settable]
    
    @scala.inline
    def valuemax: typings.devtoolsProtocol.devtoolsProtocolStrings.valuemax = "valuemax".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.valuemax]
    
    @scala.inline
    def valuemin: typings.devtoolsProtocol.devtoolsProtocolStrings.valuemin = "valuemin".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.valuemin]
    
    @scala.inline
    def valuetext: typings.devtoolsProtocol.devtoolsProtocolStrings.valuetext = "valuetext".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.valuetext]
  }
  
  @js.native
  trait AXRelatedNode extends StObject {
    
    /**
      * The BackendNodeId of the related DOM node.
      */
    var backendDOMNodeId: BackendNodeId = js.native
    
    /**
      * The IDRef value provided, if any.
      */
    var idref: js.UndefOr[String] = js.native
    
    /**
      * The text alternative of this node in the current context.
      */
    var text: js.UndefOr[String] = js.native
  }
  object AXRelatedNode {
    
    @scala.inline
    def apply(backendDOMNodeId: BackendNodeId): AXRelatedNode = {
      val __obj = js.Dynamic.literal(backendDOMNodeId = backendDOMNodeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXRelatedNode]
    }
    
    @scala.inline
    implicit class AXRelatedNodeMutableBuilder[Self <: AXRelatedNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendDOMNodeId(value: BackendNodeId): Self = StObject.set(x, "backendDOMNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdref(value: String): Self = StObject.set(x, "idref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdrefUndefined: Self = StObject.set(x, "idref", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait AXValue extends StObject {
    
    /**
      * One or more related nodes, if applicable.
      */
    var relatedNodes: js.UndefOr[js.Array[AXRelatedNode]] = js.native
    
    /**
      * The sources which contributed to the computation of this property.
      */
    var sources: js.UndefOr[js.Array[AXValueSource]] = js.native
    
    /**
      * The type of this value.
      */
    var `type`: AXValueType = js.native
    
    /**
      * The computed value of this property.
      */
    var value: js.UndefOr[js.Any] = js.native
  }
  object AXValue {
    
    @scala.inline
    def apply(`type`: AXValueType): AXValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXValue]
    }
    
    @scala.inline
    implicit class AXValueMutableBuilder[Self <: AXValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelatedNodes(value: js.Array[AXRelatedNode]): Self = StObject.set(x, "relatedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedNodesUndefined: Self = StObject.set(x, "relatedNodes", js.undefined)
      
      @scala.inline
      def setRelatedNodesVarargs(value: AXRelatedNode*): Self = StObject.set(x, "relatedNodes", js.Array(value :_*))
      
      @scala.inline
      def setSources(value: js.Array[AXValueSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      @scala.inline
      def setSourcesVarargs(value: AXValueSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setType(value: AXValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.figcaption
    - typings.devtoolsProtocol.devtoolsProtocolStrings.label
    - typings.devtoolsProtocol.devtoolsProtocolStrings.labelfor
    - typings.devtoolsProtocol.devtoolsProtocolStrings.labelwrapped
    - typings.devtoolsProtocol.devtoolsProtocolStrings.legend
    - typings.devtoolsProtocol.devtoolsProtocolStrings.tablecaption
    - typings.devtoolsProtocol.devtoolsProtocolStrings.title
    - typings.devtoolsProtocol.devtoolsProtocolStrings.other_
  */
  trait AXValueNativeSourceType extends StObject
  object AXValueNativeSourceType {
    
    @scala.inline
    def figcaption: typings.devtoolsProtocol.devtoolsProtocolStrings.figcaption = "figcaption".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.figcaption]
    
    @scala.inline
    def label: typings.devtoolsProtocol.devtoolsProtocolStrings.label = "label".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.label]
    
    @scala.inline
    def labelfor: typings.devtoolsProtocol.devtoolsProtocolStrings.labelfor = "labelfor".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.labelfor]
    
    @scala.inline
    def labelwrapped: typings.devtoolsProtocol.devtoolsProtocolStrings.labelwrapped = "labelwrapped".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.labelwrapped]
    
    @scala.inline
    def legend: typings.devtoolsProtocol.devtoolsProtocolStrings.legend = "legend".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.legend]
    
    @scala.inline
    def other: other_ = "other".asInstanceOf[other_]
    
    @scala.inline
    def tablecaption: typings.devtoolsProtocol.devtoolsProtocolStrings.tablecaption = "tablecaption".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.tablecaption]
    
    @scala.inline
    def title: typings.devtoolsProtocol.devtoolsProtocolStrings.title = "title".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.title]
  }
  
  @js.native
  trait AXValueSource extends StObject {
    
    /**
      * The name of the relevant attribute, if any.
      */
    var attribute: js.UndefOr[String] = js.native
    
    /**
      * The value of the relevant attribute, if any.
      */
    var attributeValue: js.UndefOr[AXValue] = js.native
    
    /**
      * Whether the value for this property is invalid.
      */
    var invalid: js.UndefOr[Boolean] = js.native
    
    /**
      * Reason for the value being invalid, if it is.
      */
    var invalidReason: js.UndefOr[String] = js.native
    
    /**
      * The native markup source for this value, e.g. a <label> element.
      */
    var nativeSource: js.UndefOr[AXValueNativeSourceType] = js.native
    
    /**
      * The value, such as a node or node list, of the native source.
      */
    var nativeSourceValue: js.UndefOr[AXValue] = js.native
    
    /**
      * Whether this source is superseded by a higher priority source.
      */
    var superseded: js.UndefOr[Boolean] = js.native
    
    /**
      * What type of source this is.
      */
    var `type`: AXValueSourceType = js.native
    
    /**
      * The value of this property source.
      */
    var value: js.UndefOr[AXValue] = js.native
  }
  object AXValueSource {
    
    @scala.inline
    def apply(`type`: AXValueSourceType): AXValueSource = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXValueSource]
    }
    
    @scala.inline
    implicit class AXValueSourceMutableBuilder[Self <: AXValueSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setAttributeValue(value: AXValue): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidReason(value: String): Self = StObject.set(x, "invalidReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidReasonUndefined: Self = StObject.set(x, "invalidReason", js.undefined)
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setNativeSource(value: AXValueNativeSourceType): Self = StObject.set(x, "nativeSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeSourceUndefined: Self = StObject.set(x, "nativeSource", js.undefined)
      
      @scala.inline
      def setNativeSourceValue(value: AXValue): Self = StObject.set(x, "nativeSourceValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeSourceValueUndefined: Self = StObject.set(x, "nativeSourceValue", js.undefined)
      
      @scala.inline
      def setSuperseded(value: Boolean): Self = StObject.set(x, "superseded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupersededUndefined: Self = StObject.set(x, "superseded", js.undefined)
      
      @scala.inline
      def setType(value: AXValueSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.attribute
    - typings.devtoolsProtocol.devtoolsProtocolStrings.`implicit`
    - typings.devtoolsProtocol.devtoolsProtocolStrings.style
    - typings.devtoolsProtocol.devtoolsProtocolStrings.contents
    - typings.devtoolsProtocol.devtoolsProtocolStrings.placeholder
    - typings.devtoolsProtocol.devtoolsProtocolStrings.relatedElement
  */
  trait AXValueSourceType extends StObject
  object AXValueSourceType {
    
    @scala.inline
    def attribute: typings.devtoolsProtocol.devtoolsProtocolStrings.attribute = "attribute".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.attribute]
    
    @scala.inline
    def contents: typings.devtoolsProtocol.devtoolsProtocolStrings.contents = "contents".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.contents]
    
    @scala.inline
    def `implicit`: typings.devtoolsProtocol.devtoolsProtocolStrings.`implicit` = "implicit".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.`implicit`]
    
    @scala.inline
    def placeholder: typings.devtoolsProtocol.devtoolsProtocolStrings.placeholder = "placeholder".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.placeholder]
    
    @scala.inline
    def relatedElement: typings.devtoolsProtocol.devtoolsProtocolStrings.relatedElement = "relatedElement".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.relatedElement]
    
    @scala.inline
    def style: typings.devtoolsProtocol.devtoolsProtocolStrings.style = "style".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.style]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.boolean
    - typings.devtoolsProtocol.devtoolsProtocolStrings.tristate
    - typings.devtoolsProtocol.devtoolsProtocolStrings.booleanOrUndefined
    - typings.devtoolsProtocol.devtoolsProtocolStrings.idref
    - typings.devtoolsProtocol.devtoolsProtocolStrings.idrefList
    - typings.devtoolsProtocol.devtoolsProtocolStrings.integer
    - typings.devtoolsProtocol.devtoolsProtocolStrings.node
    - typings.devtoolsProtocol.devtoolsProtocolStrings.nodeList
    - typings.devtoolsProtocol.devtoolsProtocolStrings.number
    - typings.devtoolsProtocol.devtoolsProtocolStrings.string
    - typings.devtoolsProtocol.devtoolsProtocolStrings.computedString
    - typings.devtoolsProtocol.devtoolsProtocolStrings.token
    - typings.devtoolsProtocol.devtoolsProtocolStrings.tokenList
    - typings.devtoolsProtocol.devtoolsProtocolStrings.domRelation
    - typings.devtoolsProtocol.devtoolsProtocolStrings.role
    - typings.devtoolsProtocol.devtoolsProtocolStrings.internalRole
    - typings.devtoolsProtocol.devtoolsProtocolStrings.valueUndefined
  */
  trait AXValueType extends StObject
  object AXValueType {
    
    @scala.inline
    def boolean: typings.devtoolsProtocol.devtoolsProtocolStrings.boolean = "boolean".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.boolean]
    
    @scala.inline
    def booleanOrUndefined: typings.devtoolsProtocol.devtoolsProtocolStrings.booleanOrUndefined = "booleanOrUndefined".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.booleanOrUndefined]
    
    @scala.inline
    def computedString: typings.devtoolsProtocol.devtoolsProtocolStrings.computedString = "computedString".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.computedString]
    
    @scala.inline
    def domRelation: typings.devtoolsProtocol.devtoolsProtocolStrings.domRelation = "domRelation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.domRelation]
    
    @scala.inline
    def idref: typings.devtoolsProtocol.devtoolsProtocolStrings.idref = "idref".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.idref]
    
    @scala.inline
    def idrefList: typings.devtoolsProtocol.devtoolsProtocolStrings.idrefList = "idrefList".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.idrefList]
    
    @scala.inline
    def integer: typings.devtoolsProtocol.devtoolsProtocolStrings.integer = "integer".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.integer]
    
    @scala.inline
    def internalRole: typings.devtoolsProtocol.devtoolsProtocolStrings.internalRole = "internalRole".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.internalRole]
    
    @scala.inline
    def node: typings.devtoolsProtocol.devtoolsProtocolStrings.node = "node".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.node]
    
    @scala.inline
    def nodeList: typings.devtoolsProtocol.devtoolsProtocolStrings.nodeList = "nodeList".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.nodeList]
    
    @scala.inline
    def number: typings.devtoolsProtocol.devtoolsProtocolStrings.number = "number".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.number]
    
    @scala.inline
    def role: typings.devtoolsProtocol.devtoolsProtocolStrings.role = "role".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.role]
    
    @scala.inline
    def string: typings.devtoolsProtocol.devtoolsProtocolStrings.string = "string".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.string]
    
    @scala.inline
    def token: typings.devtoolsProtocol.devtoolsProtocolStrings.token = "token".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.token]
    
    @scala.inline
    def tokenList: typings.devtoolsProtocol.devtoolsProtocolStrings.tokenList = "tokenList".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.tokenList]
    
    @scala.inline
    def tristate: typings.devtoolsProtocol.devtoolsProtocolStrings.tristate = "tristate".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.tristate]
    
    @scala.inline
    def valueUndefined: typings.devtoolsProtocol.devtoolsProtocolStrings.valueUndefined = "valueUndefined".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.valueUndefined]
  }
  
  @js.native
  trait GetFullAXTreeResponse extends StObject {
    
    var nodes: js.Array[AXNode] = js.native
  }
  object GetFullAXTreeResponse {
    
    @scala.inline
    def apply(nodes: js.Array[AXNode]): GetFullAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFullAXTreeResponse]
    }
    
    @scala.inline
    implicit class GetFullAXTreeResponseMutableBuilder[Self <: GetFullAXTreeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetPartialAXTreeRequest extends StObject {
    
    /**
      * Identifier of the backend node to get the partial accessibility tree for.
      */
    var backendNodeId: js.UndefOr[BackendNodeId] = js.native
    
    /**
      * Whether to fetch this nodes ancestors, siblings and children. Defaults to true.
      */
    var fetchRelatives: js.UndefOr[Boolean] = js.native
    
    /**
      * Identifier of the node to get the partial accessibility tree for.
      */
    var nodeId: js.UndefOr[NodeId] = js.native
    
    /**
      * JavaScript object id of the node wrapper to get the partial accessibility tree for.
      */
    var objectId: js.UndefOr[RemoteObjectId] = js.native
  }
  object GetPartialAXTreeRequest {
    
    @scala.inline
    def apply(): GetPartialAXTreeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPartialAXTreeRequest]
    }
    
    @scala.inline
    implicit class GetPartialAXTreeRequestMutableBuilder[Self <: GetPartialAXTreeRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
      
      @scala.inline
      def setFetchRelatives(value: Boolean): Self = StObject.set(x, "fetchRelatives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchRelativesUndefined: Self = StObject.set(x, "fetchRelatives", js.undefined)
      
      @scala.inline
      def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      @scala.inline
      def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    }
  }
  
  @js.native
  trait GetPartialAXTreeResponse extends StObject {
    
    /**
      * The `Accessibility.AXNode` for this DOM node, if it exists, plus its ancestors, siblings and
      * children, if requested.
      */
    var nodes: js.Array[AXNode] = js.native
  }
  object GetPartialAXTreeResponse {
    
    @scala.inline
    def apply(nodes: js.Array[AXNode]): GetPartialAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPartialAXTreeResponse]
    }
    
    @scala.inline
    implicit class GetPartialAXTreeResponseMutableBuilder[Self <: GetPartialAXTreeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait QueryAXTreeRequest extends StObject {
    
    /**
      * Find nodes with this computed name.
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Identifier of the backend node for the root to query.
      */
    var backendNodeId: js.UndefOr[BackendNodeId] = js.native
    
    /**
      * Identifier of the node for the root to query.
      */
    var nodeId: js.UndefOr[NodeId] = js.native
    
    /**
      * JavaScript object id of the node wrapper for the root to query.
      */
    var objectId: js.UndefOr[RemoteObjectId] = js.native
    
    /**
      * Find nodes with this computed role.
      */
    var role: js.UndefOr[String] = js.native
  }
  object QueryAXTreeRequest {
    
    @scala.inline
    def apply(): QueryAXTreeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryAXTreeRequest]
    }
    
    @scala.inline
    implicit class QueryAXTreeRequestMutableBuilder[Self <: QueryAXTreeRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      @scala.inline
      def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
      
      @scala.inline
      def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      @scala.inline
      def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  @js.native
  trait QueryAXTreeResponse extends StObject {
    
    /**
      * A list of `Accessibility.AXNode` matching the specified attributes,
      * including nodes that are ignored for accessibility.
      */
    var nodes: js.Array[AXNode] = js.native
  }
  object QueryAXTreeResponse {
    
    @scala.inline
    def apply(nodes: js.Array[AXNode]): QueryAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryAXTreeResponse]
    }
    
    @scala.inline
    implicit class QueryAXTreeResponseMutableBuilder[Self <: QueryAXTreeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
}
