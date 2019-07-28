package typings.atGoogleDashCloudStorage.buildSrcAclMod

import typings.atGoogleDashCloudCommon.buildSrcUtilMod.BodyResponseCallback
import typings.atGoogleDashCloudCommon.buildSrcUtilMod.DecorateRequestOptions
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
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix, request = js.Any.fromFunction2(request))
  
    __obj.asInstanceOf[AclOptions]
  }
}

