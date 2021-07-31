package typings.firebase.mod.firebase

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
  - typings.firebase.firebaseStrings.error
  - typings.firebase.firebaseStrings.silent
*/
trait LogLevel extends StObject
object LogLevel {
  
  @scala.inline
  def debug: typings.firebase.firebaseStrings.debug = "debug".asInstanceOf[typings.firebase.firebaseStrings.debug]
  
  @scala.inline
  def error: typings.firebase.firebaseStrings.error = "error".asInstanceOf[typings.firebase.firebaseStrings.error]
  
  @scala.inline
  def info: typings.firebase.firebaseStrings.info = "info".asInstanceOf[typings.firebase.firebaseStrings.info]
  
  @scala.inline
  def silent: typings.firebase.firebaseStrings.silent = "silent".asInstanceOf[typings.firebase.firebaseStrings.silent]
  
  @scala.inline
  def verbose: typings.firebase.firebaseStrings.verbose = "verbose".asInstanceOf[typings.firebase.firebaseStrings.verbose]
  
  @scala.inline
  def warn: typings.firebase.firebaseStrings.warn = "warn".asInstanceOf[typings.firebase.firebaseStrings.warn]
}
