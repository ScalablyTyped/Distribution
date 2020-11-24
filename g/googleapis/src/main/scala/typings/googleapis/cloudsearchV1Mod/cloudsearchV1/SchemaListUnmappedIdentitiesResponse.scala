package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListUnmappedIdentitiesResponse extends js.Object {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var unmappedIdentities: js.UndefOr[js.Array[SchemaUnmappedIdentity]] = js.native
}
object SchemaListUnmappedIdentitiesResponse {
  
  @scala.inline
  def apply(): SchemaListUnmappedIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUnmappedIdentitiesResponse]
  }
  
  @scala.inline
  implicit class SchemaListUnmappedIdentitiesResponseOps[Self <: SchemaListUnmappedIdentitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUnmappedIdentitiesVarargs(value: SchemaUnmappedIdentity*): Self = this.set("unmappedIdentities", js.Array(value :_*))
    
    @scala.inline
    def setUnmappedIdentities(value: js.Array[SchemaUnmappedIdentity]): Self = this.set("unmappedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmappedIdentities: Self = this.set("unmappedIdentities", js.undefined)
  }
}
