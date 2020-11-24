package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringBulk[T] extends Generic {
  
  var body: T = js.native
  
  var interval: js.UndefOr[String] = js.native
  
  var system_api_version: js.UndefOr[String] = js.native
  
  var system_id: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object MonitoringBulk {
  
  @scala.inline
  def apply[T](body: T): MonitoringBulk[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringBulk[T]]
  }
  
  @scala.inline
  implicit class MonitoringBulkOps[Self <: MonitoringBulk[_], T] (val x: Self with MonitoringBulk[T]) extends AnyVal {
    
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: String): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setSystem_api_version(value: String): Self = this.set("system_api_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem_api_version: Self = this.set("system_api_version", js.undefined)
    
    @scala.inline
    def setSystem_id(value: String): Self = this.set("system_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem_id: Self = this.set("system_id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
