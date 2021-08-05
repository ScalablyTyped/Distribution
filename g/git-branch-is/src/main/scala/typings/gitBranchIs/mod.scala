package typings.gitBranchIs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(branchNameOrTest: BranchNameOrTest): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(branchNameOrTest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def apply(branchNameOrTest: BranchNameOrTest, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(branchNameOrTest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(branchNameOrTest: BranchNameOrTest, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(branchNameOrTest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(branchNameOrTest: BranchNameOrTest, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(branchNameOrTest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("git-branch-is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  trait Options extends StObject {
    
    /**
      * Current working directory where the branch name is
      * tested
      * @default ''
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Extra arguments to pass to git
      * @default []
      */
    var gitArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Path to the repository (i.e.
      * <code>--git-dir=</code> option to <code>git</code>).
      * @default ''
      */
    var gitDir: js.UndefOr[String] = js.undefined
    
    /**
      * Git binary name or path to use (default:
      * <code>'git'</code>).
      * @default 'git'
      */
    var gitPath: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setGitArgs(value: js.Array[String]): Self = StObject.set(x, "gitArgs", value.asInstanceOf[js.Any])
      
      inline def setGitArgsUndefined: Self = StObject.set(x, "gitArgs", js.undefined)
      
      inline def setGitArgsVarargs(value: String*): Self = StObject.set(x, "gitArgs", js.Array(value :_*))
      
      inline def setGitDir(value: String): Self = StObject.set(x, "gitDir", value.asInstanceOf[js.Any])
      
      inline def setGitDirUndefined: Self = StObject.set(x, "gitDir", js.undefined)
      
      inline def setGitPath(value: String): Self = StObject.set(x, "gitPath", value.asInstanceOf[js.Any])
      
      inline def setGitPathUndefined: Self = StObject.set(x, "gitPath", js.undefined)
    }
  }
}
