package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A log entry _before_ it is added to the main log */
trait ILogPreEntry extends StObject {
  
  /** Content of the log entry */
  var content: String
  
  /** Name of the source of the log entry (name of what added the log entry) */
  var source: String
}
object ILogPreEntry {
  
  inline def apply(content: String, source: String): ILogPreEntry = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogPreEntry]
  }
  
  extension [Self <: ILogPreEntry](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
