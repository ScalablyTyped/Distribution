package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransportMod {
  type ApiResponse[T, C] = RequestEvent[T, C]
  type anyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type emitFn = js.Function2[/* event */ java.lang.String | js.Symbol, /* repeated */ js.Any, scala.Boolean]
  type generateRequestIdFn = js.Function2[/* params */ TransportRequestParams, /* options */ TransportRequestOptions, js.Any]
  type nodeFilterFn = js.Function1[/* connection */ atElasticElasticsearchLib.libConnectionMod.default, scala.Boolean]
  type nodeSelectorFn = js.Function1[
    /* connections */ js.Array[atElasticElasticsearchLib.libConnectionMod.default], 
    atElasticElasticsearchLib.libConnectionMod.default
  ]
  type noopFn = js.Function1[/* repeated */ js.Any, scala.Unit]
}
