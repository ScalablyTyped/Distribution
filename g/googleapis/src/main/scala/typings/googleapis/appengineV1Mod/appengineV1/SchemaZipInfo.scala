package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaZipInfo extends StObject {
  
  /**
    * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
    */
  var filesCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'.
    */
  var sourceUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaZipInfo {
  
  inline def apply(): SchemaZipInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZipInfo]
  }
  
  extension [Self <: SchemaZipInfo](x: Self) {
    
    inline def setFilesCount(value: Double): Self = StObject.set(x, "filesCount", value.asInstanceOf[js.Any])
    
    inline def setFilesCountNull: Self = StObject.set(x, "filesCount", null)
    
    inline def setFilesCountUndefined: Self = StObject.set(x, "filesCount", js.undefined)
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlNull: Self = StObject.set(x, "sourceUrl", null)
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
  }
}
