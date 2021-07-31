package typings.dompurify

import typings.dompurify.dompurifyBooleans.`false`
import typings.dompurify.dompurifyBooleans.`true`
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined dompurify.dompurify.Config & {  RETURN_DOM_FRAGMENT :false | undefined,   RETURN_DOM :false | undefined} */
  trait ConfigRETURNDOMFRAGMENTfa extends StObject {
    
    var ADD_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_DATA_URI_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_URI_REGEXP: js.UndefOr[RegExp] = js.undefined
    
    var ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.undefined
    
    var ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.undefined
    
    var FORBID_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORBID_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORCE_BODY: js.UndefOr[Boolean] = js.undefined
    
    var IN_PLACE: js.UndefOr[Boolean] = js.undefined
    
    var KEEP_CONTENT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] = js.undefined
    
    var SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.undefined
    
    var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.undefined
    
    var SANITIZE_DOM: js.UndefOr[Boolean] = js.undefined
    
    var USE_PROFILES: js.UndefOr[`false` | Html] = js.undefined
    
    var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigRETURNDOMFRAGMENTfa {
    
    @scala.inline
    def apply(
      RETURN_DOM: js.UndefOr[Boolean] & js.UndefOr[`false`],
      RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] & js.UndefOr[`false`]
    ): ConfigRETURNDOMFRAGMENTfa = {
      val __obj = js.Dynamic.literal(RETURN_DOM = RETURN_DOM.asInstanceOf[js.Any], RETURN_DOM_FRAGMENT = RETURN_DOM_FRAGMENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigRETURNDOMFRAGMENTfa]
    }
    
    @scala.inline
    implicit class ConfigRETURNDOMFRAGMENTfaMutableBuilder[Self <: ConfigRETURNDOMFRAGMENTfa] (val x: Self) extends AnyVal {
      
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
      def setRETURN_DOM(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "RETURN_DOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRETURN_DOM_FRAGMENT(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "RETURN_DOM_FRAGMENT", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined dompurify.dompurify.Config & {  RETURN_DOM_FRAGMENT :true} */
  trait ConfigRETURNDOMFRAGMENTtr extends StObject {
    
    var ADD_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_DATA_URI_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_URI_REGEXP: js.UndefOr[RegExp] = js.undefined
    
    var ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.undefined
    
    var ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.undefined
    
    var FORBID_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORBID_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORCE_BODY: js.UndefOr[Boolean] = js.undefined
    
    var IN_PLACE: js.UndefOr[Boolean] = js.undefined
    
    var KEEP_CONTENT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] & `true`
    
    var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] = js.undefined
    
    var SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.undefined
    
    var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.undefined
    
    var SANITIZE_DOM: js.UndefOr[Boolean] = js.undefined
    
    var USE_PROFILES: js.UndefOr[`false` | Html] = js.undefined
    
    var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigRETURNDOMFRAGMENTtr {
    
    @scala.inline
    def apply(RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] & `true`): ConfigRETURNDOMFRAGMENTtr = {
      val __obj = js.Dynamic.literal(RETURN_DOM_FRAGMENT = RETURN_DOM_FRAGMENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigRETURNDOMFRAGMENTtr]
    }
    
    @scala.inline
    implicit class ConfigRETURNDOMFRAGMENTtrMutableBuilder[Self <: ConfigRETURNDOMFRAGMENTtr] (val x: Self) extends AnyVal {
      
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
      def setRETURN_DOM_FRAGMENT(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "RETURN_DOM_FRAGMENT", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined dompurify.dompurify.Config & {  RETURN_DOM :true} */
  trait ConfigRETURNDOMtrue extends StObject {
    
    var ADD_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_DATA_URI_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_URI_REGEXP: js.UndefOr[RegExp] = js.undefined
    
    var ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.undefined
    
    var ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.undefined
    
    var FORBID_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORBID_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORCE_BODY: js.UndefOr[Boolean] = js.undefined
    
    var IN_PLACE: js.UndefOr[Boolean] = js.undefined
    
    var KEEP_CONTENT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM: js.UndefOr[Boolean] & `true`
    
    var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] = js.undefined
    
    var SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.undefined
    
    var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.undefined
    
    var SANITIZE_DOM: js.UndefOr[Boolean] = js.undefined
    
    var USE_PROFILES: js.UndefOr[`false` | Html] = js.undefined
    
    var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigRETURNDOMtrue {
    
    @scala.inline
    def apply(RETURN_DOM: js.UndefOr[Boolean] & `true`): ConfigRETURNDOMtrue = {
      val __obj = js.Dynamic.literal(RETURN_DOM = RETURN_DOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigRETURNDOMtrue]
    }
    
    @scala.inline
    implicit class ConfigRETURNDOMtrueMutableBuilder[Self <: ConfigRETURNDOMtrue] (val x: Self) extends AnyVal {
      
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
      def setRETURN_DOM(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "RETURN_DOM", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined dompurify.dompurify.Config & {  RETURN_TRUSTED_TYPE :true} */
  trait ConfigRETURNTRUSTEDTYPEtr extends StObject {
    
    var ADD_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_DATA_URI_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ADD_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var ALLOWED_URI_REGEXP: js.UndefOr[RegExp] = js.undefined
    
    var ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.undefined
    
    var ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.undefined
    
    var FORBID_ATTR: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORBID_TAGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var FORCE_BODY: js.UndefOr[Boolean] = js.undefined
    
    var IN_PLACE: js.UndefOr[Boolean] = js.undefined
    
    var KEEP_CONTENT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.undefined
    
    var RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] & `true`
    
    var SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.undefined
    
    var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.undefined
    
    var SANITIZE_DOM: js.UndefOr[Boolean] = js.undefined
    
    var USE_PROFILES: js.UndefOr[`false` | Html] = js.undefined
    
    var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigRETURNTRUSTEDTYPEtr {
    
    @scala.inline
    def apply(RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] & `true`): ConfigRETURNTRUSTEDTYPEtr = {
      val __obj = js.Dynamic.literal(RETURN_TRUSTED_TYPE = RETURN_TRUSTED_TYPE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigRETURNTRUSTEDTYPEtr]
    }
    
    @scala.inline
    implicit class ConfigRETURNTRUSTEDTYPEtrMutableBuilder[Self <: ConfigRETURNTRUSTEDTYPEtr] (val x: Self) extends AnyVal {
      
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
      def setRETURN_TRUSTED_TYPE(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "RETURN_TRUSTED_TYPE", value.asInstanceOf[js.Any])
      
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
  
  trait Html extends StObject {
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var mathMl: js.UndefOr[Boolean] = js.undefined
    
    var svg: js.UndefOr[Boolean] = js.undefined
    
    var svgFilters: js.UndefOr[Boolean] = js.undefined
  }
  object Html {
    
    @scala.inline
    def apply(): Html = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setMathMl(value: Boolean): Self = StObject.set(x, "mathMl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathMlUndefined: Self = StObject.set(x, "mathMl", js.undefined)
      
      @scala.inline
      def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgFilters(value: Boolean): Self = StObject.set(x, "svgFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgFiltersUndefined: Self = StObject.set(x, "svgFilters", js.undefined)
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
}
