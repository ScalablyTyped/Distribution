package typings.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Shadow")
@js.native
class Shadow protected ()
  extends typings.easeljs.createjs.Shadow {
  def this(color: String, offsetX: Double, offsetY: Double, blur: Double) = this()
}
/* static members */
object Shadow {
  
  @JSGlobal("createjs.Shadow")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("createjs.Shadow.identity")
  @js.native
  def identity: typings.easeljs.createjs.Shadow = js.native
  @scala.inline
  def identity_=(x: typings.easeljs.createjs.Shadow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
}
