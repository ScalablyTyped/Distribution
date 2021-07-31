package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for AuthorizedCertificates.ListAuthorizedCertificates.
  */
trait SchemaListAuthorizedCertificatesResponse extends StObject {
  
  /**
    * The SSL certificates the user is authorized to administer.
    */
  var certificates: js.UndefOr[js.Array[SchemaAuthorizedCertificate]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAuthorizedCertificatesResponse {
  
  @scala.inline
  def apply(): SchemaListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuthorizedCertificatesResponse]
  }
  
  @scala.inline
  implicit class SchemaListAuthorizedCertificatesResponseMutableBuilder[Self <: SchemaListAuthorizedCertificatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: js.Array[SchemaAuthorizedCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: SchemaAuthorizedCertificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
