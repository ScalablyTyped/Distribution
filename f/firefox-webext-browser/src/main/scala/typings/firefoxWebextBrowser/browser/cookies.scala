package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.cookies` API to query and modify cookies, and to be notified when they change.
  *
  * Permissions: `cookies`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object cookies {
  
  /** Represents information about an HTTP cookie. */
  trait Cookie extends StObject {
    
    /** The domain of the cookie (e.g. "www.google.com", "example.com"). */
    var domain: String
    
    /**
      * The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.
      */
    var expirationDate: js.UndefOr[Double] = js.undefined
    
    /** The first-party domain of the cookie. */
    var firstPartyDomain: String
    
    /**
      * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie).
      */
    var hostOnly: Boolean
    
    /** True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts). */
    var httpOnly: Boolean
    
    /** The name of the cookie. */
    var name: String
    
    /** The cookie's storage partition, if any. null if not partitioned. */
    var partitionKey: js.UndefOr[PartitionKey] = js.undefined
    
    /** The path of the cookie. */
    var path: String
    
    /** The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests). */
    var sameSite: SameSiteStatus
    
    /**
      * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS).
      */
    var secure: Boolean
    
    /** True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date. */
    var session: Boolean
    
    /** The ID of the cookie store containing this cookie, as provided in getAllCookieStores(). */
    var storeId: String
    
    /** The value of the cookie. */
    var value: String
  }
  object Cookie {
    
    inline def apply(
      domain: String,
      firstPartyDomain: String,
      hostOnly: Boolean,
      httpOnly: Boolean,
      name: String,
      path: String,
      sameSite: SameSiteStatus,
      secure: Boolean,
      session: Boolean,
      storeId: String,
      value: String
    ): Cookie = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
      
      inline def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a cookie store in the browser. An incognito mode window, for instance, uses a separate cookie store from a non-incognito window.
    */
  trait CookieStore extends StObject {
    
    /** The unique identifier for the cookie store. */
    var id: String
    
    /** Indicates if this is an incognito cookie store */
    var incognito: Boolean
    
    /** Identifiers of all the browser tabs that share this cookie store. */
    var tabIds: js.Array[Double]
  }
  object CookieStore {
    
    inline def apply(id: String, incognito: Boolean, tabIds: js.Array[Double]): CookieStore = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], tabIds = tabIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieStore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieStore] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
      
      inline def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value*))
    }
  }
  
  /** Information to filter the cookies being retrieved. */
  trait GetAllDetails extends StObject {
    
    /** Restricts the retrieved cookies to those whose domains match or are subdomains of this one. */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts the retrieved cookies to those whose first-party domains match this one. This attribute is required if First-Party Isolation is enabled. To not filter by a specific first-party domain, use `null` or `undefined`.
      */
    var firstPartyDomain: js.UndefOr[String] = js.undefined
    
    /** Filters the cookies by name. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Selects a specific storage partition to look up cookies. Defaults to null, in which case only non-partitioned cookies are retrieved. If an object iis passed, partitioned cookies are also included, and filtered based on the keys present in the given PartitionKey description. An empty object ({}) returns all cookies (partitioned + unpartitioned), a non-empty object (e.g. {topLevelSite: '...'}) only returns cookies whose partition match all given attributes.
      */
    var partitionKey: js.UndefOr[PartitionKey] = js.undefined
    
    /** Restricts the retrieved cookies to those whose path exactly matches this string. */
    var path: js.UndefOr[String] = js.undefined
    
    /** Filters the cookies by their Secure property. */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** Filters out session vs. persistent cookies. */
    var session: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.
      */
    var storeId: js.UndefOr[String] = js.undefined
    
    /** Restricts the retrieved cookies to those that would match the given URL. */
    var url: js.UndefOr[String] = js.undefined
  }
  object GetAllDetails {
    
    inline def apply(): GetAllDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAllDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAllDetails] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
      
      inline def setFirstPartyDomainUndefined: Self = StObject.set(x, "firstPartyDomain", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /** Details to identify the cookie being retrieved. */
  trait GetDetails extends StObject {
    
    /**
      * The first-party domain which the cookie to retrieve is associated. This attribute is required if First-Party Isolation is enabled.
      */
    var firstPartyDomain: js.UndefOr[String] = js.undefined
    
    /** The name of the cookie to retrieve. */
    var name: String
    
    /**
      * The storage partition, if the cookie is part of partitioned storage. By default, only non-partitioned cookies are returned.
      */
    var partitionKey: js.UndefOr[PartitionKey] = js.undefined
    
    /**
      * The ID of the cookie store in which to look for the cookie. By default, the current execution context's cookie store will be used.
      */
    var storeId: js.UndefOr[String] = js.undefined
    
    /**
      * The URL with which the cookie to retrieve is associated. This argument may be a full URL, in which case any data following the URL path (e.g. the query string) is simply ignored. If host permissions for this URL are not specified in the manifest file, the API call will fail.
      */
    var url: String
  }
  object GetDetails {
    
    inline def apply(name: String, url: String): GetDetails = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetDetails] (val x: Self) extends AnyVal {
      
      inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
      
      inline def setFirstPartyDomainUndefined: Self = StObject.set(x, "firstPartyDomain", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The underlying reason behind the cookie's change. If a cookie was inserted, or removed via an explicit call to `cookies.remove`, "cause" will be "explicit". If a cookie was automatically removed due to expiry, "cause" will be "expired". If a cookie was removed due to being overwritten with an already-expired expiration date, "cause" will be set to "expired_overwrite". If a cookie was automatically removed due to garbage collection, "cause" will be "evicted". If a cookie was automatically removed due to a "set" call that overwrote it, "cause" will be "overwrite". Plan your response accordingly.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite
  */
  trait OnChangedCause extends StObject
  object OnChangedCause {
    
    inline def evicted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted = "evicted".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted]
    
    inline def expired: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired = "expired".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired]
    
    inline def expired_overwrite: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite = "expired_overwrite".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite]
    
    inline def explicit: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit = "explicit".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit]
    
    inline def overwrite: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite = "overwrite".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite]
  }
  
  trait OnChangedChangeInfo extends StObject {
    
    /** The underlying reason behind the cookie's change. */
    var cause: OnChangedCause
    
    /** Information about the cookie that was set or removed. */
    var cookie: Cookie
    
    /** True if a cookie was removed. */
    var removed: Boolean
  }
  object OnChangedChangeInfo {
    
    inline def apply(cause: OnChangedCause, cookie: Cookie, removed: Boolean): OnChangedChangeInfo = {
      val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangedChangeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnChangedChangeInfo] (val x: Self) extends AnyVal {
      
      inline def setCause(value: OnChangedCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The description of the storage partition of a cookie. This object may be omitted (null) if a cookie is not partitioned.
    */
  trait PartitionKey extends StObject {
    
    /** The first-party URL of the cookie, if the cookie is in storage partitioned by the top-level site. */
    var topLevelSite: js.UndefOr[String] = js.undefined
  }
  object PartitionKey {
    
    inline def apply(): PartitionKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartitionKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartitionKey] (val x: Self) extends AnyVal {
      
      inline def setTopLevelSite(value: String): Self = StObject.set(x, "topLevelSite", value.asInstanceOf[js.Any])
      
      inline def setTopLevelSiteUndefined: Self = StObject.set(x, "topLevelSite", js.undefined)
    }
  }
  
  /** Information to identify the cookie to remove. */
  trait RemoveDetails extends StObject {
    
    /**
      * The first-party domain associated with the cookie. This attribute is required if First-Party Isolation is enabled.
      */
    var firstPartyDomain: js.UndefOr[String] = js.undefined
    
    /** The name of the cookie to remove. */
    var name: String
    
    /**
      * The storage partition, if the cookie is part of partitioned storage. By default, non-partitioned storage is used.
      */
    var partitionKey: js.UndefOr[PartitionKey] = js.undefined
    
    /**
      * The ID of the cookie store to look in for the cookie. If unspecified, the cookie is looked for by default in the current execution context's cookie store.
      */
    var storeId: js.UndefOr[String] = js.undefined
    
    /**
      * The URL associated with the cookie. If host permissions for this URL are not specified in the manifest file, the API call will fail.
      */
    var url: String
  }
  object RemoveDetails {
    
    inline def apply(name: String, url: String): RemoveDetails = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveDetails] (val x: Self) extends AnyVal {
      
      inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
      
      inline def setFirstPartyDomainUndefined: Self = StObject.set(x, "firstPartyDomain", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Contains details about the cookie that's been removed. If removal failed for any reason, this will be "null", and `runtime.lastError` will be set.
    */
  trait RemoveReturnDetails extends StObject {
    
    /** The first-party domain associated with the cookie that's been removed. */
    var firstPartyDomain: String
    
    /** The name of the cookie that's been removed. */
    var name: String
    
    /** The storage partition, if the cookie is part of partitioned storage. null if not partitioned. */
    var partitionKey: js.UndefOr[PartitionKey] = js.undefined
    
    /** The ID of the cookie store from which the cookie was removed. */
    var storeId: String
    
    /** The URL associated with the cookie that's been removed. */
    var url: String
  }
  object RemoveReturnDetails {
    
    inline def apply(firstPartyDomain: String, name: String, storeId: String, url: String): RemoveReturnDetails = {
      val __obj = js.Dynamic.literal(firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveReturnDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveReturnDetails] (val x: Self) extends AnyVal {
      
      inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* cookies types */
  /**
    * A cookie's 'SameSite' state (https://tools.ietf.org/html/draft-west-first-party-cookies). 'no_restriction' corresponds to a cookie set without a 'SameSite' attribute, 'lax' to 'SameSite=Lax', and 'strict' to 'SameSite=Strict'.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict
  */
  trait SameSiteStatus extends StObject
  object SameSiteStatus {
    
    inline def lax: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax = "lax".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax]
    
    inline def no_restriction: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction = "no_restriction".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction]
    
    inline def strict: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict = "strict".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict]
  }
  
  /** Details about the cookie being set. */
  trait SetDetails extends StObject {
    
    /** The domain of the cookie. If omitted, the cookie becomes a host-only cookie. */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie becomes a session cookie.
      */
    var expirationDate: js.UndefOr[Double] = js.undefined
    
    /**
      * The first-party domain of the cookie. This attribute is required if First-Party Isolation is enabled.
      */
    var firstPartyDomain: js.UndefOr[String] = js.undefined
    
    /** Whether the cookie should be marked as HttpOnly. Defaults to false. */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /** The name of the cookie. Empty by default if omitted. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The storage partition, if the cookie is part of partitioned storage. By default, non-partitioned storage is used.
      */
    var partitionKey: js.UndefOr[PartitionKey] = js.undefined
    
    /** The path of the cookie. Defaults to the path portion of the url parameter. */
    var path: js.UndefOr[String] = js.undefined
    
    /** The cookie's same-site status. */
    var sameSite: js.UndefOr[SameSiteStatus] = js.undefined
    
    /** Whether the cookie should be marked as Secure. Defaults to false. */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's cookie store.
      */
    var storeId: js.UndefOr[String] = js.undefined
    
    /**
      * The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of the created cookie. If host permissions for this URL are not specified in the manifest file, the API call will fail.
      */
    var url: String
    
    /** The value of the cookie. Empty by default if omitted. */
    var value: js.UndefOr[String] = js.undefined
  }
  object SetDetails {
    
    inline def apply(url: String): SetDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetDetails] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
      
      inline def setFirstPartyDomainUndefined: Self = StObject.set(x, "firstPartyDomain", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
