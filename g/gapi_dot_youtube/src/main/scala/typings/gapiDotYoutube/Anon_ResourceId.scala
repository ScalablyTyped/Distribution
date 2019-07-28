package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResourceId extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource that was marked as a favorite.
    */
  var resourceId: Anon_Kind
}

object Anon_ResourceId {
  @scala.inline
  def apply(resourceId: Anon_Kind): Anon_ResourceId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId)
  
    __obj.asInstanceOf[Anon_ResourceId]
  }
}

