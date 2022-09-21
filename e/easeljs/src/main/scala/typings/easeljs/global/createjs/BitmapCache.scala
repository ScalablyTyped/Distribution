package typings.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.BitmapCache")
@js.native
open class BitmapCache ()
  extends StObject
     with typings.easeljs.createjs.BitmapCache
/* static members */
object BitmapCache {
  
  @JSGlobal("createjs.BitmapCache")
  @js.native
  val ^ : js.Any = js.native
  
  // methods
  inline def getFilterBounds(target: typings.easeljs.createjs.DisplayObject): typings.easeljs.createjs.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterBounds")(target.asInstanceOf[js.Any]).asInstanceOf[typings.easeljs.createjs.Rectangle]
  inline def getFilterBounds(target: typings.easeljs.createjs.DisplayObject, output: typings.easeljs.createjs.Rectangle): typings.easeljs.createjs.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterBounds")(target.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typings.easeljs.createjs.Rectangle]
}
