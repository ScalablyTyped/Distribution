package typings.elasticEcsPinoFormat

import typings.pino.mod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): LoggerOptions = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[LoggerOptions]
  inline def apply(config: Config): LoggerOptions = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[LoggerOptions]
  
  @JSImport("@elastic/ecs-pino-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config extends StObject {
    
    /**
      * Whether to automatically integrate with
      * Elastic APM (https://github.com/elastic/apm-agent-nodejs). If a started
      * APM agent is detected, then log records will include the following
      * fields:
      *
      * - "service.name" - the configured serviceName in the agent
      * - "event.dataset" - set to "$serviceName.log" for correlation in Kibana
      * - "trace.id", "transaction.id", and "span.id" - if there is a current
      *   active trace when the log call is made
      *
      * Default true.
      */
    var apmIntegration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to convert a logged `err` field to ECS error fields.
      * Default true, to match Pino's default of having an `err` serializer.
      */
    var convertErr: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to convert logged `req` and `res` HTTP request and response fields
      * to ECS HTTP, User agent, and URL fields. Default false.
      */
    var convertReqRes: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setApmIntegration(value: Boolean): Self = StObject.set(x, "apmIntegration", value.asInstanceOf[js.Any])
      
      inline def setApmIntegrationUndefined: Self = StObject.set(x, "apmIntegration", js.undefined)
      
      inline def setConvertErr(value: Boolean): Self = StObject.set(x, "convertErr", value.asInstanceOf[js.Any])
      
      inline def setConvertErrUndefined: Self = StObject.set(x, "convertErr", js.undefined)
      
      inline def setConvertReqRes(value: Boolean): Self = StObject.set(x, "convertReqRes", value.asInstanceOf[js.Any])
      
      inline def setConvertReqResUndefined: Self = StObject.set(x, "convertReqRes", js.undefined)
    }
  }
}
