package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetReference extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
}
object SchemaTargetReference {
  
  @scala.inline
  def apply(): SchemaTargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetReference]
  }
  
  @scala.inline
  implicit class SchemaTargetReferenceMutableBuilder[Self <: SchemaTargetReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
