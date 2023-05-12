package typings.emberAutoImport

import typings.emberAutoImport.anon.Css
import typings.emberAutoImport.anon.Html
import typings.emberAutoImport.jsAnalyzerMod.TreeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsBundleConfigMod {
  
  @JSImport("ember-auto-import/js/bundle-config", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BundleConfig {
    def this(outputPaths: OutputPaths) = this()
  }
  
  @js.native
  trait BundleConfig extends StObject {
    
    def bundleEntrypoint(name: BundleName, `type`: BundleType): String = js.native
    
    def bundleForPath(path: String): BundleName = js.native
    
    def bundleForTreeType(treeType: TreeType): BundleName = js.native
    
    def htmlEntrypoints(): js.Array[String] = js.native
    
    def isBuiltInBundleName(name: String): /* is ember-auto-import.ember-auto-import/js/bundle-config.BundleName */ Boolean = js.native
    
    def lazyChunkPath: String = js.native
    
    def names: js.Array[BundleName] = js.native
    
    /* private */ var outputPaths: Any = js.native
    
    def types: js.Array[BundleType] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberAutoImport.emberAutoImportStrings.app
    - typings.emberAutoImport.emberAutoImportStrings.tests
  */
  trait BundleName extends StObject
  object BundleName {
    
    inline def app: typings.emberAutoImport.emberAutoImportStrings.app = "app".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.app]
    
    inline def tests: typings.emberAutoImport.emberAutoImportStrings.tests = "tests".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.tests]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberAutoImport.emberAutoImportStrings.js_
    - typings.emberAutoImport.emberAutoImportStrings.css
  */
  trait BundleType extends StObject
  object BundleType {
    
    inline def css: typings.emberAutoImport.emberAutoImportStrings.css = "css".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.css]
    
    inline def js_ : typings.emberAutoImport.emberAutoImportStrings.js_ = "js".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.js_]
  }
  
  trait OutputPaths extends StObject {
    
    var app: Html
    
    var vendor: Css
  }
  object OutputPaths {
    
    inline def apply(app: Html, vendor: Css): OutputPaths = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputPaths]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputPaths] (val x: Self) extends AnyVal {
      
      inline def setApp(value: Html): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: Css): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    }
  }
}
