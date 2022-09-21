package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerLogsOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  var details: js.UndefOr[Boolean] = js.undefined
  
  var follow: js.UndefOr[Boolean] = js.undefined
  
  var since: js.UndefOr[Double] = js.undefined
  
  var stderr: js.UndefOr[Boolean] = js.undefined
  
  var stdout: js.UndefOr[Boolean] = js.undefined
  
  var tail: js.UndefOr[Double] = js.undefined
  
  var timestamps: js.UndefOr[Boolean] = js.undefined
}
object ContainerLogsOptions {
  
  inline def apply(): ContainerLogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerLogsOptions]
  }
  
  extension [Self <: ContainerLogsOptions](x: Self) {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setDetails(value: Boolean): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    inline def setTail(value: Double): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    inline def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
    
    inline def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
  }
}
