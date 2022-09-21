package typings.engineIoClient

import org.scalablytyped.runtime.StringDictionary
import typings.node.timersMod.global.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<engine.io-client.engine.io-client/build/esm/socket.SocketOptions> */
  trait PartialSocketOptions extends StObject {
    
    var agent: js.UndefOr[String | Boolean] = js.undefined
    
    var autoUnref: js.UndefOr[Boolean] = js.undefined
    
    var ca: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var closeOnBeforeunload: js.UndefOr[Boolean] = js.undefined
    
    var extraHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var forceBase64: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var perMessageDeflate: js.UndefOr[Threshold] = js.undefined
    
    var pfx: js.UndefOr[String] = js.undefined
    
    var policyPost: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var protocols: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var query: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var rememberUpgrade: js.UndefOr[Boolean] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var timestampParam: js.UndefOr[String] = js.undefined
    
    var timestampRequests: js.UndefOr[Boolean] = js.undefined
    
    var transportOptions: js.UndefOr[js.Object] = js.undefined
    
    var transports: js.UndefOr[js.Array[String]] = js.undefined
    
    var upgrade: js.UndefOr[Boolean] = js.undefined
    
    var useNativeTimers: js.UndefOr[Boolean] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSocketOptions {
    
    inline def apply(): PartialSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSocketOptions]
    }
    
    extension [Self <: PartialSocketOptions](x: Self) {
      
      inline def setAgent(value: String | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAutoUnref(value: Boolean): Self = StObject.set(x, "autoUnref", value.asInstanceOf[js.Any])
      
      inline def setAutoUnrefUndefined: Self = StObject.set(x, "autoUnref", js.undefined)
      
      inline def setCa(value: String | js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setCloseOnBeforeunload(value: Boolean): Self = StObject.set(x, "closeOnBeforeunload", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBeforeunloadUndefined: Self = StObject.set(x, "closeOnBeforeunload", js.undefined)
      
      inline def setExtraHeaders(value: StringDictionary[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setForceBase64(value: Boolean): Self = StObject.set(x, "forceBase64", value.asInstanceOf[js.Any])
      
      inline def setForceBase64Undefined: Self = StObject.set(x, "forceBase64", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnlyBinaryUpgrades(value: Boolean): Self = StObject.set(x, "onlyBinaryUpgrades", value.asInstanceOf[js.Any])
      
      inline def setOnlyBinaryUpgradesUndefined: Self = StObject.set(x, "onlyBinaryUpgrades", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPerMessageDeflate(value: Threshold): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPolicyPost(value: Double): Self = StObject.set(x, "policyPost", value.asInstanceOf[js.Any])
      
      inline def setPolicyPostUndefined: Self = StObject.set(x, "policyPost", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocols(value: String | js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRememberUpgrade(value: Boolean): Self = StObject.set(x, "rememberUpgrade", value.asInstanceOf[js.Any])
      
      inline def setRememberUpgradeUndefined: Self = StObject.set(x, "rememberUpgrade", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setTimestampParam(value: String): Self = StObject.set(x, "timestampParam", value.asInstanceOf[js.Any])
      
      inline def setTimestampParamUndefined: Self = StObject.set(x, "timestampParam", js.undefined)
      
      inline def setTimestampRequests(value: Boolean): Self = StObject.set(x, "timestampRequests", value.asInstanceOf[js.Any])
      
      inline def setTimestampRequestsUndefined: Self = StObject.set(x, "timestampRequests", js.undefined)
      
      inline def setTransportOptions(value: js.Object): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
      
      inline def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
      
      inline def setTransports(value: js.Array[String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      inline def setTransportsVarargs(value: String*): Self = StObject.set(x, "transports", js.Array(value*))
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      inline def setUseNativeTimers(value: Boolean): Self = StObject.set(x, "useNativeTimers", value.asInstanceOf[js.Any])
      
      inline def setUseNativeTimersUndefined: Self = StObject.set(x, "useNativeTimers", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait Threshold extends StObject {
    
    var threshold: Double
  }
  object Threshold {
    
    inline def apply(threshold: Double): Threshold = {
      val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Threshold]
    }
    
    extension [Self <: Threshold](x: Self) {
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofsetTimeout extends StObject {
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    def apply(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.native
    def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
  }
}
