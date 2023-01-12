package typings.gitBranchIs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(branchNameOrTest: BranchNameOrTest): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(branchNameOrTest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(branchNameOrTest: BranchNameOrTest, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(branchNameOrTest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(branchNameOrTest: BranchNameOrTest, options: GitBranchIsOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(branchNameOrTest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(branchNameOrTest: BranchNameOrTest, options: GitBranchIsOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(branchNameOrTest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("git-branch-is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBranch(options: GitBranchIsOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBranch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  /**
    * Gets the name of the current (i.e. checked out) branch of a git repository.
    *
    * @param options Options.
    * @param callback Callback function called
    * with the current branch name, empty string if not on a branch, or
    * <code>Error</code> if there was an error determining the branch name.
    * @returns If <code>callback</code> is not given, a
    * <code>Promise</code> with the current branch name, empty string if not on a
    * branch, or <code>Error</code> if there was an error determining the branch
    * name.
    */
  inline def getBranch(options: GitBranchIsOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBranch")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Expected name of current branch
    * or a test function to apply to the branch name
    */
  type BranchNameOrTest = String | BranchNameTest
  
  /**
    * test function to apply to the branch name
    */
  type BranchNameTest = js.Function1[/* branchName */ String, Boolean]
  
  /**
    * function called with the return value of <code>branchNameOrTest</code> if it is a function,
    * or the result of identity checking <code>branchNameOrTest</code> to the
    * current branch name
    */
  type Callback = js.Function2[/* error */ js.Error | Null, /* result */ String, Unit]
  
  /**
    * Options for {@link gitBranchIs}.
    */
  trait GitBranchIsOptions extends StObject {
    
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
  object GitBranchIsOptions {
    
    inline def apply(): GitBranchIsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitBranchIsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GitBranchIsOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setGitArgs(value: js.Array[String]): Self = StObject.set(x, "gitArgs", value.asInstanceOf[js.Any])
      
      inline def setGitArgsUndefined: Self = StObject.set(x, "gitArgs", js.undefined)
      
      inline def setGitArgsVarargs(value: String*): Self = StObject.set(x, "gitArgs", js.Array(value*))
      
      inline def setGitDir(value: String): Self = StObject.set(x, "gitDir", value.asInstanceOf[js.Any])
      
      inline def setGitDirUndefined: Self = StObject.set(x, "gitDir", js.undefined)
      
      inline def setGitPath(value: String): Self = StObject.set(x, "gitPath", value.asInstanceOf[js.Any])
      
      inline def setGitPathUndefined: Self = StObject.set(x, "gitPath", js.undefined)
    }
  }
}
