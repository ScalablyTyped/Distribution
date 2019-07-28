package typings.atElasticElasticsearch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransportMod {
  type ApiResponse[T, C] = RequestEvent[T, C]
  type anyObject = StringDictionary[js.Any]
  type emitFn = js.Function2[/* event */ String | js.Symbol, /* repeated */ js.Any, Boolean]
  type generateRequestIdFn = js.Function2[/* params */ TransportRequestParams, /* options */ TransportRequestOptions, js.Any]
  type nodeFilterFn = js.Function1[/* connection */ typings.atElasticElasticsearch.libConnectionMod.default, Boolean]
  type nodeSelectorFn = js.Function1[
    /* connections */ js.Array[typings.atElasticElasticsearch.libConnectionMod.default], 
    typings.atElasticElasticsearch.libConnectionMod.default
  ]
  type noopFn = js.Function1[/* repeated */ js.Any, Unit]
}
