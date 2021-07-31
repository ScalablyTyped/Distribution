package typings.figma

import typings.figma.figmaStrings.AFTER_TIMEOUT
import typings.figma.figmaStrings.AUTO
import typings.figma.figmaStrings.BACK
import typings.figma.figmaStrings.CLOSE
import typings.figma.figmaStrings.MOUSE_DOWN
import typings.figma.figmaStrings.MOUSE_ENTER
import typings.figma.figmaStrings.MOUSE_LEAVE
import typings.figma.figmaStrings.MOUSE_UP
import typings.figma.figmaStrings.NODE
import typings.figma.figmaStrings.NONE
import typings.figma.figmaStrings.ON_CLICK
import typings.figma.figmaStrings.ON_DRAG
import typings.figma.figmaStrings.ON_HOVER
import typings.figma.figmaStrings.ON_PRESS
import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import typings.figma.figmaStrings.SOLID_COLOR
import typings.figma.figmaStrings.URL
import typings.figma.mod.global.Action
import typings.figma.mod.global.LineHeight
import typings.figma.mod.global.Navigation
import typings.figma.mod.global.OverlayBackground
import typings.figma.mod.global.RGBA
import typings.figma.mod.global.TextNode
import typings.figma.mod.global.Transition
import typings.figma.mod.global.Trigger
import typings.figma.mod.global.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with LineHeight {
    
    val unit: AUTO
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal(unit = "AUTO")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnit(value: AUTO): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`
    extends StObject
       with Trigger {
    
    val `type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG
  }
  object `1` {
    
    @scala.inline
    def apply(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2`
    extends StObject
       with OverlayBackground {
    
    val `type`: NONE
  }
  object `2` {
    
    @scala.inline
    def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("NONE")
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: NONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color
    extends StObject
       with OverlayBackground {
    
    val color: RGBA
    
    val `type`: SOLID_COLOR
  }
  object Color {
    
    @scala.inline
    def apply(color: RGBA): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SOLID_COLOR")
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SOLID_COLOR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay
    extends StObject
       with Trigger {
    
    val delay: Double
    
    val `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN
  }
  object Delay {
    
    @scala.inline
    def apply(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DestinationId
    extends StObject
       with Action {
    
    val destinationId: String | Null
    
    val navigation: Navigation
    
    // Only present if navigation == "OVERLAY" and the destination uses
    // overlay position type "RELATIVE"
    val overlayRelativePosition: js.UndefOr[Vector] = js.undefined
    
    val preserveScrollPosition: Boolean
    
    val transition: Transition | Null
    
    val `type`: NODE
  }
  object DestinationId {
    
    @scala.inline
    def apply(navigation: Navigation, preserveScrollPosition: Boolean): DestinationId = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any], destinationId = null, transition = null)
      __obj.updateDynamic("type")("NODE")
      __obj.asInstanceOf[DestinationId]
    }
    
    @scala.inline
    implicit class DestinationIdMutableBuilder[Self <: DestinationId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationId(value: String): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationIdNull: Self = StObject.set(x, "destinationId", null)
      
      @scala.inline
      def setNavigation(value: Navigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayRelativePosition(value: Vector): Self = StObject.set(x, "overlayRelativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayRelativePositionUndefined: Self = StObject.set(x, "overlayRelativePosition", js.undefined)
      
      @scala.inline
      def setPreserveScrollPosition(value: Boolean): Self = StObject.set(x, "preserveScrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNull: Self = StObject.set(x, "transition", null)
      
      @scala.inline
      def setType(value: NODE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var node: TextNode
    
    var start: Double
  }
  object End {
    
    @scala.inline
    def apply(end: Double, node: TextNode, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: TextNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timeout
    extends StObject
       with Trigger {
    
    val timeout: Double
    
    val `type`: AFTER_TIMEOUT
  }
  object Timeout {
    
    @scala.inline
    def apply(timeout: Double): Timeout = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("AFTER_TIMEOUT")
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: AFTER_TIMEOUT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with Action {
    
    val `type`: BACK | CLOSE
  }
  object Type {
    
    @scala.inline
    def apply(`type`: BACK | CLOSE): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: BACK | CLOSE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unit
    extends StObject
       with LineHeight {
    
    val unit: PIXELS | PERCENT
    
    val value: Double
  }
  object Unit {
    
    @scala.inline
    def apply(unit: PIXELS | PERCENT, value: Double): Unit = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit class UnitMutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnit(value: PIXELS | PERCENT): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url
    extends StObject
       with Action {
    
    val `type`: URL
    
    var url: String
  }
  object Url {
    
    @scala.inline
    def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("URL")
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: URL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
