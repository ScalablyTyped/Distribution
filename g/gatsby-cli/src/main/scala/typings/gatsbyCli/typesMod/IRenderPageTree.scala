package typings.gatsbyCli.typesMod

import typings.gatsbyCli.constantsMod.Actions.RenderPageTree
import typings.gatsbyCli.reporterTypesMod.IRenderPageArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRenderPageTree
  extends StObject
     with ActionsUnion {
  
  var payload: IRenderPageArgs
  
  var `type`: RenderPageTree
}
object IRenderPageTree {
  
  inline def apply(payload: IRenderPageArgs, `type`: RenderPageTree): IRenderPageTree = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderPageTree]
  }
  
  extension [Self <: IRenderPageTree](x: Self) {
    
    inline def setPayload(value: IRenderPageArgs): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: RenderPageTree): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
