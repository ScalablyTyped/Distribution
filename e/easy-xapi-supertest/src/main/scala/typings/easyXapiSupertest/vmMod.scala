package typings.easyXapiSupertest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vmMod {
  
  @JSImport("vm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createContext(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[Context]
  @scala.inline
  def createContext(initSandbox: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(initSandbox.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  @scala.inline
  def createScript(code: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("createScript")(code.asInstanceOf[js.Any]).asInstanceOf[Script]
  @scala.inline
  def createScript(code: String, filename: String): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("createScript")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  @scala.inline
  def runInContext(code: String, context: Context): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(code.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def runInContext(code: String, context: Context, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(code.asInstanceOf[js.Any], context.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def runInNewContext(code: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def runInNewContext(code: String, sandbox: Unit, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def runInNewContext(code: String, sandbox: Context): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def runInNewContext(code: String, sandbox: Context, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def runInThisContext(code: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def runInThisContext(code: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Context extends StObject
  
  @js.native
  trait Script extends StObject {
    
    def runInNewContext(): Unit = js.native
    def runInNewContext(sandbox: Context): Unit = js.native
    
    def runInThisContext(): Unit = js.native
  }
}
