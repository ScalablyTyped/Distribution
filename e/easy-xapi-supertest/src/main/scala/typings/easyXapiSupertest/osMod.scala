package typings.easyXapiSupertest

import typings.easyXapiSupertest.anon.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osMod {
  
  @JSImport("os", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("os", "EOL")
  @js.native
  def EOL: String = js.native
  @scala.inline
  def EOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EOL")(x.asInstanceOf[js.Any])
  
  @JSImport("os", "arch")
  @js.native
  def arch(): String = js.native
  
  @JSImport("os", "cpus")
  @js.native
  def cpus(): js.Array[Model] = js.native
  
  @JSImport("os", "freemem")
  @js.native
  def freemem(): Double = js.native
  
  @JSImport("os", "hostname")
  @js.native
  def hostname(): String = js.native
  
  @JSImport("os", "loadavg")
  @js.native
  def loadavg(): js.Array[Double] = js.native
  
  @JSImport("os", "networkInterfaces")
  @js.native
  def networkInterfaces(): js.Any = js.native
  
  @JSImport("os", "platform")
  @js.native
  def platform(): String = js.native
  
  @JSImport("os", "release")
  @js.native
  def release(): String = js.native
  
  @JSImport("os", "tmpdir")
  @js.native
  def tmpdir(): String = js.native
  
  @JSImport("os", "totalmem")
  @js.native
  def totalmem(): Double = js.native
  
  @JSImport("os", "uptime")
  @js.native
  def uptime(): Double = js.native
  
  @JSImport("os", "type")
  @js.native
  def `type`(): String = js.native
}
