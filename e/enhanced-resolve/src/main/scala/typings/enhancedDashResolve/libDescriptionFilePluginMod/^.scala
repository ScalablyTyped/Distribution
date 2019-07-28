package typings.enhancedDashResolve.libDescriptionFilePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/DescriptionFilePlugin", JSImport.Namespace)
@js.native
class ^ protected () extends DescriptionFilePlugin {
  def this(source: String, filenames: String, target: String) = this()
  def this(source: String, filenames: js.Array[String], target: String) = this()
  /* CompleteClass */
  override var filenames: js.Array[String] = js.native
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit = js.native
}

