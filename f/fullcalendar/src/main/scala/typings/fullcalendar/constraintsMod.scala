package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Constraints", JSImport.Namespace)
@js.native
object constraintsMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(eventManager: js.Any, _calendar: js.Any) = this()
    var _calendar: js.Any = js.native
    var eventManager: js.Any = js.native
    def buildCurrentBusinessFootprints(isAllDay: js.Any): js.Array[_] = js.native
    def collectOverlapEventFootprints(peerEventFootprints: js.Any, targetFootprint: js.Any): js.Array[_] = js.native
    def constraintValToFootprints(constraintVal: js.Any, isAllDay: js.Any): js.Array[_] = js.native
    def eventInstancesToFootprints(eventInstances: js.Any): js.Array[_] = js.native
    def eventRangeToEventFootprints(eventRange: js.Any): js.Array[typings.fullcalendar.eventFootprintMod.default] = js.native
    def eventRangesToEventFootprints(eventRanges: js.Any): js.Array[_] = js.native
    def footprintContainsFootprint(outerFootprint: js.Any, innerFootprint: js.Any): js.Any = js.native
    def footprintsIntersect(footprint0: js.Any, footprint1: js.Any): js.Any = js.native
    def getPeerEventInstances(eventDef: js.Any): js.Any = js.native
    def isEventInstanceGroupAllowed(eventInstanceGroup: js.Any): Boolean = js.native
    def isFootprintAllowed(componentFootprint: js.Any, peerEventFootprints: js.Any, constraintVal: js.Any, overlapVal: js.Any): Boolean = js.native
    def isFootprintAllowed(
      componentFootprint: js.Any,
      peerEventFootprints: js.Any,
      constraintVal: js.Any,
      overlapVal: js.Any,
      subjectEventInstance: js.Any
    ): Boolean = js.native
    def isFootprintWithinConstraints(componentFootprint: js.Any, constraintFootprints: js.Any): Boolean = js.native
    def isSelectionFootprintAllowed(componentFootprint: js.Any): Boolean = js.native
    def opt(name: js.Any): js.Any = js.native
    def parseEventDefToInstances(eventInput: js.Any): js.Any = js.native
    def parseFootprints(rawInput: js.Any): js.Array[typings.fullcalendar.componentFootprintMod.default] = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(eventManager: js.Any, _calendar: js.Any) = this()
  }
  
}

