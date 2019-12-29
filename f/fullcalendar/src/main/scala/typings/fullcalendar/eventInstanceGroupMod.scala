package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventInstanceGroup", JSImport.Namespace)
@js.native
object eventInstanceGroupMod extends js.Object {
  @js.native
  class Default () extends js.Object {
    def this(eventInstances: js.Any) = this()
    var eventInstances: js.Any = js.native
    var explicitEventDef: js.Any = js.native
    def getAllEventRanges(constraintRange: js.Any): js.Any = js.native
    def getEventDef(): js.Any = js.native
    def isInverse(): js.Any = js.native
    def sliceInverseRenderRanges(constraintRange: js.Any): js.Any = js.native
    def sliceNormalRenderRanges(constraintRange: js.Any): js.Array[_] = js.native
    def sliceRenderRanges(constraintRange: js.Any): js.Any = js.native
  }
  
  @js.native
  class default () extends Default {
    def this(eventInstances: js.Any) = this()
  }
  
}

