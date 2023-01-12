package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizeEmailOptions extends StObject {
  
  var all_lowercase: js.UndefOr[Boolean] = js.undefined
  
  var gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.undefined
  
  var gmail_lowercase: js.UndefOr[Boolean] = js.undefined
  
  var gmail_remove_dots: js.UndefOr[Boolean] = js.undefined
  
  var gmail_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  
  var icloud_lowercase: js.UndefOr[Boolean] = js.undefined
  
  var icloud_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  
  var outlookdotcom_lowercase: js.UndefOr[Boolean] = js.undefined
  
  var outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  
  var yahoo_lowercase: js.UndefOr[Boolean] = js.undefined
  
  var yahoo_remove_subaddress: js.UndefOr[Boolean] = js.undefined
}
object NormalizeEmailOptions {
  
  inline def apply(): NormalizeEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeEmailOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizeEmailOptions] (val x: Self) extends AnyVal {
    
    inline def setAll_lowercase(value: Boolean): Self = StObject.set(x, "all_lowercase", value.asInstanceOf[js.Any])
    
    inline def setAll_lowercaseUndefined: Self = StObject.set(x, "all_lowercase", js.undefined)
    
    inline def setGmail_convert_googlemaildotcom(value: Boolean): Self = StObject.set(x, "gmail_convert_googlemaildotcom", value.asInstanceOf[js.Any])
    
    inline def setGmail_convert_googlemaildotcomUndefined: Self = StObject.set(x, "gmail_convert_googlemaildotcom", js.undefined)
    
    inline def setGmail_lowercase(value: Boolean): Self = StObject.set(x, "gmail_lowercase", value.asInstanceOf[js.Any])
    
    inline def setGmail_lowercaseUndefined: Self = StObject.set(x, "gmail_lowercase", js.undefined)
    
    inline def setGmail_remove_dots(value: Boolean): Self = StObject.set(x, "gmail_remove_dots", value.asInstanceOf[js.Any])
    
    inline def setGmail_remove_dotsUndefined: Self = StObject.set(x, "gmail_remove_dots", js.undefined)
    
    inline def setGmail_remove_subaddress(value: Boolean): Self = StObject.set(x, "gmail_remove_subaddress", value.asInstanceOf[js.Any])
    
    inline def setGmail_remove_subaddressUndefined: Self = StObject.set(x, "gmail_remove_subaddress", js.undefined)
    
    inline def setIcloud_lowercase(value: Boolean): Self = StObject.set(x, "icloud_lowercase", value.asInstanceOf[js.Any])
    
    inline def setIcloud_lowercaseUndefined: Self = StObject.set(x, "icloud_lowercase", js.undefined)
    
    inline def setIcloud_remove_subaddress(value: Boolean): Self = StObject.set(x, "icloud_remove_subaddress", value.asInstanceOf[js.Any])
    
    inline def setIcloud_remove_subaddressUndefined: Self = StObject.set(x, "icloud_remove_subaddress", js.undefined)
    
    inline def setOutlookdotcom_lowercase(value: Boolean): Self = StObject.set(x, "outlookdotcom_lowercase", value.asInstanceOf[js.Any])
    
    inline def setOutlookdotcom_lowercaseUndefined: Self = StObject.set(x, "outlookdotcom_lowercase", js.undefined)
    
    inline def setOutlookdotcom_remove_subaddress(value: Boolean): Self = StObject.set(x, "outlookdotcom_remove_subaddress", value.asInstanceOf[js.Any])
    
    inline def setOutlookdotcom_remove_subaddressUndefined: Self = StObject.set(x, "outlookdotcom_remove_subaddress", js.undefined)
    
    inline def setYahoo_lowercase(value: Boolean): Self = StObject.set(x, "yahoo_lowercase", value.asInstanceOf[js.Any])
    
    inline def setYahoo_lowercaseUndefined: Self = StObject.set(x, "yahoo_lowercase", js.undefined)
    
    inline def setYahoo_remove_subaddress(value: Boolean): Self = StObject.set(x, "yahoo_remove_subaddress", value.asInstanceOf[js.Any])
    
    inline def setYahoo_remove_subaddressUndefined: Self = StObject.set(x, "yahoo_remove_subaddress", js.undefined)
  }
}
