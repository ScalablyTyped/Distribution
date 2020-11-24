package typings.gitRawCommits.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GitOptionsOps[Self <: GitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebug(value: /* message */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
