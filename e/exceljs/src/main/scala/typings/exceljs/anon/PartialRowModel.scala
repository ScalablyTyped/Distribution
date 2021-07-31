package typings.exceljs.anon

import typings.exceljs.mod.CellModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.RowModel> */
trait PartialRowModel extends StObject {
  
  var cells: js.UndefOr[js.Array[CellModel]] = js.undefined
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var outlineLevel: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[PartialStyleAlignment] = js.undefined
}
object PartialRowModel {
  
  @scala.inline
  def apply(): PartialRowModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRowModel]
  }
  
  @scala.inline
  implicit class PartialRowModelMutableBuilder[Self <: PartialRowModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[CellModel]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    @scala.inline
    def setCellsVarargs(value: CellModel*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOutlineLevel(value: Double): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevelUndefined: Self = StObject.set(x, "outlineLevel", js.undefined)
    
    @scala.inline
    def setStyle(value: PartialStyleAlignment): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
