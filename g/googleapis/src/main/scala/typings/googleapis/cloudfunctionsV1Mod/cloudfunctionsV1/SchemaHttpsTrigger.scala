package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes HttpsTrigger, could be used to connect web hooks to function.
  */
trait SchemaHttpsTrigger extends StObject {
  
  /**
    * Output only. The deployed url for the function.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaHttpsTrigger {
  
  @scala.inline
  def apply(): SchemaHttpsTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpsTrigger]
  }
  
  @scala.inline
  implicit class SchemaHttpsTriggerMutableBuilder[Self <: SchemaHttpsTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
