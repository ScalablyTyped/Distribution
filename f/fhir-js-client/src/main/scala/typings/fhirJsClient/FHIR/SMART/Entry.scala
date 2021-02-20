package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a FHIR entry
  */
@js.native
trait Entry
  extends /**
  * Making this interface extendable since this is not a complete type definition of FHIR Resource
  */
/* propName */ StringDictionary[js.Any] {
  
  /**
    * FHIR Resource
    */
  var resource: Resource = js.native
  
  /**
    * FHIR Resource type name
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Version Stamp of resource
    */
  var versionId: js.UndefOr[String] = js.native
}
object Entry {
  
  @scala.inline
  def apply(resource: Resource): Entry = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
