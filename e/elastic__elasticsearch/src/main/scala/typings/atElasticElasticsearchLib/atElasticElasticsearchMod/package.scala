package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atElasticElasticsearchMod {
  type anyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type callbackFn[T] = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* result */ atElasticElasticsearchLib.libTransportMod.ApiResponse[T, js.Any], 
    scala.Unit
  ]
  type extendsCallback = js.Function1[/* options */ ClientExtendsCallbackOptions, js.Any]
}
