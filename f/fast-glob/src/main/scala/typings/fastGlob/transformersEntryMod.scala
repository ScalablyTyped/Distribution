package typings.fastGlob

import typings.fastGlob.typesMod.EntryTransformerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformersEntryMod {
  
  @JSImport("fast-glob/out/providers/transformers/entry", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with EntryTransformer {
    def this(_settings: typings.fastGlob.settingsMod.default) = this()
    
    /* private */ /* CompleteClass */
    override val _settings: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _transform: js.Any = js.native
    
    /* CompleteClass */
    override def getTransformer(): EntryTransformerFunction = js.native
  }
  
  trait EntryTransformer extends StObject {
    
    /* private */ val _settings: js.Any
    
    /* private */ var _transform: js.Any
    
    def getTransformer(): EntryTransformerFunction
  }
  object EntryTransformer {
    
    inline def apply(_settings: js.Any, _transform: js.Any, getTransformer: () => EntryTransformerFunction): EntryTransformer = {
      val __obj = js.Dynamic.literal(_settings = _settings.asInstanceOf[js.Any], _transform = _transform.asInstanceOf[js.Any], getTransformer = js.Any.fromFunction0(getTransformer))
      __obj.asInstanceOf[EntryTransformer]
    }
    
    extension [Self <: EntryTransformer](x: Self) {
      
      inline def setGetTransformer(value: () => EntryTransformerFunction): Self = StObject.set(x, "getTransformer", js.Any.fromFunction0(value))
      
      inline def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_transform(value: js.Any): Self = StObject.set(x, "_transform", value.asInstanceOf[js.Any])
    }
  }
}
