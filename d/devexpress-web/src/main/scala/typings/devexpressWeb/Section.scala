package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a section in the document.
  */
@js.native
trait Section extends js.Object {
  
  /**
    * Provides access to the section's footers.
    */
  val footers: js.Array[HeaderFooter] = js.native
  
  /**
    * Provides access to the section's headers.
    */
  val headers: js.Array[HeaderFooter] = js.native
  
  /**
    * Gets the text buffer interval occupied by the current section element.
    */
  val interval: Interval = js.native
  
  /**
    * Gets the section's character length.
    */
  val length: Double = js.native
  
  /**
    * Gets the section's start position in the document.
    */
  val start: Double = js.native
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
  implicit class SectionOps[Self <: Section] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFootersVarargs(value: HeaderFooter*): Self = this.set("footers", js.Array(value :_*))
    
    @scala.inline
    def setFooters(value: js.Array[HeaderFooter]): Self = this.set("footers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: HeaderFooter*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[HeaderFooter]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
