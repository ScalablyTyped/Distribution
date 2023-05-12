package typings.emberAutoImport

import typings.broccoliNodeApi.mod.InputNode
import typings.emberAutoImport.jsBundlerMod.BuildResult
import typings.emberAutoImport.jsBundlerMod.Bundler
import typings.emberAutoImport.jsBundlerMod.BundlerOptions
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWebpackMod {
  
  @JSImport("ember-auto-import/js/webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ember-auto-import/js/webpack", JSImport.Default)
  @js.native
  open class default protected () extends WebpackBundler {
    def this(priorTrees: js.Array[InputNode], opts: BundlerOptions) = this()
  }
  
  inline def mergeConfig(dest: Configuration, srcs: Configuration*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(scala.List(dest.asInstanceOf[js.Any]).`++`(srcs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @js.native
  trait WebpackBundler extends Bundler {
    
    /* private */ var addDiscoveredExternals: Any = js.native
    
    /* private */ var babelRule: Any = js.native
    
    @JSName("buildResult")
    def buildResult_MWebpackBundler: BuildResult = js.native
    
    /* private */ var ensureLinked: Any = js.native
    
    /* private */ var externalDepsSearcher: Any = js.native
    
    /* private */ var externalizedByUs: Any = js.native
    
    /* private */ def externalsHandler: Any = js.native
    
    /* private */ var lastBuildResult: Any = js.native
    
    /* private */ var linkDeps: Any = js.native
    
    /* private */ var opts: Any = js.native
    
    /* private */ var runWebpack: Any = js.native
    
    /* private */ var setup: Any = js.native
    
    /* private */ var setupStyleLoader: Any = js.native
    
    /* private */ var skipBabel: Any = js.native
    
    /* private */ def stagingDir: Any = js.native
    
    /* private */ var state: Any = js.native
    
    /* private */ var summarizeStats: Any = js.native
    
    /* private */ def webpack: Any = js.native
    
    /* private */ var writeEntryFile: Any = js.native
    
    /* private */ var writeLoaderFile: Any = js.native
  }
}
