package typings.fastGlob.errorMod

import typings.fastGlob.typesMod.ErrorFilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorFilter extends js.Object {
  var _isNonFatalError: js.Any
  val _settings: js.Any
  def getFilter(): ErrorFilterFunction
}

object ErrorFilter {
  @scala.inline
  def apply(_isNonFatalError: js.Any, _settings: js.Any, getFilter: () => ErrorFilterFunction): ErrorFilter = {
    val __obj = js.Dynamic.literal(_isNonFatalError = _isNonFatalError.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction0(getFilter))
    __obj.asInstanceOf[ErrorFilter]
  }
}

