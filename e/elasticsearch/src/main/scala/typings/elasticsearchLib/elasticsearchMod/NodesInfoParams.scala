package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodesInfoParams extends GenericParams {
  var flatSettings: js.UndefOr[scala.Boolean] = js.undefined
  var human: js.UndefOr[scala.Boolean] = js.undefined
  var metric: js.UndefOr[NameList] = js.undefined
  var nodeId: NameList
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

