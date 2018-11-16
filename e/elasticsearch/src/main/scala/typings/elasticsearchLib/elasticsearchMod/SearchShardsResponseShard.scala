package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchShardsResponseShard extends js.Object {
  var allocation_id: elasticsearchLib.Anon_Id
  var index: java.lang.String
  var node: java.lang.String
  var primary: scala.Boolean
  var relocating_node: js.Any
  var share: scala.Double
  var state: java.lang.String
}

