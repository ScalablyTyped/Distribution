package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesRolloverResponse extends js.Object {
  var acknowledged: scala.Boolean
  var conditions: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var dry_run: scala.Boolean
  var new_index: java.lang.String
  var old_index: java.lang.String
  var rolled_over: scala.Boolean
  var shards_acknowledged: scala.Boolean
}

