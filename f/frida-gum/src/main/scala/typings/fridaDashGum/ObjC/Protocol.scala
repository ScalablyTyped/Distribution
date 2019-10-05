package typings.fridaDashGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import typings.fridaDashGum.NativePointer
import typings.fridaDashGum.ObjectWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated language binding for any Objective-C protocol.
  */
@JSGlobal("ObjC.Protocol")
@js.native
class Protocol protected () extends ObjectWrapper {
  def this(handle: NativePointer) = this()
  /* CompleteClass */
  override var handle: NativePointer = js.native
  /**
    * Methods declared by this protocol.
    */
  var methods: StringDictionary[ProtocolMethodDescription] = js.native
  /**
    * Name visible to the Objective-C runtime.
    */
  var name: String = js.native
  /**
    * Properties declared by this protocol.
    */
  var properties: StringDictionary[ProtocolPropertyAttributes] = js.native
  /**
    * Protocols that this protocol conforms to.
    */
  var protocols: StringDictionary[Protocol] = js.native
}

