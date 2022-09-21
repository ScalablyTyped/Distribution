package typings.ghPages

import typings.ghPages.anon.Email
import typings.ghPages.ghPagesBooleans.`false`
import typings.ghPages.ghPagesBooleans.`true`
import typings.ghPages.ghPagesNumbers.`1`
import typings.ghPages.ghPagesStrings.AsteriskAsteriskSlashAsterisk
import typings.ghPages.ghPagesStrings.Dot
import typings.ghPages.ghPagesStrings.Updates
import typings.ghPages.ghPagesStrings.`gh-pages`
import typings.ghPages.ghPagesStrings.git
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gh-pages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clean(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")().asInstanceOf[Unit]
  
  /* Inlined std.Readonly<gh-pages.gh-pages.Defaults> */
  object defaults {
    
    @JSImport("gh-pages", "defaults.add")
    @js.native
    val add: `false` = js.native
    
    @JSImport("gh-pages", "defaults.beforeAdd")
    @js.native
    val beforeAdd: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("gh-pages", "defaults.branch")
    @js.native
    val branch: `gh-pages` = js.native
    
    @JSImport("gh-pages", "defaults.depth")
    @js.native
    val depth: `1` = js.native
    
    @JSImport("gh-pages", "defaults.dest")
    @js.native
    val dest: Dot = js.native
    
    @JSImport("gh-pages", "defaults.dotfiles")
    @js.native
    val dotfiles: `false` = js.native
    
    @JSImport("gh-pages", "defaults.git")
    @js.native
    val git: typings.ghPages.ghPagesStrings.git = js.native
    
    @JSImport("gh-pages", "defaults.history")
    @js.native
    val history: `true` = js.native
    
    @JSImport("gh-pages", "defaults.message")
    @js.native
    val message: Updates = js.native
    
    @JSImport("gh-pages", "defaults.push")
    @js.native
    val push: `true` = js.native
    
    @JSImport("gh-pages", "defaults.remote")
    @js.native
    val remote: String = js.native
    
    @JSImport("gh-pages", "defaults.remove")
    @js.native
    val remove: Dot = js.native
    
    @JSImport("gh-pages", "defaults.silent")
    @js.native
    val silent: `false` = js.native
    
    @JSImport("gh-pages", "defaults.src")
    @js.native
    val src: AsteriskAsteriskSlashAsterisk = js.native
  }
  
  inline def getCacheDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheDir")().asInstanceOf[String]
  inline def getCacheDir(optPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheDir")(optPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def publish(basePath: String, callback: js.Function1[/* err */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(basePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publish(basePath: String, config: PublishOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(basePath.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publish(basePath: String, config: PublishOptions, callback: js.Function1[/* err */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(basePath.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Defaults_ extends StObject {
    
    var add: `false`
    
    var beforeAdd: Null
    
    var branch: `gh-pages`
    
    var depth: `1`
    
    var dest: Dot
    
    var dotfiles: `false`
    
    var git: typings.ghPages.ghPagesStrings.git
    
    var history: `true`
    
    var message: Updates
    
    var push: `true`
    
    var remote: String
    
    var remove: Dot
    
    var silent: `false`
    
    var src: AsteriskAsteriskSlashAsterisk
  }
  object Defaults_ {
    
    inline def apply(beforeAdd: Null, remote: String): Defaults_ = {
      val __obj = js.Dynamic.literal(add = false, beforeAdd = beforeAdd.asInstanceOf[js.Any], branch = "gh-pages", depth = 1, dest = ".", dotfiles = false, git = "git", history = true, message = "Updates", push = true, remote = remote.asInstanceOf[js.Any], remove = ".", silent = false, src = "**/*")
      __obj.asInstanceOf[Defaults_]
    }
    
    extension [Self <: Defaults_](x: Self) {
      
      inline def setAdd(value: `false`): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setBeforeAdd(value: Null): Self = StObject.set(x, "beforeAdd", value.asInstanceOf[js.Any])
      
      inline def setBranch(value: `gh-pages`): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: `1`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDest(value: Dot): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDotfiles(value: `false`): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      inline def setGit(value: git): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: `true`): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Updates): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPush(value: `true`): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Dot): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: `false`): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: AsteriskAsteriskSlashAsterisk): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Git extends StObject {
    
    def add(files: String): js.Promise[this.type] = js.native
    def add(files: js.Array[String]): js.Promise[this.type] = js.native
    
    def checkout(remote: String, branch: String): js.Promise[this.type] = js.native
    
    def clean(): js.Promise[this.type] = js.native
    
    def clone(repo: String, dir: String, branch: String, options: PublishOptions): js.Promise[this.type] = js.native
    
    def commit(message: String): js.Promise[this.type] = js.native
    
    def deleteRef(branch: String): js.Promise[this.type] = js.native
    
    def exec(command: String): js.Promise[this.type] = js.native
    
    def fetch(remote: String): js.Promise[this.type] = js.native
    
    def getRemoteUrl(remote: String): js.Promise[this.type] = js.native
    
    def init(): js.Promise[this.type] = js.native
    
    def push(remote: String, branch: String): js.Promise[this.type] = js.native
    def push(remote: String, branch: String, force: Boolean): js.Promise[this.type] = js.native
    
    def reset(remote: String, branch: String): js.Promise[this.type] = js.native
    
    def rm(files: String): js.Promise[this.type] = js.native
    def rm(files: js.Array[String]): js.Promise[this.type] = js.native
    
    def tag(name: String): js.Promise[this.type] = js.native
  }
  
  trait PublishOptions extends StObject {
    
    var add: js.UndefOr[Boolean] = js.undefined
    
    var beforeAdd: js.UndefOr[(js.Function1[/* git */ Git, js.Promise[js.UndefOr[Git]]]) | Null] = js.undefined
    
    var branch: js.UndefOr[String] = js.undefined
    
    var dest: js.UndefOr[String] = js.undefined
    
    var dotfiles: js.UndefOr[Boolean] = js.undefined
    
    var git: js.UndefOr[String] = js.undefined
    
    /**
      * Push force new commit without parent history
      * @default true
      */
    var history: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var only: js.UndefOr[String] = js.undefined
    
    var push: js.UndefOr[Boolean] = js.undefined
    
    var remote: js.UndefOr[String] = js.undefined
    
    /**
      * Removes files that match the given pattern (Ignored if used together with --add).
      * By default, gh-pages removes everything inside the target branch auto-generated directory before copying the new files from dir.
      * @default '.'
      */
    var remove: js.UndefOr[String] = js.undefined
    
    var repo: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[Null | Email] = js.undefined
  }
  object PublishOptions {
    
    inline def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    extension [Self <: PublishOptions](x: Self) {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setBeforeAdd(value: /* git */ Git => js.Promise[js.UndefOr[Git]]): Self = StObject.set(x, "beforeAdd", js.Any.fromFunction1(value))
      
      inline def setBeforeAddNull: Self = StObject.set(x, "beforeAdd", null)
      
      inline def setBeforeAddUndefined: Self = StObject.set(x, "beforeAdd", js.undefined)
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setDotfiles(value: Boolean): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      inline def setDotfilesUndefined: Self = StObject.set(x, "dotfiles", js.undefined)
      
      inline def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnly(value: String): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setUser(value: Email): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
