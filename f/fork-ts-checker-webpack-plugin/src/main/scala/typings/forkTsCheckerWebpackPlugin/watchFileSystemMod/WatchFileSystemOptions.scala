package typings.forkTsCheckerWebpackPlugin.watchFileSystemMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchFileSystemOptions extends js.Object {
  
  var aggregateTimeout: Double = js.native
  
  var followSymlinks: Boolean = js.native
  
  var ignored: String | RegExp | (js.Array[String | RegExp]) = js.native
  
  var poll: Boolean = js.native
}
object WatchFileSystemOptions {
  
  @scala.inline
  def apply(
    aggregateTimeout: Double,
    followSymlinks: Boolean,
    ignored: String | RegExp | (js.Array[String | RegExp]),
    poll: Boolean
  ): WatchFileSystemOptions = {
    val __obj = js.Dynamic.literal(aggregateTimeout = aggregateTimeout.asInstanceOf[js.Any], followSymlinks = followSymlinks.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], poll = poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchFileSystemOptions]
  }
  
  @scala.inline
  implicit class WatchFileSystemOptionsOps[Self <: WatchFileSystemOptions] (val x: Self) extends AnyVal {
    
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
    def setFollowSymlinks(value: Boolean): Self = this.set("followSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredVarargs(value: (String | RegExp)*): Self = this.set("ignored", js.Array(value :_*))
    
    @scala.inline
    def setIgnored(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoll(value: Boolean): Self = this.set("poll", value.asInstanceOf[js.Any])
  }
}
