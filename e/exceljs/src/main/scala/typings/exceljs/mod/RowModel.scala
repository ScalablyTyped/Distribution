package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowModel extends StObject {
  
  var cells: js.Array[CellModel] = js.native
  
  var collapsed: Boolean = js.native
  
  var height: Double = js.native
  
  var hidden: Boolean = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var number: Double = js.native
  
  var outlineLevel: Double = js.native
  
  var style: PartialStyle = js.native
}
object RowModel {
  
  @scala.inline
  def apply(
    cells: js.Array[CellModel],
    collapsed: Boolean,
    height: Double,
    hidden: Boolean,
    max: Double,
    min: Double,
    number: Double,
    outlineLevel: Double,
    style: PartialStyle
  ): RowModel = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], outlineLevel = outlineLevel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowModel]
  }
  
  @scala.inline
  implicit class RowModelMutableBuilder[Self <: RowModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[CellModel]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: CellModel*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevel(value: Double): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: PartialStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
