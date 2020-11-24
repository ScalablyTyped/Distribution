package typings.forkTsCheckerWebpackPlugin.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/watch/WatchFileSystem.WatchFileSystemOptions> */
@js.native
trait PartialWatchFileSystemOpt extends js.Object {
  
  var aggregateTimeout: js.UndefOr[Double] = js.native
  
  var followSymlinks: js.UndefOr[Boolean] = js.native
  
  var ignored: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  
  var poll: js.UndefOr[Boolean] = js.native
}
object PartialWatchFileSystemOpt {
  
  @scala.inline
  def apply(): PartialWatchFileSystemOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWatchFileSystemOpt]
  }
  
  @scala.inline
  implicit class PartialWatchFileSystemOptOps[Self <: PartialWatchFileSystemOpt] (val x: Self) extends AnyVal {
    
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
    def setAggregateTimeout(value: Double): Self = this.set("aggregateTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateTimeout: Self = this.set("aggregateTimeout", js.undefined)
    
    @scala.inline
    def setFollowSymlinks(value: Boolean): Self = this.set("followSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowSymlinks: Self = this.set("followSymlinks", js.undefined)
    
    @scala.inline
    def setIgnoredVarargs(value: (String | RegExp)*): Self = this.set("ignored", js.Array(value :_*))
    
    @scala.inline
    def setIgnored(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    
    @scala.inline
    def setPoll(value: Boolean): Self = this.set("poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
  }
}
