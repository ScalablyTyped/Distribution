package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cli extends StObject {
  
  var cli: String = js.native
  
  var local: String = js.native
}
object Cli {
  
  @scala.inline
  def apply(cli: String, local: String): Cli = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cli]
  }
  
  @scala.inline
  implicit class CliMutableBuilder[Self <: Cli] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCli(value: String): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
  }
}
