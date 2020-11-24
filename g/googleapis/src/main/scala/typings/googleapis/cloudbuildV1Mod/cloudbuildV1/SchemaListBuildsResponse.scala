package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response including listed builds.
  */
@js.native
trait SchemaListBuildsResponse extends js.Object {
  
  /**
    * Builds will be sorted by `create_time`, descending.
    */
  var builds: js.UndefOr[js.Array[SchemaBuild]] = js.native
  
  /**
    * Token to receive the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListBuildsResponse {
  
  @scala.inline
  def apply(): SchemaListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBuildsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBuildsResponseOps[Self <: SchemaListBuildsResponse] (val x: Self) extends AnyVal {
    
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
    def setBuildsVarargs(value: SchemaBuild*): Self = this.set("builds", js.Array(value :_*))
    
    @scala.inline
    def setBuilds(value: js.Array[SchemaBuild]): Self = this.set("builds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilds: Self = this.set("builds", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
