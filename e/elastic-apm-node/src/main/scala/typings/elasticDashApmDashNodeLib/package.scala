package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticDashApmDashNodeLib {
  type CaptureErrorCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* id */ java.lang.String, scala.Unit]
  type FilterFn = js.Function1[/* payload */ Payload, Payload | scala.Boolean | scala.Unit]
  type PatchHandler = js.Function3[
    /* exports */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Agent */ /* agent */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PatchOptions */ /* options */ js.Any, 
    js.Any
  ]
  type Payload = org.scalablytyped.runtime.StringDictionary[js.Any]
  type TagValue = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
