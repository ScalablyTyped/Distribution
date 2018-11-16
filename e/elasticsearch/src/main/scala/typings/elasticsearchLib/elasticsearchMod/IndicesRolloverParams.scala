package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndicesRolloverParams extends GenericParams {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var newIndex: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var waitForActiveShards: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

