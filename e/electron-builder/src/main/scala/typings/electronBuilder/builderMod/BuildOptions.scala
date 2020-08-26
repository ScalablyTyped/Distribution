package typings.electronBuilder.builderMod

import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.electronPublish.mod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptions
  extends PackagerOptions
     with PublishOptions

object BuildOptions {
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
}

