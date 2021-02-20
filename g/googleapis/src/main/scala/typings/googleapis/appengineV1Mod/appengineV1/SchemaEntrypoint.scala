package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entrypoint for the application.
  */
@js.native
trait SchemaEntrypoint extends StObject {
  
  /**
    * The format should be a shell command that can be fed to bash -c.
    */
  var shell: js.UndefOr[String] = js.native
}
object SchemaEntrypoint {
  
  @scala.inline
  def apply(): SchemaEntrypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntrypoint]
  }
  
  @scala.inline
  implicit class SchemaEntrypointMutableBuilder[Self <: SchemaEntrypoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}
