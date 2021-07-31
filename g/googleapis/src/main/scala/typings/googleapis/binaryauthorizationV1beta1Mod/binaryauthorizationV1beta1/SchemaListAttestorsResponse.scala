package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for BinauthzManagementService.ListAttestors.
  */
trait SchemaListAttestorsResponse extends StObject {
  
  /**
    * The list of attestors.
    */
  var attestors: js.UndefOr[js.Array[SchemaAttestor]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListAttestorsRequest.page_token field in the subsequent call to the
    * `ListAttestors` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAttestorsResponse {
  
  @scala.inline
  def apply(): SchemaListAttestorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAttestorsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAttestorsResponseMutableBuilder[Self <: SchemaListAttestorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestors(value: js.Array[SchemaAttestor]): Self = StObject.set(x, "attestors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestorsUndefined: Self = StObject.set(x, "attestors", js.undefined)
    
    @scala.inline
    def setAttestorsVarargs(value: SchemaAttestor*): Self = StObject.set(x, "attestors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
