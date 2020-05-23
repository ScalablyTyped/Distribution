package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlObjectList")
@js.native
class KmlObjectList[T /* <: typings.googleEarth.google.earth.KmlObject */] ()
  extends typings.googleEarth.google.earth.KmlObjectList[T] {
  /**
    * Number of objects in collection.
    */
  /* CompleteClass */
  override def getLength(): Double = js.native
  /**
    * Gets an item from the object list. For example, list.item(0) returns the first object in the list.
    */
  /* CompleteClass */
  override def item(index: Double): T = js.native
}

