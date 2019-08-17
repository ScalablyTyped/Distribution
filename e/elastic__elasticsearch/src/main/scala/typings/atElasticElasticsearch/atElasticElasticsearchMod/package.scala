package typings.atElasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atElasticElasticsearchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atElasticElasticsearch.libTransportMod.ApiResponse
  import typings.std.Error

  type anyObject = StringDictionary[js.Any]
  type callbackFn[T] = js.Function2[/* err */ Error | Null, /* result */ ApiResponse[T, js.Any], Unit]
  type extendsCallback = js.Function1[/* options */ ClientExtendsCallbackOptions, js.Any]
}
