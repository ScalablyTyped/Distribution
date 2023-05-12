package typings.emberAutoImport

import typings.broccoliNodeApi.mod.Node
import typings.emberAutoImport.emberAutoImportBooleans.`true`
import typings.emberAutoImport.jsAnalyzerSyntaxMod.ImportSyntax
import typings.emberAutoImport.jsAnalyzerSyntaxMod.LiteralImportSyntax
import typings.emberAutoImport.jsAnalyzerSyntaxMod.TemplateImportSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAnalyzerMod {
  
  @JSImport("ember-auto-import/js/analyzer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Analyzer {
    def this(inputTree: Node, pack: typings.emberAutoImport.jsPackageMod.default) = this()
    def this(inputTree: Node, pack: typings.emberAutoImport.jsPackageMod.default, treeType: TreeType) = this()
    def this(
      inputTree: Node,
      pack: typings.emberAutoImport.jsPackageMod.default,
      treeType: Unit,
      supportsFastAnalyzer: `true`
    ) = this()
    def this(
      inputTree: Node,
      pack: typings.emberAutoImport.jsPackageMod.default,
      treeType: TreeType,
      supportsFastAnalyzer: `true`
    ) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Funnel * / any */ @js.native
  trait Analyzer extends StObject {
    
    def build(args: Any*): js.Promise[Unit] = js.native
    
    /* private */ var getPatchset: Any = js.native
    
    def imports: js.Array[Import] = js.native
    
    /* private */ var matchesExtension: Any = js.native
    
    /* private */ var modules: Any = js.native
    
    /* private */ var pack: Any = js.native
    
    def parser(): js.Promise[
        js.Function2[/* source */ String, /* relativePath */ String, js.Array[ImportSyntax]]
      ] = js.native
    
    /* private */ var paths: Any = js.native
    
    /* private */ var previousTree: Any = js.native
    
    def removeImports(relativePath: String): Unit = js.native
    
    /* private */ var supportsFastAnalyzer: Any = js.native
    
    /* private */ var treeType: Any = js.native
    
    def updateImports(relativePath: String): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberAutoImport.jsAnalyzerMod.LiteralImport
    - typings.emberAutoImport.jsAnalyzerMod.TemplateImport
  */
  trait Import extends StObject
  object Import {
    
    inline def LiteralImport(
      _package: typings.emberAutoImport.jsPackageMod.default,
      isDynamic: Boolean,
      path: String,
      specifier: String
    ): typings.emberAutoImport.jsAnalyzerMod.LiteralImport = {
      val __obj = js.Dynamic.literal(isDynamic = isDynamic.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emberAutoImport.jsAnalyzerMod.LiteralImport]
    }
    
    inline def TemplateImport(
      _package: typings.emberAutoImport.jsPackageMod.default,
      cookedQuasis: js.Array[String],
      expressionNameHints: js.Array[String | Null],
      isDynamic: Boolean,
      path: String
    ): typings.emberAutoImport.jsAnalyzerMod.TemplateImport = {
      val __obj = js.Dynamic.literal(cookedQuasis = cookedQuasis.asInstanceOf[js.Any], expressionNameHints = expressionNameHints.asInstanceOf[js.Any], isDynamic = isDynamic.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emberAutoImport.jsAnalyzerMod.TemplateImport]
    }
  }
  
  trait LiteralImport
    extends StObject
       with LiteralImportSyntax
       with PackageContext
       with Import
  object LiteralImport {
    
    inline def apply(
      _package: typings.emberAutoImport.jsPackageMod.default,
      isDynamic: Boolean,
      path: String,
      specifier: String
    ): LiteralImport = {
      val __obj = js.Dynamic.literal(isDynamic = isDynamic.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiteralImport]
    }
  }
  
  trait PackageContext extends StObject {
    
    @JSName("package")
    var _package: typings.emberAutoImport.jsPackageMod.default
    
    var path: String
    
    var treeType: js.UndefOr[TreeType] = js.undefined
  }
  object PackageContext {
    
    inline def apply(_package: typings.emberAutoImport.jsPackageMod.default, path: String): PackageContext = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageContext] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setTreeType(value: TreeType): Self = StObject.set(x, "treeType", value.asInstanceOf[js.Any])
      
      inline def setTreeTypeUndefined: Self = StObject.set(x, "treeType", js.undefined)
      
      inline def set_package(value: typings.emberAutoImport.jsPackageMod.default): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateImport
    extends StObject
       with TemplateImportSyntax
       with PackageContext
       with Import
  object TemplateImport {
    
    inline def apply(
      _package: typings.emberAutoImport.jsPackageMod.default,
      cookedQuasis: js.Array[String],
      expressionNameHints: js.Array[String | Null],
      isDynamic: Boolean,
      path: String
    ): TemplateImport = {
      val __obj = js.Dynamic.literal(cookedQuasis = cookedQuasis.asInstanceOf[js.Any], expressionNameHints = expressionNameHints.asInstanceOf[js.Any], isDynamic = isDynamic.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateImport]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberAutoImport.emberAutoImportStrings.app
    - typings.emberAutoImport.emberAutoImportStrings.addon
    - typings.emberAutoImport.emberAutoImportStrings.`addon-templates`
    - typings.emberAutoImport.emberAutoImportStrings.`addon-test-support`
    - typings.emberAutoImport.emberAutoImportStrings.styles
    - typings.emberAutoImport.emberAutoImportStrings.templates
    - typings.emberAutoImport.emberAutoImportStrings.test
  */
  trait TreeType extends StObject
  object TreeType {
    
    inline def addon: typings.emberAutoImport.emberAutoImportStrings.addon = "addon".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.addon]
    
    inline def `addon-templates`: typings.emberAutoImport.emberAutoImportStrings.`addon-templates` = "addon-templates".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.`addon-templates`]
    
    inline def `addon-test-support`: typings.emberAutoImport.emberAutoImportStrings.`addon-test-support` = "addon-test-support".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.`addon-test-support`]
    
    inline def app: typings.emberAutoImport.emberAutoImportStrings.app = "app".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.app]
    
    inline def styles: typings.emberAutoImport.emberAutoImportStrings.styles = "styles".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.styles]
    
    inline def templates: typings.emberAutoImport.emberAutoImportStrings.templates = "templates".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.templates]
    
    inline def test: typings.emberAutoImport.emberAutoImportStrings.test = "test".asInstanceOf[typings.emberAutoImport.emberAutoImportStrings.test]
  }
}
