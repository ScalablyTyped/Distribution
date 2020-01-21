package typings.enhancedResolve.parsePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/ParsePlugin", JSImport.Namespace)
@js.native
class ^ protected () extends ParsePlugin {
  def this(source: String, target: String) = this()
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

