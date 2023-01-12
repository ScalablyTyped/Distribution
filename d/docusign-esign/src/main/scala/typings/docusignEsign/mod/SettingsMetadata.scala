package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsMetadata extends StObject {
  
  /**
    * When **true**, indicates compliance with United States Food and Drug Administration (FDA) regulations on electronic records and electronic signatures (ERES).
    */
  var is21CFRPart11: js.UndefOr[String] = js.undefined
  
  /**
    * An array of option strings supported by this setting.
    */
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the property is editable. Valid values are:
    *
    * - `editable`
    * - `read_only`
    */
  var rights: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var uiHint: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var uiOrder: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var uiType: js.UndefOr[String] = js.undefined
}
object SettingsMetadata {
  
  inline def apply(): SettingsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingsMetadata] (val x: Self) extends AnyVal {
    
    inline def setIs21CFRPart11(value: String): Self = StObject.set(x, "is21CFRPart11", value.asInstanceOf[js.Any])
    
    inline def setIs21CFRPart11Undefined: Self = StObject.set(x, "is21CFRPart11", js.undefined)
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRights(value: String): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    inline def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
    
    inline def setUiHint(value: String): Self = StObject.set(x, "uiHint", value.asInstanceOf[js.Any])
    
    inline def setUiHintUndefined: Self = StObject.set(x, "uiHint", js.undefined)
    
    inline def setUiOrder(value: String): Self = StObject.set(x, "uiOrder", value.asInstanceOf[js.Any])
    
    inline def setUiOrderUndefined: Self = StObject.set(x, "uiOrder", js.undefined)
    
    inline def setUiType(value: String): Self = StObject.set(x, "uiType", value.asInstanceOf[js.Any])
    
    inline def setUiTypeUndefined: Self = StObject.set(x, "uiType", js.undefined)
  }
}
