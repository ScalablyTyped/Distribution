package typings.gitana.mod

import org.scalablytyped.runtime.StObject
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
object EmailProvider {
  
  /* static member */
  @JSImport("gitana", "EmailProvider.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "EmailProvider.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "EmailProvider.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "EmailProvider.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "EmailProvider.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
