package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedInstanceLastAttempt extends StObject {
  
  /**
    * [Output Only] Encountered errors during the last attempt to create or
    * delete the instance.
    */
  var errors: js.UndefOr[`3`] = js.undefined
}
object SchemaManagedInstanceLastAttempt {
  
  @scala.inline
  def apply(): SchemaManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceLastAttempt]
  }
  
  @scala.inline
  implicit class SchemaManagedInstanceLastAttemptMutableBuilder[Self <: SchemaManagedInstanceLastAttempt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: `3`): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
