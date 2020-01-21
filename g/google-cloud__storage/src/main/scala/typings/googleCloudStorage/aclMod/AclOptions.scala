package typings.googleCloudStorage.aclMod

import typings.googleCloudCommon.utilMod.BodyResponseCallback
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclOptions extends js.Object {
  var pathPrefix: String
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit
}

object AclOptions {
  @scala.inline
  def apply(pathPrefix: String, request: (DecorateRequestOptions, BodyResponseCallback) => Unit): AclOptions = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any], request = js.Any.fromFunction2(request))
  
    __obj.asInstanceOf[AclOptions]
  }
}

