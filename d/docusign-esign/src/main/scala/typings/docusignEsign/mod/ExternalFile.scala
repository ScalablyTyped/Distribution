package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalFile extends StObject {
  
  /**
    * The UTC date and time that the file or folder was last modified.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The storage provider's id for the file or folder.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The file extension for a file.
    *
    * **Note**: If the item is a folder, this value is null.
    */
  var img: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of a file.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the file. The file size limit varies based on the cloud storage provider.
    */
  var size: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, DocuSign supports the file type for upload.
    */
  var supported: js.UndefOr[String] = js.undefined
  
  /**
    * The type of cloud storage item. Valid values are:
    *
    * - `file`
    * - `folder`
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the file or folder.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object ExternalFile {
  
  @scala.inline
  def apply(): ExternalFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalFile]
  }
  
  @scala.inline
  implicit class ExternalFileMutableBuilder[Self <: ExternalFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSupported(value: String): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
