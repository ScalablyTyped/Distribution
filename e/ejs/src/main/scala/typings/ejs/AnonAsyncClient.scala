package typings.ejs

import typings.ejs.ejsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncClient extends js.Object {
  var async: `true`
  var client: `true`
}

object AnonAsyncClient {
  @scala.inline
  def apply(async: `true`, client: `true`): AnonAsyncClient = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAsyncClient]
  }
}

