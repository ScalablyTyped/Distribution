package typings.enhancedDashResolve.libDescriptionFilePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionFilePlugin extends js.Object {
  var filenames: js.Array[String]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object DescriptionFilePlugin {
  @scala.inline
  def apply(
    apply: typings.enhancedDashResolve.libResolverMod.^ => Unit,
    filenames: js.Array[String],
    source: String,
    target: String
  ): DescriptionFilePlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), filenames = filenames, source = source, target = target)
  
    __obj.asInstanceOf[DescriptionFilePlugin]
  }
}

