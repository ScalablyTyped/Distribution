package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "EmailProvider")
@js.native
class EmailProvider protected () extends AbstractApplicationObject {
  def this(application: js.Any, `object`: js.Any) = this()
  
  def send(email: js.Any, model: js.Any): js.Any = js.native
  
  def sendForExport(exportId: js.Any, emailConfig: js.Any, callback: js.Any): js.Any = js.native
  
  def test(from: js.Any, to: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "EmailProvider")
@js.native
object EmailProvider extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
