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
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(unit = "AUTO")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setUnit(value: AUTO): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`
    extends StObject
       with Trigger {
    
    val `type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG
  }
  object `1` {
    
    inline def apply(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setType(value: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2`
    extends StObject
       with OverlayBackground {
    
    val `type`: NONE
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("NONE")
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setType(value: NONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color
    extends StObject
       with OverlayBackground {
    
    val color: RGBA
    
    val `type`: SOLID_COLOR
  }
  object Color {
    
    inline def apply(color: RGBA): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SOLID_COLOR")
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setType(value: SOLID_COLOR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay
    extends StObject
       with Trigger {
    
    val delay: Double
    
    val `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN
  }
  object Delay {
    
    inline def apply(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    extension [Self <: Delay](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setType(value: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply(navigation: Navigation, preserveScrollPosition: Boolean): DestinationId = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any], destinationId = null, transition = null)
      __obj.updateDynamic("type")("NODE")
      __obj.asInstanceOf[DestinationId]
    }
    
    extension [Self <: DestinationId](x: Self) {
      
      inline def setDestinationId(value: String): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
      
      inline def setDestinationIdNull: Self = StObject.set(x, "destinationId", null)
      
      inline def setNavigation(value: Navigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setOverlayRelativePosition(value: Vector): Self = StObject.set(x, "overlayRelativePosition", value.asInstanceOf[js.Any])
      
      inline def setOverlayRelativePositionUndefined: Self = StObject.set(x, "overlayRelativePosition", js.undefined)
      
      inline def setPreserveScrollPosition(value: Boolean): Self = StObject.set(x, "preserveScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionNull: Self = StObject.set(x, "transition", null)
      
      inline def setType(value: NODE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var node: TextNode
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, node: TextNode, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setNode(value: TextNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timeout
    extends StObject
       with Trigger {
    
    val timeout: Double
    
    val `type`: AFTER_TIMEOUT
  }
  object Timeout {
    
    inline def apply(timeout: Double): Timeout = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("AFTER_TIMEOUT")
      __obj.asInstanceOf[Timeout]
    }
    
    extension [Self <: Timeout](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setType(value: AFTER_TIMEOUT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with Action {
    
    val `type`: BACK | CLOSE
  }
  object Type {
    
    inline def apply(`type`: BACK | CLOSE): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: BACK | CLOSE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unit
    extends StObject
       with LineHeight {
    
    val unit: PIXELS | PERCENT
    
    val value: Double
  }
  object Unit {
    
    inline def apply(unit: PIXELS | PERCENT, value: Double): Unit = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    extension [Self <: Unit](x: Self) {
      
      inline def setUnit(value: PIXELS | PERCENT): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url
    extends StObject
       with Action {
    
    val `type`: URL
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("URL")
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setType(value: URL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
