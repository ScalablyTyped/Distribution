package typings.gapiDotClientDotOauth2.gapi.client.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  var me: MeResource
}

object V2Resource {
  @scala.inline
  def apply(me: MeResource): V2Resource = {
    val __obj = js.Dynamic.literal(me = me)
  
    __obj.asInstanceOf[V2Resource]
  }
}

