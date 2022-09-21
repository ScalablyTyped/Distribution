package typings.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.ButtonHelper")
@js.native
open class ButtonHelper protected ()
  extends StObject
     with typings.easeljs.createjs.ButtonHelper {
  def this(
    target: typings.easeljs.createjs.MovieClip,
    outLabel: js.UndefOr[String],
    overLabel: js.UndefOr[String],
    downLabel: js.UndefOr[String],
    play: js.UndefOr[Boolean],
    hitArea: js.UndefOr[typings.easeljs.createjs.DisplayObject],
    hitLabel: js.UndefOr[String]
  ) = this()
  def this(
    target: typings.easeljs.createjs.Sprite,
    outLabel: js.UndefOr[String],
    overLabel: js.UndefOr[String],
    downLabel: js.UndefOr[String],
    play: js.UndefOr[Boolean],
    hitArea: js.UndefOr[typings.easeljs.createjs.DisplayObject],
    hitLabel: js.UndefOr[String]
  ) = this()
  
  // properties
  /* CompleteClass */
  var downLabel: String | Double = js.native
  
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * @deprecated - use the 'enabled' property instead
    */
  /* CompleteClass */
  override def getEnabled(): Boolean = js.native
  
  /* CompleteClass */
  var outLabel: String | Double = js.native
  
  /* CompleteClass */
  var overLabel: String | Double = js.native
  
  /* CompleteClass */
  var play: Boolean = js.native
  
  // methods
  /**
    * @deprecated - use the 'enabled' property instead
    */
  /* CompleteClass */
  override def setEnabled(value: Boolean): Unit = js.native
  
  /* CompleteClass */
  var target: typings.easeljs.createjs.MovieClip | typings.easeljs.createjs.Sprite = js.native
}
