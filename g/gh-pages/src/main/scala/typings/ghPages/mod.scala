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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gh-pages", "clean")
  @js.native
  def clean(): Unit = js.native
  
  /* Inlined std.Readonly<gh-pages.gh-pages.Defaults> */
  object defaults {
    
    @JSImport("gh-pages", "defaults.add")
    @js.native
    val add: `false` = js.native
    
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
  
  @JSImport("gh-pages", "publish")
  @js.native
  def publish(basePath: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  @JSImport("gh-pages", "publish")
  @js.native
  def publish(basePath: String, config: PublishOptions): Unit = js.native
  @JSImport("gh-pages", "publish")
  @js.native
  def publish(basePath: String, config: PublishOptions, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  @js.native
  trait Defaults_ extends StObject {
    
    var add: `false` = js.native
    
    var branch: `gh-pages` = js.native
    
    var depth: `1` = js.native
    
    var dest: Dot = js.native
    
    var dotfiles: `false` = js.native
    
    var git: typings.ghPages.ghPagesStrings.git = js.native
    
    var history: `true` = js.native
    
    var message: Updates = js.native
    
    var push: `true` = js.native
    
    var remote: String = js.native
    
    var remove: Dot = js.native
    
    var silent: `false` = js.native
    
    var src: AsteriskAsteriskSlashAsterisk = js.native
  }
  object Defaults_ {
    
    @scala.inline
    def apply(
      add: `false`,
      branch: `gh-pages`,
      depth: `1`,
      dest: Dot,
      dotfiles: `false`,
      git: git,
      history: `true`,
      message: Updates,
      push: `true`,
      remote: String,
      remove: Dot,
      silent: `false`,
      src: AsteriskAsteriskSlashAsterisk
    ): Defaults_ = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], dotfiles = dotfiles.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Defaults_]
    }
    
    @scala.inline
    implicit class Defaults_MutableBuilder[Self <: Defaults_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: `false`): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranch(value: `gh-pages`): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: `1`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDest(value: Dot): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotfiles(value: `false`): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGit(value: git): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistory(value: `true`): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: Updates): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: `true`): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: Dot): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: `false`): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: AsteriskAsteriskSlashAsterisk): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PublishOptions extends StObject {
    
    var add: js.UndefOr[Boolean] = js.native
    
    var branch: js.UndefOr[String] = js.native
    
    var dest: js.UndefOr[String] = js.native
    
    var dotfiles: js.UndefOr[Boolean] = js.native
    
    var git: js.UndefOr[String] = js.native
    
    /**
      * Push force new commit without parent history
      * @default true
      */
    var history: js.UndefOr[Boolean] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var only: js.UndefOr[String] = js.native
    
    var push: js.UndefOr[Boolean] = js.native
    
    var remote: js.UndefOr[String] = js.native
    
    /**
      * Removes files that match the given pattern (Ignored if used together with --add).
      * By default, gh-pages removes everything inside the target branch auto-generated directory before copying the new files from dir.
      * @default '.'
      */
    var remove: js.UndefOr[String] = js.native
    
    var repo: js.UndefOr[String] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var src: js.UndefOr[String | js.Array[String]] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var user: js.UndefOr[Null | Email] = js.native
  }
  object PublishOptions {
    
    @scala.inline
    def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    @scala.inline
    implicit class PublishOptionsMutableBuilder[Self <: PublishOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setDotfiles(value: Boolean): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotfilesUndefined: Self = StObject.set(x, "dotfiles", js.undefined)
      
      @scala.inline
      def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
      
      @scala.inline
      def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnly(value: String): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      @scala.inline
      def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setUser(value: Email): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNull: Self = StObject.set(x, "user", null)
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
