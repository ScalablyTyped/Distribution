package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesShrinkParams extends GenericParams {
  var index: java.lang.String
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var target: java.lang.String
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

