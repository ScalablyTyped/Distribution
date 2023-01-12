package typings.fastGlob

import typings.fastGlob.outTypesMod.EntryTransformerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersTransformersEntryMod {
  
  @JSImport("fast-glob/out/providers/transformers/entry", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EntryTransformer {
    def this(_settings: typings.fastGlob.outSettingsMod.default) = this()
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* private */ /* CompleteClass */
    var _transform: Any = js.native
    
    /* CompleteClass */
    override def getTransformer(): EntryTransformerFunction = js.native
  }
  
  trait EntryTransformer extends StObject {
    
    /* private */ val _settings: Any
    
    /* private */ var _transform: Any
    
    def getTransformer(): EntryTransformerFunction
  }
  object EntryTransformer {
    
    inline def apply(_settings: Any, _transform: Any, getTransformer: () => EntryTransformerFunction): EntryTransformer = {
      val __obj = js.Dynamic.literal(_settings = _settings.asInstanceOf[js.Any], _transform = _transform.asInstanceOf[js.Any], getTransformer = js.Any.fromFunction0(getTransformer))
      __obj.asInstanceOf[EntryTransformer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntryTransformer] (val x: Self) extends AnyVal {
      
      inline def setGetTransformer(value: () => EntryTransformerFunction): Self = StObject.set(x, "getTransformer", js.Any.fromFunction0(value))
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_transform(value: Any): Self = StObject.set(x, "_transform", value.asInstanceOf[js.Any])
    }
  }
}
