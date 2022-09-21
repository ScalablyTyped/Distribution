package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A log entry from the main log */
trait ILogEntry
  extends StObject
     with ILogPreEntry {
  
  /** Level of the log, 0-5, Trace, Info, Warn, Error, Fatal, Silent */
  var logLevel: Double
  
  /** Timestamp of when the entry was added to the main's log */
  var timestamp: Double
}
object ILogEntry {
  
  inline def apply(content: String, logLevel: Double, source: String, timestamp: Double): ILogEntry = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogEntry]
  }
  
  extension [Self <: ILogEntry](x: Self) {
    
    inline def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
