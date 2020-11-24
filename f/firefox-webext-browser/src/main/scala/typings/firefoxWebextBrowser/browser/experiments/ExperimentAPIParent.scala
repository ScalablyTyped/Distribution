package typings.firefoxWebextBrowser.browser.experiments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentAPIParent extends js.Object {
  
  var events: js.UndefOr[APIEvents] = js.native
  
  var paths: js.UndefOr[APIPaths] = js.native
  
  var scopes: js.UndefOr[js.Array[APIParentScope]] = js.native
  
  var script: ExperimentURL = js.native
}
object ExperimentAPIParent {
  
  @scala.inline
  def apply(script: ExperimentURL): ExperimentAPIParent = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentAPIParent]
  }
  
  @scala.inline
  implicit class ExperimentAPIParentOps[Self <: ExperimentAPIParent] (val x: Self) extends AnyVal {
    
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
    def setScript(value: ExperimentURL): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: APIEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: APIEvents): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: APIPath*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: APIPaths): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: APIParentScope*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[APIParentScope]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
}
