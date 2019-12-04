package typings.enhancedDashResolve.libTryNextPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/TryNextPlugin", JSImport.Namespace)
@js.native
class ^ protected () extends TryNextPlugin {
  def this(source: String, message: String, target: String) = this()
  def this(source: String, message: Null, target: String) = this()
  /* CompleteClass */
  override var message: String | Null = js.native
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit = js.native
}

