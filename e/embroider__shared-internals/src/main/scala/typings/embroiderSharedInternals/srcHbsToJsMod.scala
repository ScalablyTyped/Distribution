package typings.embroiderSharedInternals

import typings.embroiderSharedInternals.anon.ModulePrefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHbsToJsMod {
  
  @JSImport("@embroider/shared-internals/src/hbs-to-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hbsToJS(hbsContents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hbsToJS")(hbsContents.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hbsToJS(hbsContents: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hbsToJS")(hbsContents.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var compatModuleNaming: js.UndefOr[ModulePrefix] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompatModuleNaming(value: ModulePrefix): Self = StObject.set(x, "compatModuleNaming", value.asInstanceOf[js.Any])
      
      inline def setCompatModuleNamingUndefined: Self = StObject.set(x, "compatModuleNaming", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
