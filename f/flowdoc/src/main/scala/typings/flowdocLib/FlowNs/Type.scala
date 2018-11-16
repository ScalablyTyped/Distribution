package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("Flow.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait Diamond
    extends flowdocLib.FlowNs.Type
  
  @js.native
  sealed trait Document
    extends flowdocLib.FlowNs.Type
  
  @js.native
  sealed trait Ellipse
    extends flowdocLib.FlowNs.Type
  
  @js.native
  sealed trait Hotspot
    extends flowdocLib.FlowNs.Type
  
  @js.native
  sealed trait Image
    extends flowdocLib.FlowNs.Type
  
  @js.native
  sealed trait Layer
    extends flowdocLib.FlowNs.Type
  
  @js.native
  sealed trait Page
    extends flowdocLib.FlowNs.Type
  
  @js.native
  sealed trait Rectangle
    extends flowdocLib.FlowNs.Type
  
  @js.native
  sealed trait Screen
    extends flowdocLib.FlowNs.Type
  
  /* "DIAMOND" */ val Diamond: Diamond with java.lang.String = js.native
  /* "DOCUMENT" */ val Document: Document with java.lang.String = js.native
  /* "ELLIPSE" */ val Ellipse: Ellipse with java.lang.String = js.native
  /* "HOTSPOT" */ val Hotspot: Hotspot with java.lang.String = js.native
  /* "IMAGE" */ val Image: Image with java.lang.String = js.native
  /* "LAYER" */ val Layer: Layer with java.lang.String = js.native
  /* "PAGE" */ val Page: Page with java.lang.String = js.native
  /* "RECT" */ val Rectangle: Rectangle with java.lang.String = js.native
  /* "SCREEN" */ val Screen: Screen with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[flowdocLib.FlowNs.Type with java.lang.String] = js.native
}

