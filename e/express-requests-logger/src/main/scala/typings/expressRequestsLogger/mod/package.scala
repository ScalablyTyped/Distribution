package typings.expressRequestsLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type StatusCodeMap = typings.std.Record[
    java.lang.String, 
    typings.expressRequestsLogger.expressRequestsLoggerStrings.trace | typings.expressRequestsLogger.expressRequestsLoggerStrings.debug | typings.expressRequestsLogger.expressRequestsLoggerStrings.info | typings.expressRequestsLogger.expressRequestsLoggerStrings.warn | typings.expressRequestsLogger.expressRequestsLoggerStrings.error
  ]
}
