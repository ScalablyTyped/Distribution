package typings.findProcess

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cmd extends StObject {
    
    var cmd: String = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var name: String = js.native
    
    var pid: Double = js.native
    
    var ppid: js.UndefOr[Double] = js.native
    
    var uid: js.UndefOr[Double] = js.native
  }
  object Cmd {
    
    @scala.inline
    def apply(cmd: String, name: String, pid: Double): Cmd = {
      val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cmd]
    }
    
    @scala.inline
    implicit class CmdMutableBuilder[Self <: Cmd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpid(value: Double): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpidUndefined: Self = StObject.set(x, "ppid", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
