package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A UrlMap resource. This resource defines the mapping from URL to the
  * BackendService resource, based on the &quot;longest-match&quot; of the
  * URL&#39;s host and path.
  */
@js.native
trait SchemaUrlMap extends js.Object {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * defaultRouteAction takes effect when none of the  hostRules match. The
    * load balancer performs advanced routing actions like URL rewrites, header
    * transformations, etc. prior to forwarding the request to the selected
    * backend. If defaultRouteAction specifies any weightedBackendServices,
    * defaultService must not be set. Conversely if defaultService is set,
    * defaultRouteAction cannot contain any  weightedBackendServices. Only one
    * of defaultRouteAction or defaultUrlRedirect must be set.
    */
  var defaultRouteAction: js.UndefOr[SchemaHttpRouteAction] = js.native
  
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
  var defaultService: js.UndefOr[String] = js.native
  
  /**
    * When none of the specified hostRules match, the request is redirected to
    * a URL specified by defaultUrlRedirect. If defaultUrlRedirect is
    * specified, defaultService or defaultRouteAction must not be set.
    */
  var defaultUrlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a UrlMap. An up-to-date fingerprint must be
    * provided in order to update the UrlMap, otherwise the request will fail
    * with error 412 conditionNotMet.  To see the latest fingerprint, make a
    * get() request to retrieve a UrlMap.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * Specifies changes to request and response headers that need to take
    * effect for the selected backendService. The headerAction specified here
    * take effect after headerAction specified under pathMatcher.
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.native
  
  /**
    * The list of HostRules to use against the URL.
    */
  var hostRules: js.UndefOr[js.Array[SchemaHostRule]] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The list of named PathMatchers to use against the URL.
    */
  var pathMatchers: js.UndefOr[js.Array[SchemaPathMatcher]] = js.native
  
  /**
    * [Output Only] URL of the region where the regional URL map resides. This
    * field is not applicable to global URL maps. You must specify this field
    * as part of the HTTP request URL. It is not settable as a field in the
    * request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The list of expected URL mapping tests. Request to update this UrlMap
    * will succeed only if all of the test cases pass. You can specify a
    * maximum of 100 tests per UrlMap.
    */
  var tests: js.UndefOr[js.Array[SchemaUrlMapTest]] = js.native
}
object SchemaUrlMap {
  
  @scala.inline
  def apply(): SchemaUrlMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMap]
  }
  
  @scala.inline
  implicit class SchemaUrlMapOps[Self <: SchemaUrlMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDefaultRouteAction(value: SchemaHttpRouteAction): Self = this.set("defaultRouteAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteAction: Self = this.set("defaultRouteAction", js.undefined)
    
    @scala.inline
    def setDefaultService(value: String): Self = this.set("defaultService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultService: Self = this.set("defaultService", js.undefined)
    
    @scala.inline
    def setDefaultUrlRedirect(value: SchemaHttpRedirectAction): Self = this.set("defaultUrlRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUrlRedirect: Self = this.set("defaultUrlRedirect", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setHeaderAction(value: SchemaHttpHeaderAction): Self = this.set("headerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderAction: Self = this.set("headerAction", js.undefined)
    
    @scala.inline
    def setHostRulesVarargs(value: SchemaHostRule*): Self = this.set("hostRules", js.Array(value :_*))
    
    @scala.inline
    def setHostRules(value: js.Array[SchemaHostRule]): Self = this.set("hostRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostRules: Self = this.set("hostRules", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPathMatchersVarargs(value: SchemaPathMatcher*): Self = this.set("pathMatchers", js.Array(value :_*))
    
    @scala.inline
    def setPathMatchers(value: js.Array[SchemaPathMatcher]): Self = this.set("pathMatchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathMatchers: Self = this.set("pathMatchers", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setTestsVarargs(value: SchemaUrlMapTest*): Self = this.set("tests", js.Array(value :_*))
    
    @scala.inline
    def setTests(value: js.Array[SchemaUrlMapTest]): Self = this.set("tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTests: Self = this.set("tests", js.undefined)
  }
}
