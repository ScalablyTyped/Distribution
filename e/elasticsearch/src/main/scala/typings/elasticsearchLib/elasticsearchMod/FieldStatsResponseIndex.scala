package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldStatsResponseIndex extends js.Object {
  var fields: org.scalablytyped.runtime.StringDictionary[FieldStatsResponseField]
}

object FieldStatsResponseIndex {
  @scala.inline
  def apply(fields: org.scalablytyped.runtime.StringDictionary[FieldStatsResponseField]): FieldStatsResponseIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[FieldStatsResponseIndex]
  }
}

