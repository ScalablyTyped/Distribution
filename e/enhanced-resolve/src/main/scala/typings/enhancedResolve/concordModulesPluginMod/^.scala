package typings.enhancedResolve.concordModulesPluginMod

import typings.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/ConcordModulesPlugin", JSImport.Namespace)
@js.native
class ^ protected () extends ConcordModulesPlugin {
  def this(source: String, options: Dictionary[_], target: String) = this()
  /* CompleteClass */
  override var options: Dictionary[_] = js.native
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

