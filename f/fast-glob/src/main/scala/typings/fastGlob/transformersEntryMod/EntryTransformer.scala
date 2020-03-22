package typings.fastGlob.transformersEntryMod

import typings.fastGlob.typesMod.EntryTransformerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryTransformer extends js.Object {
  val _settings: js.Any
  var _transform: js.Any
  def getTransformer(): EntryTransformerFunction
}

object EntryTransformer {
  @scala.inline
  def apply(_settings: js.Any, _transform: js.Any, getTransformer: () => EntryTransformerFunction): EntryTransformer = {
    val __obj = js.Dynamic.literal(_settings = _settings.asInstanceOf[js.Any], _transform = _transform.asInstanceOf[js.Any], getTransformer = js.Any.fromFunction0(getTransformer))
  
    __obj.asInstanceOf[EntryTransformer]
  }
}

