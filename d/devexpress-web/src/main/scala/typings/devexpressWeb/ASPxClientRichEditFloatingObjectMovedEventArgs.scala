package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the FloatingObjectMoved event.
  */
@js.native
trait ASPxClientRichEditFloatingObjectMovedEventArgs extends ASPxClientEventArgs {
  
  /**
    * The floating object's new position.
    */
  var newPosition: Double = js.native
  
  /**
    * The x-coordinate (in pixels) of the upper-left corner of the floating object relative to the page.
    */
  var objectX: Double = js.native
  
  /**
    * The y-coordinate (in pixels) of the upper-left corner of the floating object relative to the page.
    */
  var objectY: Double = js.native
  
  /**
    * Returns an index of a page where a floating object has been moved.
    */
  val pageIndex: Double = js.native
  
  /**
    * Returns an array of intervals that are belongs to the current page (pageIndex).
    */
  val pageIntervals: js.Array[Interval] = js.native
  
  /**
    * Returns the active sub-document's identifier.
    */
  val subDocumentId: Double = js.native
}
object ASPxClientRichEditFloatingObjectMovedEventArgs {
  
  @scala.inline
  def apply(
    newPosition: Double,
    objectX: Double,
    objectY: Double,
    pageIndex: Double,
    pageIntervals: js.Array[Interval],
    subDocumentId: Double
  ): ASPxClientRichEditFloatingObjectMovedEventArgs = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], objectX = objectX.asInstanceOf[js.Any], objectY = objectY.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageIntervals = pageIntervals.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditFloatingObjectMovedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditFloatingObjectMovedEventArgsOps[Self <: ASPxClientRichEditFloatingObjectMovedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setNewPosition(value: Double): Self = this.set("newPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectX(value: Double): Self = this.set("objectX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectY(value: Double): Self = this.set("objectY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIntervalsVarargs(value: Interval*): Self = this.set("pageIntervals", js.Array(value :_*))
    
    @scala.inline
    def setPageIntervals(value: js.Array[Interval]): Self = this.set("pageIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocumentId(value: Double): Self = this.set("subDocumentId", value.asInstanceOf[js.Any])
  }
}
