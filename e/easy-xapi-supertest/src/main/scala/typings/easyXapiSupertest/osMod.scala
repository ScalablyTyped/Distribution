package typings.easyXapiSupertest

import typings.easyXapiSupertest.anon.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def arch(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arch")().asInstanceOf[String]
  
  @scala.inline
  def cpus(): js.Array[Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("cpus")().asInstanceOf[js.Array[Model]]
  
  @scala.inline
  def freemem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freemem")().asInstanceOf[Double]
  
  @scala.inline
  def hostname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostname")().asInstanceOf[String]
  
  @scala.inline
  def loadavg(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")().asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def networkInterfaces(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("networkInterfaces")().asInstanceOf[js.Any]
  
  @scala.inline
  def platform(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")().asInstanceOf[String]
  
  @scala.inline
  def release(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("release")().asInstanceOf[String]
  
  @scala.inline
  def tmpdir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpdir")().asInstanceOf[String]
  
  @scala.inline
  def totalmem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalmem")().asInstanceOf[Double]
  
  @scala.inline
  def `type`(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")().asInstanceOf[String]
  
  @scala.inline
  def uptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uptime")().asInstanceOf[Double]
}
