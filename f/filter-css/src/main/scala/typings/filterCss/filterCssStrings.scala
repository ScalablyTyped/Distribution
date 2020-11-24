package typings.filterCss

import typings.filterCss.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterCssStrings {
  
  @scala.inline
  def declarationProperty: declarationProperty = "declarationProperty".asInstanceOf[declarationProperty]
  
  @scala.inline
  def declarationValue: declarationValue = "declarationValue".asInstanceOf[declarationValue]
  
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @scala.inline
  def selector: selector = "selector".asInstanceOf[selector]
  
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait declarationProperty extends Context
  
  @js.native
  sealed trait declarationValue extends Context
  
  @js.native
  sealed trait media extends Context
  
  @js.native
  sealed trait selector extends Context
  
  @js.native
  sealed trait `type` extends Context
}
