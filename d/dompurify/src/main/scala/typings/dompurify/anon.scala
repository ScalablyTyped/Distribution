package typings.dompurify

import typings.dompurify.dompurifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowCustomizedBuiltInElements extends StObject {
    
    var allowCustomizedBuiltInElements: js.UndefOr[Boolean] = js.undefined
    
    var attributeNameCheck: js.UndefOr[js.RegExp | (js.Function1[/* lcName */ String, Boolean]) | Null] = js.undefined
    
    var tagNameCheck: js.UndefOr[js.RegExp | (js.Function1[/* tagName */ String, Boolean]) | Null] = js.undefined
  }
  object AllowCustomizedBuiltInElements {
    
    inline def apply(): AllowCustomizedBuiltInElements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowCustomizedBuiltInElements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowCustomizedBuiltInElements] (val x: Self) extends AnyVal {
      
      inline def setAllowCustomizedBuiltInElements(value: Boolean): Self = StObject.set(x, "allowCustomizedBuiltInElements", value.asInstanceOf[js.Any])
      
      inline def setAllowCustomizedBuiltInElementsUndefined: Self = StObject.set(x, "allowCustomizedBuiltInElements", js.undefined)
      
      inline def setAttributeNameCheck(value: js.RegExp | (js.Function1[/* lcName */ String, Boolean])): Self = StObject.set(x, "attributeNameCheck", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameCheckFunction1(value: /* lcName */ String => Boolean): Self = StObject.set(x, "attributeNameCheck", js.Any.fromFunction1(value))
      
      inline def setAttributeNameCheckNull: Self = StObject.set(x, "attributeNameCheck", null)
      
      inline def setAttributeNameCheckUndefined: Self = StObject.set(x, "attributeNameCheck", js.undefined)
      
      inline def setTagNameCheck(value: js.RegExp | (js.Function1[/* tagName */ String, Boolean])): Self = StObject.set(x, "tagNameCheck", value.asInstanceOf[js.Any])
      
      inline def setTagNameCheckFunction1(value: /* tagName */ String => Boolean): Self = StObject.set(x, "tagNameCheck", js.Any.fromFunction1(value))
      
      inline def setTagNameCheckNull: Self = StObject.set(x, "tagNameCheck", null)
      
      inline def setTagNameCheckUndefined: Self = StObject.set(x, "tagNameCheck", js.undefined)
    }
  }
  
  /* Inlined dompurify.dompurify.Config & {  RETURN_DOM_FRAGMENT :false | undefined,   RETURN_DOM :false | undefined} */
  trait ConfigRETURNDOMFRAGMENTfa extends StObject {
    
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
  object ConfigRETURNDOMFRAGMENTfa {
    
    inline def apply(): ConfigRETURNDOMFRAGMENTfa = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigRETURNDOMFRAGMENTfa]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigRETURNDOMFRAGMENTfa] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined dompurify.dompurify.Config & {  RETURN_DOM_FRAGMENT :true} */
  trait ConfigRETURNDOMFRAGMENTtr extends StObject {
    
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
  object ConfigRETURNDOMFRAGMENTtr {
    
    inline def apply(): ConfigRETURNDOMFRAGMENTtr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigRETURNDOMFRAGMENTtr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigRETURNDOMFRAGMENTtr] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined dompurify.dompurify.Config & {  RETURN_DOM :true} */
  trait ConfigRETURNDOMtrue extends StObject {
    
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
  object ConfigRETURNDOMtrue {
    
    inline def apply(): ConfigRETURNDOMtrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigRETURNDOMtrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigRETURNDOMtrue] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined dompurify.dompurify.Config & {  RETURN_TRUSTED_TYPE :true} */
  trait ConfigRETURNTRUSTEDTYPEtr extends StObject {
    
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
  object ConfigRETURNTRUSTEDTYPEtr {
    
    inline def apply(): ConfigRETURNTRUSTEDTYPEtr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigRETURNTRUSTEDTYPEtr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigRETURNTRUSTEDTYPEtr] (val x: Self) extends AnyVal {
      
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
  
  trait Html extends StObject {
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var mathMl: js.UndefOr[Boolean] = js.undefined
    
    var svg: js.UndefOr[Boolean] = js.undefined
    
    var svgFilters: js.UndefOr[Boolean] = js.undefined
  }
  object Html {
    
    inline def apply(): Html = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setMathMl(value: Boolean): Self = StObject.set(x, "mathMl", value.asInstanceOf[js.Any])
      
      inline def setMathMlUndefined: Self = StObject.set(x, "mathMl", js.undefined)
      
      inline def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgFilters(value: Boolean): Self = StObject.set(x, "svgFilters", value.asInstanceOf[js.Any])
      
      inline def setSvgFiltersUndefined: Self = StObject.set(x, "svgFilters", js.undefined)
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
}
