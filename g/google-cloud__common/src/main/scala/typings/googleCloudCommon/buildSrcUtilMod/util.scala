package typings.googleCloudCommon.buildSrcUtilMod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util extends Shortcut {
  
  @JSImport("@google-cloud/common/build/src/util", "util")
  @js.native
  val ^ : Util_ = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@google-cloud/common/build/src/util", "util.ApiError")
  @js.native
  open class ApiErrorCls protected () extends ApiError {
    def this(errorMessage: String) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@google-cloud/common/build/src/util", "util.PartialFailureError")
  @js.native
  open class PartialFailureErrorCls protected () extends PartialFailureError {
    def this(b: GoogleErrorBody) = this()
  }
  
  type _To = Util_
  
  /* This means you don't have to write `^`, but can instead just say `util.foo` */
  override def _to: Util_ = ^
}
