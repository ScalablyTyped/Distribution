package typings
package fsDashExtraLib.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEntry extends js.Object {
  var path: java.lang.String
  var stats: nodeLib.fsMod.Stats
}

object PathEntry {
  @scala.inline
  def apply(path: java.lang.String, stats: nodeLib.fsMod.Stats): PathEntry = {
    val __obj = js.Dynamic.literal(path = path, stats = stats)
  
    __obj.asInstanceOf[PathEntry]
  }
}

