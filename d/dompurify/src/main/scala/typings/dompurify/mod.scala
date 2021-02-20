package typings.dompurify

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
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
import typings.std.RegExp
import typings.std.Window
import typings.trustedTypes.mod.global.TrustedHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dompurify", JSImport.Namespace)
  @js.native
  val ^ : createDOMPurifyI = js.native
  
  @js.native
  trait Config extends StObject {
    
    var ADD_ATTR: js.UndefOr[js.Array[String]] = js.native
    
    var ADD_DATA_URI_TAGS: js.UndefOr[js.Array[String]] = js.native
    
    var ADD_TAGS: js.UndefOr[js.Array[String]] = js.native
    
    var ALLOWED_ATTR: js.UndefOr[js.Array[String]] = js.native
    
    var ALLOWED_TAGS: js.UndefOr[js.Array[String]] = js.native
    
    var ALLOWED_URI_REGEXP: js.UndefOr[RegExp] = js.native
    
    var ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.native
    
    var ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.native
    
    var FORBID_ATTR: js.UndefOr[js.Array[String]] = js.native
    
    var FORBID_TAGS: js.UndefOr[js.Array[String]] = js.native
    
    var FORCE_BODY: js.UndefOr[Boolean] = js.native
    
    var IN_PLACE: js.UndefOr[Boolean] = js.native
    
    var KEEP_CONTENT: js.UndefOr[Boolean] = js.native
    
    var RETURN_DOM: js.UndefOr[Boolean] = js.native
    
    var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] = js.native
    
    var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.native
    
    var RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] = js.native
    
    var SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.native
    
    var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.native
    
    var SANITIZE_DOM: js.UndefOr[Boolean] = js.native
    
    var USE_PROFILES: js.UndefOr[`false` | Html] = js.native
    
    var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADD_ATTR(value: js.Array[String]): Self = StObject.set(x, "ADD_ATTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADD_ATTRUndefined: Self = StObject.set(x, "ADD_ATTR", js.undefined)
      
      @scala.inline
      def setADD_ATTRVarargs(value: String*): Self = StObject.set(x, "ADD_ATTR", js.Array(value :_*))
      
      @scala.inline
      def setADD_DATA_URI_TAGS(value: js.Array[String]): Self = StObject.set(x, "ADD_DATA_URI_TAGS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADD_DATA_URI_TAGSUndefined: Self = StObject.set(x, "ADD_DATA_URI_TAGS", js.undefined)
      
      @scala.inline
      def setADD_DATA_URI_TAGSVarargs(value: String*): Self = StObject.set(x, "ADD_DATA_URI_TAGS", js.Array(value :_*))
      
      @scala.inline
      def setADD_TAGS(value: js.Array[String]): Self = StObject.set(x, "ADD_TAGS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADD_TAGSUndefined: Self = StObject.set(x, "ADD_TAGS", js.undefined)
      
      @scala.inline
      def setADD_TAGSVarargs(value: String*): Self = StObject.set(x, "ADD_TAGS", js.Array(value :_*))
      
      @scala.inline
      def setALLOWED_ATTR(value: js.Array[String]): Self = StObject.set(x, "ALLOWED_ATTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALLOWED_ATTRUndefined: Self = StObject.set(x, "ALLOWED_ATTR", js.undefined)
      
      @scala.inline
      def setALLOWED_ATTRVarargs(value: String*): Self = StObject.set(x, "ALLOWED_ATTR", js.Array(value :_*))
      
      @scala.inline
      def setALLOWED_TAGS(value: js.Array[String]): Self = StObject.set(x, "ALLOWED_TAGS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALLOWED_TAGSUndefined: Self = StObject.set(x, "ALLOWED_TAGS", js.undefined)
      
      @scala.inline
      def setALLOWED_TAGSVarargs(value: String*): Self = StObject.set(x, "ALLOWED_TAGS", js.Array(value :_*))
      
      @scala.inline
      def setALLOWED_URI_REGEXP(value: RegExp): Self = StObject.set(x, "ALLOWED_URI_REGEXP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALLOWED_URI_REGEXPUndefined: Self = StObject.set(x, "ALLOWED_URI_REGEXP", js.undefined)
      
      @scala.inline
      def setALLOW_DATA_ATTR(value: Boolean): Self = StObject.set(x, "ALLOW_DATA_ATTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALLOW_DATA_ATTRUndefined: Self = StObject.set(x, "ALLOW_DATA_ATTR", js.undefined)
      
      @scala.inline
      def setALLOW_UNKNOWN_PROTOCOLS(value: Boolean): Self = StObject.set(x, "ALLOW_UNKNOWN_PROTOCOLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALLOW_UNKNOWN_PROTOCOLSUndefined: Self = StObject.set(x, "ALLOW_UNKNOWN_PROTOCOLS", js.undefined)
      
      @scala.inline
      def setFORBID_ATTR(value: js.Array[String]): Self = StObject.set(x, "FORBID_ATTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFORBID_ATTRUndefined: Self = StObject.set(x, "FORBID_ATTR", js.undefined)
      
      @scala.inline
      def setFORBID_ATTRVarargs(value: String*): Self = StObject.set(x, "FORBID_ATTR", js.Array(value :_*))
      
      @scala.inline
      def setFORBID_TAGS(value: js.Array[String]): Self = StObject.set(x, "FORBID_TAGS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFORBID_TAGSUndefined: Self = StObject.set(x, "FORBID_TAGS", js.undefined)
      
      @scala.inline
      def setFORBID_TAGSVarargs(value: String*): Self = StObject.set(x, "FORBID_TAGS", js.Array(value :_*))
      
      @scala.inline
      def setFORCE_BODY(value: Boolean): Self = StObject.set(x, "FORCE_BODY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFORCE_BODYUndefined: Self = StObject.set(x, "FORCE_BODY", js.undefined)
      
      @scala.inline
      def setIN_PLACE(value: Boolean): Self = StObject.set(x, "IN_PLACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIN_PLACEUndefined: Self = StObject.set(x, "IN_PLACE", js.undefined)
      
      @scala.inline
      def setKEEP_CONTENT(value: Boolean): Self = StObject.set(x, "KEEP_CONTENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKEEP_CONTENTUndefined: Self = StObject.set(x, "KEEP_CONTENT", js.undefined)
      
      @scala.inline
      def setRETURN_DOM(value: Boolean): Self = StObject.set(x, "RETURN_DOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRETURN_DOMUndefined: Self = StObject.set(x, "RETURN_DOM", js.undefined)
      
      @scala.inline
      def setRETURN_DOM_FRAGMENT(value: Boolean): Self = StObject.set(x, "RETURN_DOM_FRAGMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRETURN_DOM_FRAGMENTUndefined: Self = StObject.set(x, "RETURN_DOM_FRAGMENT", js.undefined)
      
      @scala.inline
      def setRETURN_DOM_IMPORT(value: Boolean): Self = StObject.set(x, "RETURN_DOM_IMPORT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRETURN_DOM_IMPORTUndefined: Self = StObject.set(x, "RETURN_DOM_IMPORT", js.undefined)
      
      @scala.inline
      def setRETURN_TRUSTED_TYPE(value: Boolean): Self = StObject.set(x, "RETURN_TRUSTED_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRETURN_TRUSTED_TYPEUndefined: Self = StObject.set(x, "RETURN_TRUSTED_TYPE", js.undefined)
      
      @scala.inline
      def setSAFE_FOR_JQUERY(value: Boolean): Self = StObject.set(x, "SAFE_FOR_JQUERY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSAFE_FOR_JQUERYUndefined: Self = StObject.set(x, "SAFE_FOR_JQUERY", js.undefined)
      
      @scala.inline
      def setSAFE_FOR_TEMPLATES(value: Boolean): Self = StObject.set(x, "SAFE_FOR_TEMPLATES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSAFE_FOR_TEMPLATESUndefined: Self = StObject.set(x, "SAFE_FOR_TEMPLATES", js.undefined)
      
      @scala.inline
      def setSANITIZE_DOM(value: Boolean): Self = StObject.set(x, "SANITIZE_DOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSANITIZE_DOMUndefined: Self = StObject.set(x, "SANITIZE_DOM", js.undefined)
      
      @scala.inline
      def setUSE_PROFILES(value: `false` | Html): Self = StObject.set(x, "USE_PROFILES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSE_PROFILESUndefined: Self = StObject.set(x, "USE_PROFILES", js.undefined)
      
      @scala.inline
      def setWHOLE_DOCUMENT(value: Boolean): Self = StObject.set(x, "WHOLE_DOCUMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWHOLE_DOCUMENTUndefined: Self = StObject.set(x, "WHOLE_DOCUMENT", js.undefined)
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
    
    var removed: js.Array[_] = js.native
    
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
    
    @scala.inline
    def afterSanitizeAttributes: typings.dompurify.dompurifyStrings.afterSanitizeAttributes = "afterSanitizeAttributes".asInstanceOf[typings.dompurify.dompurifyStrings.afterSanitizeAttributes]
    
    @scala.inline
    def afterSanitizeElements: typings.dompurify.dompurifyStrings.afterSanitizeElements = "afterSanitizeElements".asInstanceOf[typings.dompurify.dompurifyStrings.afterSanitizeElements]
    
    @scala.inline
    def afterSanitizeShadowDOM: typings.dompurify.dompurifyStrings.afterSanitizeShadowDOM = "afterSanitizeShadowDOM".asInstanceOf[typings.dompurify.dompurifyStrings.afterSanitizeShadowDOM]
    
    @scala.inline
    def beforeSanitizeAttributes: typings.dompurify.dompurifyStrings.beforeSanitizeAttributes = "beforeSanitizeAttributes".asInstanceOf[typings.dompurify.dompurifyStrings.beforeSanitizeAttributes]
    
    @scala.inline
    def beforeSanitizeElements: typings.dompurify.dompurifyStrings.beforeSanitizeElements = "beforeSanitizeElements".asInstanceOf[typings.dompurify.dompurifyStrings.beforeSanitizeElements]
    
    @scala.inline
    def beforeSanitizeShadowDOM: typings.dompurify.dompurifyStrings.beforeSanitizeShadowDOM = "beforeSanitizeShadowDOM".asInstanceOf[typings.dompurify.dompurifyStrings.beforeSanitizeShadowDOM]
    
    @scala.inline
    def uponSanitizeAttribute: typings.dompurify.dompurifyStrings.uponSanitizeAttribute = "uponSanitizeAttribute".asInstanceOf[typings.dompurify.dompurifyStrings.uponSanitizeAttribute]
    
    @scala.inline
    def uponSanitizeElement: typings.dompurify.dompurifyStrings.uponSanitizeElement = "uponSanitizeElement".asInstanceOf[typings.dompurify.dompurifyStrings.uponSanitizeElement]
    
    @scala.inline
    def uponSanitizeShadowNode: typings.dompurify.dompurifyStrings.uponSanitizeShadowNode = "uponSanitizeShadowNode".asInstanceOf[typings.dompurify.dompurifyStrings.uponSanitizeShadowNode]
  }
  
  @js.native
  trait SanitizeAttributeHookEvent extends _HookEvent {
    
    var allowedAttributes: StringDictionary[Boolean] = js.native
    
    var attrName: String = js.native
    
    var attrValue: String = js.native
    
    var keepAttr: Boolean = js.native
  }
  object SanitizeAttributeHookEvent {
    
    @scala.inline
    def apply(
      allowedAttributes: StringDictionary[Boolean],
      attrName: String,
      attrValue: String,
      keepAttr: Boolean
    ): SanitizeAttributeHookEvent = {
      val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], attrValue = attrValue.asInstanceOf[js.Any], keepAttr = keepAttr.asInstanceOf[js.Any])
      __obj.asInstanceOf[SanitizeAttributeHookEvent]
    }
    
    @scala.inline
    implicit class SanitizeAttributeHookEventMutableBuilder[Self <: SanitizeAttributeHookEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedAttributes(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrName(value: String): Self = StObject.set(x, "attrName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrValue(value: String): Self = StObject.set(x, "attrValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAttr(value: Boolean): Self = StObject.set(x, "keepAttr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SanitizeElementHookEvent extends _HookEvent {
    
    var allowedTags: StringDictionary[Boolean] = js.native
    
    var tagName: String = js.native
  }
  object SanitizeElementHookEvent {
    
    @scala.inline
    def apply(allowedTags: StringDictionary[Boolean], tagName: String): SanitizeElementHookEvent = {
      val __obj = js.Dynamic.literal(allowedTags = allowedTags.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SanitizeElementHookEvent]
    }
    
    @scala.inline
    implicit class SanitizeElementHookEventMutableBuilder[Self <: SanitizeElementHookEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedTags(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait _HookEvent extends StObject
  object _HookEvent {
    
    @scala.inline
    def SanitizeAttributeHookEvent(
      allowedAttributes: StringDictionary[Boolean],
      attrName: String,
      attrValue: String,
      keepAttr: Boolean
    ): typings.dompurify.mod.SanitizeAttributeHookEvent = {
      val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], attrValue = attrValue.asInstanceOf[js.Any], keepAttr = keepAttr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dompurify.mod.SanitizeAttributeHookEvent]
    }
    
    @scala.inline
    def SanitizeElementHookEvent(allowedTags: StringDictionary[Boolean], tagName: String): typings.dompurify.mod.SanitizeElementHookEvent = {
      val __obj = js.Dynamic.literal(allowedTags = allowedTags.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dompurify.mod.SanitizeElementHookEvent]
    }
  }
  
  type _To = createDOMPurifyI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: createDOMPurifyI = ^
  
  @js.native
  trait createDOMPurifyI extends DOMPurifyI {
    
    def apply(): DOMPurifyI = js.native
    def apply(window: Window): DOMPurifyI = js.native
  }
}
