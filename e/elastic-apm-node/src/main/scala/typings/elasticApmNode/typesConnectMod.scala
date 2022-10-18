package typings.elasticApmNode

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConnectMod {
  
  object Connect {
    
    type ErrorHandleFunction = js.Function4[
        /* err */ Any, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ NextFunction, 
        Unit
      ]
    
    type NextFunction = js.Function1[/* err */ js.UndefOr[Any], Unit]
  }
}
