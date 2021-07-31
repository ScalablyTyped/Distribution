package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing guardians.
  */
trait SchemaListGuardiansResponse extends StObject {
  
  /**
    * Guardians on this page of results that met the criteria specified in the
    * request.
    */
  var guardians: js.UndefOr[js.Array[SchemaGuardian]] = js.undefined
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListGuardiansResponse {
  
  @scala.inline
  def apply(): SchemaListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGuardiansResponse]
  }
  
  @scala.inline
  implicit class SchemaListGuardiansResponseMutableBuilder[Self <: SchemaListGuardiansResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuardians(value: js.Array[SchemaGuardian]): Self = StObject.set(x, "guardians", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardiansUndefined: Self = StObject.set(x, "guardians", js.undefined)
    
    @scala.inline
    def setGuardiansVarargs(value: SchemaGuardian*): Self = StObject.set(x, "guardians", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
