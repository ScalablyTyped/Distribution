package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Storage location.
  */
trait SchemaGcsDestination extends StObject {
  
  /**
    * The uri of the Cloud Storage object. It&#39;s the same uri that is used
    * by gsutil. For example: &quot;gs://bucket_name/object_name&quot;. See
    * [Viewing and Editing Object
    * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
    * for more information.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaGcsDestination {
  
  @scala.inline
  def apply(): SchemaGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsDestination]
  }
  
  @scala.inline
  implicit class SchemaGcsDestinationMutableBuilder[Self <: SchemaGcsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
