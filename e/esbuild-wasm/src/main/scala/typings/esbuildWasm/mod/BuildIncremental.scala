package typings.esbuildWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildIncremental
  extends StObject
     with BuildResult {
  
  @JSName("rebuild")
  def rebuild_MBuildIncremental(): js.Promise[BuildIncremental]
  @JSName("rebuild")
  var rebuild_Original: BuildInvalidate
}
object BuildIncremental {
  
  inline def apply(errors: js.Array[Message], rebuild: BuildInvalidate, warnings: js.Array[Message]): BuildIncremental = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], rebuild = rebuild.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildIncremental]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildIncremental] (val x: Self) extends AnyVal {
    
    inline def setRebuild(value: BuildInvalidate): Self = StObject.set(x, "rebuild", value.asInstanceOf[js.Any])
  }
}
