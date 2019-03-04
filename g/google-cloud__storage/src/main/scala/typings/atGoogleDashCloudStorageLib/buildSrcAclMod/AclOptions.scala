package typings
package atGoogleDashCloudStorageLib.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclOptions extends js.Object {
  var pathPrefix: java.lang.String
  def request(
    reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions,
    callback: atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback
  ): scala.Unit
}

object AclOptions {
  @scala.inline
  def apply(
    pathPrefix: java.lang.String,
    request: js.Function2[
      atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions, 
      atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback, 
      scala.Unit
    ]
  ): AclOptions = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix, request = request)
  
    __obj.asInstanceOf[AclOptions]
  }
}

