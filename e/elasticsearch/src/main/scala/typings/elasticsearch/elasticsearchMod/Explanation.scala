package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explanation extends js.Object {
  var description: String
  var details: js.Array[Explanation]
  var value: Double
}

object Explanation {
  @scala.inline
  def apply(description: String, details: js.Array[Explanation], value: Double): Explanation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Explanation]
  }
}

