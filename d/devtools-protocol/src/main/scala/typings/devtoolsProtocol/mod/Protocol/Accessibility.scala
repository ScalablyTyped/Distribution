package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accessibility {
  
  trait AXNode extends StObject {
    
    /**
      * The backend ID for the associated DOM node, if any.
      */
    var backendDOMNodeId: js.UndefOr[BackendNodeId] = js.undefined
    
    /**
      * IDs for each of this node's child nodes.
      */
    var childIds: js.UndefOr[js.Array[AXNodeId]] = js.undefined
    
    /**
      * The accessible description for this `Node`.
      */
    var description: js.UndefOr[AXValue] = js.undefined
    
    /**
      * Whether this node is ignored for accessibility
      */
    var ignored: Boolean
    
    /**
      * Collection of reasons why this node is hidden.
      */
    var ignoredReasons: js.UndefOr[js.Array[AXProperty]] = js.undefined
    
    /**
      * The accessible name for this `Node`.
      */
    var name: js.UndefOr[AXValue] = js.undefined
    
    /**
      * Unique identifier for this node.
      */
    var nodeId: AXNodeId
    
    /**
      * All other properties
      */
    var properties: js.UndefOr[js.Array[AXProperty]] = js.undefined
    
    /**
      * This `Node`'s role, whether explicit or implicit.
      */
    var role: js.UndefOr[AXValue] = js.undefined
    
    /**
      * The value for this `Node`.
      */
    var value: js.UndefOr[AXValue] = js.undefined
  }
  object AXNode {
    
    inline def apply(ignored: Boolean, nodeId: AXNodeId): AXNode = {
      val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXNode]
    }
    
    extension [Self <: AXNode](x: Self) {
      
      inline def setBackendDOMNodeId(value: BackendNodeId): Self = StObject.set(x, "backendDOMNodeId", value.asInstanceOf[js.Any])
      
      inline def setBackendDOMNodeIdUndefined: Self = StObject.set(x, "backendDOMNodeId", js.undefined)
      
      inline def setChildIds(value: js.Array[AXNodeId]): Self = StObject.set(x, "childIds", value.asInstanceOf[js.Any])
      
      inline def setChildIdsUndefined: Self = StObject.set(x, "childIds", js.undefined)
      
      inline def setChildIdsVarargs(value: AXNodeId*): Self = StObject.set(x, "childIds", js.Array(value :_*))
      
      inline def setDescription(value: AXValue): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredReasons(value: js.Array[AXProperty]): Self = StObject.set(x, "ignoredReasons", value.asInstanceOf[js.Any])
      
      inline def setIgnoredReasonsUndefined: Self = StObject.set(x, "ignoredReasons", js.undefined)
      
      inline def setIgnoredReasonsVarargs(value: AXProperty*): Self = StObject.set(x, "ignoredReasons", js.Array(value :_*))
      
      inline def setName(value: AXValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNodeId(value: AXNodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[AXProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: AXProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      inline def setRole(value: AXValue): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type AXNodeId = String
  
  trait AXProperty extends StObject {
    
    /**
      * The name of this property.
      */
    var name: AXPropertyName
    
    /**
      * The value of this property.
      */
    var value: AXValue
  }
  object AXProperty {
    
    inline def apply(name: AXPropertyName, value: AXValue): AXProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXProperty]
    }
    
    extension [Self <: AXProperty](x: Self) {
      
      inline def setName(value: AXPropertyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    inline def activedescendant: typings.devtoolsProtocol.devtoolsProtocolStrings.activedescendant = "activedescendant".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.activedescendant]
    
    inline def atomic: typings.devtoolsProtocol.devtoolsProtocolStrings.atomic = "atomic".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.atomic]
    
    inline def autocomplete: typings.devtoolsProtocol.devtoolsProtocolStrings.autocomplete = "autocomplete".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.autocomplete]
    
    inline def busy: typings.devtoolsProtocol.devtoolsProtocolStrings.busy = "busy".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.busy]
    
    inline def checked: typings.devtoolsProtocol.devtoolsProtocolStrings.checked = "checked".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.checked]
    
    inline def controls: typings.devtoolsProtocol.devtoolsProtocolStrings.controls = "controls".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.controls]
    
    inline def describedby: typings.devtoolsProtocol.devtoolsProtocolStrings.describedby = "describedby".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.describedby]
    
    inline def details: typings.devtoolsProtocol.devtoolsProtocolStrings.details = "details".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.details]
    
    inline def disabled: typings.devtoolsProtocol.devtoolsProtocolStrings.disabled = "disabled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.disabled]
    
    inline def editable: typings.devtoolsProtocol.devtoolsProtocolStrings.editable = "editable".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.editable]
    
    inline def errormessage: typings.devtoolsProtocol.devtoolsProtocolStrings.errormessage = "errormessage".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.errormessage]
    
    inline def expanded: typings.devtoolsProtocol.devtoolsProtocolStrings.expanded = "expanded".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.expanded]
    
    inline def flowto: typings.devtoolsProtocol.devtoolsProtocolStrings.flowto = "flowto".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.flowto]
    
    inline def focusable: typings.devtoolsProtocol.devtoolsProtocolStrings.focusable = "focusable".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.focusable]
    
    inline def focused: typings.devtoolsProtocol.devtoolsProtocolStrings.focused = "focused".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.focused]
    
    inline def hasPopup: typings.devtoolsProtocol.devtoolsProtocolStrings.hasPopup = "hasPopup".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.hasPopup]
    
    inline def hidden: typings.devtoolsProtocol.devtoolsProtocolStrings.hidden = "hidden".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.hidden]
    
    inline def hiddenRoot: typings.devtoolsProtocol.devtoolsProtocolStrings.hiddenRoot = "hiddenRoot".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.hiddenRoot]
    
    inline def invalid: typings.devtoolsProtocol.devtoolsProtocolStrings.invalid = "invalid".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.invalid]
    
    inline def keyshortcuts: typings.devtoolsProtocol.devtoolsProtocolStrings.keyshortcuts = "keyshortcuts".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.keyshortcuts]
    
    inline def labelledby: typings.devtoolsProtocol.devtoolsProtocolStrings.labelledby = "labelledby".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.labelledby]
    
    inline def level: typings.devtoolsProtocol.devtoolsProtocolStrings.level = "level".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.level]
    
    inline def live: typings.devtoolsProtocol.devtoolsProtocolStrings.live = "live".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.live]
    
    inline def modal: typings.devtoolsProtocol.devtoolsProtocolStrings.modal = "modal".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.modal]
    
    inline def multiline: typings.devtoolsProtocol.devtoolsProtocolStrings.multiline = "multiline".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.multiline]
    
    inline def multiselectable: typings.devtoolsProtocol.devtoolsProtocolStrings.multiselectable = "multiselectable".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.multiselectable]
    
    inline def orientation: typings.devtoolsProtocol.devtoolsProtocolStrings.orientation = "orientation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.orientation]
    
    inline def owns: typings.devtoolsProtocol.devtoolsProtocolStrings.owns = "owns".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.owns]
    
    inline def pressed: typings.devtoolsProtocol.devtoolsProtocolStrings.pressed = "pressed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.pressed]
    
    inline def readonly: typings.devtoolsProtocol.devtoolsProtocolStrings.readonly = "readonly".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.readonly]
    
    inline def relevant: typings.devtoolsProtocol.devtoolsProtocolStrings.relevant = "relevant".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.relevant]
    
    inline def required: typings.devtoolsProtocol.devtoolsProtocolStrings.required = "required".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.required]
    
    inline def roledescription: typings.devtoolsProtocol.devtoolsProtocolStrings.roledescription = "roledescription".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.roledescription]
    
    inline def root: typings.devtoolsProtocol.devtoolsProtocolStrings.root = "root".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.root]
    
    inline def selected: typings.devtoolsProtocol.devtoolsProtocolStrings.selected = "selected".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.selected]
    
    inline def settable: typings.devtoolsProtocol.devtoolsProtocolStrings.settable = "settable".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.settable]
    
    inline def valuemax: typings.devtoolsProtocol.devtoolsProtocolStrings.valuemax = "valuemax".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.valuemax]
    
    inline def valuemin: typings.devtoolsProtocol.devtoolsProtocolStrings.valuemin = "valuemin".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.valuemin]
    
    inline def valuetext: typings.devtoolsProtocol.devtoolsProtocolStrings.valuetext = "valuetext".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.valuetext]
  }
  
  trait AXRelatedNode extends StObject {
    
    /**
      * The BackendNodeId of the related DOM node.
      */
    var backendDOMNodeId: BackendNodeId
    
    /**
      * The IDRef value provided, if any.
      */
    var idref: js.UndefOr[String] = js.undefined
    
    /**
      * The text alternative of this node in the current context.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object AXRelatedNode {
    
    inline def apply(backendDOMNodeId: BackendNodeId): AXRelatedNode = {
      val __obj = js.Dynamic.literal(backendDOMNodeId = backendDOMNodeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXRelatedNode]
    }
    
    extension [Self <: AXRelatedNode](x: Self) {
      
      inline def setBackendDOMNodeId(value: BackendNodeId): Self = StObject.set(x, "backendDOMNodeId", value.asInstanceOf[js.Any])
      
      inline def setIdref(value: String): Self = StObject.set(x, "idref", value.asInstanceOf[js.Any])
      
      inline def setIdrefUndefined: Self = StObject.set(x, "idref", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait AXValue extends StObject {
    
    /**
      * One or more related nodes, if applicable.
      */
    var relatedNodes: js.UndefOr[js.Array[AXRelatedNode]] = js.undefined
    
    /**
      * The sources which contributed to the computation of this property.
      */
    var sources: js.UndefOr[js.Array[AXValueSource]] = js.undefined
    
    /**
      * The type of this value.
      */
    var `type`: AXValueType
    
    /**
      * The computed value of this property.
      */
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object AXValue {
    
    inline def apply(`type`: AXValueType): AXValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXValue]
    }
    
    extension [Self <: AXValue](x: Self) {
      
      inline def setRelatedNodes(value: js.Array[AXRelatedNode]): Self = StObject.set(x, "relatedNodes", value.asInstanceOf[js.Any])
      
      inline def setRelatedNodesUndefined: Self = StObject.set(x, "relatedNodes", js.undefined)
      
      inline def setRelatedNodesVarargs(value: AXRelatedNode*): Self = StObject.set(x, "relatedNodes", js.Array(value :_*))
      
      inline def setSources(value: js.Array[AXValueSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: AXValueSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      inline def setType(value: AXValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
    
    inline def figcaption: typings.devtoolsProtocol.devtoolsProtocolStrings.figcaption = "figcaption".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.figcaption]
    
    inline def label: typings.devtoolsProtocol.devtoolsProtocolStrings.label = "label".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.label]
    
    inline def labelfor: typings.devtoolsProtocol.devtoolsProtocolStrings.labelfor = "labelfor".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.labelfor]
    
    inline def labelwrapped: typings.devtoolsProtocol.devtoolsProtocolStrings.labelwrapped = "labelwrapped".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.labelwrapped]
    
    inline def legend: typings.devtoolsProtocol.devtoolsProtocolStrings.legend = "legend".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.legend]
    
    inline def other: other_ = "other".asInstanceOf[other_]
    
    inline def tablecaption: typings.devtoolsProtocol.devtoolsProtocolStrings.tablecaption = "tablecaption".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.tablecaption]
    
    inline def title: typings.devtoolsProtocol.devtoolsProtocolStrings.title = "title".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.title]
  }
  
  trait AXValueSource extends StObject {
    
    /**
      * The name of the relevant attribute, if any.
      */
    var attribute: js.UndefOr[String] = js.undefined
    
    /**
      * The value of the relevant attribute, if any.
      */
    var attributeValue: js.UndefOr[AXValue] = js.undefined
    
    /**
      * Whether the value for this property is invalid.
      */
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reason for the value being invalid, if it is.
      */
    var invalidReason: js.UndefOr[String] = js.undefined
    
    /**
      * The native markup source for this value, e.g. a <label> element.
      */
    var nativeSource: js.UndefOr[AXValueNativeSourceType] = js.undefined
    
    /**
      * The value, such as a node or node list, of the native source.
      */
    var nativeSourceValue: js.UndefOr[AXValue] = js.undefined
    
    /**
      * Whether this source is superseded by a higher priority source.
      */
    var superseded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * What type of source this is.
      */
    var `type`: AXValueSourceType
    
    /**
      * The value of this property source.
      */
    var value: js.UndefOr[AXValue] = js.undefined
  }
  object AXValueSource {
    
    inline def apply(`type`: AXValueSourceType): AXValueSource = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXValueSource]
    }
    
    extension [Self <: AXValueSource](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setAttributeValue(value: AXValue): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidReason(value: String): Self = StObject.set(x, "invalidReason", value.asInstanceOf[js.Any])
      
      inline def setInvalidReasonUndefined: Self = StObject.set(x, "invalidReason", js.undefined)
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setNativeSource(value: AXValueNativeSourceType): Self = StObject.set(x, "nativeSource", value.asInstanceOf[js.Any])
      
      inline def setNativeSourceUndefined: Self = StObject.set(x, "nativeSource", js.undefined)
      
      inline def setNativeSourceValue(value: AXValue): Self = StObject.set(x, "nativeSourceValue", value.asInstanceOf[js.Any])
      
      inline def setNativeSourceValueUndefined: Self = StObject.set(x, "nativeSourceValue", js.undefined)
      
      inline def setSuperseded(value: Boolean): Self = StObject.set(x, "superseded", value.asInstanceOf[js.Any])
      
      inline def setSupersededUndefined: Self = StObject.set(x, "superseded", js.undefined)
      
      inline def setType(value: AXValueSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
    
    inline def attribute: typings.devtoolsProtocol.devtoolsProtocolStrings.attribute = "attribute".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.attribute]
    
    inline def contents: typings.devtoolsProtocol.devtoolsProtocolStrings.contents = "contents".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.contents]
    
    inline def `implicit`: typings.devtoolsProtocol.devtoolsProtocolStrings.`implicit` = "implicit".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.`implicit`]
    
    inline def placeholder: typings.devtoolsProtocol.devtoolsProtocolStrings.placeholder = "placeholder".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.placeholder]
    
    inline def relatedElement: typings.devtoolsProtocol.devtoolsProtocolStrings.relatedElement = "relatedElement".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.relatedElement]
    
    inline def style: typings.devtoolsProtocol.devtoolsProtocolStrings.style = "style".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.style]
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
    
    inline def boolean: typings.devtoolsProtocol.devtoolsProtocolStrings.boolean = "boolean".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.boolean]
    
    inline def booleanOrUndefined: typings.devtoolsProtocol.devtoolsProtocolStrings.booleanOrUndefined = "booleanOrUndefined".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.booleanOrUndefined]
    
    inline def computedString: typings.devtoolsProtocol.devtoolsProtocolStrings.computedString = "computedString".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.computedString]
    
    inline def domRelation: typings.devtoolsProtocol.devtoolsProtocolStrings.domRelation = "domRelation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.domRelation]
    
    inline def idref: typings.devtoolsProtocol.devtoolsProtocolStrings.idref = "idref".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.idref]
    
    inline def idrefList: typings.devtoolsProtocol.devtoolsProtocolStrings.idrefList = "idrefList".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.idrefList]
    
    inline def integer: typings.devtoolsProtocol.devtoolsProtocolStrings.integer = "integer".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.integer]
    
    inline def internalRole: typings.devtoolsProtocol.devtoolsProtocolStrings.internalRole = "internalRole".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.internalRole]
    
    inline def node: typings.devtoolsProtocol.devtoolsProtocolStrings.node = "node".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.node]
    
    inline def nodeList: typings.devtoolsProtocol.devtoolsProtocolStrings.nodeList = "nodeList".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.nodeList]
    
    inline def number: typings.devtoolsProtocol.devtoolsProtocolStrings.number = "number".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.number]
    
    inline def role: typings.devtoolsProtocol.devtoolsProtocolStrings.role = "role".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.role]
    
    inline def string: typings.devtoolsProtocol.devtoolsProtocolStrings.string = "string".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.string]
    
    inline def token: typings.devtoolsProtocol.devtoolsProtocolStrings.token = "token".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.token]
    
    inline def tokenList: typings.devtoolsProtocol.devtoolsProtocolStrings.tokenList = "tokenList".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.tokenList]
    
    inline def tristate: typings.devtoolsProtocol.devtoolsProtocolStrings.tristate = "tristate".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.tristate]
    
    inline def valueUndefined: typings.devtoolsProtocol.devtoolsProtocolStrings.valueUndefined = "valueUndefined".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.valueUndefined]
  }
  
  trait GetFullAXTreeResponse extends StObject {
    
    var nodes: js.Array[AXNode]
  }
  object GetFullAXTreeResponse {
    
    inline def apply(nodes: js.Array[AXNode]): GetFullAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFullAXTreeResponse]
    }
    
    extension [Self <: GetFullAXTreeResponse](x: Self) {
      
      inline def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  trait GetPartialAXTreeRequest extends StObject {
    
    /**
      * Identifier of the backend node to get the partial accessibility tree for.
      */
    var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
    
    /**
      * Whether to fetch this nodes ancestors, siblings and children. Defaults to true.
      */
    var fetchRelatives: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Identifier of the node to get the partial accessibility tree for.
      */
    var nodeId: js.UndefOr[NodeId] = js.undefined
    
    /**
      * JavaScript object id of the node wrapper to get the partial accessibility tree for.
      */
    var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  }
  object GetPartialAXTreeRequest {
    
    inline def apply(): GetPartialAXTreeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPartialAXTreeRequest]
    }
    
    extension [Self <: GetPartialAXTreeRequest](x: Self) {
      
      inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
      
      inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
      
      inline def setFetchRelatives(value: Boolean): Self = StObject.set(x, "fetchRelatives", value.asInstanceOf[js.Any])
      
      inline def setFetchRelativesUndefined: Self = StObject.set(x, "fetchRelatives", js.undefined)
      
      inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    }
  }
  
  trait GetPartialAXTreeResponse extends StObject {
    
    /**
      * The `Accessibility.AXNode` for this DOM node, if it exists, plus its ancestors, siblings and
      * children, if requested.
      */
    var nodes: js.Array[AXNode]
  }
  object GetPartialAXTreeResponse {
    
    inline def apply(nodes: js.Array[AXNode]): GetPartialAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPartialAXTreeResponse]
    }
    
    extension [Self <: GetPartialAXTreeResponse](x: Self) {
      
      inline def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  trait QueryAXTreeRequest extends StObject {
    
    /**
      * Find nodes with this computed name.
      */
    var accessibleName: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier of the backend node for the root to query.
      */
    var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
    
    /**
      * Identifier of the node for the root to query.
      */
    var nodeId: js.UndefOr[NodeId] = js.undefined
    
    /**
      * JavaScript object id of the node wrapper for the root to query.
      */
    var objectId: js.UndefOr[RemoteObjectId] = js.undefined
    
    /**
      * Find nodes with this computed role.
      */
    var role: js.UndefOr[String] = js.undefined
  }
  object QueryAXTreeRequest {
    
    inline def apply(): QueryAXTreeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryAXTreeRequest]
    }
    
    extension [Self <: QueryAXTreeRequest](x: Self) {
      
      inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
      
      inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
      
      inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  trait QueryAXTreeResponse extends StObject {
    
    /**
      * A list of `Accessibility.AXNode` matching the specified attributes,
      * including nodes that are ignored for accessibility.
      */
    var nodes: js.Array[AXNode]
  }
  object QueryAXTreeResponse {
    
    inline def apply(nodes: js.Array[AXNode]): QueryAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryAXTreeResponse]
    }
    
    extension [Self <: QueryAXTreeResponse](x: Self) {
      
      inline def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
}
