package typings.googleGax.fallbackMod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "protobuf.Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root ()
  extends typings.protobufjs.mod.Root {
  def this(options: StringDictionary[js.Any]) = this()
}
/* static members */
object Root {
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.Root.fromJSON")
  @js.native
  def fromJSON(json: INamespace): typings.protobufjs.mod.Root = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Root.fromJSON")
  @js.native
  def fromJSON(json: INamespace, root: typings.protobufjs.mod.Root): typings.protobufjs.mod.Root = js.native
}
