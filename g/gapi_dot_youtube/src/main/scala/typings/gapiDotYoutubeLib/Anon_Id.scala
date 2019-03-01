package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /**
    * The id parameter specifies the YouTube subscription ID for the resource that is being deleted. In a subscription resource, the id property specifies the YouTube subscription ID.
    */
  var id: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Id]
  }
}

