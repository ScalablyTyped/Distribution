package typings.gitRawCommits

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a readable stream. Stream is split to break on each commit.
    *
    * @param gitOpts
    * @param execOpts Options to pass to `git` `childProcess`.
    */
  inline def apply(gitOptions: GitOptions): Readable = ^.asInstanceOf[js.Dynamic].apply(gitOptions.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def apply(gitOptions: GitOptions, execOptions: ExecOptions): Readable = (^.asInstanceOf[js.Dynamic].apply(gitOptions.asInstanceOf[js.Any], execOptions.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  @JSImport("git-raw-commits", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Options to pass to `git` `childProcess`.
    */
  trait ExecOptions extends StObject {
    
    /**
      * Current working directory to execute git in.
      */
    var cwd: js.UndefOr[String] = js.undefined
  }
  object ExecOptions {
    
    inline def apply(): ExecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
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
  trait GitOptions
    extends StObject
       with /* options */ StringDictionary[Any] {
    
    /**
      * A function to get debug information.
      */
    var debug: js.UndefOr[js.Function1[/* message */ Any, Unit]] = js.undefined
    
    /**
      * Please check http://git-scm.com/docs/git-log for format options.
      *
      * @default
      * '%B'
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * @default
      * ''
      */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * Filter commits to the path provided.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * @default
      * 'HEAD'
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object GitOptions {
    
    inline def apply(): GitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GitOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: /* message */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
