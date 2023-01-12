package typings.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EASConfig extends StObject {
  
  /**
    * The ID for this project if it's using EAS. UUID. This value will not change when a project is
    * transferred between accounts or renamed.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object EASConfig {
  
  inline def apply(): EASConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EASConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EASConfig] (val x: Self) extends AnyVal {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
