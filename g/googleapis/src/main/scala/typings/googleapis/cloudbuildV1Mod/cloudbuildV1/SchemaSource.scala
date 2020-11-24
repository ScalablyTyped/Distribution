package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of the source in a supported storage service.
  */
@js.native
trait SchemaSource extends js.Object {
  
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
  implicit class SchemaSourceOps[Self <: SchemaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRepoSource(value: SchemaRepoSource): Self = this.set("repoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoSource: Self = this.set("repoSource", js.undefined)
    
    @scala.inline
    def setStorageSource(value: SchemaStorageSource): Self = this.set("storageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageSource: Self = this.set("storageSource", js.undefined)
  }
}
