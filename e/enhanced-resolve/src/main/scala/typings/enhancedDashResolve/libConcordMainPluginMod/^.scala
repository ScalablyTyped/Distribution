package typings.enhancedDashResolve.libConcordMainPluginMod

import typings.enhancedDashResolve.libConcordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/ConcordMainPlugin", JSImport.Namespace)
@js.native
class ^ protected () extends ConcordMainPlugin {
  def this(source: String, options: Dictionary[_], target: String) = this()
  /* CompleteClass */
  override var options: Dictionary[_] = js.native
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit = js.native
}

