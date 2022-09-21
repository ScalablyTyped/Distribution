package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublicDelegatedPrefix extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicDelegatedPrefix. An up-to-date fingerprint must be provided in order to update the PublicDelegatedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicDelegatedPrefix.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource type. The server generates this identifier.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IPv4 address range, in CIDR format, represented by this public delegated prefix.
    */
  var ipCidrRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the prefix will be live migrated.
    */
  var isLiveMigration: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#publicDelegatedPrefix for public delegated prefixes.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
    */
  var parentPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of sub public delegated prefixes that exist for this public delegated prefix.
    */
  var publicDelegatedSubPrefixs: js.UndefOr[js.Array[SchemaPublicDelegatedPrefixPublicDelegatedSubPrefix]] = js.undefined
  
  /**
    * [Output Only] URL of the region where the public delegated prefix resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL with id for the resource.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The status of the public delegated prefix, which can be one of following values: - `INITIALIZING` The public delegated prefix is being initialized and addresses cannot be created yet. - `READY_TO_ANNOUNCE` The public delegated prefix is a live migration prefix and is active. - `ANNOUNCED` The public delegated prefix is active. - `DELETING` The public delegated prefix is being deprovsioned.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaPublicDelegatedPrefix {
  
  inline def apply(): SchemaPublicDelegatedPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicDelegatedPrefix]
  }
  
  extension [Self <: SchemaPublicDelegatedPrefix](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeNull: Self = StObject.set(x, "ipCidrRange", null)
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setIsLiveMigration(value: Boolean): Self = StObject.set(x, "isLiveMigration", value.asInstanceOf[js.Any])
    
    inline def setIsLiveMigrationNull: Self = StObject.set(x, "isLiveMigration", null)
    
    inline def setIsLiveMigrationUndefined: Self = StObject.set(x, "isLiveMigration", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentPrefix(value: String): Self = StObject.set(x, "parentPrefix", value.asInstanceOf[js.Any])
    
    inline def setParentPrefixNull: Self = StObject.set(x, "parentPrefix", null)
    
    inline def setParentPrefixUndefined: Self = StObject.set(x, "parentPrefix", js.undefined)
    
    inline def setPublicDelegatedSubPrefixs(value: js.Array[SchemaPublicDelegatedPrefixPublicDelegatedSubPrefix]): Self = StObject.set(x, "publicDelegatedSubPrefixs", value.asInstanceOf[js.Any])
    
    inline def setPublicDelegatedSubPrefixsUndefined: Self = StObject.set(x, "publicDelegatedSubPrefixs", js.undefined)
    
    inline def setPublicDelegatedSubPrefixsVarargs(value: SchemaPublicDelegatedPrefixPublicDelegatedSubPrefix*): Self = StObject.set(x, "publicDelegatedSubPrefixs", js.Array(value*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
