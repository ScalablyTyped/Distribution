package typings.fastify.anon

import typings.fastify.contentTypeParserMod.ConstructorAction
import typings.fastify.contentTypeParserMod.ProtoAction
import typings.fastify.fastifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  connectionTimeout :number | undefined,   keepAliveTimeout :number | undefined,   forceCloseConnections :boolean | undefined,   bodyLimit :number | undefined,   caseSensitive :boolean | undefined,   allowUnsafeRegex :boolean | undefined,   http2 :boolean | undefined,   https :boolean | std.Readonly<{  allowHTTP1 :boolean}> | undefined,   ignoreTrailingSlash :boolean | undefined,   ignoreDuplicateSlashes :boolean | undefined,   disableRequestLogging :boolean | undefined,   maxParamLength :number | undefined,   onProtoPoisoning :fastify.fastify/types/content-type-parser.ProtoAction | undefined,   onConstructorPoisoning :fastify.fastify/types/content-type-parser.ConstructorAction | undefined,   pluginTimeout :number | undefined,   requestIdHeader :string | false | undefined,   requestIdLogLabel :string | undefined,   http2SessionTimeout :number | undefined}> */
trait ReadonlyconnectionTimeout extends StObject {
  
  val allowUnsafeRegex: js.UndefOr[Boolean] = js.undefined
  
  val bodyLimit: js.UndefOr[Double] = js.undefined
  
  val caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  val connectionTimeout: js.UndefOr[Double] = js.undefined
  
  val disableRequestLogging: js.UndefOr[Boolean] = js.undefined
  
  val forceCloseConnections: js.UndefOr[Boolean] = js.undefined
  
  val http2: js.UndefOr[Boolean] = js.undefined
  
  val http2SessionTimeout: js.UndefOr[Double] = js.undefined
  
  val https: js.UndefOr[Boolean | ReadonlyallowHTTP1boolean] = js.undefined
  
  val ignoreDuplicateSlashes: js.UndefOr[Boolean] = js.undefined
  
  val ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
  
  val keepAliveTimeout: js.UndefOr[Double] = js.undefined
  
  val maxParamLength: js.UndefOr[Double] = js.undefined
  
  val onConstructorPoisoning: js.UndefOr[ConstructorAction] = js.undefined
  
  val onProtoPoisoning: js.UndefOr[ProtoAction] = js.undefined
  
  val pluginTimeout: js.UndefOr[Double] = js.undefined
  
  val requestIdHeader: js.UndefOr[String | `false`] = js.undefined
  
  val requestIdLogLabel: js.UndefOr[String] = js.undefined
}
object ReadonlyconnectionTimeout {
  
  inline def apply(): ReadonlyconnectionTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyconnectionTimeout]
  }
  
  extension [Self <: ReadonlyconnectionTimeout](x: Self) {
    
    inline def setAllowUnsafeRegex(value: Boolean): Self = StObject.set(x, "allowUnsafeRegex", value.asInstanceOf[js.Any])
    
    inline def setAllowUnsafeRegexUndefined: Self = StObject.set(x, "allowUnsafeRegex", js.undefined)
    
    inline def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
    
    inline def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    inline def setDisableRequestLogging(value: Boolean): Self = StObject.set(x, "disableRequestLogging", value.asInstanceOf[js.Any])
    
    inline def setDisableRequestLoggingUndefined: Self = StObject.set(x, "disableRequestLogging", js.undefined)
    
    inline def setForceCloseConnections(value: Boolean): Self = StObject.set(x, "forceCloseConnections", value.asInstanceOf[js.Any])
    
    inline def setForceCloseConnectionsUndefined: Self = StObject.set(x, "forceCloseConnections", js.undefined)
    
    inline def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2SessionTimeout(value: Double): Self = StObject.set(x, "http2SessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setHttp2SessionTimeoutUndefined: Self = StObject.set(x, "http2SessionTimeout", js.undefined)
    
    inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    inline def setHttps(value: Boolean | ReadonlyallowHTTP1boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setIgnoreDuplicateSlashes(value: Boolean): Self = StObject.set(x, "ignoreDuplicateSlashes", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDuplicateSlashesUndefined: Self = StObject.set(x, "ignoreDuplicateSlashes", js.undefined)
    
    inline def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
    
    inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
    
    inline def setMaxParamLength(value: Double): Self = StObject.set(x, "maxParamLength", value.asInstanceOf[js.Any])
    
    inline def setMaxParamLengthUndefined: Self = StObject.set(x, "maxParamLength", js.undefined)
    
    inline def setOnConstructorPoisoning(value: ConstructorAction): Self = StObject.set(x, "onConstructorPoisoning", value.asInstanceOf[js.Any])
    
    inline def setOnConstructorPoisoningUndefined: Self = StObject.set(x, "onConstructorPoisoning", js.undefined)
    
    inline def setOnProtoPoisoning(value: ProtoAction): Self = StObject.set(x, "onProtoPoisoning", value.asInstanceOf[js.Any])
    
    inline def setOnProtoPoisoningUndefined: Self = StObject.set(x, "onProtoPoisoning", js.undefined)
    
    inline def setPluginTimeout(value: Double): Self = StObject.set(x, "pluginTimeout", value.asInstanceOf[js.Any])
    
    inline def setPluginTimeoutUndefined: Self = StObject.set(x, "pluginTimeout", js.undefined)
    
    inline def setRequestIdHeader(value: String | `false`): Self = StObject.set(x, "requestIdHeader", value.asInstanceOf[js.Any])
    
    inline def setRequestIdHeaderUndefined: Self = StObject.set(x, "requestIdHeader", js.undefined)
    
    inline def setRequestIdLogLabel(value: String): Self = StObject.set(x, "requestIdLogLabel", value.asInstanceOf[js.Any])
    
    inline def setRequestIdLogLabelUndefined: Self = StObject.set(x, "requestIdLogLabel", js.undefined)
  }
}
