package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A UrlMap resource. This resource defines the mapping from URL to the
  * BackendService resource, based on the &quot;longest-match&quot; of the
  * URL&#39;s host and path.
  */
trait SchemaUrlMap extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * The full or partial URL of the defaultService resource to which traffic
    * is directed if none of the hostRules match. If defaultRouteAction is
    * additionally specified, advanced routing actions like URL Rewrites, etc.
    * take effect prior to sending the request to the backend. However, if
    * defaultService is specified, defaultRouteAction cannot contain any
    * weightedBackendServices. Conversely, if routeAction specifies any
    * weightedBackendServices, service must not be specified. Only one of
    * defaultService, defaultUrlRedirect  or
    * defaultRouteAction.weightedBackendService must be set.
    */
  var defaultService: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a UrlMap. An up-to-date fingerprint must be
    * provided in order to update the UrlMap, otherwise the request will fail
    * with error 412 conditionNotMet.  To see the latest fingerprint, make a
    * get() request to retrieve a UrlMap.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The list of HostRules to use against the URL.
    */
  var hostRules: js.UndefOr[js.Array[SchemaHostRule]] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The list of named PathMatchers to use against the URL.
    */
  var pathMatchers: js.UndefOr[js.Array[SchemaPathMatcher]] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The list of expected URL mapping tests. Request to update this UrlMap
    * will succeed only if all of the test cases pass. You can specify a
    * maximum of 100 tests per UrlMap.
    */
  var tests: js.UndefOr[js.Array[SchemaUrlMapTest]] = js.undefined
}
object SchemaUrlMap {
  
  inline def apply(): SchemaUrlMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMap]
  }
  
  extension [Self <: SchemaUrlMap](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDefaultService(value: String): Self = StObject.set(x, "defaultService", value.asInstanceOf[js.Any])
    
    inline def setDefaultServiceUndefined: Self = StObject.set(x, "defaultService", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setHostRules(value: js.Array[SchemaHostRule]): Self = StObject.set(x, "hostRules", value.asInstanceOf[js.Any])
    
    inline def setHostRulesUndefined: Self = StObject.set(x, "hostRules", js.undefined)
    
    inline def setHostRulesVarargs(value: SchemaHostRule*): Self = StObject.set(x, "hostRules", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPathMatchers(value: js.Array[SchemaPathMatcher]): Self = StObject.set(x, "pathMatchers", value.asInstanceOf[js.Any])
    
    inline def setPathMatchersUndefined: Self = StObject.set(x, "pathMatchers", js.undefined)
    
    inline def setPathMatchersVarargs(value: SchemaPathMatcher*): Self = StObject.set(x, "pathMatchers", js.Array(value :_*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTests(value: js.Array[SchemaUrlMapTest]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
    
    inline def setTestsVarargs(value: SchemaUrlMapTest*): Self = StObject.set(x, "tests", js.Array(value :_*))
  }
}
