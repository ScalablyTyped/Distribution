package typings.expressPrometheusMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Express
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(userOptions: UserOptions): Express = ^.asInstanceOf[js.Dynamic].apply(userOptions.asInstanceOf[js.Any]).asInstanceOf[Express]
  
  @JSImport("express-prometheus-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Labels
    extends StObject
       with /** Custom labels */
  /* key */ StringDictionary[String] {
    
    var method: String
    
    var route: String
    
    var status: String
  }
  object Labels {
    
    inline def apply(method: String, route: String, status: String): Labels = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Labels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserOptions extends StObject {
    
    /**
      * Optional authentication predicate, the function should receive as argument, the req object and return truthy for sucessfull authentication, or falsy, otherwise.
      * This option supports Promise results.
      */
    var authenticate: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          Boolean | js.Promise[Boolean]
        ]
      ] = js.undefined
    
    /** Whether or not to collect prom-client default metrics. These metrics are useful for collecting saturation metrics, for example. Defaults to true */
    var collectDefaultMetrics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to collect garbage collection metrics via module prometheus-gc-stats.
      * Dependency prometheus-gc-stats is marked as optional, hence if this option is set to true but npm/yarn could not install the dependency,
      * no garbage collection metric will be collected. Defaults to false.
      */
    var collectGCMetrics: js.UndefOr[Boolean] = js.undefined
    
    /** Optional Array containing extra labels, used together with transformLabels */
    var customLabels: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional, list of regexes to be used as argument to url-value-parser, this will cause extra route params, to be replaced with a #val placeholder. */
    var extraMasks: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    /** Express app that will expose metrics endpoint, if an app is provided, use it, instead of instantiating a new one */
    var metricsApp: js.UndefOr[Express] = js.undefined
    
    /** Url route that will expose the metrics for scraping. Defaults to '/metrics' */
    var metricsPath: js.UndefOr[String] = js.undefined
    
    /** Whether or not to normalize http status codes. Defaults to true */
    var normalizeStatus: js.UndefOr[Boolean] = js.undefined
    
    /** Optional prefix for the metrics name. By default, no prefix is added. */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** Buckets for the request duration metrics (in milliseconds) histogram. */
    var requestDurationBuckets: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Buckets for the request length metrics (in bytes) histogram. Defaults to [] */
    var requestLengthBuckets: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Buckets for the response length metrics (in bytes) histogram. Defaults to [] */
    var responseLengthBuckets: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Optional function(labels, req, res) adds to the labels object dynamic values for each label in customLabels */
    var transformLabels: js.UndefOr[
        js.Function3[
          /* labels */ Labels, 
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          Unit
        ]
      ] = js.undefined
  }
  object UserOptions {
    
    inline def apply(): UserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthenticate(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "authenticate", js.Any.fromFunction1(value))
      
      inline def setAuthenticateUndefined: Self = StObject.set(x, "authenticate", js.undefined)
      
      inline def setCollectDefaultMetrics(value: Boolean): Self = StObject.set(x, "collectDefaultMetrics", value.asInstanceOf[js.Any])
      
      inline def setCollectDefaultMetricsUndefined: Self = StObject.set(x, "collectDefaultMetrics", js.undefined)
      
      inline def setCollectGCMetrics(value: Boolean): Self = StObject.set(x, "collectGCMetrics", value.asInstanceOf[js.Any])
      
      inline def setCollectGCMetricsUndefined: Self = StObject.set(x, "collectGCMetrics", js.undefined)
      
      inline def setCustomLabels(value: js.Array[String]): Self = StObject.set(x, "customLabels", value.asInstanceOf[js.Any])
      
      inline def setCustomLabelsUndefined: Self = StObject.set(x, "customLabels", js.undefined)
      
      inline def setCustomLabelsVarargs(value: String*): Self = StObject.set(x, "customLabels", js.Array(value*))
      
      inline def setExtraMasks(value: js.Array[js.RegExp]): Self = StObject.set(x, "extraMasks", value.asInstanceOf[js.Any])
      
      inline def setExtraMasksUndefined: Self = StObject.set(x, "extraMasks", js.undefined)
      
      inline def setExtraMasksVarargs(value: js.RegExp*): Self = StObject.set(x, "extraMasks", js.Array(value*))
      
      inline def setMetricsApp(value: Express): Self = StObject.set(x, "metricsApp", value.asInstanceOf[js.Any])
      
      inline def setMetricsAppUndefined: Self = StObject.set(x, "metricsApp", js.undefined)
      
      inline def setMetricsPath(value: String): Self = StObject.set(x, "metricsPath", value.asInstanceOf[js.Any])
      
      inline def setMetricsPathUndefined: Self = StObject.set(x, "metricsPath", js.undefined)
      
      inline def setNormalizeStatus(value: Boolean): Self = StObject.set(x, "normalizeStatus", value.asInstanceOf[js.Any])
      
      inline def setNormalizeStatusUndefined: Self = StObject.set(x, "normalizeStatus", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRequestDurationBuckets(value: js.Array[Double]): Self = StObject.set(x, "requestDurationBuckets", value.asInstanceOf[js.Any])
      
      inline def setRequestDurationBucketsUndefined: Self = StObject.set(x, "requestDurationBuckets", js.undefined)
      
      inline def setRequestDurationBucketsVarargs(value: Double*): Self = StObject.set(x, "requestDurationBuckets", js.Array(value*))
      
      inline def setRequestLengthBuckets(value: js.Array[Double]): Self = StObject.set(x, "requestLengthBuckets", value.asInstanceOf[js.Any])
      
      inline def setRequestLengthBucketsUndefined: Self = StObject.set(x, "requestLengthBuckets", js.undefined)
      
      inline def setRequestLengthBucketsVarargs(value: Double*): Self = StObject.set(x, "requestLengthBuckets", js.Array(value*))
      
      inline def setResponseLengthBuckets(value: js.Array[Double]): Self = StObject.set(x, "responseLengthBuckets", value.asInstanceOf[js.Any])
      
      inline def setResponseLengthBucketsUndefined: Self = StObject.set(x, "responseLengthBuckets", js.undefined)
      
      inline def setResponseLengthBucketsVarargs(value: Double*): Self = StObject.set(x, "responseLengthBuckets", js.Array(value*))
      
      inline def setTransformLabels(
        value: (/* labels */ Labels, /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]]) => Unit
      ): Self = StObject.set(x, "transformLabels", js.Any.fromFunction3(value))
      
      inline def setTransformLabelsUndefined: Self = StObject.set(x, "transformLabels", js.undefined)
    }
  }
}
