package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/extension-info
  var name: String
  
  var version: String
}
object ExtensionInfo {
  
  @scala.inline
  def apply(name: String, version: String): ExtensionInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  
  @scala.inline
  implicit class ExtensionInfoMutableBuilder[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
