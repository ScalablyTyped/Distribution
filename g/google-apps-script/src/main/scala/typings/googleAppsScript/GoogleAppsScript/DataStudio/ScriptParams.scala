package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptParams extends js.Object {
  
  /** A timestamp that marks the most recent request for a refresh of data. */
  var lastRefresh: String = js.native
  
  /** If true, the getData() request is for automatic semantic type detection. */
  var sampleExtraction: js.UndefOr[Boolean] = js.native
}
object ScriptParams {
  
  @scala.inline
  def apply(lastRefresh: String): ScriptParams = {
    val __obj = js.Dynamic.literal(lastRefresh = lastRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptParams]
  }
  
  @scala.inline
  implicit class ScriptParamsOps[Self <: ScriptParams] (val x: Self) extends AnyVal {
    
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
    def setLastRefresh(value: String): Self = this.set("lastRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleExtraction(value: Boolean): Self = this.set("sampleExtraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleExtraction: Self = this.set("sampleExtraction", js.undefined)
  }
}
