package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: js.Array[js.Any]
  
  var script: String
}
object Args {
  
  @scala.inline
  def apply(args: js.Array[js.Any], script: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
