package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxScrollable[TProperties]
  extends StObject
     with DOMComponent[TProperties] {
  
  /**
    * Gets the UI component&apos;s height.
    */
  def clientHeight(): Double = js.native
  
  /**
    * Gets the UI component&apos;s width.
    */
  def clientWidth(): Double = js.native
  
  /**
    * Gets the UI component&apos;s content.
    */
  def content(): DxElement_[HTMLElement] = js.native
  
  def scrollBy(distance: Any): Unit = js.native
  /**
    * Scrolls the content by a specific distance.
    */
  def scrollBy(distance: Double): Unit = js.native
  
  /**
    * Gets the scrollable content&apos;s height in pixels.
    */
  def scrollHeight(): Double = js.native
  
  /**
    * Gets the left scroll offset.
    */
  def scrollLeft(): Double = js.native
  
  /**
    * Gets the scroll offset.
    */
  def scrollOffset(): Any = js.native
  
  def scrollTo(targetLocation: Any): Unit = js.native
  /**
    * Scrolls the content to a specific position.
    */
  def scrollTo(targetLocation: Double): Unit = js.native
  
  /**
    * Scrolls content to an element.
    */
  def scrollToElement(element: UserDefinedElement[Element]): Unit = js.native
  
  /**
    * Gets the top scroll offset.
    */
  def scrollTop(): Double = js.native
  
  /**
    * Gets the scrollable content&apos;s width in pixels.
    */
  def scrollWidth(): Double = js.native
  
  /**
    * Updates the scrollable contents&apos; dimensions.
    */
  def update(): js.Promise[Unit] = js.native
}
object dxScrollable {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type Properties = dxScrollableOptions[ScrollableInstance]
  
  trait ScrollEventInfo[T]
    extends StObject
       with NativeEventInfo[T, WheelEvent | MouseEvent | Event] {
    
    val reachedBottom: js.UndefOr[Boolean] = js.undefined
    
    val reachedLeft: js.UndefOr[Boolean] = js.undefined
    
    val reachedRight: js.UndefOr[Boolean] = js.undefined
    
    val reachedTop: js.UndefOr[Boolean] = js.undefined
    
    val scrollOffset: js.UndefOr[Any] = js.undefined
  }
  object ScrollEventInfo {
    
    inline def apply[T](component: T, element: DxElement_[HTMLElement]): ScrollEventInfo[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollEventInfo[T]]
    }
    
    extension [Self <: ScrollEventInfo[?], T](x: Self & ScrollEventInfo[T]) {
      
      inline def setReachedBottom(value: Boolean): Self = StObject.set(x, "reachedBottom", value.asInstanceOf[js.Any])
      
      inline def setReachedBottomUndefined: Self = StObject.set(x, "reachedBottom", js.undefined)
      
      inline def setReachedLeft(value: Boolean): Self = StObject.set(x, "reachedLeft", value.asInstanceOf[js.Any])
      
      inline def setReachedLeftUndefined: Self = StObject.set(x, "reachedLeft", js.undefined)
      
      inline def setReachedRight(value: Boolean): Self = StObject.set(x, "reachedRight", value.asInstanceOf[js.Any])
      
      inline def setReachedRightUndefined: Self = StObject.set(x, "reachedRight", js.undefined)
      
      inline def setReachedTop(value: Boolean): Self = StObject.set(x, "reachedTop", value.asInstanceOf[js.Any])
      
      inline def setReachedTopUndefined: Self = StObject.set(x, "reachedTop", js.undefined)
      
      inline def setScrollOffset(value: Any): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  @js.native
  trait ScrollableInstance
    extends StObject
       with dxScrollable[Properties]
}
