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
  inline def EOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EOL")(x.asInstanceOf[js.Any])
  
  inline def arch(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arch")().asInstanceOf[String]
  
  inline def cpus(): js.Array[Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("cpus")().asInstanceOf[js.Array[Model]]
  
  inline def freemem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freemem")().asInstanceOf[Double]
  
  inline def hostname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostname")().asInstanceOf[String]
  
  inline def loadavg(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")().asInstanceOf[js.Array[Double]]
  
  inline def networkInterfaces(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("networkInterfaces")().asInstanceOf[Any]
  
  inline def platform(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")().asInstanceOf[String]
  
  inline def release(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("release")().asInstanceOf[String]
  
  inline def tmpdir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpdir")().asInstanceOf[String]
  
  inline def totalmem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalmem")().asInstanceOf[Double]
  
  inline def `type`(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")().asInstanceOf[String]
  
  inline def uptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uptime")().asInstanceOf[Double]
}
