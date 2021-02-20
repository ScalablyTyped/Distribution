package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAccess extends StObject {
  
  /**
    * Access token information.
    */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * A Base64-encoded representation of the attachment that is used to upload and download the file. File attachments may be up to 50 MB in size.
    */
  var data: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
  
  var expires_in: js.UndefOr[String] = js.native
  
  var refresh_token: js.UndefOr[String] = js.native
  
  /**
    * Must be set to "api".
    */
  var scope: js.UndefOr[String] = js.native
  
  var token_type: js.UndefOr[String] = js.native
}
object OauthAccess {
  
  @scala.inline
  def apply(): OauthAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthAccess]
  }
  
  @scala.inline
  implicit class OauthAccessMutableBuilder[Self <: OauthAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setData(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    @scala.inline
    def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
  }
}
