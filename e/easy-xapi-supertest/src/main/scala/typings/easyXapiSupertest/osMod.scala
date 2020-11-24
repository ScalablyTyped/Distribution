package typings.easyXapiSupertest

import typings.easyXapiSupertest.anon.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("os", JSImport.Namespace)
@js.native
object osMod extends js.Object {
  
  var EOL: String = js.native
  
  def arch(): String = js.native
  
  def cpus(): js.Array[Model] = js.native
  
  def freemem(): Double = js.native
  
  def hostname(): String = js.native
  
  def loadavg(): js.Array[Double] = js.native
  
  def networkInterfaces(): js.Any = js.native
  
  def platform(): String = js.native
  
  def release(): String = js.native
  
  def tmpdir(): String = js.native
  
  def totalmem(): Double = js.native
  
  def `type`(): String = js.native
  
  def uptime(): Double = js.native
}
