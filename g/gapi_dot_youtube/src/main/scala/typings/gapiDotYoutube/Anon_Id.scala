package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /**
    * The id parameter specifies the YouTube subscription ID for the resource that is being deleted. In a subscription resource, the id property specifies the YouTube subscription ID.
    */
  var id: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

