package typings.fsDashExtra.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEntry extends js.Object {
  var path: String
  var stats: typings.node.fsMod.Stats
}

object PathEntry {
  @scala.inline
  def apply(path: String, stats: typings.node.fsMod.Stats): PathEntry = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathEntry]
  }
}

