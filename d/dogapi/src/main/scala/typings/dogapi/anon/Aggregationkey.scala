package typings.dogapi.anon

import typings.dogapi.dogapiStrings.`my apps`
import typings.dogapi.dogapiStrings.bitbucket
import typings.dogapi.dogapiStrings.capistrano
import typings.dogapi.dogapiStrings.chef
import typings.dogapi.dogapiStrings.error
import typings.dogapi.dogapiStrings.fabric
import typings.dogapi.dogapiStrings.feed
import typings.dogapi.dogapiStrings.git
import typings.dogapi.dogapiStrings.hudson
import typings.dogapi.dogapiStrings.info
import typings.dogapi.dogapiStrings.jenkins
import typings.dogapi.dogapiStrings.low
import typings.dogapi.dogapiStrings.nagios
import typings.dogapi.dogapiStrings.normal
import typings.dogapi.dogapiStrings.puppet
import typings.dogapi.dogapiStrings.success
import typings.dogapi.dogapiStrings.user
import typings.dogapi.dogapiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aggregationkey extends js.Object {
  
  var aggregation_key: js.UndefOr[String] = js.native
  
  var alert_type: js.UndefOr[error | warning | info | success] = js.native
  
  var date_happened: js.UndefOr[Double] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var priority: js.UndefOr[normal | low] = js.native
  
  var source_type_name: js.UndefOr[
    nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
  ] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object Aggregationkey {
  
  @scala.inline
  def apply(): Aggregationkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregationkey]
  }
  
  @scala.inline
  implicit class AggregationkeyOps[Self <: Aggregationkey] (val x: Self) extends AnyVal {
    
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
    def setAggregation_key(value: String): Self = this.set("aggregation_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation_key: Self = this.set("aggregation_key", js.undefined)
    
    @scala.inline
    def setAlert_type(value: error | warning | info | success): Self = this.set("alert_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert_type: Self = this.set("alert_type", js.undefined)
    
    @scala.inline
    def setDate_happened(value: Double): Self = this.set("date_happened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate_happened: Self = this.set("date_happened", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPriority(value: normal | low): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setSource_type_name(
      value: nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
    ): Self = this.set("source_type_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_type_name: Self = this.set("source_type_name", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
