package typings.googleDdns

import typings.googleDdns.googleDdnsBooleans.`false`
import typings.googleDdns.googleDdnsBooleans.`true`
import typings.googleDdns.googleDdnsStrings.`911`
import typings.googleDdns.googleDdnsStrings.abuse
import typings.googleDdns.googleDdnsStrings.badagent
import typings.googleDdns.googleDdnsStrings.badauth
import typings.googleDdns.googleDdnsStrings.error
import typings.googleDdns.googleDdnsStrings.good
import typings.googleDdns.googleDdnsStrings.nochg
import typings.googleDdns.googleDdnsStrings.nohost
import typings.googleDdns.googleDdnsStrings.notfqdn
import typings.googleDdns.googleDdnsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-ddns", "DynamicDNS")
  @js.native
  class DynamicDNS protected () extends StObject {
    def this(options: DynamicDNSOptions) = this()
    
    /**
      * Gets the current IP address in the DNS record.
      * @returns a Promise resolving with the IP or rejecting with an error object `{error: message}`
      */
    def getCurrentIP(): js.Promise[String] = js.native
    
    /**
      * Gets the public IP address of the network hosting this application.
      * @returns a Promise resolving with the IP or rejecting with an error object `{error: message}`
      */
    def getPublicIP(): js.Promise[String] = js.native
    
    /**
      * Synchronizes the DNS IP address with the current public IP address.
      * Compares the current public IP address against the DNS record for
      * the domain, and updates the record if they differ.
      * @param force Send an update request without checking whether
      * the current DNS and public IPs differ.
      * @returns `Promise<true>` if the public IP address and the IP address
      * in the DNS record are the same and no sync was attempted. Otherwise
      * returns a Promise of an object with response data. Error responses
      * are rejected.
      */
    def sync(): js.Promise[`true` | SuccessResponse] = js.native
    def sync(force: Boolean): js.Promise[`true` | SuccessResponse] = js.native
  }
  
  @JSImport("google-ddns", "Service")
  @js.native
  class Service protected () extends StObject {
    def this(options: ServiceOptions) = this()
    
    /**
      * Start the service time interval.
      */
    def start(): Unit = js.native
  }
  
  @js.native
  trait DynamicDNSOptions extends StObject {
    
    /**
      * If debug mode is enabled, debug and status information will be
      * written to the console.
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to fail or continue synchronizing if the current hostname
      * was not resolved. This typically happens if the domain was created
      * and has not yet been applied or propagated. See TTL (Time-to-Live)
      * for more information. Even if this fails, the update can still be
      * successful.
      */
    var failOnUnresolvedHostName: js.UndefOr[Boolean] = js.native
    
    /**
      * If `useHostIPAddressCache` is `true`, this option is used to force a
      * DNS request every once in a while. This is the number of seconds
      * until the cache expires.
      */
    var hostIPAddressCacheExpires: js.UndefOr[Double] = js.native
    
    /**
      * The dynamic DNS hostname.
      */
    var hostname: String = js.native
    
    /**
      * The maximum number of times to attempt synchronization despite the
      * hostname not being resolved. Applies if `failOnUnresolvedHostName`
      * is `false`.
      */
    var maxUnresolvedHostNameFail: js.UndefOr[Double] = js.native
    
    /**
      * The dynamic DNS password.
      */
    var password: String = js.native
    
    /**
      * The URL used to check the current public IP of the device.
      */
    var publicIpUrl: js.UndefOr[String] = js.native
    
    /**
      * The URL of the Google Dynamic DNS API. Must include the text `%HOSTNAME%` and `%IPADDRESS%` as placeholders for the hostname and IP
      * address.
      */
    var updateIpUrl: js.UndefOr[String] = js.native
    
    /**
      * Whether to cache the IP address of the DNS record or make a DNS
      * request every time. This can usually be left enabled since this
      * client is the only one responsible for updating the DNS record.
      */
    var useHostIPAddressCache: js.UndefOr[Boolean] = js.native
    
    /**
      * The HTTP header User-Agent to send when updating the IP address.
      * This is required by the Google Dynamic DNS API.
      */
    var userAgent: js.UndefOr[String] = js.native
    
    /**
      * The dynamic DNS username.
      */
    var username: String = js.native
  }
  object DynamicDNSOptions {
    
    @scala.inline
    def apply(hostname: String, password: String, username: String): DynamicDNSOptions = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicDNSOptions]
    }
    
    @scala.inline
    implicit class DynamicDNSOptionsMutableBuilder[Self <: DynamicDNSOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFailOnUnresolvedHostName(value: Boolean): Self = StObject.set(x, "failOnUnresolvedHostName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnUnresolvedHostNameUndefined: Self = StObject.set(x, "failOnUnresolvedHostName", js.undefined)
      
      @scala.inline
      def setHostIPAddressCacheExpires(value: Double): Self = StObject.set(x, "hostIPAddressCacheExpires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostIPAddressCacheExpiresUndefined: Self = StObject.set(x, "hostIPAddressCacheExpires", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUnresolvedHostNameFail(value: Double): Self = StObject.set(x, "maxUnresolvedHostNameFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUnresolvedHostNameFailUndefined: Self = StObject.set(x, "maxUnresolvedHostNameFail", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpUrl(value: String): Self = StObject.set(x, "publicIpUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpUrlUndefined: Self = StObject.set(x, "publicIpUrl", js.undefined)
      
      @scala.inline
      def setUpdateIpUrl(value: String): Self = StObject.set(x, "updateIpUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateIpUrlUndefined: Self = StObject.set(x, "updateIpUrl", js.undefined)
      
      @scala.inline
      def setUseHostIPAddressCache(value: Boolean): Self = StObject.set(x, "useHostIPAddressCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHostIPAddressCacheUndefined: Self = StObject.set(x, "useHostIPAddressCache", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorResponse extends StObject {
    
    // This definition is here to make it possible to access the `ip`
    // property in the union `SuccessResponse | ErrorResponse`
    // See https://github.com/Microsoft/TypeScript/issues/12815
    var ip: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * A human-readable response message
      */
    var message: String = js.native
    
    /**
      * The response code (may include `good` or `nochg` in edge cases)
      */
    var response: nohost | badauth | notfqdn | badagent | abuse | `911` | good | nochg = js.native
    
    /**
      * The response status
      */
    var status: error = js.native
  }
  object ErrorResponse {
    
    @scala.inline
    def apply(
      message: String,
      response: nohost | badauth | notfqdn | badagent | abuse | `911` | good | nochg,
      status: error
    ): ErrorResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponse]
    }
    
    @scala.inline
    implicit class ErrorResponseMutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: nohost | badauth | notfqdn | badagent | abuse | `911` | good | nochg): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceOptions extends DynamicDNSOptions {
    
    /**
      * The number of seconds between updates.
      */
    var checkInterval: js.UndefOr[Double] = js.native
    
    /**
      * Whether to stop the service if the maximum number of consecutive
      * errors is reached.
      */
    var exitOnMaxErrors: js.UndefOr[Boolean] = js.native
    
    /**
      * The path of the log file to output to. Set to `false` to disable
      * logging to file.
      */
    var logPath: js.UndefOr[String | `false`] = js.native
    
    /**
      * Whether to log output to the console.
      */
    var logToConsole: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum number of consecutive errors before stopping the service
      * if `exitOnMaxErrors` is `true`.
      */
    var maxConsecutiveErrors: js.UndefOr[Double] = js.native
  }
  object ServiceOptions {
    
    @scala.inline
    def apply(hostname: String, password: String, username: String): ServiceOptions = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceOptions]
    }
    
    @scala.inline
    implicit class ServiceOptionsMutableBuilder[Self <: ServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
      
      @scala.inline
      def setExitOnMaxErrors(value: Boolean): Self = StObject.set(x, "exitOnMaxErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnMaxErrorsUndefined: Self = StObject.set(x, "exitOnMaxErrors", js.undefined)
      
      @scala.inline
      def setLogPath(value: String | `false`): Self = StObject.set(x, "logPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogPathUndefined: Self = StObject.set(x, "logPath", js.undefined)
      
      @scala.inline
      def setLogToConsole(value: Boolean): Self = StObject.set(x, "logToConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogToConsoleUndefined: Self = StObject.set(x, "logToConsole", js.undefined)
      
      @scala.inline
      def setMaxConsecutiveErrors(value: Double): Self = StObject.set(x, "maxConsecutiveErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConsecutiveErrorsUndefined: Self = StObject.set(x, "maxConsecutiveErrors", js.undefined)
    }
  }
  
  @js.native
  trait SuccessResponse extends StObject {
    
    /**
      * The IP address in the DNS record.
      */
    var ip: String = js.native
    
    /**
      * A human-readable response message
      */
    var message: String = js.native
    
    /**
      * The response code
      */
    var response: good | nochg = js.native
    
    /**
      * The response status
      */
    var status: success = js.native
  }
  object SuccessResponse {
    
    @scala.inline
    def apply(ip: String, message: String, response: good | nochg, status: success): SuccessResponse = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessResponse]
    }
    
    @scala.inline
    implicit class SuccessResponseMutableBuilder[Self <: SuccessResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: good | nochg): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
