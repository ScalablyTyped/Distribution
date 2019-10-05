package typings.atEmberApplication

import typings.atEmberApplication.dashPrivateDefaultDashResolverMod.DefaultResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/application/-private/default-resolver", JSImport.Namespace)
@js.native
object dashPrivateDefaultDashResolverMod extends js.Object {
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
  
  @js.native
  class default () extends DefaultResolver
  
}

