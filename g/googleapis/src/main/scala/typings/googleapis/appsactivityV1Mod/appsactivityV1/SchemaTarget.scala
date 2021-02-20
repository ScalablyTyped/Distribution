package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the object modified by the event.
  */
@js.native
trait SchemaTarget extends StObject {
  
  /**
    * The ID of the target. For example, in Google Drive, this is the file or
    * folder ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The MIME type of the target.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * The name of the target. For example, in Google Drive, this is the title
    * of the file.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaTarget {
  
  @scala.inline
  def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  
  @scala.inline
  implicit class SchemaTargetMutableBuilder[Self <: SchemaTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
