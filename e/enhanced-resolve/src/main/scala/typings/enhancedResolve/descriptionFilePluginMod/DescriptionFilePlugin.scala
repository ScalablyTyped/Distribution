package typings.enhancedResolve.descriptionFilePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionFilePlugin extends js.Object {
  var filenames: js.Array[String]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
}

object DescriptionFilePlugin {
  @scala.inline
  def apply(
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    filenames: js.Array[String],
    source: String,
    target: String
  ): DescriptionFilePlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), filenames = filenames.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionFilePlugin]
  }
}

