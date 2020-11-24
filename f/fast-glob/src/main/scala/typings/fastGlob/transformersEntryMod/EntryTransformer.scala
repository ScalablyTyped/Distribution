package typings.fastGlob.transformersEntryMod

import typings.fastGlob.typesMod.EntryTransformerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryTransformer extends js.Object {
  
  val _settings: js.Any = js.native
  
  var _transform: js.Any = js.native
  
  def getTransformer(): EntryTransformerFunction = js.native
}
object EntryTransformer {
  
  @scala.inline
  def apply(_settings: js.Any, _transform: js.Any, getTransformer: () => EntryTransformerFunction): EntryTransformer = {
    val __obj = js.Dynamic.literal(_settings = _settings.asInstanceOf[js.Any], _transform = _transform.asInstanceOf[js.Any], getTransformer = js.Any.fromFunction0(getTransformer))
    __obj.asInstanceOf[EntryTransformer]
  }
  
  @scala.inline
  implicit class EntryTransformerOps[Self <: EntryTransformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_transform(value: js.Any): Self = this.set("_transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTransformer(value: () => EntryTransformerFunction): Self = this.set("getTransformer", js.Any.fromFunction0(value))
  }
}
