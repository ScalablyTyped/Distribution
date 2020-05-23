package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import typings.fridaGum.NativePointer
import typings.fridaGum.ObjectWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated language binding for any Objective-C protocol.
  */
trait Protocol extends ObjectWrapper {
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
}

