package typings.firebase.compatMod.firebase

import typings.firebase.firebaseStrings.error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The JS SDK supports 5 log levels and also allows a user the ability to
  * silence the logs altogether.
  *
  * The order is as follows:
  * silent < debug < verbose < info < warn < error
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.debug
  - typings.firebase.firebaseStrings.verbose
  - typings.firebase.firebaseStrings.info
  - typings.firebase.firebaseStrings.warn
  - typings.firebase.firebaseStrings.error_
  - typings.firebase.firebaseStrings.silent
*/
trait LogLevel extends StObject
object LogLevel {
  
  inline def debug: typings.firebase.firebaseStrings.debug = "debug".asInstanceOf[typings.firebase.firebaseStrings.debug]
  
  inline def error: error_ = "error".asInstanceOf[error_]
  
  inline def info: typings.firebase.firebaseStrings.info = "info".asInstanceOf[typings.firebase.firebaseStrings.info]
  
  inline def silent: typings.firebase.firebaseStrings.silent = "silent".asInstanceOf[typings.firebase.firebaseStrings.silent]
  
  inline def verbose: typings.firebase.firebaseStrings.verbose = "verbose".asInstanceOf[typings.firebase.firebaseStrings.verbose]
  
  inline def warn: typings.firebase.firebaseStrings.warn = "warn".asInstanceOf[typings.firebase.firebaseStrings.warn]
}
