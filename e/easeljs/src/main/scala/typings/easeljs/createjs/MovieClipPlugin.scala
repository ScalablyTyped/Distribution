package typings.easeljs.createjs

import typings.tweenjs.createjs.Tween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovieClipPlugin extends StObject {
  
  // methods
  def tween(
    tween: Tween,
    prop: String,
    value: String,
    startValues: js.Array[js.Any],
    endValues: js.Array[js.Any],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
  def tween(
    tween: Tween,
    prop: String,
    value: Boolean,
    startValues: js.Array[js.Any],
    endValues: js.Array[js.Any],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
  def tween(
    tween: Tween,
    prop: String,
    value: Double,
    startValues: js.Array[js.Any],
    endValues: js.Array[js.Any],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
}
