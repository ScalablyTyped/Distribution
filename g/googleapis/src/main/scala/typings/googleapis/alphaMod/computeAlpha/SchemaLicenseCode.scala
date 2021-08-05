package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLicenseCode extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Description of this License Code.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of resource. Always compute#licenseCode for licenses.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL and description aliases of Licenses with the same
    * License Code.
    */
  var licenseAlias: js.UndefOr[js.Array[SchemaLicenseCodeLicenseAlias]] = js.undefined
  
  /**
    * [Output Only] Name of the resource. The name is 1-20 characters long and
    * must be a valid 64 bit integer.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Current state of this License Code.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] If true, the license will remain attached when creating
    * images or snapshots from disks. Otherwise, the license is not
    * transferred.
    */
  var transferable: js.UndefOr[Boolean] = js.undefined
}
object SchemaLicenseCode {
  
  inline def apply(): SchemaLicenseCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseCode]
  }
  
  extension [Self <: SchemaLicenseCode](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLicenseAlias(value: js.Array[SchemaLicenseCodeLicenseAlias]): Self = StObject.set(x, "licenseAlias", value.asInstanceOf[js.Any])
    
    inline def setLicenseAliasUndefined: Self = StObject.set(x, "licenseAlias", js.undefined)
    
    inline def setLicenseAliasVarargs(value: SchemaLicenseCodeLicenseAlias*): Self = StObject.set(x, "licenseAlias", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTransferable(value: Boolean): Self = StObject.set(x, "transferable", value.asInstanceOf[js.Any])
    
    inline def setTransferableUndefined: Self = StObject.set(x, "transferable", js.undefined)
  }
}
