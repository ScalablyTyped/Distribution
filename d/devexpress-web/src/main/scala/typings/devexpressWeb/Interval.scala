package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a document's interval.
  */
trait Interval extends StObject {
  
  /**
    * Gets the interval's character length.
    */
  var length: Double
  
  /**
    * Gets the interval's start position in the document.
    */
  var start: Double
}
object Interval {
  
  @scala.inline
  def apply(length: Double, start: Double): Interval = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
