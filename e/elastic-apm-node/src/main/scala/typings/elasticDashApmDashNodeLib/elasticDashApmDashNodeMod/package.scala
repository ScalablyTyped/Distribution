package typings
package elasticDashApmDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticDashApmDashNodeMod {
  type CaptureErrorCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* id */ java.lang.String, scala.Unit]
  type FilterFn = js.Function1[/* payload */ Payload, Payload | scala.Boolean | scala.Unit]
  type LabelValue = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
  type Labels = org.scalablytyped.runtime.StringDictionary[LabelValue]
  type PatchHandler = js.Function3[/* exports */ js.Any, /* agent */ Agent, /* options */ PatchOptions, js.Any]
  type Payload = org.scalablytyped.runtime.StringDictionary[js.Any]
}
