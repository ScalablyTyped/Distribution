package typings.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Touch")
@js.native
class Touch ()
  extends typings.easeljs.createjs.Touch
/* static members */
object Touch {
  
  // methods
  @JSGlobal("createjs.Touch.disable")
  @js.native
  def disable(stage: typings.easeljs.createjs.Stage): Unit = js.native
  
  @JSGlobal("createjs.Touch.enable")
  @js.native
  def enable(stage: typings.easeljs.createjs.Stage): Boolean = js.native
  @JSGlobal("createjs.Touch.enable")
  @js.native
  def enable(
    stage: typings.easeljs.createjs.Stage,
    singleTouch: js.UndefOr[scala.Nothing],
    allowDefault: Boolean
  ): Boolean = js.native
  @JSGlobal("createjs.Touch.enable")
  @js.native
  def enable(stage: typings.easeljs.createjs.Stage, singleTouch: Boolean): Boolean = js.native
  @JSGlobal("createjs.Touch.enable")
  @js.native
  def enable(stage: typings.easeljs.createjs.Stage, singleTouch: Boolean, allowDefault: Boolean): Boolean = js.native
  
  @JSGlobal("createjs.Touch.isSupported")
  @js.native
  def isSupported(): Boolean = js.native
}
