package typings.fullcalendarList

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  //# sourceMappingURL=ambient.d.ts.map
  @JSImport("@fullcalendar/list", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginDef */ Any = js.native
  
  trait ExtraOptionRefiners extends StObject {
    
    var noEventsClassNames: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<ClassNamesGenerator<NoEventsContentArg>> */ Any
    
    var noEventsContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<CustomContentGenerator<NoEventsContentArg>> */ Any
    
    var noEventsDidMount: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<DidMountHandler<NoEventsMountArg>> */ Any
    
    var noEventsWillUnmount: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<WillUnmountHandler<NoEventsMountArg>> */ Any
  }
  object ExtraOptionRefiners {
    
    inline def apply(
      noEventsClassNames: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<ClassNamesGenerator<NoEventsContentArg>> */ Any,
      noEventsContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<CustomContentGenerator<NoEventsContentArg>> */ Any,
      noEventsDidMount: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<DidMountHandler<NoEventsMountArg>> */ Any,
      noEventsWillUnmount: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<WillUnmountHandler<NoEventsMountArg>> */ Any
    ): ExtraOptionRefiners = {
      val __obj = js.Dynamic.literal(noEventsClassNames = noEventsClassNames.asInstanceOf[js.Any], noEventsContent = noEventsContent.asInstanceOf[js.Any], noEventsDidMount = noEventsDidMount.asInstanceOf[js.Any], noEventsWillUnmount = noEventsWillUnmount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraOptionRefiners]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtraOptionRefiners] (val x: Self) extends AnyVal {
      
      inline def setNoEventsClassNames(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<ClassNamesGenerator<NoEventsContentArg>> */ Any
      ): Self = StObject.set(x, "noEventsClassNames", value.asInstanceOf[js.Any])
      
      inline def setNoEventsContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<CustomContentGenerator<NoEventsContentArg>> */ Any
      ): Self = StObject.set(x, "noEventsContent", value.asInstanceOf[js.Any])
      
      inline def setNoEventsDidMount(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<DidMountHandler<NoEventsMountArg>> */ Any
      ): Self = StObject.set(x, "noEventsDidMount", value.asInstanceOf[js.Any])
      
      inline def setNoEventsWillUnmount(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<WillUnmountHandler<NoEventsMountArg>> */ Any
      ): Self = StObject.set(x, "noEventsWillUnmount", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginDef */ Any
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginDef */ Any = default
  
  /* augmented module */
  object fullcalendarCoreInternalAugmentingMod {
    
    type BaseOptionRefiners = ExtraOptionRefiners
  }
}
