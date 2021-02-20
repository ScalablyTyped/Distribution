package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The zip file information for a zip deployment.
  */
@js.native
trait SchemaZipInfo extends StObject {
  
  /**
    * An estimate of the number of files in a zip for a zip deployment. If set,
    * must be greater than or equal to the actual number of files. Used for
    * optimizing performance; if not provided, deployment may be slow.
    */
  var filesCount: js.UndefOr[Double] = js.native
  
  /**
    * URL of the zip file to deploy from. Must be a URL to a resource in Google
    * Cloud Storage in the form
    * &#39;http(s)://storage.googleapis.com/&lt;bucket&gt;/&lt;object&gt;&#39;.
    */
  var sourceUrl: js.UndefOr[String] = js.native
}
object SchemaZipInfo {
  
  @scala.inline
  def apply(): SchemaZipInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZipInfo]
  }
  
  @scala.inline
  implicit class SchemaZipInfoMutableBuilder[Self <: SchemaZipInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilesCount(value: Double): Self = StObject.set(x, "filesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesCountUndefined: Self = StObject.set(x, "filesCount", js.undefined)
    
    @scala.inline
    def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
  }
}
