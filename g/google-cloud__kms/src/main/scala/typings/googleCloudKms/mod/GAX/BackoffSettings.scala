package typings.googleCloudKms.mod.GAX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** https://googleapis.github.io/gax-nodejs/global.html#BackoffSettings */
@js.native
trait BackoffSettings extends js.Object {
  
  var initialRetryDelayMillis: Double = js.native
  
  var initialRpcTimeoutMillis: Double = js.native
  
  var maxRetryDelayMillis: Double = js.native
  
  var maxRpcTimeoutMillis: Double = js.native
  
  var retryDelayMultiplier: Double = js.native
  
  var totalTimeoutMillis: Double = js.native
}
object BackoffSettings {
  
  @scala.inline
  def apply(
    initialRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    maxRetryDelayMillis: Double,
    maxRpcTimeoutMillis: Double,
    retryDelayMultiplier: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = {
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis = initialRpcTimeoutMillis.asInstanceOf[js.Any], maxRetryDelayMillis = maxRetryDelayMillis.asInstanceOf[js.Any], maxRpcTimeoutMillis = maxRpcTimeoutMillis.asInstanceOf[js.Any], retryDelayMultiplier = retryDelayMultiplier.asInstanceOf[js.Any], totalTimeoutMillis = totalTimeoutMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffSettings]
  }
  
  @scala.inline
  implicit class BackoffSettingsOps[Self <: BackoffSettings] (val x: Self) extends AnyVal {
    
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
    def setInitialRetryDelayMillis(value: Double): Self = this.set("initialRetryDelayMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRpcTimeoutMillis(value: Double): Self = this.set("initialRpcTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetryDelayMillis(value: Double): Self = this.set("maxRetryDelayMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRpcTimeoutMillis(value: Double): Self = this.set("maxRpcTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelayMultiplier(value: Double): Self = this.set("retryDelayMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTimeoutMillis(value: Double): Self = this.set("totalTimeoutMillis", value.asInstanceOf[js.Any])
  }
}
