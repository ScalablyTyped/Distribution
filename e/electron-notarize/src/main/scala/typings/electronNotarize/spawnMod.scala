package typings.electronNotarize

import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spawnMod {
  
  @JSImport("electron-notarize/lib/spawn", "spawn")
  @js.native
  def spawn(cmd: String): js.Promise[SpawnResult] = js.native
  @JSImport("electron-notarize/lib/spawn", "spawn")
  @js.native
  def spawn(cmd: String, args: js.UndefOr[scala.Nothing], opts: SpawnOptions): js.Promise[SpawnResult] = js.native
  @JSImport("electron-notarize/lib/spawn", "spawn")
  @js.native
  def spawn(cmd: String, args: js.Array[String]): js.Promise[SpawnResult] = js.native
  @JSImport("electron-notarize/lib/spawn", "spawn")
  @js.native
  def spawn(cmd: String, args: js.Array[String], opts: SpawnOptions): js.Promise[SpawnResult] = js.native
  
  @js.native
  trait SpawnResult extends StObject {
    
    var code: Double | Null = js.native
    
    var output: String = js.native
  }
  object SpawnResult {
    
    @scala.inline
    def apply(output: String): SpawnResult = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpawnResult]
    }
    
    @scala.inline
    implicit class SpawnResultMutableBuilder[Self <: SpawnResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeNull: Self = StObject.set(x, "code", null)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
}
