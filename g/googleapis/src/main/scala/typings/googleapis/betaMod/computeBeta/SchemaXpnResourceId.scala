package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service resource (a.k.a service project) ID.
  */
trait SchemaXpnResourceId extends StObject {
  
  /**
    * The ID of the service resource. In the case of projects, this field
    * supports project id (e.g., my-project-123) and project number (e.g.
    * 12345678).
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the service resource.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaXpnResourceId {
  
  @scala.inline
  def apply(): SchemaXpnResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXpnResourceId]
  }
  
  @scala.inline
  implicit class SchemaXpnResourceIdMutableBuilder[Self <: SchemaXpnResourceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
