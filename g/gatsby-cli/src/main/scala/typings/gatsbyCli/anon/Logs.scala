package typings.gatsbyCli.anon

import typings.gatsbyCli.reporterTypesMod.IRenderPageArgs
import typings.gatsbyCli.typesMod.IGatsbyCLIState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logs extends StObject {
  
  var logs: IGatsbyCLIState
  
  var pageTree: IRenderPageArgs
}
object Logs {
  
  inline def apply(logs: IGatsbyCLIState, pageTree: IRenderPageArgs): Logs = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], pageTree = pageTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logs]
  }
  
  extension [Self <: Logs](x: Self) {
    
    inline def setLogs(value: IGatsbyCLIState): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setPageTree(value: IRenderPageArgs): Self = StObject.set(x, "pageTree", value.asInstanceOf[js.Any])
  }
}
