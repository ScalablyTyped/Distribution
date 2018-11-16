package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndicesCreateParams extends GenericParams {
  var index: java.lang.String
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var updateAllTypes: js.UndefOr[scala.Boolean] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
}

