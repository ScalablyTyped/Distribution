package typings.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldStatsResponseIndex extends js.Object {
  var fields: StringDictionary[FieldStatsResponseField]
}

object FieldStatsResponseIndex {
  @scala.inline
  def apply(fields: StringDictionary[FieldStatsResponseField]): FieldStatsResponseIndex = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldStatsResponseIndex]
  }
}

