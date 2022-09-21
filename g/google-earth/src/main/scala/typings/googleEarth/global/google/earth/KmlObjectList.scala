package typings.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlObjectList")
@js.native
open class KmlObjectList[T /* <: typings.googleEarth.google.earth.KmlObject */] ()
  extends StObject
     with typings.googleEarth.google.earth.KmlObjectList[T] {
  
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
