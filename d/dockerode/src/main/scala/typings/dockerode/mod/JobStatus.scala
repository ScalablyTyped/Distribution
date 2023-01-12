package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatus extends StObject {
  
  var JobIteration: Version
  
  var LastExecution: js.UndefOr[String] = js.undefined
}
object JobStatus {
  
  inline def apply(JobIteration: Version): JobStatus = {
    val __obj = js.Dynamic.literal(JobIteration = JobIteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobStatus] (val x: Self) extends AnyVal {
    
    inline def setJobIteration(value: Version): Self = StObject.set(x, "JobIteration", value.asInstanceOf[js.Any])
    
    inline def setLastExecution(value: String): Self = StObject.set(x, "LastExecution", value.asInstanceOf[js.Any])
    
    inline def setLastExecutionUndefined: Self = StObject.set(x, "LastExecution", js.undefined)
  }
}
