package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Print Job */
@js.native
trait PrintJob extends StObject {
  
  /**
    * Gets a status of the print job
    *
    * @param replyCallback a function called when the status is available
    */
  def getStatus(replyCallback: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _]): Unit = js.native
}
object PrintJob {
  
  @scala.inline
  def apply(getStatus: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _] => Unit): PrintJob = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[PrintJob]
  }
  
  @scala.inline
  implicit class PrintJobMutableBuilder[Self <: PrintJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStatus(value: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _] => Unit): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
