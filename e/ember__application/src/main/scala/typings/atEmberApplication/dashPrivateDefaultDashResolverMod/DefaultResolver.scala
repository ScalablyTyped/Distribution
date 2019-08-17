package typings.atEmberApplication.dashPrivateDefaultDashResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultResolver
  extends typings.atEmberEngine.dashPrivateResolverMod.default {
  /**
    * This will be set to the Application instance when it is
    * created.
    */
  var namespace: typings.atEmberApplication.atEmberApplicationMod.default = js.native
  /**
    * This method is called via the container's resolver method.
    * It parses the provided `fullName` and then looks up and
    * returns the appropriate template or class.
    */
  def resolve(fullName: String): js.Object = js.native
}

