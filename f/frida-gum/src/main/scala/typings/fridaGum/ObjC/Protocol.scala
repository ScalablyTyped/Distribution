package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import typings.fridaGum.NativePointer
import typings.fridaGum.ObjectWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamically generated language binding for any Objective-C protocol.
  */
trait Protocol
  extends StObject
     with ObjectWrapper {
  
  /**
    * Methods declared by this protocol.
    */
  var methods: StringDictionary[ProtocolMethodDescription]
  
  /**
    * Name visible to the Objective-C runtime.
    */
  var name: String
  
  /**
    * Properties declared by this protocol.
    */
  var properties: StringDictionary[ProtocolPropertyAttributes]
  
  /**
    * Protocols that this protocol conforms to.
    */
  var protocols: StringDictionary[Protocol]
}
object Protocol {
  
  @scala.inline
  def apply(
    handle: NativePointer,
    methods: StringDictionary[ProtocolMethodDescription],
    name: String,
    properties: StringDictionary[ProtocolPropertyAttributes],
    protocols: StringDictionary[Protocol]
  ): Protocol = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  
  @scala.inline
  implicit class ProtocolMutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethods(value: StringDictionary[ProtocolMethodDescription]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[ProtocolPropertyAttributes]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocols(value: StringDictionary[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
  }
}
