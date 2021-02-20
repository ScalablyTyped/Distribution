package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerLogsOptions extends StObject {
  
  var details: js.UndefOr[Boolean] = js.native
  
  var follow: js.UndefOr[Boolean] = js.native
  
  var since: js.UndefOr[Double] = js.native
  
  var stderr: js.UndefOr[Boolean] = js.native
  
  var stdout: js.UndefOr[Boolean] = js.native
  
  var tail: js.UndefOr[Double] = js.native
  
  var timestamps: js.UndefOr[Boolean] = js.native
}
object ContainerLogsOptions {
  
  @scala.inline
  def apply(): ContainerLogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerLogsOptions]
  }
  
  @scala.inline
  implicit class ContainerLogsOptionsMutableBuilder[Self <: ContainerLogsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Boolean): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    @scala.inline
    def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    @scala.inline
    def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    @scala.inline
    def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    @scala.inline
    def setTail(value: Double): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
  }
}
