package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNetworksListipowners
  extends StObject
     with StandardParameters {
  
  /**
    * A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `\>`, `<`, `<=`, `\>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:` operator can be used with string fields to match substrings. For non-string fields it is equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq "double quoted literal"` `(fieldname1 eq literal) (fieldname2 ne "literal")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name "instance", you would use `name ne .*instance`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) IP CIDR range filter, example: "10.128.10.0/30".
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the network to return.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy="creationTimestamp desc"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported.
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
    * Specifies a page token to use. Set `pageToken` to the `nextPageToken` returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Opt-in for partial success behavior which provides partial results in case of failure. The default value is false.
    */
  var returnPartialSuccess: js.UndefOr[Boolean] = js.undefined
  
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
  
  inline def apply(): ParamsResourceNetworksListipowners = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworksListipowners]
  }
  
  extension [Self <: ParamsResourceNetworksListipowners](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOwnerProjects(value: String): Self = StObject.set(x, "ownerProjects", value.asInstanceOf[js.Any])
    
    inline def setOwnerProjectsUndefined: Self = StObject.set(x, "ownerProjects", js.undefined)
    
    inline def setOwnerTypes(value: String): Self = StObject.set(x, "ownerTypes", value.asInstanceOf[js.Any])
    
    inline def setOwnerTypesUndefined: Self = StObject.set(x, "ownerTypes", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setReturnPartialSuccess(value: Boolean): Self = StObject.set(x, "returnPartialSuccess", value.asInstanceOf[js.Any])
    
    inline def setReturnPartialSuccessUndefined: Self = StObject.set(x, "returnPartialSuccess", js.undefined)
    
    inline def setSubnetName(value: String): Self = StObject.set(x, "subnetName", value.asInstanceOf[js.Any])
    
    inline def setSubnetNameUndefined: Self = StObject.set(x, "subnetName", js.undefined)
    
    inline def setSubnetRegion(value: String): Self = StObject.set(x, "subnetRegion", value.asInstanceOf[js.Any])
    
    inline def setSubnetRegionUndefined: Self = StObject.set(x, "subnetRegion", js.undefined)
  }
}
