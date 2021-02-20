package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Service resource is a logical component of an application that can share
  * state and communicate in a secure fashion with other services. For example,
  * an application that handles customer requests might include separate
  * services to handle tasks such as backend data analysis or API requests from
  * mobile devices. Each service has a collection of versions that define a
  * specific set of code used to implement the functionality of that service.
  */
@js.native
trait SchemaService extends StObject {
  
  /**
    * Relative name of the service within the application. Example:
    * default.@OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Full path to the Service resource in the API. Example:
    * apps/myapp/services/default.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Mapping that defines fractional HTTP traffic diversion to different
    * versions within the service.
    */
  var split: js.UndefOr[SchemaTrafficSplit] = js.native
}
object SchemaService {
  
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  @scala.inline
  implicit class SchemaServiceMutableBuilder[Self <: SchemaService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSplit(value: SchemaTrafficSplit): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
