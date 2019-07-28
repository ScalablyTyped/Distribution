package typings.elasticDashApmDashNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticDashApmDashNodeMod {
  type CaptureErrorCallback = js.Function2[/* err */ Error | Null, /* id */ String, Unit]
  type FilterFn = js.Function1[/* payload */ Payload, Payload | Boolean | Unit]
  type KeyValueConfig = String | Labels | js.Array[js.Array[LabelValue]]
  type LabelValue = js.UndefOr[String | Double | Boolean | Null]
  type Labels = StringDictionary[LabelValue]
  type PatchHandler = js.Function3[/* exports */ js.Any, /* agent */ Agent, /* options */ PatchOptions, js.Any]
  type Payload = StringDictionary[js.Any]
}
