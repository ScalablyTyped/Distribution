package typings.errorDashSubclass

import typings.errorDashSubclass.errorDashSubclassMod.ErrorSubclass
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("error-subclass", JSImport.Namespace)
@js.native
object errorDashSubclassMod extends js.Object {
  @js.native
  class default () extends ErrorSubclass {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var displayName: String = js.native
  }
  
  type ErrorSubclass = Error
}

