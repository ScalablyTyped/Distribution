package typings.filestackReact

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("filestack-react", "PickerDropPane")
  @js.native
  val PickerDropPane: FC[PickerDropPaneProps] = js.native
  
  @JSImport("filestack-react", "PickerInline")
  @js.native
  val PickerInline: FC[PickerInlineProps] = js.native
  
  @JSImport("filestack-react", "PickerOverlay")
  @js.native
  val PickerOverlay: FC[PickerOverlayProps] = js.native
  
  trait PickerBaseProps extends StObject {
    
    /**
      * Filestack api key
      */
    var apikey: String
    
    /**
      * https://filestack.github.io/filestack-js/interfaces/pickeroptions.html
      */
    var clientOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOptions */ Any
      ] = js.undefined
    
    /**
      * A function to be called when error occurs
      */
    var onError: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* error */ Any, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function to be called after successful completed action
      * @deprecated
      */
    var onSuccess: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* result */ Any, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called when all files have been uploaded
      */
    var onUploadDone: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* result */ Any, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * https://filestack.github.io/filestack-js/interfaces/clientoptions.html
      */
    var pickerOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerOptions */ Any
      ] = js.undefined
  }
  object PickerBaseProps {
    
    inline def apply(apikey: String): PickerBaseProps = {
      val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerBaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickerBaseProps] (val x: Self) extends AnyVal {
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setClientOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOptions */ Any
      ): Self = StObject.set(x, "clientOptions", value.asInstanceOf[js.Any])
      
      inline def setClientOptionsUndefined: Self = StObject.set(x, "clientOptions", js.undefined)
      
      inline def setOnError(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* error */ Any => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* result */ Any => Unit
      ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setOnUploadDone(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* result */ Any => Unit
      ): Self = StObject.set(x, "onUploadDone", js.Any.fromFunction1(value))
      
      inline def setOnUploadDoneUndefined: Self = StObject.set(x, "onUploadDone", js.undefined)
      
      inline def setPickerOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerOptions */ Any
      ): Self = StObject.set(x, "pickerOptions", value.asInstanceOf[js.Any])
      
      inline def setPickerOptionsUndefined: Self = StObject.set(x, "pickerOptions", js.undefined)
    }
  }
  
  type PickerDropPaneProps = PickerBaseProps
  
  type PickerInlineProps = PickerBaseProps
  
  type PickerOverlayProps = PickerBaseProps
}
