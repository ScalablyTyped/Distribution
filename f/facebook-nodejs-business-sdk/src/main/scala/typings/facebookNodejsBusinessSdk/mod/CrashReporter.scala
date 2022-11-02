package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcCrashReporterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "CrashReporter")
@js.native
open class CrashReporter () extends default
object CrashReporter {
  
  @JSImport("facebook-nodejs-business-sdk", "CrashReporter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("facebook-nodejs-business-sdk", "CrashReporter._instance")
  @js.native
  def instance: typings.facebookNodejsBusinessSdk.srcCrashReporterMod.CrashReporter = js.native
  
  inline def instance_=(x: typings.facebookNodejsBusinessSdk.srcCrashReporterMod.CrashReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
}
