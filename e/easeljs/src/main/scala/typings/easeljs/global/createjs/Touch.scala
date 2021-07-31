package typings.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Touch")
@js.native
class Touch ()
  extends StObject
     with typings.easeljs.createjs.Touch
/* static members */
object Touch {
  
  @JSGlobal("createjs.Touch")
  @js.native
  val ^ : js.Any = js.native
  
  // methods
  @scala.inline
  def disable(stage: typings.easeljs.createjs.Stage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(stage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def enable(stage: typings.easeljs.createjs.Stage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def enable(stage: typings.easeljs.createjs.Stage, singleTouch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(stage.asInstanceOf[js.Any], singleTouch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def enable(stage: typings.easeljs.createjs.Stage, singleTouch: Boolean, allowDefault: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(stage.asInstanceOf[js.Any], singleTouch.asInstanceOf[js.Any], allowDefault.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def enable(stage: typings.easeljs.createjs.Stage, singleTouch: Unit, allowDefault: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(stage.asInstanceOf[js.Any], singleTouch.asInstanceOf[js.Any], allowDefault.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
