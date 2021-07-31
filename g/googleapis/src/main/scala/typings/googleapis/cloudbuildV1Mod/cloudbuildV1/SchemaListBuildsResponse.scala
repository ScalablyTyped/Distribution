package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response including listed builds.
  */
trait SchemaListBuildsResponse extends StObject {
  
  /**
    * Builds will be sorted by `create_time`, descending.
    */
  var builds: js.UndefOr[js.Array[SchemaBuild]] = js.undefined
  
  /**
    * Token to receive the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListBuildsResponse {
  
  @scala.inline
  def apply(): SchemaListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBuildsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBuildsResponseMutableBuilder[Self <: SchemaListBuildsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuilds(value: js.Array[SchemaBuild]): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsUndefined: Self = StObject.set(x, "builds", js.undefined)
    
    @scala.inline
    def setBuildsVarargs(value: SchemaBuild*): Self = StObject.set(x, "builds", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
