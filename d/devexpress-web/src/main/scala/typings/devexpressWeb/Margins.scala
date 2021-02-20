package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the margin settings.
  */
@js.native
trait Margins extends StObject {
  
  /**
    * Gets or sets the bottom margin.
    */
  var bottom: Double = js.native
  
  /**
    * Gets or sets the left margin.
    */
  var left: Double = js.native
  
  /**
    * Gets or sets the right margin.
    */
  var right: Double = js.native
  
  /**
    * Gets or sets the top margin.
    */
  var top: Double = js.native
}
object Margins {
  
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Margins = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margins]
  }
  
  @scala.inline
  implicit class MarginsMutableBuilder[Self <: Margins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
