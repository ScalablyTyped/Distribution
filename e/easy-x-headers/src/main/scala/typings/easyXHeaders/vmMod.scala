package typings.easyXHeaders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vmMod {
  
  @JSImport("vm", "createContext")
  @js.native
  def createContext(): Context = js.native
  @JSImport("vm", "createContext")
  @js.native
  def createContext(initSandbox: Context): Context = js.native
  
  @JSImport("vm", "createScript")
  @js.native
  def createScript(code: String): Script = js.native
  @JSImport("vm", "createScript")
  @js.native
  def createScript(code: String, filename: String): Script = js.native
  
  @JSImport("vm", "runInContext")
  @js.native
  def runInContext(code: String, context: Context): Unit = js.native
  @JSImport("vm", "runInContext")
  @js.native
  def runInContext(code: String, context: Context, filename: String): Unit = js.native
  
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: String): Unit = js.native
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: String, sandbox: js.UndefOr[scala.Nothing], filename: String): Unit = js.native
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: String, sandbox: Context): Unit = js.native
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: String, sandbox: Context, filename: String): Unit = js.native
  
  @JSImport("vm", "runInThisContext")
  @js.native
  def runInThisContext(code: String): Unit = js.native
  @JSImport("vm", "runInThisContext")
  @js.native
  def runInThisContext(code: String, filename: String): Unit = js.native
  
  @js.native
  trait Context extends StObject
  
  @js.native
  trait Script extends StObject {
    
    def runInNewContext(): Unit = js.native
    def runInNewContext(sandbox: Context): Unit = js.native
    
    def runInThisContext(): Unit = js.native
  }
}
