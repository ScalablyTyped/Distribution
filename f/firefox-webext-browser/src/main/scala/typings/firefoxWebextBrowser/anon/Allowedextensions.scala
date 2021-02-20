package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionID
import typings.firefoxWebextBrowser.browser.manifest.NativeManifest
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.pkcs11
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.stdio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allowedextensions extends NativeManifest {
  
  var allowed_extensions: js.Array[ExtensionID] = js.native
  
  var description: String = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  var `type`: pkcs11 | stdio = js.native
}
object Allowedextensions {
  
  @scala.inline
  def apply(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): Allowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowedextensions]
  }
  
  @scala.inline
  implicit class AllowedextensionsMutableBuilder[Self <: Allowedextensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed_extensions(value: js.Array[ExtensionID]): Self = StObject.set(x, "allowed_extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_extensionsVarargs(value: ExtensionID*): Self = StObject.set(x, "allowed_extensions", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pkcs11 | stdio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
