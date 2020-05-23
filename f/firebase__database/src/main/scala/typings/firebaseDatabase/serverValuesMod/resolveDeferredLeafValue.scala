package typings.firebaseDatabase.serverValuesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredLeafValue")
@js.native
object resolveDeferredLeafValue extends js.Object {
  def apply(value: String, existingVal: ValueProvider, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def apply(
    value: StringDictionary[js.Any],
    existingVal: ValueProvider,
    serverValues: StringDictionary[js.Any]
  ): String | Double | Boolean = js.native
  def apply(value: Boolean, existingVal: ValueProvider, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def apply(value: Double, existingVal: ValueProvider, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
}

