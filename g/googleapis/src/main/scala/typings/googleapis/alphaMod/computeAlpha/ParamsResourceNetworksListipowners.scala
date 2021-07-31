package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNetworksListipowners
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * A filter expression that filters resources listed in the response. The
    * expression must specify the field name, a comparison operator, and the
    * value that you want to use for filtering. The value must be a string, a
    * number, or a boolean. The comparison operator must be either =, !=, >, or
    * <.  For example, if you are filtering Compute Engine instances, you can
    * exclude instances named example-instance by specifying name !=
    * example-instance.  You can also filter nested fields. For example, you
    * could specify scheduling.automaticRestart = false to include instances
    * only if they are not scheduled for automatic restarts. You can use
    * filtering on nested fields to filter based on resource labels.  To filter
    * on multiple expressions, provide each separate expression within
    * parentheses. For example, (scheduling.automaticRestart = true)
    * (cpuPlatform = "Intel Skylake"). By default, each expression is an AND
    * expression. However, you can include AND and OR expressions explicitly.
    * For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel
    * Broadwell") AND (scheduling.automaticRestart = true).
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) IP CIDR range filter, example: "10.128.10.0/30".
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results per page that should be returned. If the
    * number of available results is larger than maxResults, Compute Engine
    * returns a nextPageToken that can be used to get the next page of results
    * in subsequent list requests. Acceptable values are 0 to 500, inclusive.
    * (Default: 500)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the network to return.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Sorts list results by a certain order. By default, results are returned
    * in alphanumerical order based on the resource name.  You can also sort
    * results in descending order based on the creation timestamp using
    * orderBy="creationTimestamp desc". This sorts results based on the
    * creationTimestamp field in reverse chronological order (newest result
    * first). Use this to sort resources like operations so that the newest
    * operation is returned first.  Currently, only sorting by name or
    * creationTimestamp desc is supported.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Project IDs filter, example: "project-1,project-2".
    */
  var ownerProjects: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Owner types filter, example: "instance,forwardingRule".
    */
  var ownerTypes: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a page token to use. Set pageToken to the nextPageToken
    * returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Subnetwork name filter.
    */
  var subnetName: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Subnetwork region filter.
    */
  var subnetRegion: js.UndefOr[String] = js.undefined
}
object ParamsResourceNetworksListipowners {
  
  @scala.inline
  def apply(): ParamsResourceNetworksListipowners = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworksListipowners]
  }
  
  @scala.inline
  implicit class ParamsResourceNetworksListipownersMutableBuilder[Self <: ParamsResourceNetworksListipowners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setOwnerProjects(value: String): Self = StObject.set(x, "ownerProjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerProjectsUndefined: Self = StObject.set(x, "ownerProjects", js.undefined)
    
    @scala.inline
    def setOwnerTypes(value: String): Self = StObject.set(x, "ownerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerTypesUndefined: Self = StObject.set(x, "ownerTypes", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setSubnetName(value: String): Self = StObject.set(x, "subnetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetNameUndefined: Self = StObject.set(x, "subnetName", js.undefined)
    
    @scala.inline
    def setSubnetRegion(value: String): Self = StObject.set(x, "subnetRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetRegionUndefined: Self = StObject.set(x, "subnetRegion", js.undefined)
  }
}
