package typings.ember.mod.Ember

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Map stores values indexed by keys. Unlike JavaScript's
  * default Objects, the keys of a Map can be any JavaScript
  * object.
  * @deprecated
  */
@JSImport("ember", "Ember.Map")
@js.native
class Map () extends StObject {
  
  def copy(): Map = js.native
  
  def forEach(callback: js.Function1[/* repeated */ js.Any, _], self: js.Any): Unit = js.native
  
  def get(key: js.Any): js.Any = js.native
  
  def has(key: js.Any): Boolean = js.native
  
  var length: Double = js.native
  
  def set(key: js.Any, value: js.Any): Unit = js.native
}
object Map {
  
  /* static member */
  @JSImport("ember", "Ember.Map.create")
  @js.native
  def create(): Map = js.native
}
