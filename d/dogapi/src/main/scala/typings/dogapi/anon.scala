package typings.dogapi

import typings.dogapi.dogapiStrings.`my apps`
import typings.dogapi.dogapiStrings.bitbucket
import typings.dogapi.dogapiStrings.capistrano
import typings.dogapi.dogapiStrings.chef
import typings.dogapi.dogapiStrings.count
import typings.dogapi.dogapiStrings.error
import typings.dogapi.dogapiStrings.fabric
import typings.dogapi.dogapiStrings.feed
import typings.dogapi.dogapiStrings.gauge
import typings.dogapi.dogapiStrings.git
import typings.dogapi.dogapiStrings.hudson
import typings.dogapi.dogapiStrings.info
import typings.dogapi.dogapiStrings.jenkins
import typings.dogapi.dogapiStrings.low
import typings.dogapi.dogapiStrings.nagios
import typings.dogapi.dogapiStrings.normal
import typings.dogapi.dogapiStrings.puppet
import typings.dogapi.dogapiStrings.rate
import typings.dogapi.dogapiStrings.success
import typings.dogapi.dogapiStrings.user
import typings.dogapi.dogapiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aggregationkey extends StObject {
    
    var aggregation_key: js.UndefOr[String] = js.undefined
    
    var alert_type: js.UndefOr[error | warning | info | success] = js.undefined
    
    var date_happened: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[normal | low] = js.undefined
    
    var source_type_name: js.UndefOr[
        nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
      ] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Aggregationkey {
    
    @scala.inline
    def apply(): Aggregationkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aggregationkey]
    }
    
    @scala.inline
    implicit class AggregationkeyMutableBuilder[Self <: Aggregationkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregation_key(value: String): Self = StObject.set(x, "aggregation_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregation_keyUndefined: Self = StObject.set(x, "aggregation_key", js.undefined)
      
      @scala.inline
      def setAlert_type(value: error | warning | info | success): Self = StObject.set(x, "alert_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlert_typeUndefined: Self = StObject.set(x, "alert_type", js.undefined)
      
      @scala.inline
      def setDate_happened(value: Double): Self = StObject.set(x, "date_happened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_happenedUndefined: Self = StObject.set(x, "date_happened", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPriority(value: normal | low): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setSource_type_name(
        value: nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
      ): Self = StObject.set(x, "source_type_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_type_nameUndefined: Self = StObject.set(x, "source_type_name", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait Apihost extends StObject {
    
    var api_host: js.UndefOr[String] = js.undefined
    
    var api_key: String
    
    var app_key: String
  }
  object Apihost {
    
    @scala.inline
    def apply(api_key: String, app_key: String): Apihost = {
      val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], app_key = app_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Apihost]
    }
    
    @scala.inline
    implicit class ApihostMutableBuilder[Self <: Apihost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_host(value: String): Self = StObject.set(x, "api_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_hostUndefined: Self = StObject.set(x, "api_host", js.undefined)
      
      @scala.inline
      def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_key(value: String): Self = StObject.set(x, "app_key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Datehappened extends StObject {
    
    var date_happened: Double
    
    var handle: js.Any
    
    var id: js.BigInt
    
    var priority: normal | low
    
    var related_event_id: Double | Null
    
    var tags: js.Array[String]
    
    var text: String
    
    var title: String
    
    var url: String
  }
  object Datehappened {
    
    @scala.inline
    def apply(
      date_happened: Double,
      handle: js.Any,
      id: js.BigInt,
      priority: normal | low,
      tags: js.Array[String],
      text: String,
      title: String,
      url: String
    ): Datehappened = {
      val __obj = js.Dynamic.literal(date_happened = date_happened.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], related_event_id = null)
      __obj.asInstanceOf[Datehappened]
    }
    
    @scala.inline
    implicit class DatehappenedMutableBuilder[Self <: Datehappened] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate_happened(value: Double): Self = StObject.set(x, "date_happened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandle(value: js.Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.BigInt): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: normal | low): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelated_event_id(value: Double): Self = StObject.set(x, "related_event_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelated_event_idNull: Self = StObject.set(x, "related_event_id", null)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var metric_type: js.UndefOr[gauge | count] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: js.UndefOr[gauge | rate | count] = js.undefined
  }
  object Host {
    
    @scala.inline
    def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMetric_type(value: gauge | count): Self = StObject.set(x, "metric_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric_typeUndefined: Self = StObject.set(x, "metric_type", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setType(value: gauge | rate | count): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Metric extends StObject {
    
    var metric: String
    
    var metric_type: js.UndefOr[String] = js.undefined
    
    var points: Double | (js.Array[Double | (js.Tuple2[String, Double])])
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Metric {
    
    @scala.inline
    def apply(metric: String, points: Double | (js.Array[Double | (js.Tuple2[String, Double])])): Metric = {
      val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metric]
    }
    
    @scala.inline
    implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric_type(value: String): Self = StObject.set(x, "metric_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric_typeUndefined: Self = StObject.set(x, "metric_type", js.undefined)
      
      @scala.inline
      def setPoints(value: Double | (js.Array[Double | (js.Tuple2[String, Double])])): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: (Double | (js.Tuple2[String, Double]))*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
