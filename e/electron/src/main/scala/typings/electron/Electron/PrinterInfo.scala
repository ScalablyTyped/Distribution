package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/printer-info
  /**
    * a longer description of the printer's type.
    */
  var description: String
  
  /**
    * the name of the printer as shown in Print Preview.
    */
  var displayName: String
  
  /**
    * whether or not a given printer is set as the default printer on the OS.
    */
  var isDefault: Boolean
  
  /**
    * the name of the printer as understood by the OS.
    */
  var name: String
  
  /**
    * an object containing a variable number of platform-specific printer information.
    */
  var options: Options
  
  /**
    * the current status of the printer.
    */
  var status: Double
}
object PrinterInfo {
  
  inline def apply(
    description: String,
    displayName: String,
    isDefault: Boolean,
    name: String,
    options: Options,
    status: Double
  ): PrinterInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterInfo] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
