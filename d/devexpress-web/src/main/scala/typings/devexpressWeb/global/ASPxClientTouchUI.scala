package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains scroll extender methods that can be used to support scrolling under touch UI devices.
  */
@JSGlobal("ASPxClientTouchUI")
@js.native
open class ASPxClientTouchUI ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTouchUI
object ASPxClientTouchUI {
  
  @JSGlobal("ASPxClientTouchUI")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extends the specified element's functionality with scrolling via touch behavior (one finger) and customized scrollbar-related options. A ScrollExtender object allowing you to apply the current scroll extender to another element.
    * @param options An ASPxClientTouchUIOptions object that provides options affecting the touch scrolling functionality.
    */
  /* static member */
  inline def MakeScrollable(id: String): typings.devexpressWeb.ScrollExtender = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeScrollable")(id.asInstanceOf[js.Any]).asInstanceOf[typings.devexpressWeb.ScrollExtender]
  inline def MakeScrollable(id: String, options: typings.devexpressWeb.ASPxClientTouchUIOptions): typings.devexpressWeb.ScrollExtender = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeScrollable")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.devexpressWeb.ScrollExtender]
  inline def MakeScrollable(id: Any): typings.devexpressWeb.ScrollExtender = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeScrollable")(id.asInstanceOf[js.Any]).asInstanceOf[typings.devexpressWeb.ScrollExtender]
  inline def MakeScrollable(id: Any, options: typings.devexpressWeb.ASPxClientTouchUIOptions): typings.devexpressWeb.ScrollExtender = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeScrollable")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.devexpressWeb.ScrollExtender]
}
