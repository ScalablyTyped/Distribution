package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated language binding for any Objective-C protocol.
  */
@JSGlobal("ObjC.Protocol")
@js.native
class Protocol protected ()
  extends fridaDashGumLib.ObjectWrapper {
  def this(handle: fridaDashGumLib.NativePointer) = this()
  /* CompleteClass */
  override var handle: fridaDashGumLib.NativePointer = js.native
  /**
    * Methods declared by this protocol.
    */
  var methods: org.scalablytyped.runtime.StringDictionary[ProtocolMethodDescription] = js.native
  /**
    * Name visible to the Objective-C runtime.
    */
  var name: java.lang.String = js.native
  /**
    * Properties declared by this protocol.
    */
  var properties: org.scalablytyped.runtime.StringDictionary[ProtocolPropertyAttributes] = js.native
  /**
    * Protocols that this protocol conforms to.
    */
  var protocols: org.scalablytyped.runtime.StringDictionary[Protocol] = js.native
}

