package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message destination application(s)
  */
@js.native
trait MessageHeaderDestination extends BackboneElement {
  
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Actual destination address or id
    */
  var endpoint: uri = js.native
  
  /**
    * Name of system
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Particular delivery destination within the destination
    */
  var target: js.UndefOr[Reference] = js.native
}
object MessageHeaderDestination {
  
  @scala.inline
  def apply(endpoint: uri): MessageHeaderDestination = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderDestination]
  }
  
  @scala.inline
  implicit class MessageHeaderDestinationMutableBuilder[Self <: MessageHeaderDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: uri): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
