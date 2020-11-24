package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogBucket extends js.Object {
  
  var logBucket: js.UndefOr[String] = js.native
  
  var logObjectPrefix: js.UndefOr[String] = js.native
}
object LogBucket {
  
  @scala.inline
  def apply(): LogBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogBucket]
  }
  
  @scala.inline
  implicit class LogBucketOps[Self <: LogBucket] (val x: Self) extends AnyVal {
    
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
    def setLogBucket(value: String): Self = this.set("logBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogBucket: Self = this.set("logBucket", js.undefined)
    
    @scala.inline
    def setLogObjectPrefix(value: String): Self = this.set("logObjectPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogObjectPrefix: Self = this.set("logObjectPrefix", js.undefined)
  }
}
