package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of the source in a supported storage service.
  */
@js.native
trait SchemaSource extends StObject {
  
  /**
    * If provided, get the source from this location in a Cloud Source
    * Repository.
    */
  var repoSource: js.UndefOr[SchemaRepoSource] = js.native
  
  /**
    * If provided, get the source from this location in Google Cloud Storage.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.native
}
object SchemaSource {
  
  @scala.inline
  def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  @scala.inline
  implicit class SchemaSourceMutableBuilder[Self <: SchemaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepoSource(value: SchemaRepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    @scala.inline
    def setStorageSource(value: SchemaStorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
