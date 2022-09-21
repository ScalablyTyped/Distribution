package typings.gitRevisionWebpackPlugin

import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-revision-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GitRevisionPlugin {
    def this(options: Options) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def branch(): String = js.native
    
    /* CompleteClass */
    override def commithash(): String = js.native
    
    /* CompleteClass */
    override def version(): String = js.native
  }
  
  trait GitRevisionPlugin
    extends StObject
       with WebpackPluginInstance {
    
    def branch(): String
    
    def commithash(): String
    
    def version(): String
  }
  object GitRevisionPlugin {
    
    inline def apply(apply: Compiler => Unit, branch: () => String, commithash: () => String, version: () => String): GitRevisionPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), branch = js.Any.fromFunction0(branch), commithash = js.Any.fromFunction0(commithash), version = js.Any.fromFunction0(version))
      __obj.asInstanceOf[GitRevisionPlugin]
    }
    
    extension [Self <: GitRevisionPlugin](x: Self) {
      
      inline def setBranch(value: () => String): Self = StObject.set(x, "branch", js.Any.fromFunction0(value))
      
      inline def setCommithash(value: () => String): Self = StObject.set(x, "commithash", js.Any.fromFunction0(value))
      
      inline def setVersion(value: () => String): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var branch: js.UndefOr[Boolean] = js.undefined
    
    var branchCommand: js.UndefOr[String] = js.undefined
    
    var commithashCommand: js.UndefOr[String] = js.undefined
    
    var gitWorkTree: js.UndefOr[String] = js.undefined
    
    var lightweightTags: js.UndefOr[Boolean] = js.undefined
    
    var versionCommand: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBranch(value: Boolean): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchCommand(value: String): Self = StObject.set(x, "branchCommand", value.asInstanceOf[js.Any])
      
      inline def setBranchCommandUndefined: Self = StObject.set(x, "branchCommand", js.undefined)
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setCommithashCommand(value: String): Self = StObject.set(x, "commithashCommand", value.asInstanceOf[js.Any])
      
      inline def setCommithashCommandUndefined: Self = StObject.set(x, "commithashCommand", js.undefined)
      
      inline def setGitWorkTree(value: String): Self = StObject.set(x, "gitWorkTree", value.asInstanceOf[js.Any])
      
      inline def setGitWorkTreeUndefined: Self = StObject.set(x, "gitWorkTree", js.undefined)
      
      inline def setLightweightTags(value: Boolean): Self = StObject.set(x, "lightweightTags", value.asInstanceOf[js.Any])
      
      inline def setLightweightTagsUndefined: Self = StObject.set(x, "lightweightTags", js.undefined)
      
      inline def setVersionCommand(value: String): Self = StObject.set(x, "versionCommand", value.asInstanceOf[js.Any])
      
      inline def setVersionCommandUndefined: Self = StObject.set(x, "versionCommand", js.undefined)
    }
  }
}
