package typings.firefoxWebextBrowser.browser.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One of
  *
  * *   `not_controllable`: cannot be controlled by any extension
  * *   `controlled_by_other_extensions`: controlled by extensions with higher precedence
  * *   `controllable_by_this_extension`: can be controlled by this extension
  * *   `controlled_by_this_extension`: controlled by this extension
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension
*/
trait LevelOfControl extends js.Object
object LevelOfControl {
  
  @scala.inline
  def controllable_by_this_extension: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension]
  
  @scala.inline
  def controlled_by_other_extensions: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions]
  
  @scala.inline
  def controlled_by_this_extension: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension]
  
  @scala.inline
  def not_controllable: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable = "not_controllable".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable]
}
