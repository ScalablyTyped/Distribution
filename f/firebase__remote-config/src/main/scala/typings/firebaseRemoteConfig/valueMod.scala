package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfigTypes.mod.ValueSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/value", JSImport.Namespace)
@js.native
object valueMod extends js.Object {
  @js.native
  class Value protected ()
    extends typings.firebaseRemoteConfigTypes.mod.Value {
    def this(_source: ValueSource) = this()
    def this(_source: ValueSource, _value: String) = this()
    val _source: js.Any = js.native
    val _value: js.Any = js.native
  }
  
}

