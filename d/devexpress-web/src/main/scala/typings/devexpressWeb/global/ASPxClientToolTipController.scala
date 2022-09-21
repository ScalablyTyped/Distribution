package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ChartToolTipController class.
  */
@JSGlobal("ASPxClientToolTipController")
@js.native
open class ASPxClientToolTipController ()
  extends StObject
     with typings.devexpressWeb.ASPxClientToolTipController {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets a value that defines the position of an image within a tooltip.
    */
  /* CompleteClass */
  var imagePosition: String = js.native
  
  /**
    * Gets a value that defines when tooltips should be invoked.
    */
  /* CompleteClass */
  var openMode: String = js.native
  
  /**
    * Gets a value indicating whether an image should be shown in tooltips.
    */
  /* CompleteClass */
  var showImage: Boolean = js.native
  
  /**
    * Gets a value indicating whether it is necessary to show text in tooltips.
    */
  /* CompleteClass */
  var showText: Boolean = js.native
}
