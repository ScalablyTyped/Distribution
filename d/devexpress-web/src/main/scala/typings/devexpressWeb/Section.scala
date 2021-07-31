package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a section in the document.
  */
trait Section extends StObject {
  
  /**
    * Provides access to the section's footers.
    */
  val footers: js.Array[HeaderFooter]
  
  /**
    * Provides access to the section's headers.
    */
  val headers: js.Array[HeaderFooter]
  
  /**
    * Gets the text buffer interval occupied by the current section element.
    */
  val interval: Interval
  
  /**
    * Gets the section's character length.
    */
  val length: Double
  
  /**
    * Gets the section's start position in the document.
    */
  val start: Double
}
object Section {
  
  @scala.inline
  def apply(
    footers: js.Array[HeaderFooter],
    headers: js.Array[HeaderFooter],
    interval: Interval,
    length: Double,
    start: Double
  ): Section = {
    val __obj = js.Dynamic.literal(footers = footers.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit class SectionMutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFooters(value: js.Array[HeaderFooter]): Self = StObject.set(x, "footers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootersVarargs(value: HeaderFooter*): Self = StObject.set(x, "footers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[HeaderFooter]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: HeaderFooter*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
