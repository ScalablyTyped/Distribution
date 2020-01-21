package typings.enhancedResolve.aliasPluginMod

import typings.enhancedResolve.mod.ResolverFactory.AliasItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/AliasPlugin", JSImport.Namespace)
@js.native
class ^ protected () extends AliasPlugin {
  def this(source: String, options: AliasItem, target: String) = this()
  /* CompleteClass */
  override var alias: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var onlyModule: Boolean = js.native
  /* CompleteClass */
  override var options: AliasItem = js.native
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

