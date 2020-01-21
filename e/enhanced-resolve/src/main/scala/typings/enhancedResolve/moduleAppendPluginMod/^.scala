package typings.enhancedResolve.moduleAppendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/ModuleAppendPlugin", JSImport.Namespace)
@js.native
class ^ protected () extends ModuleAppendPlugin {
  def this(source: String, appending: String, target: String) = this()
  /* CompleteClass */
  override var appending: String = js.native
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

