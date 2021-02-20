package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the table style settings.
  */
@js.native
trait TableStyle extends StyleBase {
  
  /**
    * Gets or sets the style from which the current style inherits.
    */
  val parent: TableStyle = js.native
}
object TableStyle {
  
  @scala.inline
  def apply(isDeleted: Boolean, name: String, parent: TableStyle): TableStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
  
  @scala.inline
  implicit class TableStyleMutableBuilder[Self <: TableStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: TableStyle): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
