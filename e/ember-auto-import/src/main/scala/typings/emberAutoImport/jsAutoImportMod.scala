package typings.emberAutoImport

import typings.broccoliNodeApi.mod.Node
import typings.emberAutoImport.emberAutoImportBooleans.`true`
import typings.emberAutoImport.jsAnalyzerMod.TreeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAutoImportMod {
  
  @JSImport("ember-auto-import/js/auto-import", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AutoImport {
    def this(addonInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ember-auto-import/js/auto-import", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def lookup(
      addon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any
    ): AutoImportSharedAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(addon.asInstanceOf[js.Any]).asInstanceOf[AutoImportSharedAPI]
    
    inline def register(
      addon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(addon.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait AutoImport
    extends StObject
       with AutoImportSharedAPI {
    
    /* private */ var analyzers: Any = js.native
    
    /* private */ var bundles: Any = js.native
    
    /* private */ var configureFingerprints: Any = js.native
    
    /* private */ var consoleWrite: Any = js.native
    
    /* private */ var env: Any = js.native
    
    /* private */ var installBabelPlugin: Any = js.native
    
    /* private */ var makeBundler: Any = js.native
    
    /* private */ var packages: Any = js.native
    
    /* private */ def rootPackage: Any = js.native
    
    /* private */ var v2Addons: Any = js.native
  }
  
  @js.native
  trait AutoImportSharedAPI extends StObject {
    
    def addTo(tree: Node): Node = js.native
    
    def analyze(
      tree: Node,
      addon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any
    ): Node = js.native
    def analyze(
      tree: Node,
      addon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any,
      treeType: TreeType
    ): Node = js.native
    @JSName("analyze")
    def analyze_true(
      tree: Node,
      addon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any,
      treeType: Unit,
      supportsFastAnalyzer: `true`
    ): Node = js.native
    @JSName("analyze")
    def analyze_true(
      tree: Node,
      addon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any,
      treeType: TreeType,
      supportsFastAnalyzer: `true`
    ): Node = js.native
    
    def included(
      addonInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any
    ): Unit = js.native
    
    def isPrimary(
      addonInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any
    ): Boolean = js.native
    
    def registerV2Addon(packageName: String, packageRoot: String): Unit = js.native
  }
}
