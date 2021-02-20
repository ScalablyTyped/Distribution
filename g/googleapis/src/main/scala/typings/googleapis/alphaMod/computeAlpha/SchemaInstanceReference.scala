package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceReference extends StObject {
  
  /**
    * The URL for a specific instance.
    */
  var instance: js.UndefOr[String] = js.native
}
object SchemaInstanceReference {
  
  @scala.inline
  def apply(): SchemaInstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceReference]
  }
  
  @scala.inline
  implicit class SchemaInstanceReferenceMutableBuilder[Self <: SchemaInstanceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
