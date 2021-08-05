package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing course aliases.
  */
trait SchemaListCourseAliasesResponse extends StObject {
  
  /**
    * The course aliases.
    */
  var aliases: js.UndefOr[js.Array[SchemaCourseAlias]] = js.undefined
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListCourseAliasesResponse {
  
  inline def apply(): SchemaListCourseAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCourseAliasesResponse]
  }
  
  extension [Self <: SchemaListCourseAliasesResponse](x: Self) {
    
    inline def setAliases(value: js.Array[SchemaCourseAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: SchemaCourseAlias*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
