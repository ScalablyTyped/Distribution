package typings.feedsub.mod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedSubOptions extends js.Object {
  
  // If true, calls `reader.start()` when initialized. [default: false]
  var autoStart: js.UndefOr[Boolean] = js.native
  
  // Specify exactly what days to skip, ex: ['Saturday', 'Sunday']. [default: []]
  var daysToSkip: js.UndefOr[js.Array[String]] = js.native
  
  // Emits items on the very first request.
  // After which, it should consider those items read. [default: false]
  var emitOnStart: js.UndefOr[Boolean] = js.native
  
  // Some feeds contain a `ttl` tag that specify the
  // number of minutes to cache the feed.
  // Setting this to true will ignore that. [default: false]
  var forceInterval: js.UndefOr[Boolean] = js.native
  
  // If you'd like to specify exactly what hours to skip. [default: []]
  var hoursToSkip: js.UndefOr[js.Array[Double]] = js.native
  
  // Number of minutes to wait between checking the feed for new items. [default: 10]
  var interval: js.UndefOr[Double] = js.native
  
  // Keeps track of last date of the feed. [default: null]
  var lastDate: js.UndefOr[Double] = js.native
  
  // Maximum size of `history` array. [default: 10]
  var maxHistory: js.UndefOr[Double] = js.native
  
  // Options object passed to [miniget](https://github.com/fent/node-miniget). [default: {}]
  var requestOpts: js.UndefOr[RequestOptions] = js.native
  
  // Same as `skipHours`, but with days. [default: false]
  var skipDays: js.UndefOr[Boolean] = js.native
  
  // Some feeds have a `skipHours` tag with a list of
  // hours in which the feed should not be read.
  // if this is set to true and the feed has that tag, it obeys that rule [default: false]
  var skipHours: js.UndefOr[Boolean] = js.native
}
object FeedSubOptions {
  
  @scala.inline
  def apply(): FeedSubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedSubOptions]
  }
  
  @scala.inline
  implicit class FeedSubOptionsOps[Self <: FeedSubOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setDaysToSkipVarargs(value: String*): Self = this.set("daysToSkip", js.Array(value :_*))
    
    @scala.inline
    def setDaysToSkip(value: js.Array[String]): Self = this.set("daysToSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysToSkip: Self = this.set("daysToSkip", js.undefined)
    
    @scala.inline
    def setEmitOnStart(value: Boolean): Self = this.set("emitOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitOnStart: Self = this.set("emitOnStart", js.undefined)
    
    @scala.inline
    def setForceInterval(value: Boolean): Self = this.set("forceInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceInterval: Self = this.set("forceInterval", js.undefined)
    
    @scala.inline
    def setHoursToSkipVarargs(value: Double*): Self = this.set("hoursToSkip", js.Array(value :_*))
    
    @scala.inline
    def setHoursToSkip(value: js.Array[Double]): Self = this.set("hoursToSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoursToSkip: Self = this.set("hoursToSkip", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setLastDate(value: Double): Self = this.set("lastDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDate: Self = this.set("lastDate", js.undefined)
    
    @scala.inline
    def setMaxHistory(value: Double): Self = this.set("maxHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHistory: Self = this.set("maxHistory", js.undefined)
    
    @scala.inline
    def setRequestOpts(value: RequestOptions): Self = this.set("requestOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOpts: Self = this.set("requestOpts", js.undefined)
    
    @scala.inline
    def setSkipDays(value: Boolean): Self = this.set("skipDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipDays: Self = this.set("skipDays", js.undefined)
    
    @scala.inline
    def setSkipHours(value: Boolean): Self = this.set("skipHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipHours: Self = this.set("skipHours", js.undefined)
  }
}
