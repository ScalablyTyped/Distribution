package typings.emberAutoImport

import typings.broccoliNodeApi.mod.InputNode
import typings.broccoliPlugin.mod.^
import typings.emberAutoImport.jsBundleConfigMod.default
import typings.emberAutoImport.jsBundlerMod.Bundler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsInserterMod {
  
  @JSImport("ember-auto-import/js/inserter", "Inserter")
  @js.native
  open class Inserter protected () extends ^ {
    def this(allApp: InputNode, bundler: Bundler, config: default, options: InserterOptions) = this()
    
    /* private */ var bundler: Any = js.native
    
    /* private */ var cachedOutputFileSync: Any = js.native
    
    /* private */ var categorizeChunks: Any = js.native
    
    /* private */ var chunkURL: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var fastbootManifestInfo: Any = js.native
    
    /* private */ var insertScripts: Any = js.native
    
    /* private */ var insertStyles: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var outputCache: Any = js.native
    
    /* private */ var processHTML: Any = js.native
    
    /* private */ var replaceCustomScript: Any = js.native
    
    /* private */ var replaceCustomStyle: Any = js.native
    
    /* private */ var scriptFromCustomElement: Any = js.native
    
    /* private */ var styleFromCustomElement: Any = js.native
  }
  
  trait InserterOptions extends StObject {
    
    var insertScriptsAt: js.UndefOr[String] = js.undefined
    
    var insertStylesAt: js.UndefOr[String] = js.undefined
    
    var publicAssetURL: String
  }
  object InserterOptions {
    
    inline def apply(publicAssetURL: String): InserterOptions = {
      val __obj = js.Dynamic.literal(publicAssetURL = publicAssetURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[InserterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InserterOptions] (val x: Self) extends AnyVal {
      
      inline def setInsertScriptsAt(value: String): Self = StObject.set(x, "insertScriptsAt", value.asInstanceOf[js.Any])
      
      inline def setInsertScriptsAtUndefined: Self = StObject.set(x, "insertScriptsAt", js.undefined)
      
      inline def setInsertStylesAt(value: String): Self = StObject.set(x, "insertStylesAt", value.asInstanceOf[js.Any])
      
      inline def setInsertStylesAtUndefined: Self = StObject.set(x, "insertStylesAt", js.undefined)
      
      inline def setPublicAssetURL(value: String): Self = StObject.set(x, "publicAssetURL", value.asInstanceOf[js.Any])
    }
  }
}
