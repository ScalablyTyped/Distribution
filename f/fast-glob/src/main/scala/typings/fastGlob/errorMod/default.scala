package typings.fastGlob.errorMod

import typings.fastGlob.typesMod.ErrorFilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/filters/error", JSImport.Default)
@js.native
class default protected () extends ErrorFilter {
  def this(_settings: typings.fastGlob.settingsMod.default) = this()
  /* CompleteClass */
  override var _isNonFatalError: js.Any = js.native
  /* CompleteClass */
  override val _settings: js.Any = js.native
  /* CompleteClass */
  override def getFilter(): ErrorFilterFunction = js.native
}

