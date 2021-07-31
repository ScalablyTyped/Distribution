package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a document's interval.
  */
@JSGlobal("Interval")
@js.native
/**
  * Initiates a new Interval object instance with the specified settings.
  * @param start The interval's start position.
  * @param length The interval's length.
  */
class Interval ()
  extends StObject
     with typings.devexpressWeb.Interval {
  def this(start: Double) = this()
  def this(start: Double, length: Double) = this()
  def this(start: Unit, length: Double) = this()
  
  /**
    * Gets the interval's character length.
    */
  /* CompleteClass */
  var length: Double = js.native
  
  /**
    * Gets the interval's start position in the document.
    */
  /* CompleteClass */
  var start: Double = js.native
}
