package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of an operation or a custom query
  */
@js.native
trait CapabilityStatementRestOperation extends BackboneElement {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * The defined operation/query
    */
  var definition: Reference = js.native
  
  /**
    * Name by which the operation/query is invoked
    */
  var name: String = js.native
}
object CapabilityStatementRestOperation {
  
  @scala.inline
  def apply(definition: Reference, name: String): CapabilityStatementRestOperation = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestOperation]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestOperationMutableBuilder[Self <: CapabilityStatementRestOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
