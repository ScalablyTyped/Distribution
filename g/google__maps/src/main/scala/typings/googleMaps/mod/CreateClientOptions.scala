package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClientOptions extends StObject {
  
  /** Maps API for Work channel. */
  var channel: js.UndefOr[String] = js.undefined
  
  /** Maps API for Work client ID. */
  var clientId: js.UndefOr[String] = js.undefined
  
  /** Maps API for Work client secret (a.k.a. private key). */
  var clientSecret: js.UndefOr[String] = js.undefined
  
  /** API key (required, unless clientID and clientSecret provided). */
  var key: String
  
  /** Default language for all queries. */
  var language: js.UndefOr[Language] = js.undefined
  
  /** Rate options. */
  var rate: js.UndefOr[RateOptions] = js.undefined
  
  /** Retry options. */
  var retryOptions: js.UndefOr[RetryOptions] = js.undefined
  
  /** Timeout in milliseconds. (Default: 60 * 1000 ms). */
  var timeout: js.UndefOr[Double] = js.undefined
}
object CreateClientOptions {
  
  @scala.inline
  def apply(key: String): CreateClientOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOptions]
  }
  
  @scala.inline
  implicit class CreateClientOptionsMutableBuilder[Self <: CreateClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setRate(value: RateOptions): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOptionsUndefined: Self = StObject.set(x, "retryOptions", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
