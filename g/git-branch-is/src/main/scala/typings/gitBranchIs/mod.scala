package typings.gitBranchIs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-branch-is", JSImport.Namespace)
  @js.native
  def apply(branchNameOrTest: BranchNameOrTest): js.Promise[Boolean] = js.native
  @JSImport("git-branch-is", JSImport.Namespace)
  @js.native
  def apply(branchNameOrTest: BranchNameOrTest, callback: Callback): Unit = js.native
  @JSImport("git-branch-is", JSImport.Namespace)
  @js.native
  def apply(branchNameOrTest: BranchNameOrTest, options: Options): Unit = js.native
  @JSImport("git-branch-is", JSImport.Namespace)
  @js.native
  def apply(branchNameOrTest: BranchNameOrTest, options: Options, callback: Callback): Unit = js.native
  
  /**
    * Expected name of current branch
    * or a test function to apply to the branch name
    */
  type BranchNameOrTest = String | BranchNameTest
  
  /**
    * test function to apply to the branch name
    */
  type BranchNameTest = js.Function1[/* branchName */ String, Boolean | js.Promise[Boolean]]
  
  /**
    * function called with the return value of <code>branchNameOrTest</code> if it is a function,
    * or the result of identity checking <code>branchNameOrTest</code> to the
    * current branch name
    */
  type Callback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[Boolean], Unit]
  
  /**
    * Options for {@link gitBranchIs}.
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * Current working directory where the branch name is
      * tested
      * @default ''
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Extra arguments to pass to git
      * @default []
      */
    var gitArgs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Path to the repository (i.e.
      * <code>--git-dir=</code> option to <code>git</code>).
      * @default ''
      */
    var gitDir: js.UndefOr[String] = js.native
    
    /**
      * Git binary name or path to use (default:
      * <code>'git'</code>).
      * @default 'git'
      */
    var gitPath: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setGitArgs(value: js.Array[String]): Self = StObject.set(x, "gitArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitArgsUndefined: Self = StObject.set(x, "gitArgs", js.undefined)
      
      @scala.inline
      def setGitArgsVarargs(value: String*): Self = StObject.set(x, "gitArgs", js.Array(value :_*))
      
      @scala.inline
      def setGitDir(value: String): Self = StObject.set(x, "gitDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitDirUndefined: Self = StObject.set(x, "gitDir", js.undefined)
      
      @scala.inline
      def setGitPath(value: String): Self = StObject.set(x, "gitPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitPathUndefined: Self = StObject.set(x, "gitPath", js.undefined)
    }
  }
}
