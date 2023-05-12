package typings.embroiderSharedInternals

import typings.embroiderSharedInternals.anon.Component
import typings.embroiderSharedInternals.anon.TypeofBabel
import typings.embroiderSharedInternals.anon.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTemplateColocationPluginMod {
  
  @JSImport("@embroider/shared-internals/src/template-colocation-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(babel: TypeofBabel): Visitor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(babel.asInstanceOf[js.Any]).asInstanceOf[Visitor]
  
  trait Options extends StObject {
    
    var appRoot: String
    
    var packageGuard: js.UndefOr[Boolean] = js.undefined
    
    var templateExtensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(appRoot: String): Options = {
      val __obj = js.Dynamic.literal(appRoot = appRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAppRoot(value: String): Self = StObject.set(x, "appRoot", value.asInstanceOf[js.Any])
      
      inline def setPackageGuard(value: Boolean): Self = StObject.set(x, "packageGuard", value.asInstanceOf[js.Any])
      
      inline def setPackageGuardUndefined: Self = StObject.set(x, "packageGuard", js.undefined)
      
      inline def setTemplateExtensions(value: js.Array[String]): Self = StObject.set(x, "templateExtensions", value.asInstanceOf[js.Any])
      
      inline def setTemplateExtensionsUndefined: Self = StObject.set(x, "templateExtensions", js.undefined)
      
      inline def setTemplateExtensionsVarargs(value: String*): Self = StObject.set(x, "templateExtensions", js.Array(value*))
    }
  }
  
  trait State extends StObject {
    
    var adder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImportUtil */ Any
    
    var associate: js.UndefOr[Component] = js.undefined
    
    var colocatedTemplate: js.UndefOr[String] = js.undefined
    
    var opts: Options
  }
  object State {
    
    inline def apply(
      adder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImportUtil */ Any,
      opts: Options
    ): State = {
      val __obj = js.Dynamic.literal(adder = adder.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setAdder(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImportUtil */ Any
      ): Self = StObject.set(x, "adder", value.asInstanceOf[js.Any])
      
      inline def setAssociate(value: Component): Self = StObject.set(x, "associate", value.asInstanceOf[js.Any])
      
      inline def setAssociateUndefined: Self = StObject.set(x, "associate", js.undefined)
      
      inline def setColocatedTemplate(value: String): Self = StObject.set(x, "colocatedTemplate", value.asInstanceOf[js.Any])
      
      inline def setColocatedTemplateUndefined: Self = StObject.set(x, "colocatedTemplate", js.undefined)
      
      inline def setOpts(value: Options): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
}
