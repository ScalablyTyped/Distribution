package typings.dompurify.anon

import typings.dompurify.dompurifyBooleans.`false`
import typings.dompurify.dompurifyBooleans.`true`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dompurify.dompurify.Config & {  RETURN_DOM_FRAGMENT :true} */
@js.native
trait ConfigRETURNDOMFRAGMENTtr extends js.Object {
  
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
  
  var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] with `true` = js.native
  
  var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.native
  
  var RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] = js.native
  
  var SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.native
  
  var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.native
  
  var SANITIZE_DOM: js.UndefOr[Boolean] = js.native
  
  var USE_PROFILES: js.UndefOr[`false` | Html] = js.native
  
  var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.native
}
object ConfigRETURNDOMFRAGMENTtr {
  
  @scala.inline
  def apply(RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] with `true`): ConfigRETURNDOMFRAGMENTtr = {
    val __obj = js.Dynamic.literal(RETURN_DOM_FRAGMENT = RETURN_DOM_FRAGMENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRETURNDOMFRAGMENTtr]
  }
  
  @scala.inline
  implicit class ConfigRETURNDOMFRAGMENTtrOps[Self <: ConfigRETURNDOMFRAGMENTtr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRETURN_DOM_FRAGMENT(value: js.UndefOr[Boolean] with `true`): Self = this.set("RETURN_DOM_FRAGMENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADD_ATTRVarargs(value: String*): Self = this.set("ADD_ATTR", js.Array(value :_*))
    
    @scala.inline
    def setADD_ATTR(value: js.Array[String]): Self = this.set("ADD_ATTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteADD_ATTR: Self = this.set("ADD_ATTR", js.undefined)
    
    @scala.inline
    def setADD_DATA_URI_TAGSVarargs(value: String*): Self = this.set("ADD_DATA_URI_TAGS", js.Array(value :_*))
    
    @scala.inline
    def setADD_DATA_URI_TAGS(value: js.Array[String]): Self = this.set("ADD_DATA_URI_TAGS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteADD_DATA_URI_TAGS: Self = this.set("ADD_DATA_URI_TAGS", js.undefined)
    
    @scala.inline
    def setADD_TAGSVarargs(value: String*): Self = this.set("ADD_TAGS", js.Array(value :_*))
    
    @scala.inline
    def setADD_TAGS(value: js.Array[String]): Self = this.set("ADD_TAGS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteADD_TAGS: Self = this.set("ADD_TAGS", js.undefined)
    
    @scala.inline
    def setALLOWED_ATTRVarargs(value: String*): Self = this.set("ALLOWED_ATTR", js.Array(value :_*))
    
    @scala.inline
    def setALLOWED_ATTR(value: js.Array[String]): Self = this.set("ALLOWED_ATTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteALLOWED_ATTR: Self = this.set("ALLOWED_ATTR", js.undefined)
    
    @scala.inline
    def setALLOWED_TAGSVarargs(value: String*): Self = this.set("ALLOWED_TAGS", js.Array(value :_*))
    
    @scala.inline
    def setALLOWED_TAGS(value: js.Array[String]): Self = this.set("ALLOWED_TAGS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteALLOWED_TAGS: Self = this.set("ALLOWED_TAGS", js.undefined)
    
    @scala.inline
    def setALLOWED_URI_REGEXP(value: RegExp): Self = this.set("ALLOWED_URI_REGEXP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteALLOWED_URI_REGEXP: Self = this.set("ALLOWED_URI_REGEXP", js.undefined)
    
    @scala.inline
    def setALLOW_DATA_ATTR(value: Boolean): Self = this.set("ALLOW_DATA_ATTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteALLOW_DATA_ATTR: Self = this.set("ALLOW_DATA_ATTR", js.undefined)
    
    @scala.inline
    def setALLOW_UNKNOWN_PROTOCOLS(value: Boolean): Self = this.set("ALLOW_UNKNOWN_PROTOCOLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteALLOW_UNKNOWN_PROTOCOLS: Self = this.set("ALLOW_UNKNOWN_PROTOCOLS", js.undefined)
    
    @scala.inline
    def setFORBID_ATTRVarargs(value: String*): Self = this.set("FORBID_ATTR", js.Array(value :_*))
    
    @scala.inline
    def setFORBID_ATTR(value: js.Array[String]): Self = this.set("FORBID_ATTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFORBID_ATTR: Self = this.set("FORBID_ATTR", js.undefined)
    
    @scala.inline
    def setFORBID_TAGSVarargs(value: String*): Self = this.set("FORBID_TAGS", js.Array(value :_*))
    
    @scala.inline
    def setFORBID_TAGS(value: js.Array[String]): Self = this.set("FORBID_TAGS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFORBID_TAGS: Self = this.set("FORBID_TAGS", js.undefined)
    
    @scala.inline
    def setFORCE_BODY(value: Boolean): Self = this.set("FORCE_BODY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFORCE_BODY: Self = this.set("FORCE_BODY", js.undefined)
    
    @scala.inline
    def setIN_PLACE(value: Boolean): Self = this.set("IN_PLACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIN_PLACE: Self = this.set("IN_PLACE", js.undefined)
    
    @scala.inline
    def setKEEP_CONTENT(value: Boolean): Self = this.set("KEEP_CONTENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKEEP_CONTENT: Self = this.set("KEEP_CONTENT", js.undefined)
    
    @scala.inline
    def setRETURN_DOM(value: Boolean): Self = this.set("RETURN_DOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRETURN_DOM: Self = this.set("RETURN_DOM", js.undefined)
    
    @scala.inline
    def setRETURN_DOM_IMPORT(value: Boolean): Self = this.set("RETURN_DOM_IMPORT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRETURN_DOM_IMPORT: Self = this.set("RETURN_DOM_IMPORT", js.undefined)
    
    @scala.inline
    def setRETURN_TRUSTED_TYPE(value: Boolean): Self = this.set("RETURN_TRUSTED_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRETURN_TRUSTED_TYPE: Self = this.set("RETURN_TRUSTED_TYPE", js.undefined)
    
    @scala.inline
    def setSAFE_FOR_JQUERY(value: Boolean): Self = this.set("SAFE_FOR_JQUERY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSAFE_FOR_JQUERY: Self = this.set("SAFE_FOR_JQUERY", js.undefined)
    
    @scala.inline
    def setSAFE_FOR_TEMPLATES(value: Boolean): Self = this.set("SAFE_FOR_TEMPLATES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSAFE_FOR_TEMPLATES: Self = this.set("SAFE_FOR_TEMPLATES", js.undefined)
    
    @scala.inline
    def setSANITIZE_DOM(value: Boolean): Self = this.set("SANITIZE_DOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSANITIZE_DOM: Self = this.set("SANITIZE_DOM", js.undefined)
    
    @scala.inline
    def setUSE_PROFILES(value: `false` | Html): Self = this.set("USE_PROFILES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUSE_PROFILES: Self = this.set("USE_PROFILES", js.undefined)
    
    @scala.inline
    def setWHOLE_DOCUMENT(value: Boolean): Self = this.set("WHOLE_DOCUMENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWHOLE_DOCUMENT: Self = this.set("WHOLE_DOCUMENT", js.undefined)
  }
}
