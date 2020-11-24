package typings.dwt.webTwainMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTBorderStyle
import typings.dwt.webTwainViewerMod.WebTwainViewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTwain extends WebTwainViewer {
  
  /**
    * Addons to WebTwain instances.
    */
  var Addon: typings.dwt.webTwainMod.Addon = js.native
  
  /**
    * [Deprecation] This API is no longer needed.
    */
  var AllowMultiSelect: Boolean = js.native
  
  /**
    * [Deprecation] This API is no longer needed.
    */
  var AllowPluginAuthentication: Boolean = js.native
  
  /**
    * [Deprecation] This API is no longer needed.
    */
  var AsyncMode: Boolean = js.native
  
  /**
    * [Deprecation] This API is no longer needed.
    */
  var BorderStyle: EnumDWTBorderStyle | Double = js.native
  
  /**
    * [Deprecation] This API is no longer needed.
    */
  var BrokerProcessType: Double = js.native
  
  /**
    * [Deprecation] This API is no longer needed.
    */
  var EnableInteractiveZoom: Boolean = js.native
  
  /**
    * Return whether a WebTwain instance is ready to use.
    */
  val bReady: Boolean = js.native
}
