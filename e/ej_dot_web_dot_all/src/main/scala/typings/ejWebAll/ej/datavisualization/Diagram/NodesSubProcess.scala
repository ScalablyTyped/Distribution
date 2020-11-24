package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesSubProcess extends js.Object {
  
  /** Defines the children for BPMN's SubProcess
    * @Default {[]}
    */
  var Processes: js.UndefOr[js.Array[_]] = js.native
  
  /** Defines whether the BPMN sub process is without any prescribed order or not
    * @Default {false}
    */
  var adhoc: js.UndefOr[Boolean] = js.native
  
  /** Sets the boundary of the BPMN process
    * @Default {ej.datavisualization.Diagram.BPMNBoundary.Default}
    */
  var boundary: js.UndefOr[BPMNBoundary | String] = js.native
  
  /** Sets whether the BPMN subprocess is triggered as a collapsed of a specific activity
    * @Default {true}
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /** Sets whether the BPMN subprocess is triggered as a compensation of a specific activity
    * @Default {false}
    */
  var compensation: js.UndefOr[Boolean] = js.native
  
  /** Sets the type of the event by which the sub-process will be triggered
    * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
    */
  var event: js.UndefOr[BPMNEvents | String] = js.native
  
  /** Defines the collection of events that need to be appended with BPMN Sub-Process
    */
  var events: js.UndefOr[js.Array[NodesSubProcessEvent]] = js.native
  
  /** Defines the loop type of a sub process.
    * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
    */
  var loop: js.UndefOr[BPMNLoops | String] = js.native
  
  /** Defines the type of the event trigger
    * @Default {ej.datavisualization.Diagram.BPMNTriggers.Message}
    */
  var trigger: js.UndefOr[BPMNTriggers | String] = js.native
  
  /** Defines the type of a sub process
    * @Default {ej.datavisualization.Diagram.BPMNSubProcessTypes.None}
    */
  var `type`: js.UndefOr[BPMNSubProcessTypes | String] = js.native
}
object NodesSubProcess {
  
  @scala.inline
  def apply(): NodesSubProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesSubProcess]
  }
  
  @scala.inline
  implicit class NodesSubProcessOps[Self <: NodesSubProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcessesVarargs(value: js.Any*): Self = this.set("Processes", js.Array(value :_*))
    
    @scala.inline
    def setProcesses(value: js.Array[_]): Self = this.set("Processes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcesses: Self = this.set("Processes", js.undefined)
    
    @scala.inline
    def setAdhoc(value: Boolean): Self = this.set("adhoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdhoc: Self = this.set("adhoc", js.undefined)
    
    @scala.inline
    def setBoundary(value: BPMNBoundary | String): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCompensation(value: Boolean): Self = this.set("compensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompensation: Self = this.set("compensation", js.undefined)
    
    @scala.inline
    def setEvent(value: BPMNEvents | String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: NodesSubProcessEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[NodesSubProcessEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setLoop(value: BPMNLoops | String): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setTrigger(value: BPMNTriggers | String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setType(value: BPMNSubProcessTypes | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
