package typings.dompurify

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.dompurify.anon.AllowCustomizedBuiltInElements
import typings.dompurify.anon.ConfigRETURNDOMFRAGMENTfa
import typings.dompurify.anon.ConfigRETURNDOMFRAGMENTtr
import typings.dompurify.anon.ConfigRETURNDOMtrue
import typings.dompurify.anon.ConfigRETURNTRUSTEDTYPEtr
import typings.dompurify.anon.Html
import typings.dompurify.dompurifyBooleans.`false`
import typings.dompurify.dompurifyStrings.uponSanitizeAttribute
import typings.dompurify.dompurifyStrings.uponSanitizeElement
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Window
import typings.trustedTypes.mod.global.TrustedHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dompurify", JSImport.Namespace)
  @js.native
  val ^ : createDOMPurifyI = js.native
  
  trait Config extends StObject {
    
    var ADD_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_DATA_URI_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_URI_SAFE_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_NAMESPACES: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_URI_REGEXP: js.UndefOr[js.RegExp] = js.undefined
    
    var ALLOW_ARIA_ATTR: js.UndefOr[Boolean] = js.undefined
    
    var ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.undefined
    
    var ALLOW_SELF_CLOSE_IN_ATTR: js.UndefOr[Boolean] = js.undefined
    
    var ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.undefined
    
    var CUSTOM_ELEMENT_HANDLING: js.UndefOr[AllowCustomizedBuiltInElements] = js.undefined
    
    var FORBID_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORBID_CONTENTS: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORBID_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORCE_BODY: js.UndefOr[Boolean] = js.undefined
    
    var IN_PLACE: js.UndefOr[Boolean] = js.undefined
    
    var KEEP_CONTENT: js.UndefOr[Boolean] = js.undefined
    
    /**
      * change the default namespace from HTML to something different
      */
    var NAMESPACE: js.UndefOr[String] = js.undefined
    
    var PARSER_MEDIA_TYPE: js.UndefOr[String] = js.undefined
    
    var RETURN_DOM: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This defaults to `true` starting DOMPurify 2.2.0. Note that setting it to `false`
      * might cause XSS from attacks hidden in closed shadowroots in case the browser
      * supports Declarative Shadow: DOM https://web.dev/declarative-shadow-dom/
      */
    var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] = js.undefined
    
    var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.undefined
    
    var SANITIZE_DOM: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var SANITIZE_NAMED_PROPS: js.UndefOr[Boolean] = js.undefined
    
    var USE_PROFILES: js.UndefOr[`false` | Html] = js.undefined
    
    var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setADD_ATTR(value: js.Array[String]): Self = StObject.set(x, "ADD_ATTR", value.asInstanceOf[js.Any])
      
      inline def setADD_ATTRUndefined: Self = StObject.set(x, "ADD_ATTR", js.undefined)
      
      inline def setADD_ATTRVarargs(value: String*): Self = StObject.set(x, "ADD_ATTR", js.Array(value*))
      
      inline def setADD_DATA_URI_TAGS(value: js.Array[String]): Self = StObject.set(x, "ADD_DATA_URI_TAGS", value.asInstanceOf[js.Any])
      
      inline def setADD_DATA_URI_TAGSUndefined: Self = StObject.set(x, "ADD_DATA_URI_TAGS", js.undefined)
      
      inline def setADD_DATA_URI_TAGSVarargs(value: String*): Self = StObject.set(x, "ADD_DATA_URI_TAGS", js.Array(value*))
      
      inline def setADD_TAGS(value: js.Array[String]): Self = StObject.set(x, "ADD_TAGS", value.asInstanceOf[js.Any])
      
      inline def setADD_TAGSUndefined: Self = StObject.set(x, "ADD_TAGS", js.undefined)
      
      inline def setADD_TAGSVarargs(value: String*): Self = StObject.set(x, "ADD_TAGS", js.Array(value*))
      
      inline def setADD_URI_SAFE_ATTR(value: js.Array[String]): Self = StObject.set(x, "ADD_URI_SAFE_ATTR", value.asInstanceOf[js.Any])
      
      inline def setADD_URI_SAFE_ATTRUndefined: Self = StObject.set(x, "ADD_URI_SAFE_ATTR", js.undefined)
      
      inline def setADD_URI_SAFE_ATTRVarargs(value: String*): Self = StObject.set(x, "ADD_URI_SAFE_ATTR", js.Array(value*))
      
      inline def setALLOWED_ATTR(value: js.Array[String]): Self = StObject.set(x, "ALLOWED_ATTR", value.asInstanceOf[js.Any])
      
      inline def setALLOWED_ATTRUndefined: Self = StObject.set(x, "ALLOWED_ATTR", js.undefined)
      
      inline def setALLOWED_ATTRVarargs(value: String*): Self = StObject.set(x, "ALLOWED_ATTR", js.Array(value*))
      
      inline def setALLOWED_NAMESPACES(value: js.Array[String]): Self = StObject.set(x, "ALLOWED_NAMESPACES", value.asInstanceOf[js.Any])
      
      inline def setALLOWED_NAMESPACESUndefined: Self = StObject.set(x, "ALLOWED_NAMESPACES", js.undefined)
      
      inline def setALLOWED_NAMESPACESVarargs(value: String*): Self = StObject.set(x, "ALLOWED_NAMESPACES", js.Array(value*))
      
      inline def setALLOWED_TAGS(value: js.Array[String]): Self = StObject.set(x, "ALLOWED_TAGS", value.asInstanceOf[js.Any])
      
      inline def setALLOWED_TAGSUndefined: Self = StObject.set(x, "ALLOWED_TAGS", js.undefined)
      
      inline def setALLOWED_TAGSVarargs(value: String*): Self = StObject.set(x, "ALLOWED_TAGS", js.Array(value*))
      
      inline def setALLOWED_URI_REGEXP(value: js.RegExp): Self = StObject.set(x, "ALLOWED_URI_REGEXP", value.asInstanceOf[js.Any])
      
      inline def setALLOWED_URI_REGEXPUndefined: Self = StObject.set(x, "ALLOWED_URI_REGEXP", js.undefined)
      
      inline def setALLOW_ARIA_ATTR(value: Boolean): Self = StObject.set(x, "ALLOW_ARIA_ATTR", value.asInstanceOf[js.Any])
      
      inline def setALLOW_ARIA_ATTRUndefined: Self = StObject.set(x, "ALLOW_ARIA_ATTR", js.undefined)
      
      inline def setALLOW_DATA_ATTR(value: Boolean): Self = StObject.set(x, "ALLOW_DATA_ATTR", value.asInstanceOf[js.Any])
      
      inline def setALLOW_DATA_ATTRUndefined: Self = StObject.set(x, "ALLOW_DATA_ATTR", js.undefined)
      
      inline def setALLOW_SELF_CLOSE_IN_ATTR(value: Boolean): Self = StObject.set(x, "ALLOW_SELF_CLOSE_IN_ATTR", value.asInstanceOf[js.Any])
      
      inline def setALLOW_SELF_CLOSE_IN_ATTRUndefined: Self = StObject.set(x, "ALLOW_SELF_CLOSE_IN_ATTR", js.undefined)
      
      inline def setALLOW_UNKNOWN_PROTOCOLS(value: Boolean): Self = StObject.set(x, "ALLOW_UNKNOWN_PROTOCOLS", value.asInstanceOf[js.Any])
      
      inline def setALLOW_UNKNOWN_PROTOCOLSUndefined: Self = StObject.set(x, "ALLOW_UNKNOWN_PROTOCOLS", js.undefined)
      
      inline def setCUSTOM_ELEMENT_HANDLING(value: AllowCustomizedBuiltInElements): Self = StObject.set(x, "CUSTOM_ELEMENT_HANDLING", value.asInstanceOf[js.Any])
      
      inline def setCUSTOM_ELEMENT_HANDLINGUndefined: Self = StObject.set(x, "CUSTOM_ELEMENT_HANDLING", js.undefined)
      
      inline def setFORBID_ATTR(value: js.Array[String]): Self = StObject.set(x, "FORBID_ATTR", value.asInstanceOf[js.Any])
      
      inline def setFORBID_ATTRUndefined: Self = StObject.set(x, "FORBID_ATTR", js.undefined)
      
      inline def setFORBID_ATTRVarargs(value: String*): Self = StObject.set(x, "FORBID_ATTR", js.Array(value*))
      
      inline def setFORBID_CONTENTS(value: js.Array[String]): Self = StObject.set(x, "FORBID_CONTENTS", value.asInstanceOf[js.Any])
      
      inline def setFORBID_CONTENTSUndefined: Self = StObject.set(x, "FORBID_CONTENTS", js.undefined)
      
      inline def setFORBID_CONTENTSVarargs(value: String*): Self = StObject.set(x, "FORBID_CONTENTS", js.Array(value*))
      
      inline def setFORBID_TAGS(value: js.Array[String]): Self = StObject.set(x, "FORBID_TAGS", value.asInstanceOf[js.Any])
      
      inline def setFORBID_TAGSUndefined: Self = StObject.set(x, "FORBID_TAGS", js.undefined)
      
      inline def setFORBID_TAGSVarargs(value: String*): Self = StObject.set(x, "FORBID_TAGS", js.Array(value*))
      
      inline def setFORCE_BODY(value: Boolean): Self = StObject.set(x, "FORCE_BODY", value.asInstanceOf[js.Any])
      
      inline def setFORCE_BODYUndefined: Self = StObject.set(x, "FORCE_BODY", js.undefined)
      
      inline def setIN_PLACE(value: Boolean): Self = StObject.set(x, "IN_PLACE", value.asInstanceOf[js.Any])
      
      inline def setIN_PLACEUndefined: Self = StObject.set(x, "IN_PLACE", js.undefined)
      
      inline def setKEEP_CONTENT(value: Boolean): Self = StObject.set(x, "KEEP_CONTENT", value.asInstanceOf[js.Any])
      
      inline def setKEEP_CONTENTUndefined: Self = StObject.set(x, "KEEP_CONTENT", js.undefined)
      
      inline def setNAMESPACE(value: String): Self = StObject.set(x, "NAMESPACE", value.asInstanceOf[js.Any])
      
      inline def setNAMESPACEUndefined: Self = StObject.set(x, "NAMESPACE", js.undefined)
      
      inline def setPARSER_MEDIA_TYPE(value: String): Self = StObject.set(x, "PARSER_MEDIA_TYPE", value.asInstanceOf[js.Any])
      
      inline def setPARSER_MEDIA_TYPEUndefined: Self = StObject.set(x, "PARSER_MEDIA_TYPE", js.undefined)
      
      inline def setRETURN_DOM(value: Boolean): Self = StObject.set(x, "RETURN_DOM", value.asInstanceOf[js.Any])
      
      inline def setRETURN_DOMUndefined: Self = StObject.set(x, "RETURN_DOM", js.undefined)
      
      inline def setRETURN_DOM_FRAGMENT(value: Boolean): Self = StObject.set(x, "RETURN_DOM_FRAGMENT", value.asInstanceOf[js.Any])
      
      inline def setRETURN_DOM_FRAGMENTUndefined: Self = StObject.set(x, "RETURN_DOM_FRAGMENT", js.undefined)
      
      inline def setRETURN_DOM_IMPORT(value: Boolean): Self = StObject.set(x, "RETURN_DOM_IMPORT", value.asInstanceOf[js.Any])
      
      inline def setRETURN_DOM_IMPORTUndefined: Self = StObject.set(x, "RETURN_DOM_IMPORT", js.undefined)
      
      inline def setRETURN_TRUSTED_TYPE(value: Boolean): Self = StObject.set(x, "RETURN_TRUSTED_TYPE", value.asInstanceOf[js.Any])
      
      inline def setRETURN_TRUSTED_TYPEUndefined: Self = StObject.set(x, "RETURN_TRUSTED_TYPE", js.undefined)
      
      inline def setSAFE_FOR_TEMPLATES(value: Boolean): Self = StObject.set(x, "SAFE_FOR_TEMPLATES", value.asInstanceOf[js.Any])
      
      inline def setSAFE_FOR_TEMPLATESUndefined: Self = StObject.set(x, "SAFE_FOR_TEMPLATES", js.undefined)
      
      inline def setSANITIZE_DOM(value: Boolean): Self = StObject.set(x, "SANITIZE_DOM", value.asInstanceOf[js.Any])
      
      inline def setSANITIZE_DOMUndefined: Self = StObject.set(x, "SANITIZE_DOM", js.undefined)
      
      inline def setSANITIZE_NAMED_PROPS(value: Boolean): Self = StObject.set(x, "SANITIZE_NAMED_PROPS", value.asInstanceOf[js.Any])
      
      inline def setSANITIZE_NAMED_PROPSUndefined: Self = StObject.set(x, "SANITIZE_NAMED_PROPS", js.undefined)
      
      inline def setUSE_PROFILES(value: `false` | Html): Self = StObject.set(x, "USE_PROFILES", value.asInstanceOf[js.Any])
      
      inline def setUSE_PROFILESUndefined: Self = StObject.set(x, "USE_PROFILES", js.undefined)
      
      inline def setWHOLE_DOCUMENT(value: Boolean): Self = StObject.set(x, "WHOLE_DOCUMENT", value.asInstanceOf[js.Any])
      
      inline def setWHOLE_DOCUMENTUndefined: Self = StObject.set(x, "WHOLE_DOCUMENT", js.undefined)
    }
  }
  
  @js.native
  trait DOMPurifyI extends StObject {
    
    def addHook(
      hook: HookName,
      cb: js.Function3[/* currentNode */ Element, /* data */ HookEvent, /* config */ Config, Unit]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_uponSanitizeAttribute(
      hook: uponSanitizeAttribute,
      cb: js.Function3[
          /* currentNode */ Element, 
          /* data */ SanitizeAttributeHookEvent, 
          /* config */ Config, 
          Unit
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_uponSanitizeElement(
      hook: uponSanitizeElement,
      cb: js.Function3[
          /* currentNode */ Element, 
          /* data */ SanitizeElementHookEvent, 
          /* config */ Config, 
          Unit
        ]
    ): Unit = js.native
    
    def clearConfig(): Unit = js.native
    
    var isSupported: Boolean = js.native
    
    def isValidAttribute(tag: String, attr: String, value: String): Boolean = js.native
    
    def removeAllHooks(): Unit = js.native
    
    def removeHook(entryPoint: HookName): Unit = js.native
    
    def removeHooks(entryPoint: HookName): Unit = js.native
    
    var removed: js.Array[Any] = js.native
    
    def sanitize(source: String): String = js.native
    def sanitize(source: String, config: ConfigRETURNDOMFRAGMENTfa): String = js.native
    def sanitize(source: String, config: ConfigRETURNDOMFRAGMENTtr): DocumentFragment = js.native
    def sanitize(source: String, config: ConfigRETURNDOMtrue): HTMLElement = js.native
    def sanitize(source: String, config: ConfigRETURNTRUSTEDTYPEtr): TrustedHTML = js.native
    def sanitize(source: String, config: Config): String | HTMLElement | DocumentFragment = js.native
    def sanitize(source: Node): String = js.native
    def sanitize(source: Node, config: ConfigRETURNDOMFRAGMENTfa): String = js.native
    def sanitize(source: Node, config: ConfigRETURNDOMFRAGMENTtr): DocumentFragment = js.native
    def sanitize(source: Node, config: ConfigRETURNDOMtrue): HTMLElement = js.native
    def sanitize(source: Node, config: ConfigRETURNTRUSTEDTYPEtr): TrustedHTML = js.native
    def sanitize(source: Node, config: Config): String | HTMLElement | DocumentFragment = js.native
    
    def setConfig(cfg: Config): Unit = js.native
    
    var version: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dompurify.mod.SanitizeElementHookEvent
    - typings.dompurify.mod.SanitizeAttributeHookEvent
    - scala.Null
  */
  type HookEvent = _HookEvent | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.dompurify.dompurifyStrings.beforeSanitizeElements
    - typings.dompurify.dompurifyStrings.uponSanitizeElement
    - typings.dompurify.dompurifyStrings.afterSanitizeElements
    - typings.dompurify.dompurifyStrings.beforeSanitizeAttributes
    - typings.dompurify.dompurifyStrings.uponSanitizeAttribute
    - typings.dompurify.dompurifyStrings.afterSanitizeAttributes
    - typings.dompurify.dompurifyStrings.beforeSanitizeShadowDOM
    - typings.dompurify.dompurifyStrings.uponSanitizeShadowNode
    - typings.dompurify.dompurifyStrings.afterSanitizeShadowDOM
  */
  trait HookName extends StObject
  object HookName {
    
    inline def afterSanitizeAttributes: typings.dompurify.dompurifyStrings.afterSanitizeAttributes = "afterSanitizeAttributes".asInstanceOf[typings.dompurify.dompurifyStrings.afterSanitizeAttributes]
    
    inline def afterSanitizeElements: typings.dompurify.dompurifyStrings.afterSanitizeElements = "afterSanitizeElements".asInstanceOf[typings.dompurify.dompurifyStrings.afterSanitizeElements]
    
    inline def afterSanitizeShadowDOM: typings.dompurify.dompurifyStrings.afterSanitizeShadowDOM = "afterSanitizeShadowDOM".asInstanceOf[typings.dompurify.dompurifyStrings.afterSanitizeShadowDOM]
    
    inline def beforeSanitizeAttributes: typings.dompurify.dompurifyStrings.beforeSanitizeAttributes = "beforeSanitizeAttributes".asInstanceOf[typings.dompurify.dompurifyStrings.beforeSanitizeAttributes]
    
    inline def beforeSanitizeElements: typings.dompurify.dompurifyStrings.beforeSanitizeElements = "beforeSanitizeElements".asInstanceOf[typings.dompurify.dompurifyStrings.beforeSanitizeElements]
    
    inline def beforeSanitizeShadowDOM: typings.dompurify.dompurifyStrings.beforeSanitizeShadowDOM = "beforeSanitizeShadowDOM".asInstanceOf[typings.dompurify.dompurifyStrings.beforeSanitizeShadowDOM]
    
    inline def uponSanitizeAttribute: typings.dompurify.dompurifyStrings.uponSanitizeAttribute = "uponSanitizeAttribute".asInstanceOf[typings.dompurify.dompurifyStrings.uponSanitizeAttribute]
    
    inline def uponSanitizeElement: typings.dompurify.dompurifyStrings.uponSanitizeElement = "uponSanitizeElement".asInstanceOf[typings.dompurify.dompurifyStrings.uponSanitizeElement]
    
    inline def uponSanitizeShadowNode: typings.dompurify.dompurifyStrings.uponSanitizeShadowNode = "uponSanitizeShadowNode".asInstanceOf[typings.dompurify.dompurifyStrings.uponSanitizeShadowNode]
  }
  
  trait SanitizeAttributeHookEvent
    extends StObject
       with _HookEvent {
    
    var allowedAttributes: StringDictionary[Boolean]
    
    var attrName: String
    
    var attrValue: String
    
    var forceKeepAttr: js.UndefOr[Boolean] = js.undefined
    
    var keepAttr: Boolean
  }
  object SanitizeAttributeHookEvent {
    
    inline def apply(
      allowedAttributes: StringDictionary[Boolean],
      attrName: String,
      attrValue: String,
      keepAttr: Boolean
    ): SanitizeAttributeHookEvent = {
      val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], attrValue = attrValue.asInstanceOf[js.Any], keepAttr = keepAttr.asInstanceOf[js.Any])
      __obj.asInstanceOf[SanitizeAttributeHookEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SanitizeAttributeHookEvent] (val x: Self) extends AnyVal {
      
      inline def setAllowedAttributes(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedAttributes", value.asInstanceOf[js.Any])
      
      inline def setAttrName(value: String): Self = StObject.set(x, "attrName", value.asInstanceOf[js.Any])
      
      inline def setAttrValue(value: String): Self = StObject.set(x, "attrValue", value.asInstanceOf[js.Any])
      
      inline def setForceKeepAttr(value: Boolean): Self = StObject.set(x, "forceKeepAttr", value.asInstanceOf[js.Any])
      
      inline def setForceKeepAttrUndefined: Self = StObject.set(x, "forceKeepAttr", js.undefined)
      
      inline def setKeepAttr(value: Boolean): Self = StObject.set(x, "keepAttr", value.asInstanceOf[js.Any])
    }
  }
  
  trait SanitizeElementHookEvent
    extends StObject
       with _HookEvent {
    
    var allowedTags: StringDictionary[Boolean]
    
    var tagName: String
  }
  object SanitizeElementHookEvent {
    
    inline def apply(allowedTags: StringDictionary[Boolean], tagName: String): SanitizeElementHookEvent = {
      val __obj = js.Dynamic.literal(allowedTags = allowedTags.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SanitizeElementHookEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SanitizeElementHookEvent] (val x: Self) extends AnyVal {
      
      inline def setAllowedTags(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick</ * globalThis * / any, 'NodeFilter' | 'Node' | 'Element' | 'HTMLTemplateElement' | 'DocumentFragment' | 'HTMLFormElement' | 'DOMParser' | 'NamedNodeMap'> */
  trait WindowLike extends StObject {
    
    var DOMParser: js.UndefOr[Any] = js.undefined
    
    var DocumentFragment: js.UndefOr[Any] = js.undefined
    
    var Element: js.UndefOr[Any] = js.undefined
    
    var HTMLFormElement: js.UndefOr[Any] = js.undefined
    
    var HTMLTemplateElement: js.UndefOr[Any] = js.undefined
    
    var NamedNodeMap: js.UndefOr[Any] = js.undefined
    
    var Node: js.UndefOr[Any] = js.undefined
    
    var NodeFilter: js.UndefOr[Any] = js.undefined
  }
  object WindowLike {
    
    inline def apply(): WindowLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowLike] (val x: Self) extends AnyVal {
      
      inline def setDOMParser(value: Any): Self = StObject.set(x, "DOMParser", value.asInstanceOf[js.Any])
      
      inline def setDOMParserUndefined: Self = StObject.set(x, "DOMParser", js.undefined)
      
      inline def setDocumentFragment(value: Any): Self = StObject.set(x, "DocumentFragment", value.asInstanceOf[js.Any])
      
      inline def setDocumentFragmentUndefined: Self = StObject.set(x, "DocumentFragment", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "Element", js.undefined)
      
      inline def setHTMLFormElement(value: Any): Self = StObject.set(x, "HTMLFormElement", value.asInstanceOf[js.Any])
      
      inline def setHTMLFormElementUndefined: Self = StObject.set(x, "HTMLFormElement", js.undefined)
      
      inline def setHTMLTemplateElement(value: Any): Self = StObject.set(x, "HTMLTemplateElement", value.asInstanceOf[js.Any])
      
      inline def setHTMLTemplateElementUndefined: Self = StObject.set(x, "HTMLTemplateElement", js.undefined)
      
      inline def setNamedNodeMap(value: Any): Self = StObject.set(x, "NamedNodeMap", value.asInstanceOf[js.Any])
      
      inline def setNamedNodeMapUndefined: Self = StObject.set(x, "NamedNodeMap", js.undefined)
      
      inline def setNode(value: Any): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
      
      inline def setNodeFilter(value: Any): Self = StObject.set(x, "NodeFilter", value.asInstanceOf[js.Any])
      
      inline def setNodeFilterUndefined: Self = StObject.set(x, "NodeFilter", js.undefined)
      
      inline def setNodeUndefined: Self = StObject.set(x, "Node", js.undefined)
    }
  }
  
  trait _HookEvent extends StObject
  object _HookEvent {
    
    inline def SanitizeAttributeHookEvent(
      allowedAttributes: StringDictionary[Boolean],
      attrName: String,
      attrValue: String,
      keepAttr: Boolean
    ): typings.dompurify.mod.SanitizeAttributeHookEvent = {
      val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], attrValue = attrValue.asInstanceOf[js.Any], keepAttr = keepAttr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dompurify.mod.SanitizeAttributeHookEvent]
    }
    
    inline def SanitizeElementHookEvent(allowedTags: StringDictionary[Boolean], tagName: String): typings.dompurify.mod.SanitizeElementHookEvent = {
      val __obj = js.Dynamic.literal(allowedTags = allowedTags.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dompurify.mod.SanitizeElementHookEvent]
    }
  }
  
  type _To = createDOMPurifyI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: createDOMPurifyI = ^
  
  @js.native
  trait createDOMPurifyI
    extends StObject
       with DOMPurifyI {
    
    def apply(): DOMPurifyI = js.native
    def apply(window: WindowLike): DOMPurifyI = js.native
    def apply(window: Window): DOMPurifyI = js.native
  }
}
