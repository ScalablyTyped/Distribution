package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcCrashReporterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("facebook-nodejs-business-sdk", "CrashReporter")
@js.native
open class CrashReporter () extends default
/* static members */
object CrashReporter {
  
  @JSImport("facebook-nodejs-business-sdk", "CrashReporter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("facebook-nodejs-business-sdk", "CrashReporter._instance")
  @js.native
  def _instance: typings.facebookNodejsBusinessSdk.srcCrashReporterMod.CrashReporter = js.native
  inline def _instance_=(x: typings.facebookNodejsBusinessSdk.srcCrashReporterMod.CrashReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
}
