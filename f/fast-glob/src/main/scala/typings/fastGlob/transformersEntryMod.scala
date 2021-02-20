package typings.fastGlob

import typings.fastGlob.typesMod.EntryTransformerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformersEntryMod {
  
  @JSImport("fast-glob/out/providers/transformers/entry", JSImport.Default)
  @js.native
  class default protected () extends EntryTransformer {
    def this(_settings: typings.fastGlob.settingsMod.default) = this()
  }
  
  @js.native
  trait EntryTransformer extends StObject {
    
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
    implicit class EntryTransformerMutableBuilder[Self <: EntryTransformer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTransformer(value: () => EntryTransformerFunction): Self = StObject.set(x, "getTransformer", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_transform(value: js.Any): Self = StObject.set(x, "_transform", value.asInstanceOf[js.Any])
    }
  }
}
