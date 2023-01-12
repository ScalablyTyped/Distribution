package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.threadTicks
import typings.devtoolsProtocol.devtoolsProtocolStrings.timeTicks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Performance {
  
  trait EnableRequest extends StObject {
    
    /**
      * Time domain to use for collecting and reporting duration metrics. (EnableRequestTimeDomain enum)
      */
    var timeDomain: js.UndefOr[timeTicks | threadTicks] = js.undefined
  }
  object EnableRequest {
    
    inline def apply(): EnableRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnableRequest] (val x: Self) extends AnyVal {
      
      inline def setTimeDomain(value: timeTicks | threadTicks): Self = StObject.set(x, "timeDomain", value.asInstanceOf[js.Any])
      
      inline def setTimeDomainUndefined: Self = StObject.set(x, "timeDomain", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.timeTicks
    - typings.devtoolsProtocol.devtoolsProtocolStrings.threadTicks
  */
  trait EnableRequestTimeDomain extends StObject
  object EnableRequestTimeDomain {
    
    inline def ThreadTicks: threadTicks = "threadTicks".asInstanceOf[threadTicks]
    
    inline def TimeTicks: timeTicks = "timeTicks".asInstanceOf[timeTicks]
  }
  
  trait GetMetricsResponse extends StObject {
    
    /**
      * Current values for run-time metrics.
      */
    var metrics: js.Array[Metric]
  }
  object GetMetricsResponse {
    
    inline def apply(metrics: js.Array[Metric]): GetMetricsResponse = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMetricsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetMetricsResponse] (val x: Self) extends AnyVal {
      
      inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
    }
  }
  
  trait Metric extends StObject {
    
    /**
      * Metric name.
      */
    var name: String
    
    /**
      * Metric value.
      */
    var value: Double
  }
  object Metric {
    
    inline def apply(name: String, value: Double): Metric = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metric]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetricsEvent extends StObject {
    
    /**
      * Current values of the metrics.
      */
    var metrics: js.Array[Metric]
    
    /**
      * Timestamp title.
      */
    var title: String
  }
  object MetricsEvent {
    
    inline def apply(metrics: js.Array[Metric], title: String): MetricsEvent = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetricsEvent] (val x: Self) extends AnyVal {
      
      inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetTimeDomainRequest extends StObject {
    
    /**
      * Time domain (SetTimeDomainRequestTimeDomain enum)
      */
    var timeDomain: timeTicks | threadTicks
  }
  object SetTimeDomainRequest {
    
    inline def apply(timeDomain: timeTicks | threadTicks): SetTimeDomainRequest = {
      val __obj = js.Dynamic.literal(timeDomain = timeDomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetTimeDomainRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetTimeDomainRequest] (val x: Self) extends AnyVal {
      
      inline def setTimeDomain(value: timeTicks | threadTicks): Self = StObject.set(x, "timeDomain", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.timeTicks
    - typings.devtoolsProtocol.devtoolsProtocolStrings.threadTicks
  */
  trait SetTimeDomainRequestTimeDomain extends StObject
  object SetTimeDomainRequestTimeDomain {
    
    inline def ThreadTicks: threadTicks = "threadTicks".asInstanceOf[threadTicks]
    
    inline def TimeTicks: timeTicks = "timeTicks".asInstanceOf[timeTicks]
  }
}
