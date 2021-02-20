package typings.gitRawCommits

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a readable stream. Stream is split to break on each commit.
    *
    * @param gitOpts
    * @param execOpts Options to pass to `git` `childProcess`.
    */
  @JSImport("git-raw-commits", JSImport.Namespace)
  @js.native
  def apply(gitOptions: GitOptions): Readable = js.native
  @JSImport("git-raw-commits", JSImport.Namespace)
  @js.native
  def apply(gitOptions: GitOptions, execOptions: ExecOptions): Readable = js.native
  
  /**
    * Options to pass to `git` `childProcess`.
    */
  @js.native
  trait ExecOptions extends StObject {
    
    /**
      * Current working directory to execute git in.
      */
    var cwd: js.UndefOr[String] = js.native
  }
  object ExecOptions {
    
    @scala.inline
    def apply(): ExecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOptions]
    }
    
    @scala.inline
    implicit class ExecOptionsMutableBuilder[Self <: ExecOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
  
  /**
    * Please check the available options at http://git-scm.com/docs/git-log.
    *
    * @remarks
    * Single dash arguments are not supported because of https://github.com/sindresorhus/dargs/blob/master/index.js#L5.
    *
    * @remarks
    * For `<revision range>` we can also use `<from>..<to>` pattern, and this
    * module has the following extra options for shortcut of this pattern:
    *
    * * `from`
    * * `to`
    *
    * This module also have the following additions:
    *
    * * `format`
    * * `debug`
    * * `path`
    */
  @js.native
  trait GitOptions
    extends /* options */ StringDictionary[js.Any] {
    
    /**
      * A function to get debug information.
      */
    var debug: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
    
    /**
      * Please check http://git-scm.com/docs/git-log for format options.
      *
      * @default
      * '%B'
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * @default
      * ''
      */
    var from: js.UndefOr[String] = js.native
    
    /**
      * Filter commits to the path provided.
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * @default
      * 'HEAD'
      */
    var to: js.UndefOr[String] = js.native
  }
  object GitOptions {
    
    @scala.inline
    def apply(): GitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitOptions]
    }
    
    @scala.inline
    implicit class GitOptionsMutableBuilder[Self <: GitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: /* message */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
